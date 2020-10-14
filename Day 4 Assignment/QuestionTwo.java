import java.util.Scanner;

public class QuestionTwo {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] num=new int[5];
    System.out.println("Enter any five numbers: ");
    for(int i=0;i<5;i++){
      num[i]=sc.nextInt();
    }
    System.out.print("Odd values are: ");
    for(int i=0;i<5;i++){
      if(num[i]%2!=0){
        System.out.print(" "+num[i]);
      }
    }
  }
}
