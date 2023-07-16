class Human {

    constructor(name, address, phone) {
   
      let _name = name;
      let _address = address;
      let _phone = phone;
  
  
      this.getName = function () {
        return _name;
      };
  
      this.getAddress = function () {
        return _address;
      };
  
      this.getPhoneNumber = function () {
        return _phone;
      };
  
      this.setPhoneNumber = function (newPhone) {
        _phone = newPhone;
      };
    }
  
    printName() {
      console.log(`My name is ${this.getName()}.`);
    }
  
    printAddress() {
      console.log(`${this.getName()} lives at ${this.getAddress()}.`);
    }
  
    printPhoneNumber() {
      console.log(`${this.getName()}'s phone number is ${this.getPhoneNumber()}.`);
    }
  }
  
  const john = new Human("John", "123 Road Avenue", "1234567890");
  
  john.printName(); 
  john.printAddress(); 
  john.printPhoneNumber(); 
  
  john.setPhoneNumber("9876543210");
  john.printPhoneNumber(); 
  