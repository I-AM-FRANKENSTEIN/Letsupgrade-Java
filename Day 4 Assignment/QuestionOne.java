import java.util.Scanner;

class avenger{
Scanner sc=new Scanner(System.in);
String name, power, weapon, planet;
int age;
void getDetails(){
System.out.println("\nEnter name:");
name=sc.nextLine();
System.out.println("Enter age:");
age=sc.nextInt();
sc.nextLine();
System.out.println("Enter power:");
power=sc.nextLine();
System.out.println("Enter weapon:");
weapon=sc.nextLine();
System.out.println("Enter planet:");
planet=sc.nextLine();
}
void displayDetails(){
System.out.println("\nName: "+name);
System.out.println("Age: "+age);
System.out.println("Power: "+power);
System.out.println("Weapon: "+weapon);
System.out.println("Planet: "+planet);
}
}


public class QuestionOne {
  public static void main(String[] args) {
    avenger[] a=new avenger[5];
    System.out.println("Enter details of avengers: ");
    for(int i=0;i<5;i++){
      a[i]=new avenger();
    }
    for(int i=0;i<5;i++){
      a[i].getDetails();
    }
    System.out.println("\nThe details of avengers: ");
    for(int i=0;i<5;i++){
      a[i].displayDetails();
    }
  }

}
