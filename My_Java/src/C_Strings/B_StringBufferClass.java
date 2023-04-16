package C_Strings;

public class B_StringBufferClass {

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("Nanda");
		StringBuffer b = new StringBuffer("Nanda");
		StringBuffer c = new StringBuffer("Nanda");
		StringBuffer d = new StringBuffer("Nanda");

		 a.append("kumar");
		 System.out.println(a);

		 b.replace(0, 3, "rrrr");
		 System.out.println(b);
		 
		 c.insert(3, "mmmm");
		 System.out.println(c);

	}

}
/**
 Java String Buffer class
 
• Java StringBuffer class is used to create mutable string.
• StringBuffer represents growable and writable character sequences.
• StringBuffer may have characters and substrings inserted in the middle or appended to the end.
• StringBuffer( ): It reserves space for sixteen characters without reallocation.
  Example : StringBuffer s=new StringBuffer();
• StringBuffer( int size): It accepts a whole number argument that explicitly sets the scale of the buffer.
• Example: StringBuffer s=new StringBuffer(30);
• StringBuffer(String str): It reserves area for sixteen characters while not reallocation and accepts a String 
  argument that sets the initial contents of StringBuffer object.
• Example: StringBuffer s=new StringBuffer(“IoT");
*/
