import java.util.Scanner;
public class javaMethod {
    static int sum(int a,int b, int c){
        int sum=a+b+c;
        return sum;
    }
public static void main(String args[]){
    int a1,b1,c1,sum1;
    Scanner s=new Scanner(System.in);
    System.out.println("please enter first number:");
    a1=s.nextInt();
    System.out.println("please enter second number:");
    b1=s.nextInt();
    System.out.println("please enter third number:");
    c1=s.nextInt();
    sum1=sum(a1,b1,c1);
    System.out.println("the sum of three numbers is ="+sum1);}}
