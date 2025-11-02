function calculate(...a){
          let sum=0;
          for(let i=0;i<a.length;i++)
          {
            sum += a[i];
             if(a[i]%2!=0){
             console.log("Odd numbers : " +a[i]);
             }
        }
        const max = Math.max(...a);
        console.log("Addition of "+(a.length)+" numbers= "+sum);
        console.log("Maximum = "+max);
    
}
calculate(17,9);
calculate(81,77,54);

