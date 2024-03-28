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

// class Main{
//     public static void main(String args[]){
//         String str1 = "JAVA";
//         String str11 = "java";
//         String str2 = "JAVA";
//         String str22 = "python";
//         String str33 = "python";

//         String str3 = new String("JAVA");
//         String str4 = new String("JAVA Programming");

//         String temp = str4.substring(5);//Programming
//         System.out.println(temp);

//         temp = str4.substring(5,12); //Program
//         System.out.println(temp);            

//         temp = str4.replace('A','a');
//         System.out.println(temp);            

//         System.out.println("length of str4 : "+str4.length());//16

//         String str5 = "https://www.google.com";

//         String str6 = "sidduganeshsa@gmail.com";

//         boolean temp2 = str5.startsWith("https://"); //true
//         System.out.println(temp2); //true
//         System.out.println(str5.endsWith(".com")); //false

//         System.out.println(str5.charAt(5)); //negatives are not allowed

//         System.out.println(str6.indexOf("@"));//13
//         System.out.println(str6.indexOf("s",11)); //11

//         System.out.println(str5.lastIndexOf(".")); //18

//         for(int i=0;i<str4.length();i++)
//             System.out.print(str4.charAt(i)+" ");
//         System.out.println();

//         System.out.println(str1.equals(str11)); // false
//         System.out.println(str22.equals(str33)); // true

//         System.out.println(str1.equalsIgnoreCase(str11)); //true

//         //compare in dictionary order
//         //upper cases are smaller than lower case.
//         System.out.println(str1.compareTo(str11)); //-32
//         System.out.println(str11.compareTo(str22)); //-6
//         System.out.println(str22.compareTo(str22)); //0
//         System.out.println(str22.compareTo(str11)); //6

//         System.out.println(str1.equals(str2)); //true
//         System.out.println(str1==str2); //true

//         //equals compares the charaters
//         //== compares the references

//         System.out.println(str3.equals(str2)); //true
//         System.out.println(str3==str2); //false 

//         //valueOf //any type of is converted to string
//         // double d = 1342435.4312414;
//         System.out.println(String.valueOf(1342435.4312414));
        
            //contains
            // System.out.println(str4.contains("Programming"));

//     }
// }

// ///valueOf
// public class StringValueOfExample{  
// public static void main(String args[]){  
// int value=30;  
// String s1=String.valueOf(value);  
// System.out.println(s1+10);//concatenating string with 10  
// }}  
// https://www.javatpoint.com/java-string-valueof

////////////////////////////////
///Regular Expr's
// class Main{
//     public static void main(String args[]){
        
//         String str = "M";
//         System.out.println(str.matches("M")); //true

//         // . means any single char or symbol
//         System.out.println(str.matches(".")); //true

//         // [abc] match any one of the that
//         System.out.println(str.matches("[MFO]")); //true

//         // [^abc] other than
//         System.out.println(str.matches("[MFO]")); //false

//         String str2 = "k8";
//         System.out.println(str2.matches("[a-z][0-9]")); //260 patterns

//         //Meta characters
//         //for single char's
//         // \\w for any alphabet
//         // \\d for any digit
//         // \\D other than digits
//         // \\W other than alphabets
//         // \\s space
//         // \\S no spaces

//         //Quantifier //multiple times
//         // * means 0 or more
//         // + means 1 or more

//         String email = "john@gmail.com";
//         System.out.println("\\w*@gmail(.*)")



//     }
// }

// import java.util.Scanner;

// class Main{
//     // static int Sum(int ...x){
//     //     int sum=0;
//     //     for(int a:x){
//     //         sum+=a;
//     //     }
//     //     return sum;
//     // }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String nums[] = {sc.nextLine()};
//         // while(true){
//         // System.out.println("Enter the numbers : ");
        
//         // break;
//         // }
//         for(String x:nums){
//             System.out.println(x);
//         }
//     }
// }

