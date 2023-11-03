
import java.util.Scanner; 
public class forloop {


    //keep reading number up to zero interence
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner n=new Scanner(System.in);
        int sum=0;
        for(int i=1;i>=1;i++){
        System.out.println("please inter number=");
        int a=n.nextInt();
        if(a==0)break;
        sum=sum+a;
        
        }
        System.out.println("the sum of entered number is ="+sum);
    }
}
