package K_Collections;

interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing document.");
    }
}

public class C_Implements {
    public static void main(String[] args) {
        Document document = new Document();
        document.print(); // Output: Printing document.
    }
}


/**

implements: When a class implements an interface, it agrees to adhere to the contract specified by that 
interface. An interface in Java defines a set of method signatures that must be implemented by any class 
that implements the interface. It allows for multiple inheritance of behavior since a class can implement 
multiple interfaces.


*/