package F_ClasessAndObjects;

public class F_CaractorsticksOfClass_NestedClass {

		  private int x = 10;

		  public class InnerClass {		  // Define a nested class within the OuterClass
		    public int getX() {
		      return x;
		    }
		  }

		  public static void main(String[] args) {
		    // Create an instance of OuterClass
			  F_CaractorsticksOfClass_NestedClass myOuter = new F_CaractorsticksOfClass_NestedClass();
		    
		    // Create an instance of InnerClass by calling the InnerClass constructor on the OuterClass instance
			  F_CaractorsticksOfClass_NestedClass.InnerClass myInner = myOuter.new InnerClass();
		    
		    // Access the x variable in InnerClass through its getter method
		    System.out.println(myInner.getX());
		  }
		}