///////////////////////////
//variable arguments
// class Main{
//     static int show(int ...x){
//         int sum=0;
//         for(int elem:x){
//             sum+=elem;
//         }
//         return sum;
//     }
//     public static void main(String args[]){
//         show();
//         System.out.println(show(1,2,3,4,5));
//     }
// }

///////////////////////////////////////
///oops

// class Subject
// {
//     private String subID;
//     private String name;
//     private int maxMarks;
//     private int marksObtains;
    
//     public Subject(String subID,String name,int maxMarks)
//     {
//         this.subID=subID;
//         this.name=name;
//         this.maxMarks=maxMarks;
//     }
    
//     public String getSubID(){return subID;}
//     public String getName(){return name;}
//     public int getMaxMarks(){return maxMarks;}
//     public int getMarksObtains(){return marksObtains;}
    
//     public void setMaxMarks(int mm)
//     {
//         maxMarks=mm;
//     }
    
//     public void setMarksObtain(int m)
//     {
//         marksObtains=m;
//     }
    
//     boolean isQualified()
//     {
//         return marksObtains>=maxMarks/10*4;
//     }
    
//     public String toString()
//     {
//         return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtains;
//     }
    
// }

// public class Main {

//     public static void main(String[] args) 
//     {
//         Subject subs[]=new Subject[3];
//         subs[0]=new Subject("s101","DS",100);
//         subs[1]=new Subject("s102","Algorithms",100);
//         subs[2]=new Subject("s103","Operating Systems",100);

//         // Create student object
//     Student student = new Student("19TU1A0508", "SidduGansh", "CSE");

//     // Enroll student in subjects (assuming student can take all three)
//     for (Subject subject : subs) {
//       student.enroll(subject);
//     }

//     // Set marks for some subjects (assuming you have information)
//     student.setMarks("s101", 90); // Set marks for DS
//     student.setMarks("s103", 85); // Set marks for Operating Systems
//     student.setMarks("s102", 85);

//     // Print student information
//     System.out.println(student);

//     // Additional calculations (optional)
//     System.out.println("Total Marks: " + student.getTotalMarks());
//     System.out.println("Overall Percentage: " + student.getOverallPercentage() + "%");
//     System.out.println("Passed: " + student.isPassed());
        
       
//     }
// }
//  class Student {

//   private String studentID;
//   private String name;
//   private String department;
//   private Subject[] enrolledSubjects;

//   public Student(String studentID, String name, String department) {
//     this.studentID = studentID;
//     this.name = name;
//     this.department = department;
//     this.enrolledSubjects = new Subject[0]; // Initialize empty array
//   }

//   public String getStudentID() {
//     return studentID;
//   }

//   public String getName() {
//     return name;
//   }

//   public String getDepartment() {
//     return department;
//   }

//   public Subject[] getEnrolledSubjects() {
//     return enrolledSubjects; // Consider returning a copy if mutability is a concern
//   }

//   // Method to enroll student in a subject (assuming no duplicates)
//   public void enroll(Subject subject) {
//     Subject[] updatedSubjects = new Subject[enrolledSubjects.length + 1];
//     System.arraycopy(enrolledSubjects, 0, updatedSubjects, 0, enrolledSubjects.length);
//     updatedSubjects[updatedSubjects.length - 1] = subject;
//     enrolledSubjects = updatedSubjects;
//   }

//   // Method to set marks for a specific subject enrolled by the student
//   public void setMarks(String subjectID, int marks) {
//     for (Subject subject : enrolledSubjects) {
//       if (subject.getSubID().equals(subjectID)) {
//         subject.setMarksObtain(marks);
//         return; // Marks set, exit the loop
//       }
//     }
//     System.out.println("Subject with ID " + subjectID + " not found for student " + studentID);
//   }

//   // Calculate total marks obtained by the student across all subjects
//   public int getTotalMarks() {
//     int totalMarks = 0;
//     for (Subject subject : enrolledSubjects) {
//       totalMarks += subject.getMarksObtains();
//     }
//     return totalMarks;
//   }

