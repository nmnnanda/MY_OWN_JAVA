package K_Collections;

public class A_Intro {

}
/**

• Collections framework provides a set of interfaces and classes to implement various data structures and 
  algorithms.
• Collections framework is contained in java.util package.
• It allows the programmers to program at the interfaces, instead of the actual implementation.
• A well designed framework can improve your productivity and provide ease of maintenance.
• Java Collections are similar to containers that consists of multiple items in a single unit. for e,g. collections of 
  books, list of names etc.
• Java collection framework can perform following activity :
- Add objects to collection
- Remove objects from collection
- Search for an object in collection
- Retrieve/get object from collection


                          INTERFACE

Iterator => iterator interface provides the facility of iterating elements in a forward direction
            Methods = hasNext(), Next(), Remove()
Iterable =>  iterable interface is a root for all collection classes 
             Methods = Iterator<T> iterator()
COllection => Collection interface by all clasess in the collection framework
              Method = Boolean add(Object obj), Boolean addAll(Object obj) etc           

• Collections Interfaces :

- This is the root of the collection hierarchy.
- A collection represents a group of objects known as its elements.
- List, Queue and Set are all sub interfaces of collection interface.
- It extends Iterable interface.
- Iterable interface has only one method called iterator().


*/