const express = require('express');
const users1 =require('./MOCK_DATA_1.json');
const users_by_email = require('./MOCK_DATA_1.json');
const users_by_first_name=require('./MOCK_DATA_1.json');
const users_by_last_name=require('./MOCK_DATA_1.json');
const port = 3000;
const app = express();
app.get('/',(req,res)=>{
    res.send("Hello From Express");
});
app.get('/users',(req,res)=>{
    res.json(users1);
});
app.get("/users/:id",(req,res)=>{
    const id = Number(req.params.id);
    const user = users1.find(
        user => user.id === id)
        return res.json(user);
    
});
app.get("/users/:id/:email",(req,res)=>{
    const id = Number(req.params.id);
    const email = req.params.email;
    const user = users1.find(
        user => user.id === id && user.email === email)
        return res.json(user);
});
app.delete('/users/:id', (req, res) => {
    const id = Number(req.params.id);  
    const userIndex = users1.findIndex(
        user => user.id === id
    )
    if (userIndex === -1)
        return res.status(404).send('Data not found');

    const deletedItem = users1.splice(userIndex, 1);
    return res.json("Dae ");
});
app.get("/users_by_email/:email",(req,res)=>{
    const email = req.params.email;
    const user = users_by_email.find(
        user=>user.email === email)
        return res.json(user);
});
app.get("/users_by_first_name/:first_name",(req,res)=>{
    const first_name = req.params.first_name;
    const user = users_by_first_name.find(
        user=>user.first_name === first_name)
        return res.json(user);
});
app.get("/users_by_last_name/:last_name",(req,res)=>{
    const last_name = req.params.last_name;
    const user = users_by_last_name.find(
        user=>user.last_name === last_name)
        return res.json(user);
});


app.listen(port)
console.log("From Start Script");
