package intro.collection;


        /*
        Collections class is a member of the Java Collections Framework. The java.util.Collections package is the package that
        contains the Collections class. Collections class is basically used with the static methods that operate on the collections
        or return the collection.
        All the methods of this class throw the NullPointerException if the collection or object passed to the methods is null.

        public class Collections
        extends Object

        Object is the parent class of all the classes.

        The collection class basically contains 3 fields as listed below which can be used to return immutable entities.

        EMPTY_LIST to get an immutable empty List
        EMPTY_SET to get an immutable empty Set
        EMPTY_MAP to get an immutable empty Map

        The operations that we will be discussing are as follows:

        Adding elements to the Collections
        Sorting a Collection
        Searching in a Collection
        Copying Elements
        Disjoint Collection

        Operation 1: Adding elements to the Collections class object
        The addAll() method of java.util.Collections class is used to add all the specified elements to the specified collection.
        Elements to be added may be specified individually or as an array.
* */
//        import java.util.Collections;
//        import java.util.ArrayList;
//        import java.util.List;
//        public class CollectionClass {
//            public static void main(String[] args) {
//             List<String> l=new ArrayList<>();
//             l.add("Book");
//             l.add("Pen");
//
//             Collections.addAll(l,"Copy","Pencil","Scale");
//
//             for (int i=0;i<l.size();i++)
//                 System.out.println(l.get(i));
//
//    }
//}

     /* Operation 2: Sorting a Collection
       java.util.Collections.sort() is used to sort the elements present in the specified list of Collection in ascending order.
        java.util.Collections.reverseOrder() is used to sort in the descending order. */


//        import java.util.Collections;
//        import java.util.ArrayList;
//        import java.util.List;
//        public class CollectionClass {
//            public static void main(String[] args) {
//             List<String> l=new ArrayList<>();
//             l.add("Book");
//             l.add("Pen");
//
//             Collections.addAll(l,"Copy","Pencil","Scale");
//
//             Collections.sort(l);
//
//             for (int i=0;i<l.size();i++)
//                 System.out.println(l.get(i));
//
//             Collections.sort(l,Collections.reverseOrder());
//
//                for (int i=0;i<l.size();i++)
//                    System.out.println(l.get(i));
//
//    }
//}


/*
* Operation 3: Searching in a Collection
java.util.Collections.binarySearch() method returns the position of an object in a sorted list. To use this method, the list should be sorted in ascending order, otherwise, the result returned from the method will be wrong. If the element exists in the list, the method will return the position of the element in the sorted list, otherwise,
* the result returned by the method would be the – (insertion point where the element should have been present if exist)-1). */

//import java.util.Collections;
//import java.util.ArrayList;
//import java.util.List;
//public class CollectionClass {
//    public static void main(String[] args) {
//        List<String> l=new ArrayList<>();
//        l.add("Book");
//        l.add("Pen");
//
//        Collections.addAll(l,"Copy","Pencil","Scale");
//
//        Collections.sort(l);
//
//        System.out.println("Book index is :"+Collections.binarySearch(l,"Book"));
//
//
//
//    }
//}

/*
  Operation 4: Copying Elements
  The copy() method of java.util.Collections class is used to copy all the elements from one list into another. After the operation, the index of each copied element in the destination list will be identical to its index in the source list. The destination list must be at least as long as the source list.
  If it is longer, the remaining elements in the destination list are unaffected.
* */


//import java.util.Collections;
//import java.util.ArrayList;
//import java.util.List;
//public class CollectionClass {
//    public static void main(String[] args) {
//        List<String> l=new ArrayList<>();
//        l.add("Book");
//        l.add("Pen");
//
//        System.out.println("Original destination is");
//
//        for (int i=0;i<l.size();i++)
//            System.out.println(l.get(i));
//
//        List<String> source_List = new ArrayList<>();
//        source_List.add("Morning");
//        source_List.add("Night");
//
//        Collections.copy(l,source_List);
//        for (int i=0;i<l.size();i++)
//            System.out.println(l.get(i));
//    }
//}

/*
Operation 5: Disjoint Collection

java.util.Collections.disjoint() is used to check whether two specified collections are disjoint or not. More formally, two collections are
 disjoint if they have no elements in common. It returns true if the two collections do not have any element in common.
* */


import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
public class CollectionClass {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("Book");
        l.add("Pen");

        List<String> l2= new ArrayList<>();
       l2.add("Morning");
        l2.add("Night");

        System.out.println(Collections.disjoint(l,l2));
    }
}