//   // Calculate overall percentage (assuming all subjects have same weightage)
//   public double getOverallPercentage() {
//     int totalMarks = getTotalMarks();
//     int totalMaxMarks = 0;
//     for (Subject subject : enrolledSubjects) {
//       totalMaxMarks += subject.getMaxMarks();
//     }
//     if (totalMaxMarks == 0) {
//       return 0.0; // Avoid division by zero
//     }
//     return (double) totalMarks / totalMaxMarks * 100;
//   }

//   // Check if student is passed (based on your definition in Subject.isQualified)
//   public boolean isPassed() {
//     for (Subject subject : enrolledSubjects) {
//       if (!subject.isQualified()) {
//         return false;
//       }
//     }
//     return true;
//   }

//   @Override
//   public String toString() {
//     StringBuilder sb = new StringBuilder();
//     sb.append("\nStudent ID: ").append(studentID).append("\n");
//     sb.append("Name: ").append(name).append("\n");
//     sb.append("Department: ").append(department).append("\n");
//     sb.append("Enrolled Subjects:\n");
//     for (Subject subject : enrolledSubjects) {
//       sb.append(subject).append("\n");
//     }
//     return sb.toString();
//   }
// }
//////---------------------------------------------------------

//     class Student {
//         private String rollNo;
//         private String name;
//         private String dept;
//         private Subject subjects[];


//         public Student(String rollNo, String name, String dept){
//             rollNo = this.rollNo;
//             name = this.name;
//             dept = this.dept;
          

//         }

//         public String getRollNo() {
//             return rollNo;
//         }

       

//         public String getName() {
//             return name;
//         }

//         public void setName(String name) {
//             this.name = name;
//         }

//         public String getDept() {
//             return dept;
//         }

//         public void setDept(String dept) {
//             this.dept = dept;
//         }

//         public String[] getSubjects() {
//             return subjects;
//         }

//         public void setSubjects(String ...subjects) {
//             this.subjects = subjects;
//         }

//         public String toString(){
//             return "\n Student rollNo: "+rollNo+"\n Name "+name+"\n MarksObtained "+getSubjects;
//         }
//     }
///////////////////////////////////
//     class Subject {
//   private String name;
//   private String description;

//   public Subject(String name, String description) {
//     this.name = name;
//     this.description = description;
//   }

//   public String getName() {
//     return name;
//   }

//   public String getDescription() {
//     return description;
//   }
// }
//  class Student {
//   private String name;
//   private int id;
//   // List of enrolled subjects (replace with an appropriate data structure like ArrayList if needed)
//   private Subject[] enrolledSubjects;

//   public Student(String name, int id) {
//     this.name = name;
//     this.id = id;
//     this.enrolledSubjects = new Subject[0]; // Initialize empty array
//   }

//   public String getName() {
//     return name;
//   }

//   public int getId() {
//     return id;
//   }

//   // Method to enroll student in a subject (assuming no duplicates)
//   public void enroll(Subject subject) {
//     Subject[] updatedSubjects = new Subject[enrolledSubjects.length + 1];
//     System.arraycopy(enrolledSubjects, 0, updatedSubjects, 0, enrolledSubjects.length);
//     updatedSubjects[updatedSubjects.length - 1] = subject;
//     enrolledSubjects = updatedSubjects;
//   }

//   // Method to get enrolled subjects (consider using an accessor method returning a copy if mutability is a concern)
//   public Subject[] getEnrolledSubjects() {
//     return enrolledSubjects;
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     // Create some subjects
//     Subject math = new Subject("Math", "Introduction to Algebra and Geometry");
//     Subject science = new Subject("Science", "Exploration of the natural world");
//     Subject history = new Subject("History", "A journey through human civilization");

//     // Create some students
//     Student john = new Student("John Doe", 1001);
//     Student jane = new Student("Jane Smith", 1002);

