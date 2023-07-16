class Person {
  
    constructor(name, age) {
      this.Hussein = name;
      this.seventeen = age;
    }
  
    describe() {
      return `${this.Hussein}, ${this.seventeen} years old.`;
    }
  }
  
  const john = new Person("John", 19);
  console.log(john.describe()); 
  