// Exercise 3 - SmartPhone Class
class SmartPhone {
    // Constructor accepts name (string), storageCapacity (string), and color (string) arguments
    constructor(name, storageCapacity, color) {
      this.name = name;
      this.storageCapacity = storageCapacity;
      this.color = color;
    }
  
    // Method to print general features of the smartphone
    printFeatures() {
      console.log(`Smartphone Name: ${this.name}`);
      console.log(`Storage Capacity: ${this.storageCapacity}`);
      console.log(`Color: ${this.color}`);
    }
  }
  
  // Extension 1 - AndroidPhone class (extends SmartPhone)
  class AndroidPhone extends SmartPhone {
    constructor(name, storageCapacity, color, osVersion) {
      super(name, storageCapacity, color);
      this.osVersion = osVersion;
    }
  
    // Unique method for AndroidPhone
    showAndroidVersion() {
      console.log(`Android OS Version: ${this.osVersion}`);
    }
  }
  
  // Extension 2 - iPhone class (extends SmartPhone)
  class iPhone extends SmartPhone {
    constructor(name, storageCapacity, color, faceID) {
      super(name, storageCapacity, color);
      this.faceID = faceID;
    }
  
    // Unique method for iPhone
    hasFaceID() {
      console.log(`Face ID: ${this.faceID ? "Yes" : "No"}`);
    }
  }
  
  // Testing Exercise 3
  const androidPhone = new AndroidPhone("Samsung Galaxy", "128GB", "Black", "Android 12");
  androidPhone.printFeatures();
  androidPhone.showAndroidVersion();
  
  const iPhoneX = new iPhone("iPhone X", "64GB", "Silver", true);
  iPhoneX.printFeatures();
  iPhoneX.hasFaceID();
  