import java.util.Scanner;

class student{
    int math;
    int cs;
    int phy;
    int chem;
    int eng;
    int s=0;
    void calculate(){
        float p;
        char g;
        s=math+cs+phy+chem+eng;
        p=s*100/500;
        System.out.println("\nPercentage:- "+p);
        if(90<=p&&p<=100){
            g='O';
        }
        else if(80<=p&&p<90){
            g='E';
        }
        else if(70<=p&&p<80){
            g='A';
        }
        else if(60<=p&&p<70){
            g='B';
        }
        else if(50<=p&&p<60){
            g='C';
        }
        else if(40<=p&&p<50){
            g='D';
        }
        else{
            g='F';
        }
        System.out.println("Grade:- "+g);
    }
}
public class Main {
public static void main(String[] args) {
student stu=new student();
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks obtained in Math");
stu.math=sc.nextInt();
System.out.println("Enter marks obtained in Computer Science");
stu.cs=sc.nextInt();
System.out.println("Enter marks obtained in Physics");
stu.phy=sc.nextInt();
System.out.println("Enter marks obtained in Chemistry");
stu.chem=sc.nextInt();
System.out.println("Enter marks obtained in English");
stu.eng=sc.nextInt();
stu.calculate();
}   
}
