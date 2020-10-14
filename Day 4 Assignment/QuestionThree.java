import java.util.Scanner;

public class QuestionThree {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] num=new int[5];
    int sum=0;
    System.out.println("Enter any five numbers: ");
    for(int i=0;i<5;i++){
      num[i]=sc.nextInt();
    }
    System.out.print("Sum of the values are: ");
    for(int i=0;i<5;i++){
        sum+=num[i];
    }
    System.out.print(sum);
      
    }
  }
