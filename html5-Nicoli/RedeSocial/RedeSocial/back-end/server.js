//Dependências //Executar da primeira vez
//npm init -y
//npm install express mysql2 dotenv
//npm install cors

//Para executar o servidor
//nodemon server.js

const cors = require('cors');

const express = require('express');
const app = express();
const db = require('./db');
require('dotenv').config();

app.use(express.json());
app.use(cors())

const PORT = process.env.PORT || 3000;

//Rota POST - Cadastrar novo usuário
app.post('/cadUsuario', (req, res) => {
  // As variáveis dentro dos {} recebem os dados que vieram do front-end
  const { nomeUsuario, senhaUsuario } = req.body;

  //Se os dados que vieram do font-end forem em branco
  if (!nomeUsuario || !senhaUsuario) {
    return res.status(400).json({ error: 'Nome ou senha não inseridos.' });
  }

  //Realiza a inserção dos dados recebidos no banco de dados
  const sql = 'INSERT INTO cadastro (nomeUsuario, senhaUsuario) VALUES (?,?)';
  db.query(sql, [nomeUsuario, senhaUsuario], (err, result) => {
    if (err) {
      if (err.code === 'ER_DUP_ENTRY') {
        return res.status(409).json({ error: 'O usuário já está cadastrado.' });
      }
      return res.status(500).json({ error: err.message });
    }

    // Em caso de sucesso encaminha uma mensagem.
    res.status(201).json({ message: 'Cadastrado com sucesso!' });
  });
});

// Inicializa o servidor
app.listen(PORT, () => {
  console.log(`Servidor rodando na porta ${PORT}`);
});



//Rota POST - Fazer uma postagem
app.post('/postFoto', (req, res) => {
  // As variáveis dentro dos {} recebem os dados que vieram do front-end
  const { fotoUsuario } = req.body;

  //Se os dados que vieram do font-end forem em branco
  if (!fotoUsuario) {
    return res.status(400).json({ error: 'Postagem sem conteúdo.' });
  }

  //Realiza a inserção dos dados recebidos no banco de dados
  const sql = 'INSERT INTO postagem (fotoUsuario) VALUES (?,?)';
  db.query(sql, [fotoUsuario], (err, result) => {
    if (err) {
      return res.status(500).json({ error: err.message });
    }

    // Em caso de sucesso encaminha uma mensagem.
    res.status(201).json({ message: 'Foto postada com sucesso!' });
  });
});



// Rota GET - Ver as postagens
app.get('/verFoto', (req, res) => {
  db.query('SELECT * FROM postagem', (err, results) => {
    if (err) {
      return res.status(500).json({ error: err.message });
    }
    res.json(results);
  });
});