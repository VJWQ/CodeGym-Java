# Collections

Java collections are divided into three main groups: [Set](#Set), [List](#List), [Map/Dictionary](#Map).  


## Set
The Set interface provides an **unordered** collection of **unique objects**, i.e. Set doesn't allow duplicates.

- **LinkedHashSet**, **TreeSet**, and **HashSet** are frequently used Set implementation. 
- Frequent operations:

|  Method   | Description  |
|  -------  | -----------  |
|**add**(E e)|Adds the specified element to this set if it is not already present (optional operation).|
|**addAll**(Collection<? extends E> c)|Adds all of the elements in the specified collection to this set if they're not already present (optional operation).|
|**remove**(Object o)|Removes the specified element from this set if it is present (optional operation).|
|**removeAll**(Collection<?> c)|Removes from this set all of its elements that are contained in the specified collection (optional operation).|
|**contains**(Object o)|Returns **true** if this set contains the specified element.|
|**containsAll**(Collection<?> c)|Returns true if this set contains all of the elements of the specified collection.|
|**size()**|Returns the number of elements in this set (its cardinality).|
|**clear()**|Removes all of the elements from this set (optional operation).|

- Sample code:
```java
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

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
- **ArrayList** and **LinkedList** are two most popular used List implementation.
- Frequent operations:

|  Method   | Description  |
|  -------  | -----------  |
|**add**(String item)|Adds the specified item to the end of scrolling list.|
|**add**(String item, int index)|Adds the specified item to the the scrolling list at the position indicated by the index.|
|**remove**(int position)|Removes the item at the specified position from this scrolling list.|
|**remove**(String item)|Removes the first occurrence of an item from the list.|
|**removeAll()**|Removes all items from this list.|
|**size()**|Returns the number of elements in this list.|

- Sample code:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

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
- most popular implementation of Map interface is **HashMap**, **LinkedHashMap**, **Hashtable**, and **TreeMap**.
- Frequent operations:

|  Method   | Description  |
|  -------  | -----------  |
|**entrySet()**|Returns a Set view of the mappings contained in this map.|
|**keySet()**|Returns a Set view of the keys contained in this map.|
|**values()**|Returns a Collection view of the values contained in this map.|
|**put**(K key, V value)|Associates the specified value with the specified key in this map (optional operation).|
|**get**(Object key)|Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.|
|**containsKey**(Object key)|Returns **true** if this map contains a mapping for the specified key.|
|**containsValue(Object value)**|Returns **true** if this map maps one or more keys to the specified value.|
|**size()**|Returns the number of key-value mappings in this map.|
|**isEmpty()**|Returns true if this map contains no key-value mappings.|
|**remove**(Object key)|Removes the mapping for a key from this map if it is present (optional operation).|
|**clear()**|Removes all of the mappings from this map (optional operation).|

- Sample code:
```java
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

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

- Reviewing code in **Set** and **Map**:
```java
import java.util.HashSet;
import java.util.Set;

public static void main(String[] args)
{
    Set<String> set = new HashSet<String>();
    set.add("one");
    set.add("two");
    set.add("three");

    for (String text : set)
    {
        System.out.println(text);
    }
}
```

```java
import java.util.HashMap;
import java.util.Map;

public static void main(String[] args)
{
    Map<String, String> map = new HashMap<String, String>();
    map.put("first", "one");
    map.put("second", "two");
    map.put("third", "three");

    for (Map.Entry<String, String> pair : map.entrySet())
    {
        String key = pair.getKey();         // key
        String value = pair.getValue();     // value
        System.out.println(key + ":" + value);
    }
}
```
![](java-collection-hierarchy.png)
