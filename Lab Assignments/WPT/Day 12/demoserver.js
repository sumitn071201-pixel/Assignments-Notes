const f=require('http');
f.createServer((req,res)=>{
    console.log("Method "+req.method)

    if(req.method === 'POST'){
        res.write("POST Method Demo ");
    }
    if(req.method === 'GET'){
        res.write("GET Method Demo")
    }
  
})

.listen(4000,()=>{
    console.log("Server Started");
});

   
 