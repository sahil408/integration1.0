import Express from "express";

const app = Express();

app.get('/', (req, res) => {
    res.send("Server is Ready");
});

// get a list of 1 jokes

app.get('/jokes', (req,res) => {

    const jokes = [
        {
            id:1,
            title: 'A Joke',
            content: 'This is a Joke'
        },
        {
            id:2,
            title: 'Another Joke',
            content: 'This is a Another Joke'
        }
    ];
    res.send(jokes);
})

const port = process.env.PORT || 3000; // Corrected to use PORT instead of port

app.listen(port, () => {
    console.log(`Server at http://localhost:${port}`);
});