//     // Enroll students in subjects
//     john.enroll(math);
//     john.enroll(science);
//     jane.enroll(history);
//     jane.enroll(math);

//     // Print student information
//     System.out.println("Student: " + john.getName() + " (ID: " + john.getId() + ")");
//     System.out.println("Enrolled Subjects:");
//     for (Subject subject : john.getEnrolledSubjects()) {
//       System.out.println("  - " + subject.getName() + ": " + subject.getDescription());
//     }

//     System.out.println("\nStudent: " + jane.getName() + " (ID: " + jane.getId() + ")");
//     System.out.println("Enrolled Subjects:");
//     for (Subject subject : jane.getEnrolledSubjects()) {
//       System.out.println("  - " + subject.getName() + ": " + subject.getDescription());
//     }
//   }
// }

////////////////////////////////////////
// class Subject {
//   private String name;
//   private String description;
//   private int maxMarks;

//   public Subject(String name, String description, int maxMarks) {
//     this.name = name;
//     this.description = description;
//     this.maxMarks = maxMarks;
//   }

//   public String getName() {
//     return name;
//   }

//   public String getDescription() {
//     return description;
//   }

//   public int getMaxMarks() {
//     return maxMarks;
//   }
// }

//  class Student {
//   private String name;
//   private int id;
//   // Map subject to obtained marks (more efficient for retrieval by subject)
//   private Map<Subject, Integer> enrolledSubjects;

//   public Student(String name, int id) {
//     this.name = name;
//     this.id = id;
//     this.enrolledSubjects = new HashMap<>();
//   }

//   public String getName() {
//     return name;
//   }

//   public int getId() {
//     return id;
//   }

//   // Enroll student in a subject with obtained marks (assuming no duplicates)
//   public void enroll(Subject subject, int marks) {
//     enrolledSubjects.put(subject, marks);
//   }

//   // Method to get marks obtained in a specific subject
//   public Integer getMarks(Subject subject) {
//     return enrolledSubjects.get(subject);
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     // Create some subjects
//     Subject math = new Subject("Math", "Introduction to Algebra and Geometry", 100);
//     Subject science = new Subject("Science", "Exploration of the natural world", 150);
//     Subject history = new Subject("History", "A journey through human civilization", 75);

//     // Create some students
//     Student john = new Student("John Doe", 1001);
//     Student jane = new Student("Jane Smith", 1002);

//     // Enroll students in subjects with marks
//     john.enroll(math, 85);
//     john.enroll(science, 120);
//     jane.enroll(history, 68);
//     jane.enroll(math, 92);

//     // Print student information
//     System.out.println("Student: " + john.getName() + " (ID: " + john.getId() + ")");
//     System.out.println("Enrolled Subjects:");
//     for (Subject subject : john.enrolledSubjects.keySet()) {
//       Integer marks = john.getMarks(subject);
//       System.out.println("  - " + subject.getName() + ": " + marks + " / " + subject.getMaxMarks());
//     }

//     System.out.println("\nStudent: " + jane.getName() + " (ID: " + jane.getId() + ")");
//     System.out.println("Enrolled Subjects:");
//     for (Subject subject : jane.enrolledSubjects.keySet()) {
//       Integer marks = jane.getMarks(subject);
//       System.out.println("  - " + subject.getName() + ": " + marks + " / " + subject.getMaxMarks());
//     }
//   }
// }

//////////////////////////////////////////////////////////
//
// import java.util.*;
// import java.time.*;

// class Main{
//     public static void main(String args[]){
//         // Date d = new Date();
//         // System.out.println(d);

//         Human babyboy = new Human(new Date(),"Sanjana","Sanju");
//         System.out.println(babyboy);
//         System.out.println(LocalTime.now());

//         //ZonedDateTime from specific Calendar
// 		ZonedDateTime gregorianCalendarDateTime = new GregorianCalendar().toZonedDateTime();
// 		System.out.println(gregorianCalendarDateTime);

