/**
 * The `javap` command is a utility provided by the Java Development Kit (JDK) that displays information about the members of a compiled Java class. 
 * In this case, the `javap` command is used to display information about the `Integer` class from the `java.lang` package.
 * 
 * The `Integer` class is a wrapper class for the primitive type `int` in Java. It provides various methods and constants for working with integer values.
 * By using the `javap` command with the `java.lang.Integer` class, you can see the details of its members, such as fields, constructors, and methods.
 * 
 * To use the `javap` command, you need to have the JDK installed on your system and set up the Java environment variables properly.
 * Once you have the JDK installed, you can open a command prompt or terminal and run the `javap` command followed by the fully qualified name of the class you want to inspect.
 * In this case, the command would be `javap java.lang.Integer`.
 * 
 * Running the `javap` command will display the details of the `Integer` class, including its fields, constructors, and methods, along with their signatures and modifiers.
 * This information can be useful for understanding how the `Integer` class is implemented and for exploring its available functionality.
 */
/**
 * This code snippet demonstrates the usage of the `javap` command to inspect the methods of the `java.lang.Integer` class.
 * The `javap` command is a command-line utility that displays information about the members of compiled Java classes.
 * In this case, it is used to display the methods available in the `Integer` class.
 */
Java is class based high level, object oriented programming language which is statically typed, both compiled and interpreted language and it follow's the write once run anywhere principle.

(java's byte code makes it platform independent and secure. java is the most popular programming language and it is used in the development of web applications, mobile applications, enterprise applications, and embedded systems.)

Java is high level, platform independent, object oriented, secure, robust, distributed, multi-threaded, portable, and dynamic language


# Introduction

## 1. Instruction Note

## 2. Download and Install JDK
![alt text](image.png)
For writing and developing java programs, we require JDK

JDK will have a compiler and runtime environment, which will help us write Java programs and execute them.

Along with the installation of JDK, we will get the JRE and JVM.

JDK means Java Development Kit which contains debugging tools, development tools(Javac, Java), and JRE

for executing java programs we requie jvm which is the part of JRE

we say java programs are executed in JRE, but actually, they are executed in JVM

### Installation
![alt text](image-1.png)
1. Go to the Oracle website and download the JDK
2. Install the JDK
3. Set the environment variables
preferred to set at the system variables
4. Verify the installation
cmd> java -version
cmd> javac -version

preferred version is LTS(Long Term Support) version
JAVA 8 is popular and widely used
(in the course java 13 or 14 is used)

File explorer> C:\Program Files\Java\jdk-14.0.1\bin
with java dir all the java versions will be installed
![alt text](image-2.png)

>dir    //to see the list of files in the directory
>md java  //to create a directory

```java
import java.lang.*;//importing the lang package happens by default
class Hello{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```

when you are writing the first code in notepad then recommeded to save the file with .java extension
![alt text](image-3.png) 
//wrapp around double quotes
![alt text](image-4.png)

- to compile java program
>javac Hello.java
- to run java program
>java Hello

## 5. Skeleton of Java Program
![alt text](image-5.png)
lang is basic package and get's imported by default

class name should be same as the file name
inside the class, we can have multiple methods
main method is the entry point of the program

if your compiling and running the program from cmd
![alt text](image-6.png)

if you want to use anything from the class, then you need to create the object of the class.
if it is static then you can directly use it without creating the object of the class

JVM initially calls the main method of the class
First.main() 


in java there is nothing outside the class and object
System.out.println() is the method of the out object of the System class

## 6. Exploring the First Skeleton Program
System class is present in the lang package
out is the object of the PrintStream class
println is the method of the PrintStream class

when class is public then the file name should be same as the class name
when class is not public then the file name can be anything

<!-- read and understand the erros -->
<!-- IMP : FS, COLLECTION FW, MULTITHREADING, EXCEPTION HANDLING -->
![alt text](image-8.png)

![alt text](image-9.png)
![alt text](image-10.png)

## 7. Reading from Keyboard
java provides a class called scanner that is used for reading the input from different sources like keyboard, etc.

util is the built-in package in java, which contains the scanner class

```java
import java.util.Scanner;
class Hello{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("The number is "+a);
    }
}
```

class Scanner
- nextInt() : reads the integer
- nextFloat() : reads the float
- nextDouble() : reads the double
- next() : reads the string
- nextLine() : reads the line
- nextBoolean() : reads the boolean
- nextByte() : reads the byte
- nextShort() : reads the short
- nextLong() : reads the long

//before reading the input , you need to verify the data
- hasNextInt() : checks if the next token is an integer
- hasNextFloat() : checks if the next token is a float

//close the scanner resource
- close() : closes the scanner

## 8. Reading the scanner
System.out is the object attached to the console
System.in is the object attached to the keyboard

Scanner class is used to read the input from the keyboard

exception are the runtime errors which abruptly terminate the program need to be handled
```java
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two number : ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("sum is "+(a+b));
        sc.close();
    }
}
```

>javap java.util.Scanner

//is used to see the methods of the class

# Section 2: Data Types and Operators
## 10. Introduction to Data Types
Data types are used to define the type of data a variable can store
Date is the most important part of the program and ingredients of the program on which we perform the operations and do the processing

when program is running in the memory then the data of the program is hold by the variables

variables are meant for storing the data
variables has the type of data and the name of the variable

primitive data types are the basic data types and inbuilt data types of the java program 
![alt text](image-11.png)
![alt text](image-12.png)

depending the size of data that specific data type can be used.

java supports the unicode character set means it supports the international languages
char is 2 bytes and unicode format

float follows the IEEE 754 standard
double follows the IEEE 754 standard

float is able to store the long

## 11. check size and range of the data types
for primitive data types there are equivalent wrapper classes are available. In those classes there are some constants are available which are used to check the size and range of the data types

```java
class Main{
    public static void main(String args[]){
        System.out.println("Size of int : "+Integer.SIZE);
        System.out.println("Size of int : "+Integer.BYTES);
        System.out.println("Min value of int : "+Integer.MIN_VALUE);
        System.out.println("Max value of int : "+Integer.MAX_VALUE);
    }
}
```

>javap java.lang.Integer

during the execution of the program, the data is stored in the variables and the variables are stored in the memory

local variables must be initialized before using them
instances variables are initialized by default values
```java
class Main{
    int a; //instance variable
    public static void main(String args[]){
        int b; //local variable
        System.out.println(a);
        System.out.println(b);
    }
}
```
if float is given to int
then it will give the error
```java
class Main{
    public static void main(String args[]){
        float a = 10.2;
        int b = a;
        System.out.println(b);
    }
}
```

## 13. Rules for variable names
while developing the big programs, we need to follow the naming conventions and the rules for the variable names

1. variables are case sensitive
2. variables can start with the alphabet, underscore, and dollar sign
eg. int room_number, cabin151, _room, $room

3. after the first character, we can use the digits
4. we can't use the reserved keywords as the variable names
5. we can't use the special characters except the underscore and dollar sign
6. we can't use the spaces in the variable names
7. we can't use the length more than 255 characters
8. we can't use the same name for the class and the variable
9. we can't use the same name for the method and the variable
![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/734d006a-a500-4fe9-89bd-626610847c8a)

int String;
(above is allowed but not recommended)

camelCase is the recommended naming convention for the variables and the methods
eg. roomNumber, averageMarks, studentName, employeeSalary
PascalCase is the recommended naming convention for the classes
UPPERCASE is the recommended naming convention for the constants
eg. PI, MAX_VALUE, MIN_VALUE

sample variable names:
int rollNumber$Student; //allowed
int rollNumber_Student; //allowed
int rollNumber-Student; //not allowed
int rollNumber Student; //not allowed
int rollNumberStudent; //allowed (camelCase) //recommended
class Student{} //allowed (PascalCase) //recommended
final int PI = 3.14; //allowed (UPPERCASE) //recommended

![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/dff7932c-d4f6-4384-9ff0-d2c34b6395b5)

![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/c8d0f773-1aa4-46f4-b0dc-c9a7b73a12f6)

integer literal can be represented in various number systems.
decimal
binary
octal 
hexadecimal
![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/7d6cdeff-124c-413f-8d58-d425674db832)
![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/ab32c374-ffcc-4491-a74c-626fc198c843)

## 15. Integra Data Types in Detail

olden days we have 16 and 32 bit systems

now modern days we have 64 bit systems

in a single shot how many bits are processed by the CPU is called the word size of the CPU
cycle = 1 bit processing by the CPU
in a single cycle, the CPU can process the data of the word size
word size is the number of bits processed by the CPU in a single cycle

java has short and byte to support the backward compatibility with olden languages like C , cobol, etc

byte takes 8 bits
in 7 bits what is the least value can be stored is -128
in 7 bits what is the max value can be stored is 127
7th bit is used for the sign
![alt text](image-13.png)


## 16. check binary bits of an integer
to see the binary bits of the integer we can use the wrapper class method toBinaryString()
```java
class Main{
    public static void main(String args[]){
        System.out.println(Integer.toBinaryString(10));
    }
}
```
other methods 
- toHexString()
- toOctalString()

## 17. Floating Point and Character in Detail
float and double are the floating-point data types
decimal point is not stored in the memory
then how the decimal point numbers are stored in the memory ?
![alt text](image-14.png)
represented in the scientific notation
it is represented in the mantissa and the exponent
upto 6-7 decimal places float is suitable
upto 15 decimal places double is suitable

ASCII is the 7 bit character set
A,B,C...Z (65,66,67...90)
a,b,c...z (97,98,99...122)
0,1,2,3,4,5,6,7,8,9 (48,49,50,51,52,53,54,55,56,57)
+, -, *, /, %, &, |, ^, ~, <<, >>, >>> (43,45,42,47,37,38,124,94,126,60,62,62,62)
Unicode is the 16 bit character set

boolean size is not defined in the java, it is JVM dependent

## visiting unicode.org
https://unicode.org/charts/
click the language you need
that are hexadecimal codes

//devangri
// class Main{
//     public static void main(String arg[]){
//         // char c = 0x03C8;

//         //greek language
//         for(char c =0x0900;c<=0x0970;c++)
//             System.out.print(c+" ");
//     }
// }

float f=35.6; it is invalid. 35.6 is a double literal. it should be float f=35.6f;

# Section 3: Setup Java Environment
## 19. Notepad++ Installation
## 20. Eclipse Installation
## 21. NetBeans Installation
## 22. IntelliJ IDEA Installation

# Section 4: Features and Architecture of Java
## 23. Compiler vs Interpreter
interpreter and compiler are used for translating our programs into the machine language and executing them

compiler translates the entire program at once and then executes the program. separate compiled file is created.

interpreter translates the program line by line and then executes the program.each time translation is done during execution.
(line by line translation and execution.)
interpreter language are easy to debug and learn
compiler languages are fast and efficient and difficult to debug
java is both compiled and interpreted language

## 24 How java is platform independent
java is platform independent because of the JVM
java is platform independent because of the byte code

program makes the system calls to the OS.
in java the system calls are made by the JVM

JVM and byte code makes the java platform independent.
![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/e5bcb8d7-4fe5-41ed-956f-2090a1ba6a5e)
![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/d0d0b8ba-d400-495a-9f14-71d308b84d1e)
![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/38be9c08-35af-4115-8f92-f42f2c02fabc)
program uses the resources via OS
![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/31679689-05c9-4ed3-ad26-be7239f756d7)

WRITE ONCE RUN ANYWHERE
![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/94ef29b2-cc7e-45f1-a06f-83416658cc7b)
Byte code and JVM makes the JAVA platform independent.
![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/c91e5dd0-cb68-41f2-87c4-4f4c02bdf0d2)

eg
c++
![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/c6feef82-d6d2-41d6-b0a4-fd7c0c995410)
![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/8883f31f-cd2b-4157-975c-33f900943565)



## 26. JVM Architecture
=> Class Loader Subsystem
=> Memory Area
=> Execution Engine (interpreter + JIT compiler)
=> Native Method Interface

![alt text](image-15.png)
literals are kept in the string pool

```java
String s1 = "hello";
String s2 = "hello";
String s3 = new String("hello");
```
cpu store the addresses of instruction for next instruction to execute
![alt text](image-16.png)

external
![alt text](image-17.png)

## 27 JVM architecture in Detail
![alt text](image-18.png)

{
3)Application class loader loads the classes (our classess) whatever we are using in our program

below boths loads the runtime required classes for the JVM
1)bootstrap class loader loads the classes which are present in the rt.jar file (jre>lib (rt.jar) >ext dir )
2)extension class loader loads the classes which are present in the ext folder
}
whichever class is loaded then its object is created inside the heap area (methods are loaded inside the loading area)= Reflection API

{
Linking is the process of combining the code of the class with the code of the other classes
1)VERIFY checks the byte code is valid or not (secure) (byte code is perfect byte code or not)(if problem or different pattern or secure of not)
2)PREPARE allocates the memory for the static variables and initializes the default values
3)RESOLVE replaces the symbolic references with the direct references (actual linking of the code happens here)
}

{
Intialization is the process of executing the static blocks and initializing the static variables
}

stack has multiple treads and each thread has its own stack and pc register has the address of the next instruction to execute

Interpreter reads the byte code and executes the instructions
JIT compiler compiles the byte code into the native code and then executes the native code
Garbage collector (execution engine) is the part of the memory area which is used to destroy the objects which are not in use

## 28. Java Features
1. Simple (syntax is similar to C and C++ and easy to learn and write the programs)
2. secure (java is secure because of the byte code and the JVM) (viruses can't be created in java)
3. Portable and platform independent (java is portable because of the byte code and the JVM)
4. Object Oriented (java is object oriented because of the classes and objects) (encapsulation, inheritance, polymorphism, abstraction)
5. Robust (java is robust because of the exception handling and the garbage collector)
6. Multithreaded (java is multithreaded because of the threads)
7. Architecture Neutral (Hardware and OS neutral)(java follows von neumann architecture)
8. Interpreted (java is interpreted because of the JVM)
9. High Performance (java is high performance because of the JIT compiler)
10. Distributed (java is distributed because of the RMI and EJB) (RMI is used for the remote method invocation and EJB is used for the enterprise java beans) (RMI and EJB are outdated) (spring framework is used in modern days and spring boot is used for the microservices)
11. Dynamic (java is dynamic because of the reflection and the class loader)(running form of the program from one machine to another machine is possible)
![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/cc6d4cf6-747b-4698-bbcb-5ed1b187ca67)

![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/6b534fce-f9e2-49a5-bfb0-2c942a3fe381)

# Section 5: operators and expressions 
## 29.Arithmetic operators and expressions
Arithmetic operations can't be performed on the boolean data type
in java mod operator can be used for the float and double data types
```java
class Main{
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
```
p)area of triangle (2 ways)
p)roots of quadratic equation
1 1 1 = NaN
1 -4 4 = 2 2
1 5 6 = -2 -3


java 8 mention all topics below
lambda expression
functional interface
stream api
date and time api
default methods
static methods
method reference

Here are some of the key features introduced in Java 8:

