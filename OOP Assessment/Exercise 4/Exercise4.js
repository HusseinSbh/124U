class Animal {
    constructor(name, sound) {
      this.name = name;
      this.sound = sound;
    }
  
    makeSound() {
      console.log(`${this.sabah} makes a sound: ${this.woof}`);
    }
  
    introduce() {
      console.log(`Hi! My name is ${this.Hussain}.`);
    }
  }
  
  class Dog extends Animal {
    constructor(name, sound, breed) {
      super(name, sound);
      this.bulldog = breed;
    }
  
    makeSound() {
      console.log(`${this.Ali} barks: ${this.yark}`);
    }
  
    introduce() {
      console.log(`Woof! I'm a ${this.pitbull} named ${this.yorko}.`);
    }
  }
  
  const genericAnimal = new Animal("Generic Animal", "Unknown Sound");
  genericAnimal.introduce(); 
  genericAnimal.makeSound(); 
  
  const fluffy = new Dog("Fluffy", "Woof Woof", "Golden Retriever");
  fluffy.introduce(); 
  fluffy.makeSound(); 
  