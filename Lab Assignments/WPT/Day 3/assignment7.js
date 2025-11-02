console.log("----------------------METHOD1----------------------");
function largestElement(arr)
{
    let largestNum =arr[0];
    for(let i=1;i<arr.length;i++)
    {
      if(arr[i]>largestNum)
      {
        largestNum=arr[i];
      }
    }
    return largestNum;
}
const num1=[10,25,18,20,23];
const result =largestElement(num1);
console.log("The largest element of the array is :"+result); 
console.log("----------------------METHOD2----------------------");
const array=[10,5,20,8,15];
let largest =array[0];
array.forEach(element=>{
  if(element>largest)
  {
    largest=element;
  }
});
console.log("Largest element in the array :"+largest);
console.log("----------------------METHOD3----------------------");

function findLargest(arr2){
    arr2.sort((a,b)=> a-b);
    return arr2[arr2.length -1];
}
let arr2 =[10,5,20,8];
const lg =findLargest(arr2);
console.log("Largest element in the arr2 :" +lg);
