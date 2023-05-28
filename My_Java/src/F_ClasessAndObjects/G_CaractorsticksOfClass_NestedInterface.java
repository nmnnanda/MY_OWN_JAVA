package F_ClasessAndObjects;

interface OuterInterface {// Outer interface   
    void outerMethod();    // Method in outer interface
    
    interface InnerInterface {    // Nested interface       
        void innerMethod();        // Method in nested interface
    }
}
class OuterInterfaceImpl implements OuterInterface {// Implementation of outer interface
    
    public void outerMethod() {    // Implementing outer method
        System.out.println("Outer method implementation.");
    }
}
class InnerInterfaceImpl implements OuterInterface.InnerInterface {// Implementation of nested interface    
    public void innerMethod() {    // Implementing inner method
        System.out.println("Inner method implementation.");
    }
}

public class G_CaractorsticksOfClass_NestedInterface {  // Main class
    
    public static void main(String[] args) {
        
        OuterInterfaceImpl outerObj = new OuterInterfaceImpl();        // Creating objects of implementation classes
        InnerInterfaceImpl innerObj = new InnerInterfaceImpl();
        
        outerObj.outerMethod();        // Calling methods using objects
        innerObj.innerMethod();
    }
}
