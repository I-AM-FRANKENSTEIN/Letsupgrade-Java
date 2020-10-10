import java.util.Scanner;

class Employee{
    String name;
    int age;
    int bd;
    int bm;
    int by;
    int sal;
    float t;
    void calc(){
      age=2020-by;
      switch(sal){
        case 500000: t=20*sal/100;
                      break;
        case 400000: t=15*sal/100;
                      break;
        case 300000: t=10*sal/100;
                      break;
        case 200000: t=5*sal/100;
                      break;
        default: System.out.println("No tax");
      }
        
    }  
    void display(){
      System.out.println("\nName:- "+name);
      System.out.println("Age:- "+age);
      System.out.println("Salary:- Rs"+sal);
      System.out.println("Tax:- Rs"+t);
    }
}
public class QuestionTwo {
public static void main(String[] args) {
Employee e=new Employee();
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Name");
e.name=sc.nextLine();
System.out.println("Enter your Birth Day");
e.bd=sc.nextInt();
System.out.println("Enter your Birth Month");
e.bm=sc.nextInt();
System.out.println("Enter your Birth Year");
e.by=sc.nextInt();
System.out.println("Enter your Salary");
e.sal=sc.nextInt();
e.calc();
e.display();
}   
}
