package intro.collection;

import java.io.*;
import java.util.*;

public class Introduction {
    public static void main(String[] args) {
        // Creating instances of the array,
        // vector and hashtable
        int arr[] = new int[]{1, 2, 3, 4};
        Vector<Integer> v = new Vector();
        Hashtable<Integer, String> h = new Hashtable();

        // Adding the elements into the
        // vector
        v.addElement(1);
        v.addElement(2);
        

        // Adding the element into the
        // hashtable
        h.put(1, "geeks");
        h.put(2, "4geeks");

        // Array instance creation requires [],
        // while Vector and hastable require ()
        // Vector element insertion requires addElement(),
        // but hashtable element insertion requires put()

        // Accessing the first element of the
        // array, vector and hashtable
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));

        // Array elements are accessed using [],
        // vector elements using elementAt()
        // and hashtable elements using get()
    }
}

/*
1. The Collection interface (java.util.Collection) and
   Map interface (java.util.Map) are the two main “root” interfaces of Java collection classes.

   A framework is a set of classes and interfaces which provide a ready-made architecture.

   Before the Collection Framework(or before JDK 1.2) was introduced, the standard methods for grouping Java objects
    (or collections) were Arrays or Vectors, or Hashtables. All of these collections had no common interface.
    Therefore, though the main aim of all the collections is the same, the implementation of all these collections was
    defined independently and had no correlation among them. And also, it is very difficult for the users to remember
    all the different methods, syntax, and constructors present in every collection class.

   As we can observe, none of these collections(Array, Vector, or Hashtable) implements a standard member access interface,
   it was very difficult for programmers to write algorithms that can work for all kinds of Collections. Another drawback
    is that most of the ‘Vector’ methods are final, meaning we cannot extend the ’Vector’ class to implement a similar kind
     of Collection. Therefore, Java developers decided to come up with a common interface to deal with the above-mentioned
     problems and introduced the Collection Framework in JDK 1.2 post which both, legacy Vectors and Hashtables were
     modified to conform to the Collection Framework.


     Advantages of the Collection Framework

     Consistent API
     Reduces programming effort
     Increases program speed and quality



     Hierarchy of the Collection Framework

     The utility package, (java.util) contains all the classes and interfaces that are required by the collection
     framework. The collection framework contains an interface named an iterable interface which provides the iterator
     to iterate through all the collections. This interface is extended by the main collection interface which acts as a
     root for the collection framework. All the collections extend this collection interface thereby extending the properties
      of the iterator and the methods of this interface. The following figure illustrates the hierarchy of the collection framework.


     1. Iterable Interface: This is the root interface for the entire collection framework. The collection interface extends
     the iterable interface. Therefore, inherently, all the interfaces and classes implement this interface. The main
     functionality of this interface is to provide an iterator for the collections. Therefore, this interface contains only one abstract method which is the iterator. It returns the
        Iterator iterator();

2. Collection Interface: This interface extends the iterable interface and is implemented by all the classes in the
collection framework. This interface contains all the basic methods which every collection has like adding the data into
 the collection, removing the data, clearing the data, etc. All these methods are implemented in this interface because
 these methods are implemented by all the classes irrespective of their style of implementation. And also, having these methods in this interface ensures that the names of the methods are universal for all the collections.
Therefore, in short, we can say that this interface builds a foundation on which the collection classes are implemented.

3. List Interface: This is a child interface of the collection interface. This interface is dedicated to the data of the
list type in which we can store all the ordered collection of the objects. This also allows duplicate data to be present in it.
This list interface is implemented by various classes like ArrayList, Vector, Stack, etc. Since all the subclasses implement
the list, we can instantiate a list object with any of these classes. For example,
 List <T> al = new ArrayList<> ();
List <T> ll = new LinkedList<> ();
List <T> v = new Vector<> ();
Where T is the type of the object


4. Queue Interface: As the name suggests, a queue interface maintains the FIFO(First In First Out) order similar to a real-world
 queue line. This interface is dedicated to storing all the elements where the order of the elements matter.
 For example, whenever we try to book a ticket, the tickets are sold on a first come first serve basis.
 Therefore, the person whose request arrives first into the queue gets the ticket.
 There are various classes like PriorityQueue, ArrayDeque, etc. Since all these subclasses implement the queue, we can
 instantiate a queue object with any of these classes. For example,
 Queue <T> pq = new PriorityQueue<> ();
Queue <T> ad = new ArrayDeque<> ();
Where T is the type of the object.


5. Deque Interface: This is a very slight variation of the queue data structure. Deque, also known as a double-ended queue,
is a data structure where we can add and remove the elements from both ends of the queue. This interface extends the queue
interface. The class which implements this interface is ArrayDeque. Since ArrayDeque class implements the Deque interface,
we can instantiate a deque object with this class. For example,
 Deque<T> ad = new ArrayDeque<> ();

Where T is the type of the object.

6. Set Interface: A set is an unordered collection of objects in which duplicate values cannot be stored. This collection is
used when we wish to avoid the duplication of the objects and wish to store only the unique objects. This set interface is
implemented by various classes like HashSet, TreeSet, LinkedHashSet, etc. Since all the subclasses implement the set, we
can instantiate a set object with any of these classes. For example,
Set<T> hs = new HashSet<> ();
Set<T> lhs = new LinkedHashSet<> ();
Set<T> ts = new TreeSet<> ();

Where T is the type of the object.


7. Sorted Set Interface: This interface is very similar to the set interface. The only difference is that this interface
has extra methods that maintain the ordering of the elements. The sorted set interface extends the set interface and is used
to handle the data which needs to be sorted. The class which implements this interface is TreeSet. Since this class implements
 the SortedSet, we can instantiate a SortedSet object with this class. For example,

SortedSet<T> ts = new TreeSet<> ();

Where T is the type of the object.

8. Map Interface: A map is a data structure that supports the key-value pair mapping for the data. This interface doesn’t
support duplicate keys because the same key cannot have multiple mappings. A map is useful if there is data and we wish to
perform operations on the basis of the key. This map interface is implemented by various classes like HashMap, TreeMap, etc.
Since all the subclasses implement the map, we can instantiate a map object with any of these classes. For example,
 Map<T> hm = new HashMap<> ();
Map<T> tm = new TreeMap<> ();

Where T is the type of the object.

 */

