class Employee {
    String name;
    String city;
    int age;
    void display()
    {
        System.out.println("\nEmployee Details: ");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+city);
    }
}
public class Main {
  public static void main(String[] args) {
  Employee a=new Employee();
  a.name="Ram";
  a.city="Mumbai";
  a.age=30;
  a.display();
  Employee b=new Employee();
  b.name="Sahil";
  b.city="Goa";
  b.age=35;
  b.display();
  Employee c=new Employee();
  c.name="Kailash";
  c.city="Juhu";
  c.age=33;
  c.display();
  }
}
