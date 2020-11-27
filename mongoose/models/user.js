const mongoose = require('mongoose');
const UserSchema = new mongoose.Schema({
    email: {
        type: String,
        required: true
    },
    password: {
        type: String,
        required: true
    },
    username: {
        type: String,
        required: false
    },
    birthDate: {
        type: Date,
        required: true
    },
    profilePicture: {
        type: String,
        required: false
    },
    gender: {
        type: String,
        required: true
    },
    genderInterest: {
        type: String,
        required: true
    },
    sun: {
        type: String,
        required: true
    },
    moon: {
        type: String,
        required: true
    },
    venus: {
        type: String,
        required: true
    },
    mars: {
        type: String,
        required: true
    },
    asc: {
        type: String,
        required: true
    },
    house5: {
        type: String,
        required: true
    },
    house7: {
        type: String,
        required: true
    }
});
mongoose.model('users', UserSchema);
module.exports = mongoose.model('users');