# Static
* 
“Java 方法分为两个类别。
实例方法是在对象上调用的，并且可以访问该对象的数据。
static 方法没有该访问权限，因为它们根本没有对象引用。
但是，它们可以引用类的 static 变量和其他 static 方法。

static 方法无法处理非 static 方法或非 static 变量！”



# Object Lifecycle
Creating any object causes the Java machine to allocate memory for it. Objects have their own lifecycle.
* Begin an object's life: **when it is created**. The Java virtual machine allocates the memory necessary to create the object.
  - The object is "alive" **as long as there are references to it**. As soon as there are no references, the object "dies".
* **Memory leaks**: one of the most unpleasant bugs. 
* Java's built-in **garbage collector (GC)**: an internal Java mechanism responsible for freeing up **_memory_** (Not the object itself). 
GC reaches an object when the special `finalize()` method is called.
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
            System.out.println(name + " destroyed");
        }
    }
    ```
  - `finalize()` method: belongs to the Object class. It's similar to `equals()`, `hashCode()` and `toString()`. Every object has it.
  - the garbage collector works in parallel with the program. It is not part of the program but runs separately.
* The Java machine itself determines whether to call finalize() on a case by case basis. **Don't rely on the finalize() method to release critical resources.**

* **Reachable Object** and **Unreachable Object**: 
  - **Root Reference**: the one created directly in executable code.
  - **Reachable Object**: if can trace along to reference chain from an object to the root reference. 
  - **Unreachable Object**: if the object drops out of this chain; none of the variables in the code currently being executed references it, and it cannot be reached through the reference chain.

* All Java objects are stored in a special area of memory called the **heap**. 
They could be divided into two types: **simple objects** and **long-lived objects**. 
  - **Long-lived Objects**: objects that have survived many rounds of garbage collection. They usually live until the program ends.