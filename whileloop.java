public class whileloop {

    public static void main(String args[]) {
        // TODO code application logic here
        int a=1;
        int product=1,sum=0;
        while(a<=100){
            if(a%2==0){
                sum=sum+a;
            }
            else{
                product=product*a;
            }
            a++;
        }
        System.out.println("the sum of even number from 1 to 100 is="+sum);
        System.out.println("the product of odd number from 1 to 100 is="+product);
    }
}
