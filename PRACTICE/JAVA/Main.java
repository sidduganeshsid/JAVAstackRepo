// import java.util.*;

// public class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a,b;
//         System.out.println("Enter two number : ");
//         a = sc.nextInt();
//         b = sc.nextInt();
//         System.out.println("sum is "+(a+b));
//         sc.close();
//     }
// }

////////////////////////////
///First.java
// import java.lang.*;
// import java.util.*;

// public class Main{
//     public static void main(String args[])
//     {
//         String name;
//         Scanner sc = new Scanner(System.in);

//         System.out.println("May I know your Name");
//         name = sc.nextLine();

//         System.out.println("Welcome, Mr/Ms."+name);


//     }
// }

/////////////////
//Radix.java
// import java.util.Scanner;

// public class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the binary number : ");
//         sc.useRadix(2);
//         int binary = sc.nextInt();
//         System.out.println("Decimal equivalent is : "+binary);
//     }
// }
//////////////////
///DataTypes.java
// class Main{
//     public static void main(String args[]){
//         System.out.println("Size of int : "+Integer.SIZE);
//         System.out.println("Size of int : "+Integer.BYTES);
//         System.out.println("Min value of int : "+Integer.MIN_VALUE);
//         System.out.println("Max value of int : "+Integer.MAX_VALUE);
//     }
// }
////////
///Variable.java
// class Main{
//     int a; //instance variable
//     public static void main(String args[]){
//         int b; //local variable
//         System.out.println(a);//0
//         System.out.println(b);//error
//     }
// }

////////

// class Main{
//     public static void main(String args[]){
//         float a = 10.2;
//         int b = a;
//         System.out.println(b);
//     }
// }
// 
// // Main.java:69: error: incompatible types: possible lossy conversion from double to float
// //         float a = 10.2;
// //                   ^
// // Main.java:70: error: incompatible types: possible lossy conversion from float to int
// //         int b = a;
// //                 ^
// // 2 errors

///////////
///float and double
// class Main{
//     public static void main(String args[]){
//         // float f = 12.34; //not allowed suffix must be f
//         double d = 12.34343434; //allowed without suffix d
//         // System.out.println(f);
//         System.out.println(d);
//     }
// }

//////////
///long
// class Main{
//     public static void main(String args[]){
//         long l = 999_999;//good for readability
//         System.out.println(l)
//     }
// }

////////////////
///unicode
///NetBeans IDE (supports the unicode)

// class Main{
//     public static void main(String arg[]){
//         // char c = 0x03C8;

//         //greek language
//         for(char c =0x0370;c<=0x03FF;c++)
//             System.out.print(c+" ");
//     }
// }

//devangri
// class Main{
//     public static void main(String arg[]){
//         // char c = 0x03C8;

//         //greek language
//         for(char c =0x0900;c<=0x0970;c++)
//             System.out.print(c+" ");
//     }
// }

//////////////////////////////
///area of the triangle
// import java.util.Scanner;

// class Main{
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         float base,height, area;
//         System.out.println("Enter the Base and Height :");

//         base = sc.nextFloat();
//         height = sc.nextFloat();

//         area = 1f/2f * base * height;

//         System.out.println("Area of triangle using h and b : "+area);

//     }
// }

/////calc the area of triangle using the sides of triangle
///
// import java.util.Scanner;
// class Main{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         float a, b, c;
//         float s;
//         double area;

//         a = sc.nextFloat();
//         b = sc.nextFloat();
//         c = sc.nextFloat();

//         s = (a+b+c)/2f;
//         area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
//         //sqrt gives the double result

//         System.out.println("Area of triangle is : "+area);
//     }
// }

////////////////
///quadratic eq
// import java.util.Scanner;


// class Main{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         //ax^2 + bx + c = 0
//         int a,b,c;
//         double r1,r2;

//         System.out.println("Enter values of a, b and c :");
//         a = sc.nextInt();
//         b = sc.nextInt();
//         c = sc.nextInt();


//         r1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
//         r2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);

//         System.out.println("Roots are "+r1+" "+r2);



//     }
// }


////////////
///cuboid
// class Main{
//     public static void main(String args[]){
//         //perimeter //volume
//         //front and back l*b
//         //right and left b*h
//         //bottom and top l*b

//         //volume = l*b*h

//         //perimeter = totalArea, volume.

//         Scanner sc = new Scanner(System.in);
//         int l, b, h;
//         int totalArea, volume;

//         System.out.println("Enter length, breadth and height : ");
//         length = sc.nextInt();
//         breadth = sc.nextInt();
//         height = sc.nextInt();

//         totalArea = 2 * (l*b + l*h + b*h);
//         volume = l*b*h;
//         System.out.println("Total Area : "+totalArea);
//         System.out.println("Volume : "+volume)

//     }
// }

//////////////////////////////////////////////////////////
///STRING and inbuilt methods of string

class Main{
    public static void main(String args[]){
        String str1 = "JAVA";
        String str2 = "JAVA";
        String str3 = new String("JAVA");
        String str4 = new String("JAVA Programming");

        String temp = str4.substring(5);
        System.out.println(temp);

        temp = str4.substring(5,12);
        System.out.println(temp);            

        temp = str4.replace('A','a');
        System.out.println(temp);            

        System.out.println("length of str4 : "+str4.length());


    }
}