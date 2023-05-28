package K_Collections;

import java.util.ArrayList;
import java.util.Iterator;
public class E_Iterator {

	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		
		arraylist.add("nanda");
		arraylist.add(123);
		arraylist.add(1.23);
		arraylist.add(null);
		
		//iterating using for loop one way
		for(Object str : arraylist) {
			System.out.println(str);
		}
		//iterating using for loop way two
		for(int i=0; i<arraylist.size(); i++){
			System.out.println(arraylist.get(i));
		}
// iterating using iterator
		Iterator itr = arraylist.iterator();
		
		System.out.println("After iteration");
		System.out.println(itr.next());  //single element iteration
		
		while(itr.hasNext()) {
			Object str = itr.next();
			System.out.println(str);			
		}
	}
}
