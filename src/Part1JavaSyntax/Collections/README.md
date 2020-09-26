# Collections

Java collections are divided into three main groups: Set, List, Map (or dictionary)

## Set
The Set interface provides an **unordered** collection of **unique objects**, i.e. Set doesn't allow duplicates.

- LinkedHashSet, TreeSet, and HashSet are frequently used Set implementation. 

```java
public static void main(String[] args)
{
    Set<String> set = new HashSet<String>();
    set.add("one");
    set.add("two");
    set.add("three");

     // Get the iterator of Set
     Iterator<String> iterator = set.iterator();

    while (iterator.hasNext())        // if have next element
    {
       // obtain current & move to next
       String text = iterator.next();
       System.out.println(text);
    }
}
```


## List
List in Java provides **ordered** and **indexed** collection which **may contain duplicates**. 
- ArrayList and LinkedList are two most popular used List implementation.
```java
public static void main(String[] args)
{
    List<String> list = new ArrayList<String>();
    list.add("one");
    list.add("two");
    list.add("three");

     // Get the iterator of List
    Iterator<String> iterator = list.iterator();

    while (iterator.hasNext())      // if have next element
    {
       // obtain current & move to next
       String text = iterator.next();
       System.out.println(text);
    }
}
```

## Map
Map provides a data structure based on key-value pair and hashing. 
- If the key type is Integer: degenerate to List. 
- most popular implementation of Map interface is HashMap, LinkedHashMap, Hashtable, and TreeMap.

```java
public static void main(String[] args)
{
    // all elements are stored in pair
    Map<String, String> map = new HashMap<String, String>();
    map.put("first", "one");
    map.put("second", "two");
    map.put("third", "three");

     // Get the iterator of Map
    Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

   while (iterator.hasNext())
    {
        // get the key-value pair
        Map.Entry<String, String> pair = iterator.next();
        String key = pair.getKey();            // key
        String value = pair.getValue();        // value
        System.out.println(key + ":" + value);
    }
}
```

## Iteraor
An Iterator is an object that can be used to loop through collections. 
- Looping through a collection: use the `hasNext()` and `next()` methods of the Iterator.
  - `hasNext()`: check if existing element that still not returned by `next()`.
  - `next()`: return the next element in the collection.

```java
  while(it.hasNext()) {
    System.out.println(it.next());
  }
```
- The `remove()` method can remove items from a collection while looping.
```java
import java.util.ArrayList;
import java.util.Iterator;

public class MyClass {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    Iterator<Integer> it = numbers.iterator();
    while(it.hasNext()) {
      Integer i = it.next();
      if(i < 10) {
        it.remove();
      }
    }
    System.out.println(numbers);    //output: [12, 23]
  }
}
```

## for-each
- Iterator is an interface provided by collection framework to traverse a collection and for a sequential access of items in the collection.
```java
   // Iterating over collection 'c' using terator
   for (Iterator i = c.iterator(); i.hasNext(); ) 
       System.out.println(i.next());
```
- For eachloop is meant for traversing items in a collection.
```java
   // Iterating over collection 'c' using for-each 
   for (Element e: c)
       System.out.println(e);
```
In for-each loop, we can’t modify collection; however, it has better understanding comparing with nested for-loop. 

![](java-collection-hierarchy.png)