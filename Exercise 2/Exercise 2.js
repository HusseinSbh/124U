class Human {
    // Constructor accepts name (string), address (string), and phone (string) arguments
    constructor(name, address, phone) {
      // Private properties using closures
      let _name = name;
      let _address = address;
      let _phone = phone;
  
      // Getter method to retrieve the person's name
      this.getName = function () {
        return _name;
      };
  
      // Getter method to retrieve the person's address
      this.getAddress = function () {
        return _address;
      };
  
      // Getter method to retrieve the person's phone number
      this.getPhoneNumber = function () {
        return _phone;
      };
  
      // Setter method to set the person's phone number
      this.setPhoneNumber = function (newPhone) {
        _phone = newPhone;
      };
    }
  
    // Method to print the person's name
    printName() {
      console.log(`My name is ${this.getName()}.`);
    }
  
    // Method to print the person's address
    printAddress() {
      console.log(`${this.getName()} lives at ${this.getAddress()}.`);
    }
  
    // Method to print the person's phone number
    printPhoneNumber() {
      console.log(`${this.getName()}'s phone number is ${this.getPhoneNumber()}.`);
    }
  }
  
  // Testing Exercise 2
  const john = new Human("John", "123 Road Avenue", "1234567890");
  
  john.printName(); // Output: "My name is John."
  john.printAddress(); // Output: "John lives at 123 Road Avenue."
  john.printPhoneNumber(); // Output: "John's phone number is 1234567890."
  
  // Updating the phone number using the setter method
  john.setPhoneNumber("9876543210");
  john.printPhoneNumber(); // Output: "John's phone number is 9876543210."
  