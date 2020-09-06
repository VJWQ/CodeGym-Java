# Reading from the keyboard
> [InputStream Class](#InputStream-Class)  
> [Scanner class](#Scanner-class)

## InputStream Class
```
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
```
There are two types of streams:
* **Input** streams are used to receive data
  - In Java, this stream is implemented by the **InputStream** class.
  - `System.in` is an **InputStream object**. It is an input stream linked to a system input device (the keyboard).

* **Output** streams are for sending data.
  - In Java, this stream is implemented by the **OutputStream** class.
  - `System.out` is the system output stream. It is used to output data to the console via the method `System.out.println()`.
* The **InputStream** class (`System.in` is an **InputStream object**) has a `read()` method that reads data. However, it reads bytes, not characters.
    ```
    while (true) {
        int x = System.in.read();
        System.out.println(x);
    }
    ```
* Use **InputStreamReader** class instead. It converts byte streams to character streams. 
    ```
    InputStreamReader reader = new InputStreamReader(System.in);
    while (true) {
       int x = reader.read();
       System.out.println(x);
    }
    ```
* Read data from the file: **FileInputStream** object. 
    ```
    InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("C:\\...\\testFile.txt"));
    ```
* Greater <u>performance</u> and <u>convenience</u>:use **BufferedReader**. 
  - <font color=green>**Performance**</font>: When **BufferedReader** reads data, 
it uses a special area called a buffer, where it "stores" the characters it reads. Ultimately, when these characters are 
needed in the program, they will be taken from the buffer, not directly from the data source (keyboard, file, etc.). 
This saves a lot of resources.   
<font color=red>**`BufferedReader`** + **`InputStreamReader`** is __*faster*__ than **`InputStreamReader`** alone.</font>

  - <font color=green>**Convenience**</font>: **BufferedReader** can read only <u>one character</u> at a time with `read()` method, 
  or <u>whole lines</u> with `readLine()` method. This is especially useful when reading large amounts of data. 
      ```
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.read();
      String s = reader.readLine();
      ```
    
## Scanner class
```
import java.util.Scanner;
```
The scanner's data source doesn't have to be a string. 
* `nextLine()` method accesses the data source, finds the next unread line, and returns it.  

```
Scanner scanner = new Scanner("It matters not how strait the gate,\n" +
       "How charged with punishments the scroll,\n" +
       "I am the master of my fate,\n" +
       "I am the captain of my soul");
String s = scanner.nextLine();
System.out.println(s);
s = scanner.nextLine();
System.out.println(s);
```
* `nextInt()`: reads and returns the entered number. 
* `hasNextInt()`: checks whether the next chunk of input data is a number (returns true or false, as appropriate). 
* `hasNextLine()`: checks whether the next chunk of input is a string. 
* `hasNextByte()`, `hasNextShort()`, `hasNextLong()`, `hasNextFloat()`, `hasNextDouble()`: perform similar checks for the remaining data types. 
* `useDelimiter()`: pass a string that contains the characters we want to use as separators or delimiters to this method. 
* `close()`: like any object working with I/O streams, the scanner must be closed when it is done so it stops consuming the computer's resources.






