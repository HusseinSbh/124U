class SmartPhone {
   
    constructor(name, storageCapacity, color) {
      this.name = name;
      this.storageCapacity = storageCapacity;
      this.color = color;
    }

    printFeatures() {
      console.log(`Smartphone Name: ${this.name}`);
      console.log(`Storage Capacity: ${this.storageCapacity}`);
      console.log(`Color: ${this.color}`);
    }
  }
  
  class AndroidPhone extends SmartPhone {
    constructor(name, storageCapacity, color, osVersion) {
      super(name, storageCapacity, color);
      this.osVersion = osVersion;
    }
  

    showAndroidVersion() {
      console.log(`Android OS Version: ${this.osVersion}`);
    }
  }
  

  class iPhone extends SmartPhone {
    constructor(name, storageCapacity, color, faceID) {
      super(name, storageCapacity, color);
      this.faceID = faceID;
    }
  
    hasFaceID() {
      console.log(`Face ID: ${this.faceID ? "Yes" : "No"}`);
    }
  }
  
  const androidPhone = new AndroidPhone("Samsung Galaxy", "128GB", "Black", "Android 12");
  androidPhone.printFeatures();
  androidPhone.showAndroidVersion();
  
  const iPhoneX = new iPhone("iPhone X", "64GB", "Silver", true);
  iPhoneX.printFeatures();
  iPhoneX.hasFaceID();
  