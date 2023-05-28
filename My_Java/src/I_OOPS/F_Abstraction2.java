package I_OOPS;

abstract class Bird {
		abstract void makeSound();
}
		class Duck extends Bird {
		public void makeSound() {
		System.out.println("The sound that a Duck makes : Quack Quack");
}
}
		class Owl extends Bird {
		public void makeSound() {
		System.out.println("The sound that an Owl makes: Hoot Hoot");
}
}
		public class F_Abstraction2{
		public static void main(String[]args) {
			Duck d = new Duck();
		    d.makeSound();
		
		    Owl c = new Owl();
		    c.makeSound();
}
}

/**
	• Lets assume we have a class bird that has a method sound() and the subclasses of it 
		like Parrot, Crow, Peacock, Duck etc.
	• The bird sounds differs from one bird to another, there is no point to implement this method in parent class.
	• Now every child class must override this method to give its own implementation details, like duck class will say
		“quack”, peacock class willsay “scream” and so on.
	• So now when we know that all the bird child classes will and should override this method, then there is no 
		point to implement this method in parent class.
	• Therefore, making this method abstract would be the good choice as by making this method abstract we force 
		all the sub or child classes to implement this method.
	• Now each bird must have a sound, by making this method abstract we made it compulsory to the child class to 
		give implementation details to this method.
	• This way we ensures that every bird has a sound.
	• So this is the purpose of abstract keyword before any class name.
*/