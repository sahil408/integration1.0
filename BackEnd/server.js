import Express from "express";

const app = Express();

app.get('/', (req, res) => {
    res.send("Server is Ready");
});

const port = process.env.PORT || 3000; // Corrected to use PORT instead of port

app.listen(port, () => {
    console.log(`Server at http://localhost:${port}`);
});