//     }
// }

// class Human {
//     private String name;
//     private String motherName;
//     private String fatherName;
//     private Date dob;
//     private float height;
//     private float weight;
//     // private Education edu;

//     public Human(Date dob,String motherName, String fatherName){
//         this.dob = dob;
//         this.motherName = motherName;
//         this.fatherName = fatherName;
//     }

//     public String toString(){
//         return "\nBady DOB : "+dob+"\n Mother Name : "+motherName+"\n Father Name : "+fatherName;
//     }
// }

///////////////////////////////////////////////
////Interface

// interface Member{
//     void callback();
// }

// class Customer implements Member{
//     String name;

//     Customer(String s){
//         name = s;
//     }

//     public void callback(){
//         System.out.println("Ok, I will visit "+name);
//     }

// }

// class Store{
//     Member mem[] = new Member[100];
//     int count = 0;

//     void register(Member m)
//     {
//         mem[count++] = m;
//     }

//     void inviteSale(){
//         for(int i=0;i<count;i++)
//             mem[i].callback();
//     }
// }

// class Main{
//     public static void main(String args[]){
//         Store s = new Store();
//         Customer c1 = new Customer("sid");
//         Customer c2 = new Customer("aakash");
//         s.register(c1);
//         s.register(c2);

//         s.inviteSale();
//     }
// }

///////////////////////////
// import java.util.Date;

// class Student
// {
//     private String rollNo;
    
//     private static int count=1;
    
//     private String assignRollNo()
//     {
//         Date d=new Date();
        
//         //.getYear() is deprecated.
//         String rno="Univ-"+(d.getYear()+1900)+"-"+count; //add 1900 to get current year.
//         count++;
//         return rno;
//     }
//     Student()
//     {
//         rollNo=assignRollNo();
//     }
//     public String getRollNo()
//     {
//         return rollNo;
//     }
    
// }

// public class Main
// {
//     public static void main(String[] args) 
//     {
//         Student s1=new Student();
//         Student s2=new Student();
//         Student s3=new Student();
        
//         System.out.println(s1.getRollNo());
//         System.out.println(s2.getRollNo());
//         System.out.println(s3.getRollNo());
        
//     }   
// }


/////////////MULTI THREADING////////////////////////////
//////////////
// class Main extends Thread{

//     public void run(){
//          int i=0;
//         while(true){
//             System.out.println(i+"  WORLD");
//             i++;
//         }
//     }

//     public static void main(String args[]){
      
//         Main t = new Main();
//         t.start();
//         int i=0;
//         while(true){
//             System.out.println(i+"  Hello");
//             i++;
//         }

//     }
// }


////////PRODUCER AND CONSUMER
// package interprocess;

// class MyData
// {
//     int value;
//     boolean flag=true;
    
//     synchronized public void set(int v)
//     {
//         while(flag!=true)
//             try {wait();}catch(Exception e){}
        
//         value=v;
//         flag=false;
//         notify();
//     }
    
//     synchronized public int get()
//     {
//         int x=0;
//         while(flag!=false)
//             try {wait();}catch(Exception e){}
        
        
//         x=value;
//         flag=true;
//         notify();
        
//         return x;            
//     }
// }

// class Producer extends Thread
// {
//     MyData data;
    
//     public Producer(MyData d)
//     {
//         data=d;
//     }
//     public void run()
//     {
//         int count=1;
//         while(true)
//         {
//             data.set(count);
//             System.out.println("Producer "+count);
//             count++;
//         }
//     }
// }

// class Consumer extends Thread
// {
//     MyData data;
    
//     public Consumer(MyData d)
//     {
//         data=d;
//     }
//     public void run()
//     {
//         int value;
//         while(true)
//         {
//             value=data.get();
//             System.out.println("Consumer "+value);
//         }
//     }
// }

// public class InterProcess 
// {
//     public static void main(String[] args) 
//     {
//         MyData data=new MyData();
        
