# Object Lifecycle
Creating any object causes the Java machine to allocate memory for it. Objects have their own lifecycle.
* Begin an object's life: **when it is created**. The Java virtual machine allocates the memory necessary to create the object.
  - The object is "alive" **as long as there are references to it**. As soon as there are no references, the object "dies".
* **Memory leaks**: one of the most unpleasant bugs. 
* Java's built-in **garbage collector (GC)**: an internal Java mechanism responsible for freeing up memory. GC reaches an object when the special `finalize()` method is called.
    ```java
    class Cat
    {
        String name;
    
        Cat(String name)
        {
            this.name = name;
        }
    
        protected void finalize() throws Throwable
        {
            System.out.println(name + " 已销毁");
        }
    }
    ```
  - `finalize()` method: belongs to the Object class. It's similar to `equals()`, `hashCode()` and `toString()`. Every object has it.
  - the garbage collector works in parallel with the program. It is not part of the program but runs separately.
* The Java machine itself determines whether to call finalize() on a case by case basis. **Don't rely on the finalize() method to release critical resources.**