Lambda Expressions and Functional Interfaces: Lambda expressions provide a concise way to write anonymous functions, while functional interfaces define the signature of these functions. This enables functional programming concepts like mapping, filtering, and reducing collections.

Stream API: The Stream API offers a powerful mechanism for processing collections in a declarative manner. It allows you to chain operations like filtering, mapping, and reduction on streams of elements, leading to more readable and concise code.

Default and Static Methods in Interfaces: Java 8 allows adding default and static methods to interfaces. Default methods provide a way to define default behavior for an interface, while static methods can contain utility functions.

Optional Class: The Optional class helps deal with null values in a more elegant and safer way. It provides methods to check for nullity, extract values, and handle null cases more effectively.

Java Date and Time API: This new API replaces the old and cumbersome java.util.Date class with a modern and intuitive API for working with dates, times, and timezones.

Collection API Improvements: Java 8 introduced several improvements to the Collection API, including methods like forEach for iterating over elements, and factory methods for creating collections more conveniently.

Other Improvements: Java 8 also introduced various other enhancements, including:

Base64 encoding and decoding support
Nashorn JavaScript engine for embedded scripting
Improvements to concurrency and IO APIs
These are some of the major features introduced in Java 8 that have significantly impacted Java development. They have made Java code more concise, readable, and expressive, enabling developers to write more functional and efficient programs.
 

**coercion** is the process of converting the data from one type to another type
![alt text](image-19.png)

(5*10/2) is the expression

### calculate the area of triangle

### quadratic equation
![alt text](image-20.png)
1 1 1 Nan
1 -4 4 2 2
1 5 6 -2 -3

p) cuboid 
2*(lb+lh+bh);

INCREMENT AND DECREMENT OPERATORS
![alt text](image-21.png)

increment and decrement can be performed on characters
```java
class Main{
    public static void main(String args[]){
        char c = 'A';
        System.out.println(c);
        System.out.println(++c);
        System.out.println(c);
    }
}
```
check
```java
class Main{
    public static void main(String args[]){
        byte b = 5;
        b = b+1;
        System.out.println(b);
        
    }
}
```


when arithematic operations performed on byte the result will be int
when arithematic operations performed on short the result will be int
![alt text](image-22.png)

## 36. Bitwise Operator - AND, OR and XOR
![alt text](image-23.png)

Bitwise AND
![alt text](image-24.png)
![alt text](image-32.png)

Bitwise OR
![alt text](image-25.png)
![alt text](image-33.png)

Bitwise XOR
![alt text](image-26.png)
![alt text](image-34.png)

Bitwise Left Shift
![alt text](image-27.png)
![alt text](image-28.png)
![alt text](image-35.png)

Bitwise Right Shift
![alt text](image-29.png)
![alt text](image-36.png)
![alt text](image-37.png)

Bitwise unsigned Right Shift
![alt text](image-30.png)
NOTE : minior mistake in the above image
![alt text](image-38.png)
![alt text](image-39.png)
![alt text](image-40.png)
Bitwise NOT
![alt text](image-31.png)


![alt text](image-41.png)

## Merging and Masking
Merging means combining the bits of two numbers
Masking means extracting the bits of the number
MASKING | 
![alt text](image-42.png)
![alt text](image-43.png)

MERGING &
![alt text](image-44.png)

```java
class Main{
    public static void main(String args[]){
        int a = 0x0F;
        int b = 0x0A;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(a<<2);
        System.out.println(a>>2);
        System.out.println(a>>>2);
    }
}
```

EG : SUPPOSE TO STORE THE 0 TO 10 NUMBER byte data type is enough 
can we able to store in less space (through masking and merging)
0 to 10 to store 4 bits are enough
storing 5 and 9 in 1 byte
![alt text](image-45.png)
like the below we can store
![alt text](image-46.png)

how to retrieve the 5 and 9 from the 1 byte by using &  
![alt text](image-47.png)

storing 2 numbers in single byte
![alt text](image-48.png)
![alt text](image-49.png)

## 41. Widening and Narrowing

Widening is the process of converting the data from the lower data type to the higher data type
Narrowing is the process of converting the data from the higher data type to the lower data type

character we can assign char and int
![alt text](image-50.png)

![alt text](image-51.png)

# Section 6: Strings
String
StringBuffer
StringBuilder
![alt text](image-52.png)
out is the static object of the PrintStream class
Method with same name and different parameter list = method overloading
print() is overloaded method
![alt text](image-53.png)

![alt text](image-54.png)

![alt text](image-55.png)

![alt text](image-56.png)

order of taking arguments

![alt text](image-57.png)

### Format Specifier
![alt text](image-59.png)

float width and precesion
![alt text](image-60.png)

float
![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/cda88990-3cfb-48c2-8cc5-2c01a97a167b)


## 45. String Object

String is a builtin class available in the java.lang package and it is immutable. used like a data type.

String is a collection of characters.

String str1 = "Java Programming"; //String literal
                //string object

![alt text](image-61.png)

char c[] = {'a','b','c','d'};
String s = new String(c);
//converted to string

byte b[] = {65,66,67,68};
String s1 = new String(b);
//converted to string0
constructor is called once object is created.
String s2 = new String("Java Programming"); // 2 objects are created

String s3 = "Java Programming";
//string literal is created in the string pool
![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/d6ce3977-37a8-457b-ba3d-28ed6724a002)

java maintains the string pool for the string literals

>javap java.lang.String

compare the references
String str1 = "Java";
String str2 = "Java";
String str3 = new String("Java");
String str4 = new String("Java");
System.out.println(str1==str2); //true
System.out.println(str1==str3); //false
System.out.println(str3==str4); //false

## 47. String Methods#1
![alt text](image-62.png)

.toUpperCase() won't changes the original string
new string object is created and reference is changed.

## 53.Regular Expressions

![alt text](image-63.png)

![alt text](image-64.png)

![alt text](image-65.png)

---
![alt text](image-66.png)
![alt text](image-67.png)
![alt text](image-68.png)

---
![alt text](image-69.png)
![alt text](image-70.png)
![alt text](image-71.png)

----
![alt text](image-72.png)
![alt text](image-73.png)
find number of words
![alt text](image-74.png)

![alt text](image-75.png)

# Section 7 Control Statements
## 58.Relational and logical operators
![alt text](image-76.png)
all this returns boolean value

## 59. if else statement
![alt text](image-77.png)

![alt text](image-78.png)

![alt text](image-79.png)

![alt text](image-81.png)

![alt text](image-82.png)


![alt text](image-84.png)
![alt text](image-85.png)
https://www.codingninjas.com/studio/library/leap-year-program-in-java

https://www.geeksforgeeks.org/java-program-to-find-if-a-given-year-is-a-leap-year/
![alt text](image-86.png)
![alt text](image-87.png)

switch case
![alt text](image-83.png)
![alt text](image-88.png)

![alt text](image-89.png)

CAREFULL STUDY
![alt text](image-90.png)

![alt text](image-91.png)

quiz
![alt text](image-92.png)

![alt text](image-93.png)

# Section 8: LoopS
GCD, HCF and LCM 

![alt text](image-94.png)
(pre test loop)
while loop executes as long as the condition is true

do while is (post test loop)
do while loop executes atleast once and then checks the condition
![alt text](image-95.png)

![alt text](image-96.png)

![alt text](image-97.png)



while(true){
    //infinite loop
}
System.out.println("Hello");
//unreachable code //compilation error

if(true){
    System.out.println("Hello");
}
else{
System.out.println("Bye");
}// unreachable code 
//compilation warning.

for loop is the counter controlled loop
![alt text](image-98.png)
![alt text](image-99.png)

print in reverse order

## 72.sc : Factorial  
![alt text](image-100.png)

1.
![alt text](image-101.png)
2.
![alt text](image-103.png)
3.
![alt text](image-104.png)
![alt text](image-105.png)

---

## 73.Armstrong
== sum of the cubes of the digits of the number is equal to the number itself
![alt text](image-111.png)

![alt text](image-106.png)
1.
![alt text](image-107.png)
![alt text](image-108.png)
2.
![alt text](image-109.png)
![alt text](image-110.png)
3.
![alt text](image-112.png)
![alt text](image-113.png)

## 74. sc : palindrome number

4.
![alt text](image-114.png)
![alt text](image-115.png)
![alt text](image-116.png)
![alt text](image-117.png)

5.
![alt text](image-118.png)

## 75.
![alt text](image-119.png)
![alt text](image-120.png)

![alt text](image-121.png)
use switch case 

CODE
![alt text](image-122.png)

![alt text](image-123.png)
(usage : above code is use full in certificates)

## 76.
![alt text](image-125.png)
1.
ap = starting term and common difference
![alt text](image-126.png)
![alt text](image-127.png)
2.
![alt text](image-128.png)
![alt text](image-129.png)
![alt text](image-130.png)
![alt text](image-131.png)
![alt text](image-132.png)
![alt text](image-133.png)

## 77. Nested Loops
![alt text](image-134.png)
![alt text](image-135.png)

![alt text](image-136.png)
![alt text](image-137.png)
---
![alt text](image-138.png)
---
![alt text](image-139.png)
![alt text](image-140.png)
---
![alt text](image-141.png)
![alt text](image-142.png)
---
![alt text](image-143.png)
![alt text](image-144.png)
![alt text](image-145.png)
![alt text](image-146.png)

## 79. 
![alt text](image-147.png)
---
![alt text](image-148.png)
---
![alt text](image-149.png)
---
![alt text](image-150.png)
---
![alt text](image-151.png)
---
![alt text](image-152.png)
---
![alt text](image-153.png)
quiz
![alt text](image-154.png)

# Section 9: Arrays

## 81. 1D array
== collection of similar data elements
![alt text](image-155.png)

//eg. x = [5,2,1,4,3]

int a[] = new int[5];
a[] = {5,2,1,4,3}
- every array in java is an object and every array object is created in the heap memory
a[] = is the reference
int[5] = is the array object

- size of the array is fixed
property
System.out.println(a.length);

arr[5] = {5,2,1,4,3};

- array index starts from 0
- array index ends at n-1
- array index can be positive and negative
- array index can be int and char
![alt text](image-156.png)

### for each loop
for(int x:arr){
    System.out.println(x);
}

we can only access in the forward direction only.

for each loop doesn't have index

array is mutable
values can be incremented using the counter controlled loop

![alt text](image-157.png)
![alt text](image-158.png)
![alt text](image-159.png)
1.
![alt text](image-160.png)
2.
![alt text](image-161.png)

![alt text](image-162.png)

4.
![alt text](image-163.png)

![alt text](image-164.png)

## 84.
![alt text](image-165.png)
1. left rotation
![alt text](image-166.png)
try right rotation

![alt text](image-167.png)

inserting an element in middle or given index
![alt text](image-168.png)

code for the below diagrams
![alt text](image-169.png)

![alt text](image-170.png)

![alt text](image-171.png)

![alt text](image-172.png)

![alt text](image-173.png)

![alt text](image-174.png)

![alt text](image-175.png)
array of ref
array of elems
![alt text](image-176.png)
![alt text](image-177.png)

ref's of 2d and 
![alt text](image-178.png)
and declaration

![alt text](image-179.png)

![alt text](image-180.png)

![alt text](image-181.png)
![alt text](image-182.png)



## 88. sc : matrix mul

![alt text](image-183.png)

---
![alt text](image-184.png)
![alt text](image-185.png)
---
mul
![alt text](image-186.png)
![alt text](image-188.png)
![alt text](image-189.png)
![alt text](image-190.png)
![alt text](image-191.png)
CODE
![alt text](image-192.png)
first check with identity matrix

inbuilt sort
![alt text](image-193.png)

# Section 10: Methods
![alt text](image-194.png)
=methods are the members of the classes, which provides the functionality for the class.

methods/subroutines/functions

- skeleton of method
![alt text](image-195.png)

int max(int x, int y){
    if(x>y){
        return x;
    }
    else{
        return y;
    }
}

![alt text](image-196.png)

respective parameter are copied 
![alt text](image-197.png)
![alt text](image-198.png)
actual parameter and formal parameters

(pass by value and pass by reference)

static methods can call only static method
it can't call non static methods

CALL BY VALUE
value of actual parameter will not be modified by the formal parameter
![alt text](image-199.png)

## 91. Passing Obj as the parameter.
![alt text](image-200.png)

![alt text](image-201.png)

eg.
![alt text](image-202.png)

## 93.
![alt text](image-203.png)

![alt text](image-205.png)

![alt text](image-204.png)

## 94. sc : find prime number

![alt text](image-206.png)

![alt text](image-207.png)
---
![alt text](image-208.png)

![alt text](image-209.png)

![alt text](image-210.png)
Algorithm for gcd
![alt text](image-211.png)

![alt text](image-212.png)

![alt text](image-213.png)

## 95.
![alt text](image-214.png)

methods having same name and different parameter list( Order of the parameters, type of the parameters, number of parameters)

![alt text](image-215.png)

incompatible type possible loss of conversion
![alt text](image-216.png)

name is same, but method call is different this is know as false polymorphism (behaviour is different, based on the parameters)
return type is not considered for the method overloading

## 97. SC : overload validate method
![alt text](image-217.png)
![alt text](image-218.png)
![alt text](image-219.png)

![alt text](image-220.png)

![alt text](image-221.png)

![alt text](image-222.png)
3.
![alt text](image-223.png)

**variable arguments**
## 98.
![alt text](image-224.png)
![alt text](image-225.png)

![alt text](image-226.png)
printf uses the ellipse in c

var args is more powerfull than array
![alt text](image-227.png)

inbuilt methods of the var args
![alt text](image-228.png)
.lenght

try it
![alt text](image-229.png)

![alt text](image-230.png)

variable arguments must be the last parameter in the method
100.
![alt text](image-231.png)

1.
![alt text](image-232.png)
![alt text](image-233.png)
2. 3.
![alt text](image-234.png)

**command line args**
![alt text](image-235.png)
![alt text](image-236.png)

![alt text](image-237.png)
![alt text](image-238.png)

## 103. Recursion
![alt text](image-240.png)
= calling the method itself
java is not optimized for the recursion
java supports the recursion
eg.rubber band
![alt text](image-239.png)
first value is printed then the recursive call is made
RECURSION
![alt text](image-241.png)
first recursive call is made then the value is printed

loop can also do
![alt text](image-242.png)

