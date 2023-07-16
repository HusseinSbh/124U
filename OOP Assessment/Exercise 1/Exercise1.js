// Exercise 1 - Person Class
class Person {
    // Constructor accepts name (string) and age (number) arguments
    constructor(name, age) {
      this.name = name;
      this.age = age;
    }
  
    // Method to describe the person's name and age
    describe() {
      return `${this.name}, ${this.age} years old.`;
    }
  }
  
  // Testing Exercise 1
  const john = new Person("John", 19);
  console.log(john.describe()); // Output: "John, 19 years old"
  