# Variable Visibility

## Local variables
- **declared** <font color="red">in</font> methods, constructors, or blocks; 
- **created** when the method, constructor or block is entered; **destroyed** once it exits the method, constructor, or block; 
  - once the program reaches the end of the method (or block), the local variable disappears from memory.
- **access modifiers** cannot be used for local variables.
- <font color="blue">visible only within the declared method, constructor, or block</font>.
- implemented at stack level internally.
- <font color="red">have no default value</font>; 
  - local variables should be declared and an initial value should be assigned before the first use.

## Instance variables
- **declared** <font color="red">in</font> a class, but <font color="red">outside</font> a method, constructor or any block. Can be declared in class level before or after use.
- when a space is allocated <font color="red">for an object</font> in the heap: a slot <font color="red">for each instance variable value</font> is created.
- **created** when an object is created with the use of the keyword `new` and **destroyed** when the object is destroyed.
- hold values that <font color="green">must be referenced by more than one</font> method, constructor or block, or essential parts of an object's state that <font color="green">must be present throughout the class</font>.
- **access modifiers** can be given for instance variables.
- <font color="blue">visible for all methods, constructors and block in the class</font>. 
  - Normally, it is recommended to make these variables private (access level). 
  - However, visibility for subclasses can be given for these variables with the use of access modifiers.
- <font color="red">have default value</font>; 
  - For numbers, the default value is `0`;
  - For Booleans it is `false`;
  - For object references it is `null`. 
  - Values can be assigned during the declaration or within the constructor.
- can be accessed directly by calling the variable name inside the class. 
  - However, within static methods (when instance variables are given accessibility), they should be called using the fully qualified name. `ObjectReference.VariableName`.


## Class/Static variables
- **declared with the static keyword** <font color="red">in</font> a class, but <font color="red">outside</font> a method, constructor or any block. 
- one copy of each class variable per class, regardless of how many objects are created from it.
- <font color="red">rarely used other than being declared as constants</font>. 
  - Constants are variables that are declared as **public/private**, **final**, and **static**. 
  - Constant variables **<font color="red">never change from their initial value</font>**.
- <font color="green">stored in the static memory</font>. It is rare to use static variables other than declared final and used as either public or private constants.
- **created** when the program starts and **destroyed** when the program stops.
- visibility is similar to instance variables. 
  - However, most static variables are declared public since they must be available for users of the class.
- <font color="red">default values are same as instance variables</font>; 
  - For numbers, the default value is `0`;
  - For Booleans it is `false`;
  - For object references it is `null`. 
  - Values can be assigned during the declaration or within the constructor.
  - Additionally, <font color="red">values can be assigned in special static initializer blocks</font>.
- Static variables can be accessed by calling with the class name `ClassName.VariableName`.
- When declaring class variables as `public static final`, then variable names (constants) are <font color="red">all in upper case</font>. 
  - If the static variables are not public and final, the naming syntax is the same as instance and local variables.


