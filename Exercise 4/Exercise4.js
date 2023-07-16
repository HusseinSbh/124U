class Animal {
    constructor(name, sound) {
      this.name = name;
      this.sound = sound;
    }
  
    makeSound() {
      console.log(`${this.name} makes a sound: ${this.sound}`);
    }
  
    introduce() {
      console.log(`Hi! My name is ${this.name}.`);
    }
  }
  
  // Extension - Dog class (extends Animal)
  class Dog extends Animal {
    constructor(name, sound, breed) {
      super(name, sound);
      this.breed = breed;
    }
  
    makeSound() {
      console.log(`${this.name} barks: ${this.sound}`);
    }
  
    introduce() {
      console.log(`Woof! I'm a ${this.breed} named ${this.name}.`);
    }
  }
  
  // Testing Exercise 4
  const genericAnimal = new Animal("Generic Animal", "Unknown Sound");
  genericAnimal.introduce(); // Output: "Hi! My name is Generic Animal."
  genericAnimal.makeSound(); // Output: "Generic Animal makes a sound: Unknown Sound"
  
  const fluffy = new Dog("Fluffy", "Woof Woof", "Golden Retriever");
  fluffy.introduce(); // Output: "Woof! I'm a Golden Retriever named Fluffy."
  fluffy.makeSound(); // Output: "Fluffy barks: Woof Woof"
  