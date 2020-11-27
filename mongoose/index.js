// Config
const express = require('express');
const app = express();
const mongoose = require('mongoose');

// Database
mongoose.Promise = global.Promise;
mongoose.connect('mongodb://localhost:27017/satellite-luv', { 
    useNewUrlParser: true,
    useUnifiedTopology: true
})
.then(() => console.log("MongoDB is connected!"))
.catch((err) => console.error("Error while attempting to connect to MongoDB "+err))

// Models
const User = require('./models/user')

app.use(express.json())
app.use(express.urlencoded({ extended: true }))

// POST
app.post('/user', function (req, res) {
    const data = req.body
    if(!data) {
        res.sendStatus(400)
    }
    new User(data).save()
        .then(() => res.sendStatus(201))
        .catch(() => res.sendStatus(400))
});

// GET all
app.get('/users', function (req, res) {
    User.find()
         .then((users) => res.send(users))
         .catch(() => res.sendStatus(400));
});

// GET one
app.get('/user/:userId', function (req, res) {
    const userId = req.params.userId;
    User.findById(userId)
         .then((user) => res.send(user))
         .catch(() => res.sendStatus(400));
});

// PUT
app.put('/user/:userId', function (req, res) {
    const userId = req.params.userId;
    const data = req.body;
    if(!data || !userId) {
        res.sendStatus(400)
    }
    
    User.findByIdAndUpdate(userId, data)
         .then(() => res.sendStatus(200))
         .catch(() => res.sendStatus(400));
});

// DELETE
app.delete('/user/:userId', function (req, res) {
    const userId = req.params.userId;
    User.findByIdAndRemove(userId)
         .then(() => res.sendStatus(200))
         .catch(() => res.sendStatus(400));
});

// Server
app.listen(8080, () => {
    console.log('The server is running here: http://127.0.0.1:8080/')
});