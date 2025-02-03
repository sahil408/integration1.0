// Step 1: Import the Elasticsearch client
const { Client } = require('@elastic/elasticsearch');

// Step 2: Create a client instance
const client = new Client({ node: 'http://localhost:9200' });

// Step 3: Define the synonym filter and create an index
async function createIndex() {
  const indexName = 'synonym_example';

  // Check if index exists and delete it if necessary
  const indexExists = await client.indices.exists({ index: indexName });
  if (indexExists) {
    await client.indices.delete({ index: indexName });
    console.log(`Deleted existing index: ${indexName}`);
  }

  // Create a new index with synonym filter
  await client.indices.create({
    index: indexName,
    body: {
      settings: {
        analysis: {
          filter: {
            synonym_filter: {
              type: 'synonym',
              synonyms: ['quick, fast', 'jumps, leaps']
            }
          },
          analyzer: {
            synonym_analyzer: {
              tokenizer: 'standard',
              filter: ['lowercase', 'synonym_filter']
            }
          }
        }
      },
      mappings: {
        properties: {
          content: {
            type: 'text',
            analyzer: 'synonym_analyzer'
          }
        }
      }
    }
  });

  console.log(`Created index: ${indexName} with synonym filter.`);
}

// Step 4: Add sample documents
async function addDocuments() {
  const indexName = 'synonym_example';

  const documents = [
    { content: 'The quick brown fox jumps over the lazy dog.' },
    { content: 'A fast-moving hare leaps across the field.' }
  ];

  for (let i = 0; i < documents.length; i++) {
    await client.index({
      index: indexName,
      id: i + 1,
      body: documents[i]
    });
  }

  console.log('Added sample documents.');
  await client.indices.refresh({ index: indexName });
}

// Step 5: Search for documents using the synonym filter
async function searchDocuments() {
  const indexName = 'synonym_example';

  const response = await client.search({
    index: indexName,
    body: {
      query: {
        match: {
          content: 'fast'
        }
      }
    }
  });

  console.log('Search Results:');
  response.body.hits.hits.forEach((hit) => {
    console.log(`Score: ${hit._score}, Content: ${hit._source.content}`);
  });
}

// Execute the functions in sequence
(async function () {
  try {
    await createIndex();
    await addDocuments();
    await searchDocuments();
  } catch (error) {
    console.error('Error:', error);
  }
})();
