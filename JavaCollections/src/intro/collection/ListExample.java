package intro.collection;

public class ListExample {


   /* Since List is an interface, it can be used only with a class that implements this interface. Now, let’s see how to perform a few frequently used operations on the List.

            Operation 1: Adding elements to List class using add() method
    Operation 2: Updating elements in List class using set() method
    Operation 3: Removing elements using remove() method*/



   /* Iterating over List
    Till now we are having a very small input size and we are doing operations manually for every entity. Now let us discuss various ways by which we can iterate over the list to get them working for a larger sample set.

    Methods: There are multiple ways to iterate through the List. The most famous ways are by using the basic for loop in combination with a get() method to get the element at a specific index and the advanced for a loop.

*/
 /*  Operations on Queue Interface
  Adding Elements: In order to add an element in a queue, we can use the add() method
   Removing Elements: In order to remove an element from a queue, we can use the remove() method.
    Iterating the Queue: There are multiple ways to iterate through the Queue. The most famous way is converting the queue to the array and traversing using the for loop. However, the queue also has an inbuilt iterator which can be used to iterate through the queue.



    Characteristics of a Queue: The following are the characteristics of the queue:

The Queue is used to insert elements at the end of the queue and removes from the beginning of the queue. It follows FIFO concept.
The Java Queue supports all methods of Collection interface including insertion, deletion, etc.
LinkedList, ArrayBlockingQueue and PriorityQueue are the most frequently used implementations.
If any null operation is performed on BlockingQueues, NullPointerException is thrown.
The Queues which are available in java.util package are Unbounded Queues.
The Queues which are available in java.util.concurrent package are the Bounded Queues.
All Queues except the Deques supports insertion and removal at the tail and head of the queue respectively. The Deques support element insertion and removal at both ends.





Characteristics of a Map Interface
A Map cannot contain duplicate keys and each key can map to at most one value. Some implementations allow null key and null values like the HashMap and LinkedHashMap, but some do not like the TreeMap.
The order of a map depends on the specific implementations. For example, TreeMap and LinkedHashMap have predictable orders, while HashMap does not.
There are two interfaces for implementing Map in java. They are Map and SortedMap, and three classes: HashMap, TreeMap, and LinkedHashMap.

Which operations are related to map interface?
The basic operations of Map ( put , get , containsKey , containsValue , size , and isEmpty ) behave exactly like their counterparts in Hashtable .





Operations on the Set Interface

The set interface allows the users to perform the basic mathematical operation on the set. Let’s take two arrays to understand these basic operations. Let set1 = [1, 3, 2, 4, 8, 9, 0] and set2 = [1, 3, 7, 5, 4, 0, 7, 5]. Then the possible operations on the sets are:

1. Intersection: This operation returns all the common elements from the given two sets. For the above two sets, the intersection would be:

Intersection = [0, 1, 3, 4]
2. Union: This operation adds all the elements in one set with the other. For the above two sets, the union would be:

Union = [0, 1, 2, 3, 4, 5, 7, 8, 9]
3. Difference: This operation removes all the values present in one set from the other set. For the above two sets, the difference would be:

Difference = [2, 8, 9]



Performing Various Operations on SortedSet
After the introduction of Generics in Java 1.5, it is possible to restrict the type of object that can be stored in the Set. Since Set is an interface, it can be used only with a class that implements this interface. HashSet is one of the widely used classes which implements the Set interface. Now, let’s see how to perform a few frequently used operations on the HashSet. We are going to perform the following operations as follows:

Adding elements
Accessing elements
Removing elements
Iterating elements
Iterating through Set






A Java Cursor is an Iterator, which is used to iterate or traverse or retrieve a Collection or Stream object’s elements one by one. There are three cursors in Java.

Iterator
Enumeration
ListIterator
Note: SplitIterator can also be considered as a cursor as it is a type of Iterator only.


https://www.geeksforgeeks.org/iterators-in-java/  : everything about iterators.

https://www.geeksforgeeks.org/comparator-interface-java/ : everything about comparator
https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/  : difference between comparator and comparable


    */

}