//         Producer p=new Producer(data);
//         Consumer c=new Consumer(data);
        
//         p.start();
//         c.start();
        
//     }
// }

// //////////////////
// package scthread2;



// class WhiteBoard
// {
//     String text;
//     int numberOfStudents=0;
//     int count=0;
//     public void attendance()
//     {
//         numberOfStudents++;
//     }
    
//     synchronized public void write(String t)
//     {
//         System.out.println("Teacher is Writing " +t);
//         while(count!=0)
//                 try{wait();}catch(Exception e){}
//         text=t;
//         count=numberOfStudents;
//         notifyAll();

//     }
//     synchronized public String read()
//     {
        
//         while(count==0)
//                 try{wait();}catch(Exception e){}
            
//         String t=text;
//         count--;
//         if(count==0)
//                 notify();
//         return t;
//     }
    
// }
// class Teacher extends Thread
// {
//     WhiteBoard wb;
    
//     String notes[]={"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end"};
    
//     public Teacher(WhiteBoard w)
//     {
//         wb=w;
//     }
    
//     public void run()
//     {
//         for(int i=0;i<notes.length;i++)
//             wb.write(notes[i]);
//     }          
    
// }

// class Student extends Thread
// {
//     String name;
//     WhiteBoard wb;
//     public Student(String n,WhiteBoard w)
//     {
//         name=n;
//         wb=w;
//     }
    
//     public void run()
//     {
//         String text;
//         wb.attendance();
                
//         do
//         {
//             text=wb.read();
//             System.out.println(name + " Reading " + text);
//             System.out.flush();
//         }while(!text.equals("end"));
//     }
    
// }


// public class SCThread2 
// {
//     public static void main(String[] args) 
//     {
//         WhiteBoard wb=new WhiteBoard();
//         Teacher t=new Teacher(wb);
        
//         Student s1=new Student("1. John",wb);
//         Student s2=new Student("2. Ajay",wb);
//         Student s3=new Student("3. Kloob",wb);
//         Student s4=new Student("4. Smith",wb);
        
//         t.start();
        
//         s1.start();
//         s2.start();
//         s3.start();
//         s4.start();
        
//     }   
// }


// public class Main {

//     public static void main(String[] args) {
        
//         int m1=15;
        
//         //Integer m2=m1;
//         //Integer m3=15;
        
//         Integer m2=Integer.valueOf("123");
//         //Integer m3=Integer.valueOf("11111111", 2);//255
//         Integer m3=Integer.valueOf("A7", 16);//167 //16*10+7=167
//         Integer m4=Integer.decode("0xA7");//true //hexa to decimal
        
//         //System.out.println(m2.equals(m1));
//         //System.out.println(m2.equals(m3));
//         //System.out.println(m3);
        
//         //System.out.println(Integer.parseInt("123")); //converts into a number.
//         //System.out.println(Integer.parseInt("123a")); //NumberFormatException


//         //System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
//         System.out.println(Integer.);
//         System.out.println(Integer.toBinaryString(40));
        
//     }
    
// }
/////////////////////////////////

// import java.io.FileOutputStream;
// import java.io.IOException;

// public class Main{
//     public static void main(String args[]){

//         try (FileOutputStream fos = new FileOutputStream("C:/fffff.txt")) {
//             String str  = "Java SE learning";

//             fos.write(str.getBytes());
//         } catch (IOException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
        

//     }
// }

////////////////////////////////////////////////
//copy file data to another file
// import java.io.FileReader;

// class Main{
//     public static void main(String args[]){
//         FileReader fr = new FileReader("C:/MyJava/text.txt");

//         fr.read();

//         String str = new String(fr);

//         str = str.toLowerCase();


//     }
// }

///////////////////////////////
///DATA STREAM
import java.io.*;

class Student
{
    int rollno;
    String name;
    float avg;
    String dept;
}
public class Main
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