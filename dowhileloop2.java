
// inter number and display the sum from that number to one
import java.util.Scanner;
class dowhileloop2 {


    public static void main(String args[]) {
        Scanner Num= new Scanner(System.in);
        System.out.println("please inter number:");
        int a=Num.nextInt();
        int p=a;
        int sum=0;
        do{
            sum=sum+a;
                    a--;
        }
        while(a>=1);
        System.out.println("the sum from "+p+" is ="+sum);
        
        // TODO code application logic here
    }
}
