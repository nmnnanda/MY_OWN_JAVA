package C_Strings;

import java.util.Arrays;

public class A_StringMethods {

	public static void main(String[] args) {
		
// two types of declarations
		String a = "Nanda";  // using String literal
		String b = new String("Kumar");  // using new keyword
		int z = 12344;
//-------------------------------------------------------------------		
		String c = a.concat(" "+b);   // concatination
		System.out.println(c);
//----------------------------------------------------------------------
		int d = a.length();        // length
		System.out.println(d);
//----------------------------------------------------------------------
		char[] dest = new char[5];   // getchar
		a.getChars(0,5,dest,0);
		System.out.println(Arrays.toString(dest));
//-------------------------------------------------------------------
		char[] e = b.toCharArray();   // tochararray
		for (char c1 : e) {
            System.out.print(c1 + " ");
            System.out.println();
        }
		
		int f = a.compareTo(b);
		if (f < 0) {
		    System.out.println("a is less than b");
		} else if (f > 0) {
		    System.out.println("a is greater than b");
		} else {
		    System.out.println("a is equal to b");
		}
//-------------------------------------------------------------------------
		int g = b.compareToIgnoreCase(b);   // tochararray
		System.out.println(g);
//-------------------------------------------------------------------------		
		boolean i = a.isEmpty();    // isempty
		System.out.println(i);
//-------------------------------------------------------------------------
		boolean j = a.isBlank(); //isblank
		System.out.println(j);
//-----------------------------------------------------------------------		
		char h = a.charAt(2);     //charactor at indexnumber
		System.out.println(h);
//----------------------------------------------------------------------------		
		boolean k = a.startsWith(a);     //strings starts with
		System.out.println(k);
//------------------------------------------------------------------------		
		boolean l = a.endsWith(a);      //string ends with
		System.out.println(l);
//--------------------------------------------------------------------
		String m = a.toLowerCase();
		System.out.println(m);
//--------------------------------------------------------------------		
		String n = a.toUpperCase();
		System.out.println(n);
//----------------------------------------------------------------------
		
		/** few methods
		trim(), strip(), stripLeading(), and stripTrailing(),repeat(),contentEquals()
		getBytes(), equals(), hashCode() and equalsIgnoreCase(), indexOf() and lastIndexOf(), substring(), 
        subSequence() ,matches(), replace(), replaceFirst(), and replaceAll(), split(), lines(), indent(), transform(),
        format(),intern(), valueOf() and copyValueOf(), repeat(), describeConstable() and resolveConstantDesc(), formatted(), 
        stripIndent(), and translateEscapes()
        */
		
	}

}
