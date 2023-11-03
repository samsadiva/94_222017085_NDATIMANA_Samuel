
public class forloop2 {//creating first class

    public static void main(String args[]) {//main function
        // TODO code application logic here
        for(int a=1; a<=20; a++){//start for loop to loop up to 20 times
            if(a==2)continue;//jump to next loop if a=2
            if(a==5)break;//when a=5 loop will terminated
            System.out.println(a);//print a
        }
    }
}
