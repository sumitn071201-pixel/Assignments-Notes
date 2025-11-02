let arr = [10, 20, 30, 40, 50];
 console.log("Original array:", arr);
function useArrayFunction(option) {

    switch (option) {
        case "push":
            arr.push(60);
            console.log("After push(60):", arr);
            break;

        case "pop":
            arr.pop();
            console.log("After pop():", arr);
            break;

        case "shift":
            arr.shift();
            console.log("After shift():", arr);
            break;

        case "unshift":
            arr.unshift(5);
            console.log("After unshift(5):", arr);
            break;

        case "slice":
            let sliced = arr.slice(1, 4);
            console.log("After slice(1, 4):", sliced);
            break;

        case "splice":
            arr.splice(2, 1, 999); // remove 1 element at index 2, insert 999
            console.log("After splice(2, 1, 999):", arr);
            break;

        case "indexOf":
            console.log("indexOf(30):", arr.indexOf(30));
            break;

        case "includes":
            console.log("includes(40):", arr.includes(40));
            break;

        case "join":
            console.log("After join('-'):", arr.join("-"));
            break;

        case "reverse":
            arr.reverse();
            console.log("After reverse():", arr);
            break;

        default:
            console.log("Invalid option. Try: push, pop, shift, unshift, slice, splice, indexOf, includes, join, reverse");
    }
}


useArrayFunction("push");
useArrayFunction("pop");
useArrayFunction("shift");
useArrayFunction("unshift");
useArrayFunction("slice");
useArrayFunction("splice");
useArrayFunction("indexOf");
useArrayFunction("includes");
useArrayFunction("join");
useArrayFunction("reverse");
