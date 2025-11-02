function calculate(...a){
          let sum=0;
          for(let i=0;i<a.length;i++)
          {
            sum += a[i];
             if(a[i]%2!=0){
             console.log("Odd numbers : " +a[i]);
             }
        }
        console.log("Addition of "+(a.length)+" numbers= "+sum);

}

    calculate(1,2);
    calculate(40,99,167);
    