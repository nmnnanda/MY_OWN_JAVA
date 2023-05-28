package G_Packages;


public class CD_Protected_AccessSpecifier extends C_Protected_AcessSpecifier {
	    // Define a public method that uses the protected instance variable
	    public void accelerate() {
	        speed += 10;
	        System.out.println("Accelerating. Current speed: " + speed);
	    }
	}

