import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [jokes, setJokes] = useState([])

  return (
    <>
      <h1>Vite + React</h1>
      <p>Jokes: {jokes.length}</p>

      {
        jokes.map((joke, index) => {
          <div key={joke.id}>
            <h3>{joke.title}</h3>
            <p>{joke.content}</p>
            </div>
        })
      }
    </>
  )
}

export default App
