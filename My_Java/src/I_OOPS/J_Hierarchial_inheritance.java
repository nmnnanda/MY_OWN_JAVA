package I_OOPS;
	
      class Animal1 {	// Parent class
	  void eat() {
	    System.out.println("Eating...");
	  }
	}

	class Dog1 extends Animal1 {	// Child class 1
	  void bark() {
	    System.out.println("Barking...");
	  }
	}

	class Cat1 extends Animal1 {	// Child class 2
	  void meow() {
	    System.out.println("Meowing...");
	  }
	}

	class J_Hierarchial_inheritance {	// Main class
	  public static void main(String[] args) {
	    Dog1 dog = new Dog1();
	    Cat1 cat = new Cat1();

	    dog.eat();  // Inherits eat() from parent class
	    dog.bark(); // Calls method of child class 1
	    cat.eat();  // Inherits eat() from parent class
	    cat.meow(); // Calls method of child class 2
	  }
	}
