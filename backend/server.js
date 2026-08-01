const express = require('express');
const app = express();

// Middleware to read JSON data sent in requests
app.use(express.json());

// Home route
app.get('/', (req, res) => {
  res.send('Server is up and running!');
});

// Sum route
app.post('/sum', (req, res) => {
  const { a, b } = req.body;

  if (typeof a !== 'number' || typeof b !== 'number') {
    return res.status(400).json({ error: 'Please provide valid numbers for a and b.' });
  }

  const result = a + b;
  res.json({ result: result });
});

const PORT = 5000;
app.listen(PORT, () => {
  console.log(`Server running on http://localhost:${PORT}`);
});