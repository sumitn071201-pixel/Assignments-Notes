const personObj = {
  name: "John",
  age: 25,
  greet: function() {
    console.log("Hello, my name is " + this.name);
  }
};

personObj.greet();  

// Class definition
class PersonClass {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }

  greet() {
    console.log("Hello, my name is " + this.name);
  }
}

const personInstance = new PersonClass("Alice", 30);
personInstance.greet();  // Output: Hello, my name is Alice