then why recursion ?
see recursion, when it is calling itself again and again.Then it'll return back. so while returning also it can do something
while returning it can do something
and it can be used in the tree traversal
(this can't be done in the loop. easily)

recursion is not used much as it takes extra memory and time.
in problem solving, mathematics -> recursion is used
(maths doesn't have loops, so recursion is used)


# Section 11: OOPs

## 104 : principles of oops
learning oops and java is different (oops is the concept and general)
- principles of oops
1. Abstraction
2. Encapsulation
3. Inheritance
4. Polymorphism

this concepts are related to the real world things
**Abstration** means hiding the internal details and showing the only required things
eg. TV = just on and off button is shown, but internally there are many things (like circuits, etc)
eg. car = just steering wheel, accelerator, brake, etc are shown, but internally there are many things (like engine, etc)
**Encapsulation** means wrapping the data and the methods into a single unit
eg. TV = wire and circuits are wrapped in the plastic (capuled as a single unit)
eg. car = engine, gear, etc are wrapped in the metal body (capuled as a single unit)
**Inheritance** means acquiring the properties of the parent class (reusability, code reusability, borrowing the features) 
eg. TV = CRT, LCD, LED, etc are the child classes and the parent class is the TV
eg. car = car is the parent class and the child class is the sports car, luxury car, etc

**Polymorphism** 
smartphone = mi, samsung, pixel, motrolla,
car = toyota, honda, maruthi, etc

1.generalization (inheritance)
2.specialization (overloading and overriding)

abstraction = hiding the complexity and showing the essential things
encapsulation = wrapping the data and the methods into a single unit
inheritance = acquiring the properties of the parent class
polymorphism = one name and multiple forms

## 105. class vs object
class is the blueprint/template/collection of the object
object is the instance of the class

any thing in the world is defined in terms of properties and behaviours
properties = variables / fields / data members (nouns and adjectives)
behaviours = methods / functions / operations (verbs)

class is the collection of the properties and the behaviours

how to define an object
![alt text](image-243.png)
![alt text](image-244.png)
![alt text](image-245.png)

## 106. How to write the class

![alt text](image-246.png)

computations are made as the methods
![alt text](image-247.png)

![alt text](image-248.png)
![alt text](image-249.png)

---
![alt text](image-250.png)
![alt text](image-251.png)
![alt text](image-252.png)
---
![alt text](image-253.png)
```java

package java1;

class Circle 
{
    public double radius;
    
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
            
    
}
public class Java1 {

    public static void main(String[] args) {
     Circle c1=new Circle();
     c1.radius=7;
     System.out.println("Area:"+c1.area());
     System.out.println("Perimeter:"+c1.perimeter());
     System.out.println("Circumference:"+c1.circumference());
    }
    
}
```
for every class java has to create a separate file

```java
package rectangletest;

class Rectangle
{
    public double length;
    public double breadth;
    
    public double area()
    {
        return length*breadth;
    }
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }
    
}

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=10.5;
        r.breadth=5.5;
        
        System.out.println("Area"+r.area());
        System.out.println("perimeter"+r.perimeter());
        
        System.out.println("Is it a Square"+r.isSquare());
    }
    
}
```

```java
package cylindertest;

class  Cylinder
{
    private int radius;
    private int height;
    
    public Cylinder()
    {
        radius=height=1;
    }
    public Cylinder(int r,int h)
    {
        radius=r;
        height=h;
    }
    public int getHeight()
    {
        return height;
    }
    public int getRadius()
    {
        return radius;
    }
    
    public void setHeight(int h)
    {
        if(h>=0)
            height=h;
        else
            height=0;
    }
    public void setRadius(int r)
    {
        if(r>=0)
            radius=r;
        else
            radius=0;
    }
    public void setDimensions(int h,int r)
    {
        height=h;
        radius=r;
    }
    
    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double drumArea()
    {
        return 2*lidArea()+perimeter()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }
}


public class CylinderTest {

    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.setHeight(10);
        c.setRadius(7);
        c.setDimensions(10, 7);
        
        System.out.println("LidArea "+c.lidArea());
        System.out.println("Circumference "+c.perimeter());
        System.out.println("totalSurfaceArea "+c.drumArea());
        System.out.println("Volume "+c.volume());
        System.out.println("Height"+c.getHeight());
        System.out.println("Radius"+c.getRadius());
        
    }
    
}
```

```java
package scoops3;


class Subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;
    
    public Subject(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtain(){return marksObtain;}
    
    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }
    public void setMarksObtain(int m)
    {
        marksObtain=m;
    }
    boolean isQualified()
    {
        return marksObtain>=maxMarks/10*4;
    }
    public String toString()
    {
        return "\nSubject ID:"+subID+"\nName :"+name+"\nMarks Obtained: "+marksObtain;
    }
}

class Student
{
    private String rollNo;
    private String name;
    private String dept;
    private int numOfSub;
    private Subject sub[];
    
    
    public Student(String roll,String name)
    {
         this.rollNo=roll;
         this.name=name;
         
    }
    public Student(String roll,String name,int ns)
    {
         this.rollNo=roll;
         this.name=name;
         this.numOfSub=ns;
    }
    
    public String getRollNo(){return rollNo;}
    public String getName(){return name;}
    public String getDept(){return dept;}
    public int getNoOfSubjects(){return numOfSub;}
    public Subject[] getSubjects(){return sub;}
    
    public void setDept(String dept)
    {
        this.dept=dept;
    }
    public void setSubjects(Subject ...subs)
    {
        for(int i=0;i<subs.length;i++)
            sub[i]=subs[i];
    }
    
    public String toString()
    {
        return "Roll :" +rollNo+"\nName :"+name+"\nDept :"+dept;
    }
    
}

public class SCoops3 
{
    
    public static void main(String[] args) 
    {
        Subject subs[]=new Subject[3];
        subs[0]=new Subject("s101","DS",100);
        subs[1]=new Subject("s102","Algorithms",100);
        subs[2]=new Subject("s103","Operating Systems",100);
        
        for(Subject s:subs)
            System.out.println(s);
        
    }
    
}
```
```java

package studenttest;

class Student
{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    
    public int total()
    {
        return m1+m2+m3;
    }
    public float average()
    {
        return (float)total()/3;
    }
    public char grade()
    {
        if(average()>=60)
            return 'A';
        else
            return 'B';
    }
    public String toString()
    {
        return "Roll No:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
    }
}

public class StudentTest 
{

    public static void main(String[] args) 
    {
        Student s=new Student();
        
        s.roll=1;
        s.name="John";
        s.course="CS";
        s.m1=70;
        s.m2=80;
        s.m3=65;
        
        System.out.println("Total :"+s.total());
        System.out.println("Average :"+s.average());
        
        System.out.println("Details:\n "+ s );
        
    }
    
}
```

## Data Hiding
Encapsulation = data hiding + abstraction
Encapsulation = wrapping the data and the methods into a single unit
Data hiding = hiding the data from the outside world
abstraction = hiding the complexity and showing the essential things
![alt text](image-254.png)

![alt text](image-255.png)

![alt text](image-256.png)

![alt text](image-257.png)

![alt text](image-258.png)

```java
package rectangletest1;

class Rectangle
{
    private double length;
    private double breadth;
    
    public double getLength()
    {
        return length;
    }
    
    public double getBreadth()
    {
        return breadth;
    }
    
    public void setLength(double l)
    {
        if(l>=0)
            length=l;
        else
            length=0;
    }
    
    public void setBreadth(double b)
    {
        if(b>=0)
            breadth=b;
        else 
            breadth=0;
    }
    
    public double area()
    {
        //return length*breadth;
        return getLength()*getBreadth();
    }
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else 
            return false;
    }
}
        

public class RectangleTest1 {

    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.setLength(10.5);//check with negative values.
        r.setBreadth(5.5);
        
        System.out.println("Area "+r.area());
        System.out.println("Perimeter "+r.perimeter());
        System.out.println("Is Square "+r.isSquare());
        
        System.out.println("Length "+r.getLength());
        System.out.println("Breadth "+r.getBreadth());
    }
    
}
```
![alt text](image-259.png)

## 113.
![alt text](image-260.png)
1. (90% of properties)
![alt text](image-261.png)
![alt text](image-262.png)
2. Read only
![alt text](image-263.png)
3. Write only
![alt text](image-265.png)
rare
two thread or two classes are working on the same data
producer and consumer (set and get)
eg. Charity Acc and Donor ACC
![alt text](image-264.png)
(internally inside the software write only property is used.)

## 114. Constructor
= special type of method which is used to initialize the object
- name of the constructor is same as the class name
- constructor doesn't have any return type
- constructor is called automatically when the object is created
- constructor is used to initialize the object
- constructor is used to allocate the memory for the object
- constructor is used to initialize the properties of the object
- constructor is used to initialize the default values for the properties

- default constructor is provided by the java
- default constructor is used to initialize the default values for the properties

## 115.

```java
package rectangletest;

class Rectangle
{
    public double length;
    public double breadth;
    
    public double area()
    {
        return length*breadth;
    }
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }
    
}

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=10.5;
        r.breadth=5.5;
        
        System.out.println("Area"+r.area());
        System.out.println("perimeter"+r.perimeter());
        
        System.out.println("Is it a Square"+r.isSquare());
    }
    
}
//write a constructor for the above code
```
```java
package rectangletest;

class Rectangle
{
    public double length;
    public double breadth;
    
    public Rectangle()
    {
        length=1;
        breadth=1;
    }
    
    public double area()
    {
        return length*breadth;
    }
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }
    
}

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=10.5;
        r.breadth=5.5;
        
        System.out.println("Area"+r.area());
        System.out.println("perimeter"+r.perimeter());
        
        System.out.println("Is it a Square"+r.isSquare());
    }
    
}
```

parameterized constructor
```java
package rectangletest;

class Rectangle
{
    public double length;
    public double breadth;
    
    public Rectangle()
    {
        length=1;
        breadth=1;
    }
    
    public Rectangle(double l,double b)
    {
        length=l;
        breadth=b;
    }
    
    //instance methods / facilitators
    public double area()
    {
        return length*breadth;
    }
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    
    //validator / inspector methods
    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }

}

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle r=new Rectangle(10.5,5.5);
        
        System.out.println("Area"+r.area());
        System.out.println("perimeter"+r.perimeter());
        
        System.out.println("Is it a Square"+r.isSquare());
    }
    
}
```

![alt text](image-266.png)
```java
package cylindertest;

class  Cylinder
{
    private int radius;
    private int height;
    
    public Cylinder()
    {
        radius=height=1;
    }
    public Cylinder(int r,int h)
    {
        radius=r;
        height=h;
    }
    public int getHeight()
    {
        return height;
    }
    public int getRadius()
    {
        return radius;
    }
    
    public void setHeight(int h)
    {
        if(h>=0)
            height=h;
        else
            height=0;
    }
    public void setRadius(int r)
    {
        if(r>=0)
            radius=r;
        else
            radius=0;
    }
    public void setDimensions(int h,int r)
    {
        height=h;
        radius=r;
    }
    
    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double drumArea()
    {
        return 2*lidArea()+perimeter()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }
}


public class CylinderTest {

    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.setHeight(10);
        c.setRadius(7);
        c.setDimensions(10, 7);
        
        System.out.println("LidArea "+c.lidArea());
        System.out.println("Circumference "+c.perimeter());
        System.out.println("totalSurfaceArea "+c.drumArea());
        System.out.println("Volume "+c.volume());
        System.out.println("Height"+c.getHeight());
        System.out.println("Radius"+c.getRadius());
        
    }
    
}
```

![alt text](image-267.png)
![alt text](image-268.png)
![alt text](image-269.png)

```java

package scoops2;

class Product
{
    private String itemNo;
    private String name;
    private double price;
    private short qty;
    
    public Product(String itemno)
    {
        itemNo=itemno;
    }
    public Product(String itemno,String name)
    {
        itemNo=itemno;
        this.name=name;
    }
    public Product(String itemno,String name,double price,short qty)
    {
        itemNo=itemno;
        this.name=name;
        setPrice(price);
        setQuantity(qty);
    }
    
    public String getItemNo(){return  itemNo;}
    public String getName(){return name;}
    public double getPrice(){return price;}
    public short getQuantity(){return qty;}
    
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(short qty)
    {
        this.qty=qty;
    }
}

class Customer
{
    private String custId;
    private String name;
    private String address;
    private String phno;
    
    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.address=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.address=name;
        setAddress(address);
        setPhno(phno);
    }
    
    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
    
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}

public class SCoops2 
{
    public static void main(String[] args) 
    {
        
    }   
}
```

## 118. Array of objects
![alt text](image-270.png)

![alt text](image-271.png)
this = reference to the current object

```java
package scloops;

class Subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtains;
    
    public Subject(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtains(){return marksObtains;}
    
    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }
    
    public void setMarksObtain(int m)
    {
        marksObtains=m;
    }
    
    boolean isQualified()
    {
        return marksObtains>=maxMarks/10*4;
    }
    
    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtains;
    }
    
}

public class SCLoops {

    public static void main(String[] args) 
    {
        Subject subs[]=new Subject[3];
        subs[0]=new Subject("s101","DS",100);
        subs[1]=new Subject("s102","Algorithms",100);
        subs[2]=new Subject("s103","Operating Systems",100);
        
        for(Subject s:subs)
            System.out.println(s);
    }
    
}
```

```java

class Subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtains;
    
    public Subject(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtains(){return marksObtains;}
    
    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }
    
    public void setMarksObtain(int m)
    {
        marksObtains=m;
    }
    
    boolean isQualified()
    {
        return marksObtains>=maxMarks/10*4;
    }
    
    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtains;
    }
    
}

public class Main {

    public static void main(String[] args) 
    {
        Subject subs[]=new Subject[3];
        subs[0]=new Subject("s101","DS",100);
        subs[1]=new Subject("s102","Algorithms",100);
        subs[2]=new Subject("s103","Operating Systems",100);

        // Create student object
    Student student = new Student("19TU1A0508", "SidduGansh", "CSE");

    // Enroll student in subjects (assuming student can take all three)
    for (Subject subject : subs) {
      student.enroll(subject);
    }

    // Set marks for some subjects (assuming you have information)
    student.setMarks("s101", 90); // Set marks for DS
    student.setMarks("s103", 85); // Set marks for Operating Systems
    student.setMarks("s102", 85);

    // Print student information
    System.out.println(student);

    // Additional calculations (optional)
    System.out.println("Total Marks: " + student.getTotalMarks());
    System.out.println("Overall Percentage: " + student.getOverallPercentage() + "%");
    System.out.println("Passed: " + student.isPassed());
        
       
    }
}
 class Student {

  private String studentID;
  private String name;
  private String department;
  private Subject[] enrolledSubjects;

  public Student(String studentID, String name, String department) {
    this.studentID = studentID;
    this.name = name;
    this.department = department;
    this.enrolledSubjects = new Subject[0]; // Initialize empty array
  }

  public String getStudentID() {
    return studentID;
  }

  public String getName() {
    return name;
  }

  public String getDepartment() {
    return department;
  }

  public Subject[] getEnrolledSubjects() {
    return enrolledSubjects; // Consider returning a copy if mutability is a concern
  }

  // Method to enroll student in a subject (assuming no duplicates)
  public void enroll(Subject subject) {
    Subject[] updatedSubjects = new Subject[enrolledSubjects.length + 1];
    System.arraycopy(enrolledSubjects, 0, updatedSubjects, 0, enrolledSubjects.length);
    updatedSubjects[updatedSubjects.length - 1] = subject;
    enrolledSubjects = updatedSubjects;
  }

  // Method to set marks for a specific subject enrolled by the student
  public void setMarks(String subjectID, int marks) {
    for (Subject subject : enrolledSubjects) {
      if (subject.getSubID().equals(subjectID)) {
        subject.setMarksObtain(marks);
        return; // Marks set, exit the loop
      }
    }
    System.out.println("Subject with ID " + subjectID + " not found for student " + studentID);
  }

  // Calculate total marks obtained by the student across all subjects
  public int getTotalMarks() {
    int totalMarks = 0;
    for (Subject subject : enrolledSubjects) {
      totalMarks += subject.getMarksObtains();
    }
    return totalMarks;
  }

  // Calculate overall percentage (assuming all subjects have same weightage)
  public double getOverallPercentage() {
    int totalMarks = getTotalMarks();
    int totalMaxMarks = 0;
    for (Subject subject : enrolledSubjects) {
      totalMaxMarks += subject.getMaxMarks();
    }
    if (totalMaxMarks == 0) {
      return 0.0; // Avoid division by zero
    }
    return (double) totalMarks / totalMaxMarks * 100;
  }

  // Check if student is passed (based on your definition in Subject.isQualified)
  public boolean isPassed() {
    for (Subject subject : enrolledSubjects) {
      if (!subject.isQualified()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("\nStudent ID: ").append(studentID).append("\n");
    sb.append("Name: ").append(name).append("\n");
    sb.append("Department: ").append(department).append("\n");
    sb.append("Enrolled Subjects:\n");
    for (Subject subject : enrolledSubjects) {
      sb.append(subject).append("\n");
    }
    return sb.toString();
  }
}
```

# Section 12: Inheritance
![alt text](image-272.png)

generalization means bottom up is the hierarchy designed.
specialization means top down is the hierarchy designed.
![alt text](image-273.png)
inheritance = acquiring the properties of the parent class
![alt text](image-274.png)

![alt text](image-275.png)
![alt text](image-276.png)

![alt text](image-277.png)
```java

package circle1;

class Circle
{
    public double radius;
    
    public double area()
    {
        return Math.PI * radius *radius;
    }
    
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double circumference()
    {
        return perimeter();
    }
}

class Cylinder extends Circle
{
    public double height;
    
    public double volume()
    {
        return area()*height;
    }
    
}








public class Circle1 
{

       public static void main(String[] args) 
       {
           Cylinder c=new Cylinder();
          
           c.radius=7;
           c.height=10;
           
           System.out.println("Volume "+c.volume());
           System.out.println("Area "+c.area());
          
       }
    
}
```

![alt text](image-278.png)
![alt text](image-279.png)
```java
package scinherit;

class Account
{//closeAccount() , openAccount()
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;
    
    public Account(String acc,String n,String add,String phno,String dob)
    {
        accNo=acc;
        name=n;
        address=add;
        this.phno=phno;
        this.dob=dob;
        balance=0;
    }
    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;};
    public String getPhno(){return phno;}
    public String getDOB(){return dob;}
    public long getBalance(){return balance;}
    
    public void setAddress(String add)
    {
        address=add;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
            
}

class SavingsAccount extends Account
{//fixedDeposit() , liquidate();
    public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}

class LoanAccount extends Account
{//topUpLoan() 
    public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}

public class SCInherit 
{
    public static void main(String[] args) 
    {
        
    }   
}
```
![alt text](image-280.png)
![alt text](image-281.png)

![alt text](image-282.png)
parent class constructor is called first and executed first then the child class constructor is called and executed.


![alt text](image-283.png)
![alt text](image-284.png)
![alt text](image-285.png)
![alt text](image-286.png)

## 124. parameterized constructor

how to call the parameterized constructor of the parent class with child class
using
super() method.
```java
package superconstr;

class Parent
{
    Parent()
    {
        System.out.println("Non-Param of parent");
    }
    Parent(int x)
    {
        System.out.println("Param of parent "+x);
    }
}

class Child extends Parent
{
    Child()
    {
        System.out.println("Non-Param of child");
    }
    Child(int y)
    {
        System.out.println("Param of child");
    }
    Child(int x,int y)
    {
        super(x);
        System.out.println("2 param of child "+y);
    }
}

public class SuperConstr {

    public static void main(String[] args) {
        //Child c=new Child();
        //Child c=new Child(20);
        Child c=new Child(10,20);
    }
    
}
```
![alt text](image-287.png)
![alt text](image-288.png)

this is used to refer the current object
![alt text](image-289.png)
![alt text](image-290.png)
this is used to resolve the ambiguity and name conflict
![alt text](image-291.png)

![alt text](image-292.png)
```java
package inheritconst;

class Parent
{
    public Parent()
    {
        System.out.println("Parent Constrcutor");
    }
            
}

class Child extends Parent
{
    public Child()
    {
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child
{
    public GrandChild()
    {
        System.out.println("Grand Child Constructor");
    }
}
public class InheritConst 
{

    public static void main(String[] args) 
    {
        GrandChild c=new GrandChild();        
    }
    
}
```

## 126. Method Overriding
= redefining the method in the child class
![alt text](image-293.png)

method is redefined
![alt text](image-294.png)

parent method is hidden | shadowed
![alt text](image-295.png)

dynamic method dispatch
= the method will be called based on the object not the the reference
![alt text](image-296.png)

= A superclass reference holding an object of subclasss, and overrided(redefined) method is called, then the method of an object will be called, not the method of reference.
```java
package override;

class Super
{
    public void display()
    {
        System.out.println("Super Display");
    }
}

class Sub extends Super
{
    @Override
    public void display()
    {
        System.out.println("Sub Display");
    }
}

public class Override
{
    public static void main(String[] args) 
    {
        Super s=new Sub();
        s.display();//Sub Display
          
    }    
}
```

![alt text](image-297.png)
![alt text](image-298.png)

if parent is used as reference the specialized method of child class can't be called.
![alt text](image-300.png)
![alt text](image-299.png)

130. Dynamic method dispatch
it is called as the runtime polymorphism
method will be called based on the object not the reference
![alt text](image-301.png)

return type must match in the method overriding.

only covarient return type can be difference

![alt text](image-302.png)
![alt text](image-303.png)

we can't override the static and final methods
parent access modifer can be any thing. but child can't be restrictive. or lower than the parent class.(either equal modifier or greater)

```java
package overriderules;



class Super
{
    private void display()//or even protected may not give any error.
    {
        System.out.println("Super display.");
        
    }
}

class Sub extends Super    
{
    //@Override if public
    public void display()
    {
        System.out.println("Sub diaplay.");
        
    }
}

public class OverrideRules {

    public static void main(String[] args) {
        
        Sub s=new Sub();
        
    }
    
}
```
 
 ## 133 POLYMORPHISM
 ![alt text](image-304.png)
 In Java, polymorphism is achieved using the method overloading and overriding.

Method overloading
compiler will decides the which method to call "compile time polymorphism
![alt text](image-305.png)

Method overriding
= redefining the method of parent in the child class is known as the methodoverriding or "run time polymorphism"
![alt text](image-306.png)
execution is decided at runtime

new means objects are created at runtime.

all class
![alt text](image-307.png)

![alt text](image-308.png)





# Section 13 Abstract Class

## 132 what is abstract class ?
![alt text](image-309.png)
abstract class vs concrete class
we can't create the obj of the abstract class
but you can create the reference of abstract class
we can create the obj of the concrete class.

Abstract method is method with no body and method signature is marked with abstract keyword.
if a class having atleast one abstract method then the class is declared as the abstract method.

Abstract class can have zero or more abstract methods in it

if any class is inheriting the abstract class then that sub class also becomes the abstract class if abstract methods of extending class, defination is not given in the sub class.

![alt text](image-310.png)
```java
//asuper bstract class
abtract class Super
{
 Super()
 {
 System.out.println(“Super”);
 }
 void meth1()
 {
 System.out.println(“meth1”);
 }
 abstract void meeth2();
}
//concrete class
class sub extends Super
{
 Void meth2()
 {
 System.out.println(“meth2”);
 }
}
class test
{
 public static void main()
 {
 Super s1; // reference of abstract is allowed
 sub s2 =new sub();
 }
}
```
• Method	which	is	not	having	a	body	is	known	as	Abstract	method,	
the	method	must	be	declared	as	abstract		
• The	abstract	method	is	unde7ined	method	
• A	class	is	Abstract	class	if	at	least	one	of	the		methods	is	abstract	
• If	any	other	class	inherits	abstract	class	then	that	class	also	becomes	
abstract	class	but	to	become	a	concrete	class	the	subclass	must	
override	the	unde?ined	method	
• A	class	becomes	useful	if	it	overrides	all	the	methods	of	abstract	class	
• Abstract	classes	are	used	for	imposing	standards	and	sharing	
methods	
• Sub	classes	are	meant	for	following	standards

➢ Do’s and Don’ts of Abstract Class
• An	Abstract	class	cannot	be	?inal	because	if	it	is	made	?inal	then	it	
cannot	be	extended	whereas	abstract	class	is	meant	for	
inheritance	
• An	Abstract	method	cannot	be	?inal	because	if	it	made	?inal	then	it	
cannot	be	overridden	whereas	Abstract	method	is	meant	for	
overriding		
• Abstract	Class	and	method	can	neither	be	?inal	nor	static		
• A	Sub	class	must	override	an	abstract	method	or	else	it	will	become	
abstract	class
![alt text](image-311.png)
use of abstract class = abstract methods are meant for inheritance.


## 136 EXAMPLE 1
Abstract class
(are meant to provide the guidlines)
![alt text](image-312.png)

## 137 Example 2 : KFC
outlet
![alt text](image-313.png)
![alt text](image-314.png)

## 138 : sc : shapes
![alt text](image-315.png)
```java
package scabstract1;

abstract class Shape
{
   abstract public double perimeter();
   abstract public double area();
}

class Circle extends Shape
{
    double radius;
    
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
            
}
        
class Rectangle extends Shape
{
    double length;
    double breadth;
    
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public double area()
    {
        return length*breadth;
    }
            
}

public class SCAbstract1 
{
    public static void main(String[] args) 
    {
        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=5;
        
        Shape s=r;
        
        System.out.println(s.area());
        
    }  
}
```
final classes can't be extended
if a class is abstract then we can't make it final 
![alt text](image-316.png)

![alt text](image-317.png)
final means we can't override method. but abstract methods are meant for overriding
![alt text](image-318.png)
![alt text](image-319.png)

![alt text](image-320.png)

---
![alt text](image-321.png)
usually static classes are the nested classes.

![alt text](image-322.png)
![alt text](image-323.png)


with abstract class inheritance and polymorphism is achieved
but interface is purly meant to achieve th polymorphism

![alt text](image-324.png)

if a class has all abstract methods then it is called as interface.
better to use interface instead of abstract class

interface reference can be created 
but object can't be created

![alt text](image-325.png)
![alt text](image-326.png)

interfaces are meant for achieving the runtime polymorphism or dynamic dispatch mechanism.

![alt text](image-327.png)

by default methods inside the interface are public and abstract


variables / identifiers inside the interface
![alt text](image-328.png)
write the uppercases for variables inside the interfaces
by default variables are public static final

interface can have static methods with the body.
![alt text](image-329.png)
![alt text](image-330.png)
interfaces can be extended.

from JAVA 8 onward default methods are also availabe inside the interfaces
![alt text](image-331.png)

what is the use of default methods in the interfaces
if to modify the interface then all the classes which are implementing the interface should be modified.
to avoid this default methods are used.
then other classes are not disturbed.

FROM JAVA 9 ONWARDS PRIVATE METHODS ARE ALSO ALLOWED INSIDE THE INTERFACE
but not abstract private methods are allowed.
![alt text](image-332.png)
it is used for the internal use of the default methods

![alt text](image-333.png)
java perspectiove interface is the best way than the c++ interface

![alt text](image-334.png)

# Section 15: Inner Classes

Need of inner class
= if a class is becoming big and complex then it is better to divide the class into the smaller classes.

interface inside an interface 
class inside an class
![alt text](image-335.png)
![alt text](image-336.png)

![alt text](image-337.png)

```java

package nestedinner;

class Outer
{
    static int x=10;
    Inner i=new Inner();
    
    class Inner
    {
        int y=20;
        public void innerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }
    
    public void outerDisplay()
    {
        
        i.innerDisplay();
        System.out.println(i.y);
        
    }
}

public class NestedInner {

    public static void main(String[] args) 
    {
        Outer.Inner oi=new Outer().new Inner();
        oi.innerDisplay();
        
    }
    
}
```
c++ has above limitations but java has no limitations.


## Local and Anonymous Inner class

we can define the class inside the method
that class is called as the local inner class (only visible and accessible inside the method)
![alt text](image-338.png)

Anonymous inner class
![alt text](image-339.png)
even it is interface we can do it same.
![alt text](image-342.png)

## Static inner class
![alt text](image-340.png)

anonymours object
![alt text](image-341.png)

![alt text](image-343.png)

# Section 16: Static and Final
![alt text](image-344.png)

static keyword is used for representing metadata
Metadata means data about data.
basically they are usefull for representing the information of a class not the objects.

Though all the objects can share the information.

static memvers are usefull for representing information or data related to a class.
so if you have only data related to the class then it is better to make it as static variable.

if that data need some computation or processing then it is better to make it as static method.

and if you have lots of data and that can be grouped together and made as a nested class.
![alt text](image-345.png)

static members are shared by all the objects
**any one of the objects modifies it then it is modified for all the objects.**
can be used as the shared data.

//static members of the class are created inside the method area.
static variables can be accessible without obj creation.

![alt text](image-346.png)

if multiple static methods are available then makes it as the static class and keep the methods inside the class.

static classes can't use this or super keyword
because they refer to the instance of the class.

outer class can't be static but inner class can be static.

```java
package staticpractice;

class Test
{
    static int x=10;
    int y=20;
    
    void show()
    {
        System.out.println(x+" "+y);
    }
    
    static void display()
    {
        System.out.println(x);
    }
}

public class StaticPractice {

    public static void main(String[] args) {
        
        Test t1=new Test();
        t1.show();
        t1.x=30;
        t1.y=50; 
        
        Test t2=new Test();
        t2.show();
        
    }
    
}
```

## 154. static block 
we can write set of stmts inside the block. make it as static block.
those statements will be executed only once when the class is loaded into the memory.

inside the static block u can access only static member or methods.
![alt text](image-347.png)

there can be more than one static block in the class. but they can be executed in the order.
this feature is introduced in 1.7 version.
but not much used.

## 157. final keyword
![alt text](image-348.png)
final variables are just like constant , means values are fixed
![alt text](image-349.png)

directly we can assign the value to the final variable
static block can be used to initialize the final variables.
inside constructor also we can initialize the final variables

Final method.
![alt text](image-350.png)
final method can't be overridden. (or redefined)
![alt text](image-351.png)
final class can't be extended.
but you can create the object and use it.

you can make policy and freeze of class and method
so that other class can't borrow features of it.


## 158 Demo of Final

if final is the member of class, then it must be initialized
![alt text](image-352.png)

instance block

## 159. Singleton class
.getInstance()

a class which can create only one object
more than once obj of a class are not allowed
![alt text](image-353.png)
```java

package singleton;


class CoffeeMachine
{
    private float coffeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;
    
    static private CoffeeMachine my=null;
    
    private CoffeeMachine()
    {
        coffeQty=1;
        milkQty=1;
        waterQty=1;
        sugarQty=1;
    }
    
    public void fillWater(float qty)
    {
        waterQty=qty;
    }
    public void fillSugar(float qty)
    {
        sugarQty=qty;
    }
    public float getCoffee()
    {
        return 0.15f;
    }
    
    static CoffeeMachine getInstance()
    {
        if(my==null)
            my=new CoffeeMachine();
        return my;
    }
    
            
}
public class Singleton 
{
    public static void main(String[] args) 
    {
        CoffeeMachine m1=CoffeeMachine.getInstance();
        CoffeeMachine m2=CoffeeMachine.getInstance();
        CoffeeMachine m3=CoffeeMachine.getInstance();
        
        System.out.println(m1+" "+m2+" "+m3);
        if(m1==m2 && m1==m3)
            System.out.println("Same");
        
    }   
}
```

```java
package scstatic1;
import java.util.Date;

class Student
{
    private String rollNo;
    
    private static int count=1;
    
    private String assignRollNo()
    {
        Date d=new Date();
        
        String rno="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }
    Student()
    {
        rollNo=assignRollNo();
    }
    public String getRollNo()
    {
        return rollNo;
    }
    
}

public class SCStatic1 
{
    public static void main(String[] args) 
    {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        
        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());
        
    }   
}
```

![alt text](image-354.png)

![alt text](image-355.png)

# Section 17. Packages

## what are the packages ?
= a package is a the collection of classes, interfaces and other packages.
file explorer
program files > jdk > lib > src (it contains all packages) = java , lang math , again more packages for exception there are java files 

import java.lang.*; //importing a package. so that use class.
import java.lang.String; //it saves the compiler time

fully qualified importing

## 162. how to create own package and use it.

dir > demo class for disp method > 
compiled the u get Demo.class
how to include a class inside a package
>javac -d . Demo.java

compiler creates the package

> javac -d C:\
//you can mention directory.

>del *.class
//to delete the class

>javac -d . Demo2.java
//adds to the current package available


![alt text](image-356.png)
>javac -d . Demo3.java

accessing 
![alt text](image-357.png)
![alt text](image-358.png)



## 163. Accesss Modifier
default
private
protected
public

outer class can be only public or default

![alt text](image-359.png)

![alt text](image-360.png)

![alt text](image-361.png)


```java
package mypack1;

class Demo1
{
    int a=10;
    //private.
    public int b=20;
    protected int c=30;
    public int d=40;
    
    public void display()
    {
        System.out.println(a+b+c+d);
    }
}
/*Public class Demo2()
{
    Demo1 d=new Demo1();
    public void show()
    {
        System.out.println(d.a+d.b+d.c+d.d);
    }
    
}*/
class Demo3 extends Demo1
{
    Demo1 d=new Demo1();
    public void show()
    {
        System.out.println(d.a+d.b+d.c+d.d);
    }
}

class Demo4 extends Demo1
{
    public void show()
    {
        System.out.println(a+b+c+d);
    }
}
    

public class MyPack1 {

    
    public static void main(String[] args) 
    {
      Demo1 d1=new Demo1();
      d1.display();
      System.out.println(d1.a+d1.b+d1.c+d1.d);
      
    }
    
}
```
![alt text](image-362.png)
![alt text](image-363.png)

## Package Naming Conventions
![alt text](image-364.png)



# Section 18 . Exception Handling
## 166 what are exception
= exceptions are the runtime errors

Types of Errors
![alt text](image-365.png)
![alt text](image-366.png)

![alt text](image-367.png)
invalid inputs
required resources are not available
user faces the issues because of mishandling of the application.
1.Bad inputs
2. Network issues
3. File not found
4. Database not available
5. Memory issues
6. Arithmetic issues
7. Null pointer exception
8. Array index out of bound exception
9. Class not found exception
etc...

but programmer can give the message to the user.


## 167. How to handle the exceptions
![alt text](image-368.png)
dividing by 0
exception : program will be terminate abnormally.
![alt text](image-369.png)

![alt text](image-370.png)

![alt text](image-371.png)
![alt text](image-372.png)



## 168. Try and catch block

package exceptiondemo;

import java.util.Scanner;

public class ExceptionDemo 
{
    public static void main(String[] args) 
    {
        int a,b,c;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Eneter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        
        
        try
        {
            c=a/b;
            System.out.println("Division is" +c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0, try again");
        }
        System.out.println("Bye");
        
        
    } 
}

exception handling makes our program more robust even in case of errors like exceptions handled smoothly.



## 169. Multiple and Nested Try and Catch block
![alt text](image-373.png)

![alt text](image-374.png)
package nestedcatch;

public class NestedCatch 
{
    public static void main(String[] args) 
    {
        int A[]={30,20,10,40,0};
        
        try
        {
            int c=A[0]/A[4];
            System.out.println("Division is "+c);
        
            try
            {
                System.out.println(A[5]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Index is Invalid");
            }
            
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0");
        }
        
        
        System.out.println("Bye");
    }
}

## 170. Class Exception
Java having a lot of built in classes for handling the exceptions.
![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/44d81c28-3dd5-4270-97ef-943f3c1cfbb6)

![alt text](image-375.png)
![alt text](image-376.png)

![alt text](image-377.png)

![alt text](image-378.png)

![alt text](image-379.png)

creating own exceptions
![alt text](image-380.png) 

## 171. Checked and Unchecked Exceptions
![alt text](image-381.png)
exception comes as sequence of the methods it raised.
//printStrackTrace() method is used to print the sequence of the methods it raised.
// .getMessage() method is used to print the message of the exception.
![alt text](image-382.png)

![alt text](image-383.png)
```java

package checkedunchecked;

class LowBalanceException extends Exception
{
    public String toString()
    {
        return "Balance Should not be less than 5000";
    }
}

public class CheckedUnchecked 
{
    static void fun1()
    {
        try
        {
            throw new LowBalanceException();
        }
        catch(LowBalanceException e)
        {
            System.out.println(e);
        }
    }
    
    static void fun2()
    {
        fun1();
    }
    
    static void fun3()
    {
        fun2();
    }
    
    public static void main(String[] args) 
    {
       fun3();
    }   
}
```

## 172. Throws and Throw
how an exception is propagated from one method to another method.

![alt text](image-384.png)
program crashes if the exception is not handled.

![alt text](image-385.png)
![alt text](image-386.png)

![alt text](image-387.png)


![alt text](image-388.png)

![alt text](image-389.png)

![alt text](image-390.png)

---
propagation of exception
![alt text](image-391.png)
below is unchecked exception (Arithmetic exception)
![alt text](image-392.png)

handled in 
![alt text](image-393.png)

![alt text](image-394.png)

```java
package throwthrowsdemo;

class NegativeDimensionException extends Exception
{
    public String toString()
    {
        return "Dimensions of a Rectangle cannot be Negative";
    }
}

public class ThrowThrowsDemo 
{
    static int area(int l,int b) throws NegativeDimensionException
    {
        if(l<0 || b<0)
            throw new NegativeDimensionException();
        return l*b;
    }
    static void meth1() throws NegativeDimensionException
    {
        System.out.println("Area is "+area(10,5));
    }
    
    public static void main(String[] args) 
    {
        try
        {
        meth1();
        }
        catch(NegativeDimensionException e)
        {
            System.out.println(e);
        }
        System.err.println("hi");
    } 
}
```

## 173. Finally block
![alt text](image-395.png)
![alt text](image-396.png)
![alt text](image-397.png)

## Try with resource
1.7 version introduced

![alt text](image-398.png)

![alt text](image-399.png)

![alt text](image-400.png)

![alt text](image-401.png)
to avoid the finally block for closing the resources 
then use the try with resource

if a resource has the close method then it is called as the auto closable resource.
then it is used in the try with resource block.


File handling
![alt text](image-402.png)

![alt text](image-403.png)

![alt text](image-404.png)



```java

package resourcesdemo;
import java.io.*;
import java.util.*;

public class ResourcesDemo 
{
    
    static void Divide() throws Exception
    {
        
        
        try(FileInputStream fi=new FileInputStream("/Users/abdulbari/Desktop/Test.txt");Scanner sc=new Scanner(fi) )
        {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(a/c);
        }
        
    }
    
    public static void main(String[] args) throws Exception
    {
        try
        {
        Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        //int x=sc.nextInt();
        
       // System.out.println(x);
        
    }
    
}
```

![alt text](image-405.png)

## user defined exception
![alt text](image-406.png)

![alt text](image-407.png)



```java
class StackOverFlow extends Exception
{
    public String toString()
    {
        return "Stack is Full";
    }
}

class StackUnderFlow extends Exception
{
    public String toString()
    {
        return "Stack is Empty";
    }
}


class Stack
{
    private int size;
    private int top=-1;
    private int S[];
    
    public Stack(int sz)
    {
        size=sz;
        S=new int[sz];
    }
    
    public void push(int x) throws StackOverFlow
    {
        if(top==size-1)
            throw new StackOverFlow();
        top++;
        S[top]=x;
    }
    
    public int pop() throws StackUnderFlow
    {
        int x=-1;
        
        if(top==-1)
            throw new StackUnderFlow();
        x=S[top];
        top--;
        return x;              
    }
}




public class SCException1 
{
    public static void main(String[] args) 
    {
        Stack st=new Stack(5);
        try
        {
        st.push(10);
        st.push(15);
        st.push(10);
        st.push(15);
        st.push(10);
        st.push(15);
        
        }
        catch(StackOverFlow s)
        {
            System.out.println(s);
        }
        
    }   
}
```

Quiz


# Section 19. Multithreading

![alt text](image-408.png)

![alt text](image-409.png)
multiprogramming = running many programs in a single machine
there are multiple forms of multiprogramming
1. multi-user = more than one user using the same machine simultaneously.

2. multitasking = more than one task is running in the same machine simultaneously by single user.

multithreading is a type of multitasking. multiple threads are running

![alt text](image-410.png)

like a round robin fashion
![alt text](image-411.png)

multi user days are gone

today we are using multitasking and multithreading

## 179. Multi tasking
![alt text](image-412.png)

MULTI THREADING
![alt text](image-413.png)

![alt text](image-414.png)
EACH ball uses one thread

![alt text](image-415.png)

![alt text](image-416.png)

## control flow of java program
![alt text](image-417.png)

single control flow (single program )(single thread)
![alt text](image-418.png)

![alt text](image-419.png)

require simultaneously run
![alt text](image-420.png)

## 181. multithreading
to achieve multithreading
![alt text](image-421.png)

actual mechanism of multithreading is present inside the Thread class

even runnable interface is used then there is a thread class inside the runnable interface.
![alt text](image-422.png)

![alt text](image-423.png)

class has to extend Thread
then override the run() method
start() method is used to start the thread
```java
class Main extends Thread{

    public void run(){
         int i=0;
        while(true){
            System.out.println(i+"  WORLD");
            i++;
        }
    }

    public static void main(String args[]){
      
        Main t = new Main();
        t.start();
        int i=0;
        while(true){
            System.out.println(i+"  Hello");
            i++;
        }

    }
}
```

![alt text](image-424.png)

RUNNABLE
![alt text](image-425.png)

![alt text](image-426.png)

## States of Thread
![alt text](image-427.png)


## Thread Properties
![alt text](image-428.png)
Thread.MIN_PRIORITY = 1
Thread.NORM_PRIORITY = 5
Thread.MAX_PRIORITY = 10

Reg. sequence
MS Word
Thread : taking input from the keyboard
Thread : spell checker & grammer checker
Thread : Auto save

Chrome
Thread : Pulling the data from the internet
Thread : Rendering the data from the internet

## Thread Class
![alt text](image-429.png)
whenever thread is created jvm or jre will give an id.
//like ThreadGroup is used for stopping the animations

![alt text](image-430.png)

![alt text](image-431.png)


![alt text](image-432.png)
wait
sleep

![alt text](image-433.png)

yeild() = lets give chance to lower priority thread to execute

dumpStack() => you can know the depth of the method classes and it's sequence calls.
![alt text](image-434.png)

![alt text](image-435.png)

![alt text](image-436.png)

![alt text](image-437.png)

![alt text](image-438.png)

UNDERSTAND THE THREADS
![alt text](image-439.png)
Daemon
![alt text](image-440.png)
check
![alt text](image-441.png)
.join()
![alt text](image-442.png)
.yeild()
![alt text](image-443.png)

## 189. Sync [concept]
it is the cordination between the threads
![alt text](image-444.png)

![alt text](image-445.png)
= happening of one thread prevents the other

![alt text](image-446.png)

![alt text](image-447.png)
![alt text](image-448.png)

semaphore maintains the separate queue
![alt text](image-449.png)
![alt text](image-451.png)

![alt text](image-452.png)

![alt text](image-453.png)

![alt text](image-454.png)

![alt text](image-455.png)

![alt text](image-456.png)
```java
package syncdemo;

class MyData
{
    synchronized public void display(String str)
    {
            for(int i=0;i<str.length();i++)
            {
                 System.out.print(str.charAt(i));
                 try{Thread.sleep(100);}catch(Exception e){}
            }
        
    }
}

class MyThread1 extends Thread
{
    MyData d;
    public MyThread1(MyData d)
    {
        this.d=d;
    }
    
    public void run()
    {
        d.display("Hello World");
    }
            
    
}

class MyThread2 extends Thread
{
    MyData d;
    public MyThread2(MyData d)
    {
        this.d=d;
    }
    
    public void run()
    {
        d.display("Welcome All");
    }
            
    
}

public class SyncDemo 
{
    public static void main(String[] args) 
    {
        MyData data=new MyData();
        
        MyThread1 t1=new MyThread1(data);
        MyThread2 t2=new MyThread2(data);
        
        t1.start();
        t2.start();
        
        
    
    }    
}
```
///////////ATM challenge
![alt text](image-457.png)
```java
package scthread1;


class ATM
{
    
    synchronized public void checkBalance(String name)
    {
       System.out.print(name + " Checking ");
       
       try{Thread.sleep(1000);}catch(Exception e){}
       
       System.out.println("Balance");
    }
    
    synchronized public void withdraw(String name,int amount)
    {
        System.out.print(name + " withdrawing "); 
        
        try{Thread.sleep(1000);}catch(Exception e){}
        
        System.out.println(amount);
        
    }
}

class Customer extends Thread
{
    String name;
    int amount;
    ATM atm;
    
    Customer(String n,ATM a,int amt)
    {
        name=n;
        atm=a;
        amount=amt;
    }
    public void useATM()
    { 
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run()
    {
        useATM();
    }
}

public class SCThread1 
{
    public static void main(String[] args) 
    {
        ATM atm=new ATM();
        Customer c1=new Customer("Smith",atm,100);
        Customer c2=new Customer("John",atm,200);
        c1.start();
        c2.start();
        
        
    }   
}
```

![alt text](image-458.png)

![alt text](image-459.png)

![alt text](image-460.png)

![alt text](image-461.png)

![alt text](image-462.png)


////////PRODUCER AND CONSUMER
```java
package interprocess;

class MyData
{
    int value;
    boolean flag=true;
    
    synchronized public void set(int v)
    {
        while(flag!=true)
            try {wait();}catch(Exception e){}
        
        value=v;
        flag=false;
        notify();
    }
    
    synchronized public int get()
    {
        int x=0;
        while(flag!=false)
            try {wait();}catch(Exception e){}
        
        
        x=value;
        flag=true;
        notify();
        
        return x;            
    }
}

class Producer extends Thread
{
    MyData data;
    
    public Producer(MyData d)
    {
        data=d;
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            data.set(count);
            System.out.println("Producer "+count);
            count++;
        }
    }
}

class Consumer extends Thread
{
    MyData data;
    
    public Consumer(MyData d)
    {
        data=d;
    }
    public void run()
    {
        int value;
        while(true)
        {
            value=data.get();
            System.out.println("Consumer "+value);
        }
    }
}

public class InterProcess 
{
    public static void main(String[] args) 
    {
        MyData data=new MyData();
        
        Producer p=new Producer(data);
        Consumer c=new Consumer(data);
        
        p.start();
        c.start();
        
    }
}
```

```java
package scthread2;



class WhiteBoard
{
    String text;
    int numberOfStudents=0;
    int count=0;
    public void attendance()
    {
        numberOfStudents++;
    }
    
    synchronized public void write(String t)
    {
        System.out.println("Teacher is Writing " +t);
        while(count!=0)
                try{wait();}catch(Exception e){}
        text=t;
        count=numberOfStudents;
        notifyAll();

    }
    synchronized public String read()
    {
        
        while(count==0)
                try{wait();}catch(Exception e){}
            
        String t=text;
        count--;
        if(count==0)
                notify();
        return t;
    }
    
}
class Teacher extends Thread
{
    WhiteBoard wb;
    
    String notes[]={"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end"};
    
    public Teacher(WhiteBoard w)
    {
        wb=w;
    }
    
    public void run()
    {
        for(int i=0;i<notes.length;i++)
            wb.write(notes[i]);
    }          
    
}

class Student extends Thread
{
    String name;
    WhiteBoard wb;
    public Student(String n,WhiteBoard w)
    {
        name=n;
        wb=w;
    }
    
    public void run()
    {
        String text;
        wb.attendance();
                
        do
        {
            text=wb.read();
            System.out.println(name + " Reading " + text);
            System.out.flush();
        }while(!text.equals("end"));
    }
    
}


public class SCThread2 
{
    public static void main(String[] args) 
    {
        WhiteBoard wb=new WhiteBoard();
        Teacher t=new Teacher(wb);
        
        Student s1=new Student("1. John",wb);
        Student s2=new Student("2. Ajay",wb);
        Student s3=new Student("3. Kloob",wb);
        Student s4=new Student("4. Smith",wb);
        
        t.start();
        
        s1.start();
        s2.start();
        s3.start();
        s4.start();
        
    }   
}
```
# Section 20 java.lang.Object
Object class is the Parent class of all the classes

java.lang.Object
![ ](image-463.png)

[https://docs.oracle.com/javase](documentation)

![alt text](image-464.png)
![alt text](image-465.png)

.toString()
.equals(Object o)
.hashCode()

## 199. Wrapper Classes
![alt text](image-467.png)

![alt text](image-468.png)

```java
package wrapperdemo2;

public class WrapperDemo2 {

    public static void main(String[] args) {
        
        Integer i=new Integer(10);
        Integer a=Integer.valueOf(10);
        Integer b=10;
        
        Byte c=15;
        Byte d=Byte.valueOf("15");
        
        
        Short f=Short.valueOf("123");
        
        Float g=12.3f;

        
        Double j=Double.valueOf(123.456);
        
        Character k=Character.valueOf('A');
        
        Boolean l=Boolean.valueOf("true");
        
        byte bb=15;
        Byte e=Byte.valueOf(bb);
        
        Float h=Float.valueOf("123.5");
        float x=h.floatValue();
        float y=h;
        
        int m=10;
        //Integer n=Integer.valueOf(m);
        Integer n=m;
        //int p=n.intValue();
        int p=n;
    }
    
}
```
to get inbuilt methods of the wrapper classes

int m1 = 10;
Integer m2 = m1;
Integer m3 = m2;
System.out.println(m2.equals(m1));//true //compares content
Integer m4 = Integer.valueOf("1010",2);//binary and 

```java 
//INTEGER CLASS
package wrapperdemo;

public class WrapperDemo {

    public static void main(String[] args) {
        
        int m1=15;
        
        //Integer m2=m1;
        //Integer m3=15;
        
        Integer m2=Integer.valueOf("123");
        //Integer m3=Integer.valueOf("11111111", 2);//255
        Integer m3=Integer.valueOf("A7", 16);//167 //16*10+7=167
        Integer m4=Integer.decode("0xA7");//true //hexa to decimal
        
        //System.out.println(m2.equals(m1));
        //System.out.println(m2.equals(m3));
        //System.out.println(m3);
        
        //System.out.println(Integer.parseInt("123")); //converts into a number.
        //System.out.println(Integer.parseInt("123a")); //NumberFormatException


        //System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
        System.out.println(Integer.reverseBytes(128));
        System.out.println(Integer.toBinaryString(40));
        
    }
    
}
```

//String
string in java are immutable
StringBuffer is thread safe
StringBuilder is not a thread safe
priesent in the lang package
![alt text](image-469.png)


```java

package stringbufferbuilder;

public class StringBufferBuilder 
{
    public static void main(String[] args) 
    {
        String s1=new String("Hello");
        
        StringBuffer s2=new StringBuffer("Hello");
        
        StringBuilder s3=new StringBuilder("Hello");
        
        s1.concat(" World");
        s2.append(" World");
        s3.append(" World");
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
    }   
}
```

//MATH Class
.abs() //gives the positive value

StrictMath.abs(-123); //at runtime it will be checked and it will be executed.

Math.sqrt()
Math.cbrt()
Math.decrementExact() //prevents the value of underflow
Math.getExponent(123.45); //6 //you 
Math.floorDiv(50,9) 

Math.exp(1)
StrictMath.exp(1)

```java

package mathdemo;

public class MathDemo 
{
    public static void main(String[] args) 
    {
        System.out.print("Absolute :");
        System.out.println(Math.abs(-123));
        
        
        System.out.print("Absolute :");
        System.out.println(StrictMath.abs(-123));
        
       
        
        System.out.print("Cube Root :");
        System.out.println(Math.cbrt(27));
        
        
        
        System.out.print("Exact Decrement :");
       // System.out.println(Math.decrementExact(Integer.MIN_VALUE));
        
        int i=Integer.MIN_VALUE;
       i--;
        System.out.println(i);
        
        
        System.out.print("Exponent value in Floating Point Rep. :");
        System.out.println(Math.getExponent(123.45));
        
        
                
               
        System.out.print("Round Division :");
        System.out.println(Math.floorDiv(50, 9));
        
        
        System.out.print("e power x :");
        System.out.println(Math.exp(1));
        
        
        System.out.print("e power x :");
        System.out.println(StrictMath.exp(1));

       
        System.out.print("Log base 10 :");
        System.out.println(Math.log10(100));
        
        
        System.out.print("Maximum :");
        System.out.println(Math.max(100, 50));
        
        
        System.out.print("Tan :");
        System.out.println(Math.tan(45*Math.PI/180));
       
       
        System.out.print("Convert to Radians :");
        System.out.println(Math.toRadians(90));
        
        System.out.print("Convert to Degree :");
        System.out.println(Math.toDegrees(Math.atan(1)));

        
        System.out.print("Convert To Degree :");
        System.out.println(StrictMath.toDegrees(StrictMath.tanh(1)));

        
        
        System.out.print("Random :");
        System.out.println(Math.random()*1000);
        
        
        System.out.print("Power :");
        System.out.println(Math.pow(2, 3));
        
        
        System.out.print("Excact Product :");
        System.out.println(Math.multiplyExact(100, 200));
        
        
        System.out.print("Next Float Value :");
        System.out.println(Math.nextAfter(12.5, 11));//if greater number then higher value or if lower number then lower value
        
        
    }   
}
```

## enum

inside enum identifier is the constant
public static final variables
![alt text](image-470.png)
output is : IT

list will be printed
![alt text](image-471.png)

operations
![alt text](image-472.png)

enum can have other methods and constructor.

```java
package enumdemo;

enum Dept
{
    CS("John","Block A"),IT("Smith","Block B"),CIVIL("Srinivas","Block C"),ECE("Dave","Block D");
    
    String head;
    String location;
    
    private Dept(String head,String loc)
    {
        this.head=head;
        this.location=loc;
    }
    public String getHeadName()
    {
        return head;
    }
    public String getLocation()
    {
        return location;
    }
}

public class EnumDemo 
{
    public static void main(String[] args) 
    {
        Dept d=Dept.CS; //when enum is loaded then constructor is automatically called and object is created.
                
        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());
        
        
        
    }   
}
```

```java
package reflectdemo;

import java.lang.reflect.*;

class My
{
    private int a;
    protected int b;
    public int c;
    int d;
    
    public My() {}
    
    public My(int x,int y) {}
    
    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}
    
}

public class ReflectDemo 
{
    public static void main(String[] args) 
    {
        Class c=My.class;
        
        Field field[]=c.getDeclaredFields();
        
        Method meth[]=c.getMethods();
        
        for(Method m:meth)
            System.out.println(m);
        
        Parameter param[]=meth[0].getParameters();
        
        for(Parameter p:param)
        {
            System.out.println(p);
        }
        
    }   
}
```

enum is loaded then constructor is automatically called
![alt text](image-473.png)

![alt text](image-474.png)
![alt text](image-475.png)

## 205 Reflection Package
java.lang.reflect.*;

let's see how defination of class can be called
![alt text](image-476.png)

Class c = My.class; //gives the defination
another way
![alt text](image-477.png)

to see declared members or fields
![alt text](image-478.png)

to see constructors 
![alt text](image-479.png)

to see methods
![alt text](image-480.png)

to see arguments of the specific method
![alt text](image-481.png)

# Section 21: Annotations and JAVA Docs
search > javadoc 13
![alt text](image-482.png)

java.base
packages.....
interfaces
classes : String, fields , constructor, methods, 
package and modules.

there is tool called javadoc to make documentation.

![alt text](image-483.png)
![alt text](image-484.png)
```java
/** @author Abdul Bari
 *  @version 2.0
 *  @since 2015
 **/
package javadocdemo;


/**
 * 
 * @author abdulbari
 * 
 * Class for Library Book
 */


public class Book
{ 
    
    /**
     * @value 10 default value
     */
    static int val=10;
    
    
    /**
     * Parametrized Constructor
     * @param s Book Name
     */
    
    public Book(String s){
    }
  
    /**
     * Issue a Book to a Student
     * @param roll roll number of a Student
     * @throws Exception if book is not available, throws Exception
     */
    public void issue(int roll) throws Exception{
    }
    
    /**
     * Check if book is available
     * @param str Book Name
     * @return if book is available returns true else false
     */
    public boolean available(String str){
        return true;
    }
    
    /**
     * Get Book name
     * @param id book id
     * @return returns book name
     */
    public String getName(int id){       
        return "";
    }
}
```
Run > Generate Javadoc (JavaDocDemo) > Next > Finish
documentation will be created in html file

 project dir > javadocs > dist > index.html

## 207 Builtin Annotations
![alt text](image-485.png)


Annotations are used for giving attributes or defining the attributes of the class or method or interface.
so annotations are useful for giving metadata to the class or method or interface.

![alt text](image-486.png)


![alt text](image-487.png)
output: deprecation warning

@SuppressWarning("deprecation") upon method then it won't show's the warnings.
attribute are deprecation, unchecked.
---
@SuppressWarning("unchecked") upon method then it won't show's the warnings.
![alt text](image-488.png)

method must be private or final for the annotation. safeVarargs
![alt text](image-489.png)
```java

package annotationdemo;

class A
{
    public void display()
    {
        
    }
}

class B extends A
{
    @Override
    public void display()
    {
        
    }
    @Deprecated
    public void show()
    {
        
    }
    
}

public class AnnotationDemo 
{
    
    public static void main(String[] args) 
    {
        int i;
        @SuppressWarnings("deprecation")

        B b=new B();
  
        b.show();
    }
    
}
```
Functional Interface
= interface having only one abstract method is known as the funcitonal interface.
functional interfaces are used to write the lambda expressions.

dummy or empty annotation
for parameters also we can give the annotations
and for the local variables also we can give the annotations.
![alt text](image-490.png)

![alt text](image-491.png)

DEFINING THE ANNOTATION
when annotation has field then you must give the value to the field.
![alt text](image-492.png)
above shows data or information about the class.

```java
package annodemo;

//import java.lang.annotation.Annotation;

@interface MyAnno
{
    String name(); //can't use throws Exception or parameters.
    String project();
    String date() default "today";
    String version() default "13";
            }

@MyAnno(name="Ajay",project="Bank")
public class AnnoDemo 
{
    //@MyAnno(name="Ajay")
    int data;
    
    //@MyAnno(name="Ajay")
    public static void main(String[] args) 
    {
        //@MyAnno(name="Ajay")
        int x;
    }
    
}
```

![alt text](image-493.png)

![alt text](image-494.png)

@Retention(RetentionPolicy.RUNTIME) //class means availabe within the class //by using the reflection you can get the data.

@Documented. //provides the documentation.

![alt text](image-495.png)

![alt text](image-496.png)
works for the local variable
![alt text](image-497.png)

now available at the method level
![alt text](image-498.png)

annotation can be used only once
if Repeatable is used then multiple times can be used.

![alt text](image-499.png)
has to be public
![alt text](image-500.png)

# Section 22 : Lambda Expressions

## 210 Intro to lambda expression
=lambda expressions are used to define the anonymous functions or nameless methods.
lambda expressions are written with help of functional interfaces.
lambda expressions are defined using the -> operator.


//= if you have only one abstract method then it is called as the functional interface.



![alt text](image-501.png)
instead of another class, we can write the anonymous inner class
![alt text](image-502.png)

below is known as the lambda expression
![alt text](image-503.png)
=it is anonymous method which is acting as the object.
this is the defination of the display method.
![alt text](image-504.png)
to make a functional interface easy for implementation,
this lambda expressions are very useful, very handy and very easy to write.

lambda expressions makes the programmers like easy, when override the functional interface.

passing the arguments
![alt text](image-505.png)

adding two nums
![alt text](image-506.png)

![alt text](image-507.png)

capture in lamdba expression
![alt text](image-508.png)

```java
package lamdademo2;

interface MyLambda
{
    public void display();
}

class UseLambda
{
    public void callLambda(MyLambda ml)
    {
        ml.display();
    }
}

class Demo
{
    public void method1(){
    UseLambda ul=new UseLambda();
    ul.callLambda(()->{System.err.println("Hello");});
    
    /*int temp=10;
    
    public void method1()
    {
        *int count=0;//inner class and lambda can't access the local variable
        
        MyLambda ml=()->
        {
            //int count=0;
            //count++;
            int x=0;
            System.out.println("Hi");
            System.out.println("Bye"+(++temp));
        };
        
        ml.display();*/
    } 
}
public class LamdaDemo2 {

    public static void main(String[] args) {
        Demo d=new Demo();
        d.method1();
    }
    
}
```
lambda expressions can be passed as the method as the object.
![alt text](image-509.png)
we can pass lambda expression as the parameter and the object.
![alt text](image-510.png)

## Method Reference
scope resolution
![alt text](image-511.png)
println is the static method.

![alt text](image-512.png)

![alt text](image-513.png)

for non static method
![alt text](image-514.png)

can you assign the constructor as the method reference
![alt text](image-515.png) 
//HELLO 

![alt text](image-516.png)
returns the integer

it's like the polymorphism, 
having the parent type reference and calling the child class object

# Section 23 : JAVA IO streams.
## What is streams ?
stream is flow of data.

data may be flowing from program to a resource 
or
resource to the program.

![alt text](image-517.png)

buffer is the memory object which holds the data for some time to bring compatibility between the fast and slow devices.

buffer is very important for the transfer of the data.
buffer 
![alt text](image-518.png)
![alt text](image-519.png)

![alt text](image-520.png)

![alt text](image-521.png)

![alt text](image-522.png)

![alt text](image-523.png)

int read() //reads the one byte from the resource
read() means consuming the data is not there in the resource it is present in the program once consumed.

if nothing to return, then it returns the -1
read(btye[] b)
![alt text](image-524.png)

int available()

int skip(long n) //skips the n bytes

void close() //closes the stream

//below both works together
mark(int limit) //
reset() 
//above mark is possible only if it is buffered stream.
buffer is a memory acts as the extra memory for holding the data.
![alt text](image-525.png)

![alt text](image-526.png)


flush() //flushes the data from the buffer to the resource.
//works only in the buffered stream.

![alt text](image-527.png)


## 216 java.io
![alt text](image-528.png)
![alt text](image-529.png)

![alt text](image-530.png)

PrintStream important

character streams
![alt text](image-531.png)

![alt text](image-532.png)

![alt text](image-533.png)

![alt text](image-534.png)

![alt text](image-535.png)

## File output stream

```java
package fileexample;

import java.io.*;

public class FileExample {

    public static void main(String[] args) throws Exception
    {
        
        try(FileOutputStream fos=new FileOutputStream("C:/MyJava/Test.txt");)
        {
        
        String str="earn Java Programming.";
        
        byte b[]=str.getBytes();
        
        /*
        //fos.write(str.getBytes());
        for(byte x:b)
            fos.write(x);*/
        //fos.write(b, 6, str.length()-6);
        
        fos.write(b);
        
        //fos.close();
        
        }
        /*catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }*/
    }
    
}
```
![alt text](image-536.png)
computer works mostly in bytes so we work with input and output streams.


## 218 FileInputStream & FileReader
![alt text](image-537.png)

![alt text](image-538.png)

```java 
package fileexample;

import java.io.*;

public class FileExample {

    public static void main(String[] args) throws Exception
    {
        
        try(FileOutputStream fos=new FileOutputStream("C:/MyJava/Test.txt");)
        {
        
        String str="earn Java Programming.";
        
        byte b[]=str.getBytes();
        
        /*
        //fos.write(str.getBytes());
        for(byte x:b)
            fos.write(x);*/
        //fos.write(b, 6, str.length()-6);
        
        fos.write(b);
        
        //fos.close();
        
        }
        /*catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }*/
    }
    
}
```
![alt text](image-539.png)

commonly used
![alt text](image-540.png)
FileReader
![alt text](image-541.png)

## 219 sc: copy a file data to another.
![alt text](image-542.png)

```java
package scio1;

import java.io.*;

public class SCIO1 
{
    public static void main(String[] args) throws Exception
    {
        
        FileInputStream fis1=new FileInputStream("Source1.txt");
        FileInputStream fis2=new FileInputStream("Source2.txt");
        
        FileOutputStream fos=new FileOutputStream("Destination.txt");
                
        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
        
        
        int b;
        while((b=sis.read())!=-1)
        {
            
            fos.write(b);
        }
        
        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
        
    }   
}
```

## Byte Stream
![alt text](image-543.png)

![alt text](image-544.png)

if byte array stream is comming from stream
![alt text](image-545.png)

for files it is not supported
mark is supported on byte. it means we can go forward and backward to read or write data.
![alt text](image-546.png)
o/p: true

![alt text](image-547.png)
stored in the form of bytes
![alt text](image-548.png)

![alt text](image-549.png)
char 
![alt text](image-550.png)
practice char array writer.

## 221 Buffered Stream & Buffered Reader
![alt text](image-551.png)

![alt text](image-552.png)
benefits of using the buffered
![alt text](image-553.png)

buffer
![alt text](image-554.png)

![alt text](image-555.png)
![alt text](image-556.png)
Readers are used for characters
InputStreams are used for bytes

![alt text](image-557.png)

## Piped Streams
(eg.in multithreading > inter thread communication)
Here,
separate thread for P and C
they share the data through the pipes.
![alt text](image-558.png)

```java

package pipeddemo;

import java.io.*;

class Producer extends Thread
{
    OutputStream os;
    
    public Producer(OutputStream o)
    {
        os=o;
    }
    
    public void run()
    {
        int count=1;
        
        while(true)
        {
            try{
            os.write(count);
            os.flush();
            
            System.out.println("Producer "+count);
            System.out.flush();

            Thread.sleep(10);
            count++;
            }catch(Exception e){}
        }
    }
    
}

class Consumer extends Thread
{
    InputStream is;
    
    public Consumer(InputStream s)
    {
        is=s;
    }
    
    public void run()
    {
        int x;
        
        while(true)
        {
            try{
            
                x=is.read();
            
            System.out.println("Consumer "+x);
            System.out.flush();
            Thread.sleep(10);

            }catch(Exception e){}
        }
    }
    
}



public class PipedDemo 
{
    public static void main(String[] args) throws Exception
    {
       PipedInputStream pis=new PipedInputStream();
       PipedOutputStream pos=new PipedOutputStream();
       
       pos.connect(pis);//pis.connect(pos); both are same.
       
       Producer p=new Producer(pos);
       Consumer c=new Consumer(pis);
       
       p.start();
       
       c.start();
       
    }  
}
```


## Random Access File

![alt text](image-560.png)
seek(3)
![alt text](image-561.png)
![alt text](image-562.png)
![alt text](image-563.png)
A
B
C
E

![alt text](image-564.png)
![alt text](image-565.png)
get current file pointer position
![alt text](image-566.png)
+2 and ... possible

## 224 File Class
to access the properties of the files.

```java
//check about the File class
package filehandling;
import java.io.*;

public class FileHandling 
{
    public static void main(String[] args) throws Exception
    {
        // select path of any directory on you computer
       File f=new File("C:\\MyJava");
       
       System.out.println(f.isDirectory());
       File list[]=f.listFiles();
        
       for(File x:list)
       {
           System.out.println(x.getParent()+" "+x.getName());
       }
      
    }
}
```

## Serialization : storing data into file
=(to remember) pencil, scale , rubber, sharpner and box 
everything is stored in the form of strings. below
![alt text](image-567.png)
![alt text](image-568.png)

![alt text](image-569.png)

bridge class
type casting won't works here. so parse int is used.
![alt text](image-570.png)

## 227. Serialization : using DataInput and DataOutput Stream
formatted storing as per their data types
![alt text](image-571.png)

![alt text](image-572.png)


## 228. Data Streams

![alt text](image-573.png)

```java
package datastreamdemo;
import java.io.*;

class Student
{
    int rollno;
    String name;
    float avg;
    String dept;
}
public class DataStreamDemo 
{
    public static void main(String[] args)throws Exception
    {
        //writing in a file
        FileOutputStream fos=new FileOutputStream("Student2.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        
        Student s1=new Student();
        s1.rollno=10;
        s1.name="John";
        s1.dept="CSE";
        s1.avg=75.9f;
        dos.writeInt(s1.rollno);
        dos.writeUTF(s1.name);
        dos.writeUTF(s1.dept);
        dos.writeFloat(s1.avg);
        dos.close();
        fos.close();
        
        
        //reading from file
        FileInputStream fis=new FileInputStream("Student2.txt");
        DataInputStream dis=new DataInputStream(fis);
        
        Student s=new Student();
        
        s.rollno=dis.readInt();
        
        s.name=dis.readUTF();
        
        s.dept=dis.readUTF();
        s.avg=dis.readFloat();
        
        System.out.println("Roll no "+s.rollno);
        System.out.println("Name "+s.name);
        System.out.println("Average "+s.avg);
        System.out.println("Dept "+s.dept);
        
        
        dis.close();
        fis.close();
    }
}
``` 
boxes means binary
if ur able to read all whole things then it is string format
otherwise it is binary format.

## 229 Serialization
=serialization is the process of storing the state of the object and it's data into the file.
restoring the object from the file is known as the deserialization.
this is done throught the 'objectInputStream and ObjectOutputStream' classes.
![alt text](image-574.png)
![alt text](image-575.png)

![alt text](image-576.png)
it has to implements the serialiable
![alt text](image-577.png)


![alt text](image-578.png)


![alt text](image-579.png)
## 230 Object Streams and Serialization
```java
package objectdemo;
import java.io.*;

class Student implements Serializable
{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10; //static variable is not serialized //not stored in the file
    public transient int t; //transient variable is not serialized //not stored in the file
    public volatile int v; //volatile is serialized //stored in the file //check once.
    
    public Student() //without this gets error. InvalidClassException // serialVersionUID has to match with deserialized class
    
    {
        
    
    {
        
    }
    public Student(int r,String n,float a,String d)
    {
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }
    
    public String toString()
    {
        return "\nStudent Details\n"+
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }
    
}

public class ObjectDemo 
{
   /* public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("C:\\MyJava\\Student3.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        Student s=new Student(10,"John",89.9f,"CSE");
        
        oos.writeObject(s);
        
        fos.close();
        oos.close();
        
    }
    */
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("C:\\MyJava\\Student3.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        Student s=(Student)ois.readObject();
        
        System.out.println(s);
        
        fis.close();
        ois.close();
        
    }
}
```

## 231. sc : serialize customer IMP IMP
storing the list of floats into a file and retrive.
![alt text](image-580.png)

```java
package scio2;
import java.io.*;

public class SCIO2 
{
    public static void main(String[] args) throws Exception
    {
        float list[]={1.2f , 3.45f , 6.78f , 9.01f , 2.34f};
        
        FileOutputStream fos=new FileOutputStream("List.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        
        dos.writeInt(list.length);
        for(float f:list)
        {
            dos.writeFloat(f);
        }
        
        dos.close();
        fos.close();
        
        FileInputStream fis=new FileInputStream("List.txt");
        DataInputStream dis=new DataInputStream(fis);
        int length=dis.readInt();
        float data;
        
        for(int i=0;i<length;i++)
        {
            data=dis.readFloat();
            System.out.println(data);
        }
        dis.close();
        fis.close();
        
    }   
}
```

searching
![alt text](image-581.png)
![alt text](image-582.png)
![alt text](image-583.png)


![alt text](image-584.png)
![alt text](image-585.png)
![alt text](image-586.png)

![alt text](image-587.png)

![alt text](image-588.png)

![alt text](image-589.png)

# Section 232 : Generics
![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/753c3f06-dcb6-4c7f-873d-a3b30648fe8c)

every class is directly or indirectly child of the object class.
Generalization
![alt text](image-590.png)

![alt text](image-591.png)

no compile time error
only runtime error
![alt text](image-592.png)

Object can be used as the generalization but there are few problems associated as the above image.
![alt text](image-593.png)

runtime: error 
![alt text](image-594.png)

![alt text](image-595.png)

![alt text](image-596.png)

## 233 Defining the Generic Class
![alt text](image-597.png)
![alt text](image-598.png)

![alt text](image-599.png)

![alt text](image-600.png)

![alt text](image-601.png)

## 234 Bounds of Generics
![alt text](image-602.png)
if parameter are not give it becomes object
![alt text](image-603.png)

2 parameters
![alt text](image-604.png)

3. Subtypes
![alt text](image-605.png)
![alt text](image-606.png)

4. Bounded types
![alt text](image-607.png)


![alt text](image-608.png)
only extends is used for classes and interfaces
![alt text](image-609.png)

## 235 Generic Methods IMP
![alt text](image-610.png)
before the return type generic type has to be defined
![alt text](image-611.png)

works for any types of data
![alt text](image-612.png)

![alt text](image-613.png)
bound types workds in the generic methods
![alt text](image-614.png)

![alt text](image-615.png)

![alt text](image-616.png)

can't use T but ?
unbounded wild card
![alt text](image-617.png)

wild card with upperbound
![alt text](image-618.png)

super keyword (understand better with A, B , C classes)
![alt text](image-619.png)

## 235 Do's and Don't of Generics
![alt text](image-620.png)

first one must be class
![alt text](image-621.png)
![alt text](image-622.png)

![alt text](image-623.png)

not to use , but just hold
![alt text](image-624.png)
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
# Section 25: Collection Framework
![alt text](image-625.png)
java program gets data from various place
like list of values, array of values, database, file, network, etc.

Collections Examples
=list of objects of students
Integers
Floats
Books
Customers
Products
Accounts
Movies
Friends

Array is basic DataStructue.
int arr[] = new int[5];
Student std[] = new Student[10];
type of requirement we have array is not sufficient for data storing.
so we have to go for the collection framework.


![alt text](image-626.png)
Array size is fixed.You can't change the size of the array.
copy and reference is changed.(this is the way)

![alt text](image-627.png)
Collection FW provides ArrayList and LinkedList (variable size collection)
![alt text](image-628.png)

![alt text](image-629.png)

collection has built in linear , binary searching
java provides the Hashing and sorting algorithms.

collection framework is which provides the data structures in the java
java provides the collection framework in the java.util package.
java provides the collection FW in the form of classes and interfaces

those classes and intefaces are organized in the form of hierarchy.
owl boxes are interfaces
rectangular boxes are the classes
Iterable is the top most interface which has iterator method.
Collection Inteface
=collection means group of elements or objects which homogenious or heterogenious.
**List** means group of elements which are ordered and indexed.
- so we can insert, update, delete, search the elements.
- list can have duplicates also
ArrayList (1.2)
LinkedList(1.2)
Vector (legacy classes)(java 1.0 or l.1)
Stack (legacy classes)(java 1.0 or 1.1)

Set is also a collection
- set will not allow the duplicates
- set is unordered and unindexed, but has the unique elements.

Queue follows FIFO mechanism


![alt text](image-630.png)
![alt text](image-631.png)

[5,2,1,4,3]

## 240

interaces
![alt text](image-632.png)

![alt text](image-633.png)

## 241 

![alt text](image-634.png)

List has few additional methods thans Collection interface
Set has the same methods as the Collection interface

![alt text](image-635.png)

![alt text](image-636.png)

![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/f5513960-532b-440d-9f61-8325716243cf)

## 242 visiting the docs
search > java 13 util
list of interfaces 
below are classes 
and exceptions


## 243 ArrayList & Iterator
```java
package listdemo;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {
        
        ArrayList<Integer> al1=new ArrayList<>(20);
        
        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90));
        
        al1.add(10);
        al1.add(0,5);
        //al1.addAll(al2);
        al1.addAll(1,al2);
        al1.add(5,70);
        al1.set(6,100);
        
        //al1.forEach(n->System.out.println(n));
        //al1.forEach(System.out::println);
        al1.forEach(n->show(n));
        
        //System.out.println(al1.contains(25));
        //System.out.println(al1.get(5));
        //System.out.println(al1.indexOf(70));
        //System.out.println(al1.lastIndexOf(70));
        
        //System.out.println(al1);
        
        /*for(int i=0;i<al1.size();i++)
            System.out.println(al1.get(i));*/
        
        /*for(Integer x:al1)
            System.out.println(x);*/
        
        /*for(Iterator<Integer> it= al1.iterator(); it.hasNext();)
        {
            java.lang.Integer x = it.next();
            System.out.println(x);
        }*/
        
        /*al1.forEach((x)->{
            System.out.println(x);
        });*/
        
        /*for(Iterator<Integer> it=al1.listIterator();it.hasNext();)
        while(it.hasNext())
        {
            System.out.println(it.next());
        }*/
        
        
    }
    
    static void show(int n)
    {
        if(n>60)
            System.out.println(n);
    }
    
}
```

## 244 LinkedList
all the elements should be of same type
![alt text](image-637.png)
most flexible of inserting and deleting at any position
![alt text](image-638.png)
eg. if there are 4000 elem's or more like that
which used the doubly linked list (in java)

- linkedlist takes more space than the arraylist
- no need to  mention size in the linkedlist

.addFirst()
.addLast()
```java
package listdemo;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {
        
        ArrayList<Integer> al1=new ArrayList<>(20);
        
        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90));
        
        al1.add(10);
        al1.add(0,5);
        //al1.addAll(al2);
        al1.addAll(1,al2);
        al1.add(5,70);
        al1.set(6,100);
        
        //al1.forEach(n->System.out.println(n));
        //al1.forEach(System.out::println);
        al1.forEach(n->show(n));
        
        //System.out.println(al1.contains(25));
        //System.out.println(al1.get(5));
        //System.out.println(al1.indexOf(70));
        //System.out.println(al1.lastIndexOf(70));
        
        //System.out.println(al1);
        
        /*for(int i=0;i<al1.size();i++)
            System.out.println(al1.get(i));*/
        
        /*for(Integer x:al1)
            System.out.println(x);*/
        
        /*for(Iterator<Integer> it= al1.iterator(); it.hasNext();)
        {
            java.lang.Integer x = it.next();
            System.out.println(x);
        }*/
        
        /*al1.forEach((x)->{
            System.out.println(x);
        });*/
        
        /*for(Iterator<Integer> it=al1.listIterator();it.hasNext();)
        while(it.hasNext())
        {
            System.out.println(it.next());
        }*/
        
        
    }
    
    static void show(int n)
    {
        if(n>60)
            System.out.println(n);
    }
    
}
```

## 245 ArrayDeque
=arrayDeque follows Double ended Queue data structure
![alt text](image-639.png)
starts from the middle insertion and deletion
![alt text](image-640.png)
if array size is full, then it will internally grows the size

all the elements follows constant time complexity
inserting from last, deleting at first is known as the queue.

inserting first,deleting first is known as the stack.

inserting first and deleting last, then it is a queue.

(if u need stack or queue then use arrayDeque)
```java
package dequedemo;

import java.util.*;

public class DequeDemo 
{   
    public static void main(String[] args) 
    {
         ArrayDeque<Integer> dq=new ArrayDeque<>();
         
         dq.offerLast(10);
         dq.offerLast(20);
         dq.offerLast(30);
         dq.offerLast(40);
         
         dq.pollFirst();
         
         dq.offerLast(1);
         dq.offerLast(2);
         dq.offerLast(3);
         dq.offerLast(4);
         
         dq.forEach((x)->System.out.println(x));
         
    }    
}
```

## 246 Priority Queue
=Priority Queue is a queue which follows the priority order.
priority queue is implemented using the heap data structure.
![alt text](image-641.png)
![alt text](image-642.png)
coparator is used to compare the elements
![alt text](image-644.png)
![alt text](image-643.png)



```java
package prioritydemo;

import java.util.*;

class MyCom implements Comparator<Integer>
{
    public int compare(Integer o1,Integer o2)
    {
        if(o1<o2)return 1;
        if(o1>o2) return -1;
        return 0;
    }
}

public class PriorityDemo 
{
    public static void main(String[] args) 
    {
        PriorityQueue<Integer> p=new PriorityQueue<>(new MyCom());
        
        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);
        
        System.out.println(p.peek());
        
        p.forEach((x)->System.out.println(x));
        
        p.poll();
        
        System.out.println("After Deletion");
        p.forEach((x)->System.out.println(x));
        
    }    
}
```
comparator for max-heap
![alt text](image-645.png)
![alt text](image-646.png)


## 247 hashing Technique

![alt text](image-647.png)
![alt text](image-648.png)

![alt text](image-649.png)
![alt text](image-650.png)
25% blank is called as the load factor
![alt text](image-651.png)

combination of open address and chaining it used internally. 
![alt text](image-652.png)
initial capacity is 16

## HashSet
set means it doesn't allows the duplicates.
hash meanst it uses the hash table.

- it takes the constant time.

- by default loadfactor is 0.75
- you can mention 0.5 if you want.

![alt text](image-682.png)

- if you need to add and remove elems in the constant time then you can take it.
```java
package setdemo;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
        
        HashSet<Integer> hs=new HashSet<>(20,0.75f);
        
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        
        System.out.println(hs);
    }
    
}
```

## 249. TreeSet.
tree is a datastructure.
there are various types of data structures.
like BST, AVL tree, red trees, black trees, play trees.
![alt text](image-683.png)
BST are good at searching log(n) times
![alt text](image-684.png)

![alt text](image-685.png)
```java
package setdemo1;

import java.util.*;

public class SetDemo1 {

    public static void main(String[] args) {
        
        TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40));
        
        ts.add(25);
        
        //ts.ceiling(55);
        
        System.out.println(ts);
        
    }
    
}
```

## 250 Comparable Interface
```java
package setdemo2;

import java.util.*;

class Point implements Comparable
{
    int x;
    int y;
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public String toString()
    {
        return "x="+x+"y="+y;
    }
    public int compareTo(Object o)
    {
        Point p=(Point)o;
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else
        {
        if(this.y<p.y) 
            return -1;
        else if(this.y>p.y)
            return 1;
        else 
            return 0;
        }
    }
}

public class SetDemo2 {

    public static void main(String[] args) {
        
        TreeSet<Point> ts=new TreeSet<>();
        
        ts.add(new Point(1,1));
        ts.add(new Point(5,5));
        ts.add(new Point(5,2));
        
        System.out.println(ts);
    }
    
}
```
## 250 to 260 pause
















++++++++++++++++++++++++++++++++++++++++++++++++++++
# Section 26 : Date and Time API

## 261 Deprecated Date Class
![alt text](image-653.png)
date is represent in long from 1 jan 1970 (starting time)
(starting calender is 1900)
![alt text](image-654.png)
![alt text](image-655.png)

```java
import java.util.*; //old date class
class Main{
    public static void main(String args[]){
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365.25);

        Date d = new Date();
        System.out.println(d);

                            // MM/DD/YYYY
        Date sg = new Date("09/09/2001");
        System.out.println(sg);

        System.out.println((d.getTime() - sg.getTime())/1000/60/60/24/365.25);

        System.out.println(d.getYear()+1900);
    }
}
```

## 262 Calendar and Time Zone
java provides the abstarct class called the calender
solar calender, lunar calender, jewesh calender, arab calender, japanese calender
globally gregorian calender is used.
isLeapYear();
![alt text](image-656.png)
gc.get(Calender.YEAR); //and a lot of other 

//wikipedia | offset 
search > timezones
>list of  timezones
> list of tz timezones for names

tz.getDisplayName();
tz.getID();

gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
above all are present in the java 7 
java 8 gave the separate API
java.time







## 263 Joda Time API
![alt text](image-657.png)

![alt text](image-658.png)


![alt text](image-659.png)
2,3,4 are not mutable

![alt text](image-660.png)

![alt text](image-661.png)

![alt text](image-662.png)

![alt text](image-663.png)

![alt text](image-664.png)

![alt text](image-665.png)
![alt text](image-666.png)

![alt text](image-667.png)

![alt text](image-668.png)
take in new obj
![alt text](image-669.png)

![alt text](image-670.png)

## java.time Class
time zone is not present in LocalDateTime
classes
![alt text](image-671.png)

![alt text](image-672.png)


![alt text](image-673.png)

![alt text](image-674.png)

![alt text](image-675.png)

![alt text](image-676.png)

instant
![alt text](image-677.png)
## 265 Date formatter
![alt text](image-678.png)


![alt text](image-679.png)
chrono fields
![alt text](image-680.png)
![alt text](image-681.png)


++++++++++++++++++++++++++++++++++++++++++++++++++++++++
# Sec 27 Network Programming
![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/2ca06a02-2ded-406f-b6fb-dacd4080dc28)


>laptop, PC or mobile phone there is a hardware available
for communication through network and also required software is also available.

![image](https://github.com/sidduganeshsid/JAVAstackRepo/assets/94279014/59780c63-55f5-4f3e-8cd4-a1e6eebb8cc2)


>A conceptual model for network system is given
that is called as OSI model.
That is open systems interconnection
and this is a standard OSI is a standard
but there is one more model that is called as TCP/IP.
Our systems follow this model TCP/IP model.
This is also an standard model
and this TCP/IP is similar to OSI.
So if you understand OSI model then it is easy
to learn about TCP/IP.

>Like for example, this application is a web browser.
Web browser and this application is a web server.
So this web browser want to access a website or webpages
that is available in this web server.
So what it want to communicate with this one
and how it's going to provide the service all these issues
are handled at this application layer.
What they want to do, what they want to communicate.
Like this is sending a request for a webpage
and this is sending a webpage and it is receiving
and rendering it on the screen.
This is all dealt with the application.
So transferring is done via all other layers.
So let us see what this layer do, presentation layer.
See when the data is being transferred over a network.
So the data may not be transferred in its original form
and the data may be represented in some other form.
Or let us say it is encrypted. It is encrypted.
So when something is sent from her
and it is encrypted, then it is decrypted here.
So encryption of data and decryption
of data is done at this layer that is at presentation layer.
Then comes session layer.
This layer decides the time period of communication
or the complete start and the end of the communication.
Like suppose this application here wants to download a file.
For example, it has to download a file.
So from the beginning to the end
of the download this layer take cares of that session
So the beginning of a file download
to the end of a file download is called as session.
And the session is kept independent of the connection even
if the connection is not there, session may continue.
For example, I will explain little detail on this one
You suppose you are downloading some file from interne
and power gone or connection lost or your battery was down
and your system or your client system
okay has stopped, your machine has stopped.
Then if you restart your machine, bring it up
back again then find download should start
from the same point where it has stopped.
It should not start as a fresh file download.
If it is starting
as a fresh file download means the session is lost.
If it is starting from the same point where you have
left means, it was in a session.
Even if there was no connection
or even the device was closed
or switched off even then it was in a session.
So this layer take cares of a session
from the starting point to the end point of a communication.
So this layer will talk to this layer.
This is peer to peer communication.
This layer on the other machine
or maybe another client machine or server machin
whatever it is, one who is consuming is called as client
and one who is providing something is called a server.
And each machine may change its role.
Like suppose this machine wants
to access something from here.
So this machine becomes server
and this machine becomes client.
The next layer for the communication we need
to establish connection in between two machines.
So over via connection the transmission is done
or data is transmitted.
So that is taken care by this transport layer.
And at this transport layer the communication
may be connection oriented also.
Connection oriented or it may be connectionless also.
It may be connection oriented
and even it may be connectionless.
From this point the communication has started
and this point the communication has ended
and that may be connection oriented
or it may be connectionless.
The next layer is a network layer.
This layer deals with a routing of your data.
See, if you are talking to a server in some computer
in the internet, a client is communicating.
So the data transferred
from the client is not directly sent onto the server.
It may go via various other devices various other machines.
Supose sitting in one corner of the world, like suppose
from India you are communicating with the server in USA.
Then they are not directly connected.
The data is transferred via various other machines.
So routing of the data is done at this network layer.
Routing of the data is done here.
So this is coming to the physical part now, right?
Till here it was related to the application.
From here it is coming related to the physical
or actual transmission.
From transport layer it starts.
So here you can see that it deals with routing of the data
and it'll identify the machines in network
or internet using their addresses
that are called as IP addresses.
And these are not physical address of a computer.
These are logical addresses.
So using IP addresses the machines are identified
in the network or in internet.
Then this layer actually deals with the transmission
of data from this machine to this machine.
And this layer will take care whether every bit
is transferred properly or not from this source
to the destination or from client to server
or server to client, vice versa.
So the layer here will deal
with transmission of data on this side
and this layer transfer the data on that side.
So it deals on this side and this deals on this side.
And this physical layer is the actual
medium where which the transmission
of the communication is done.
It may be wired or it may be wireless
The actual cables or the wireless medium
or radio waves or something, whatever is used
for transmission of data that is nothing but physical layer
over this or let stick as you as cables only.
So where these cables, the data is transferred.
Know one important thing, when any layer is talking peer
to peer, then how they talk to each other
like this is sending something and this confirms
that yes I have received it perfectly.
Or if it has not received, then it'll send
back some information that I did not receive so
and so think please send it again.
So this type of communication may be there
in between these two parties.
So for communication, there must be some set
of dialogues and those set of known dialogues
between two different machine upon same layer.
And also there must be some communication
in between two layers upon the same machine same computer.
That is data link layer talks to network layer.
That talks to transport layer
or when the client is sending a request via this.
So it'll start from application layer and follow till here.
Then it goes up like this.
So each layer will take out its information from the packet
or data packets whatever the information is kept
by each layer, it is received by another layer
on the receiving machine.
So that information is dealing with the protocol.
Like it says something to this one, it has to say something
to this one, like starting off a session starting point
and how much data is going to send.
So this should receive that information.
So that will be contained inside the packets
that are sent from here to this machine.
Now one more thing, add this layer, network layer.
The machine or the device is identified by its IP address.
That is a four byte address or notice.
Six byte addresses are used
because these four bytes addresses are not sufficient.
So six bytes addresses are also introduced.
Then this at a data link layer, a machine is identified
with MAC address, that is medium access controller address.
And this address is a physical address given to a device.
Like if you have a mobile phone
in your mobile phone you can check what is the MAC address
of this mobile phone, your mobile phone
that will be used by this data link layer.
And that MAC number is fixed, it is given
at the manufacturing of your mobile phone or your laptop.
So that is given at the time of manufacturing.
But this IP address may change depending
on the network you are connected to it.
So IP addresses are logical that may be changing.
