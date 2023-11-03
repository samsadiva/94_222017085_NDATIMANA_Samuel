/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author USER
 */
public class whileloop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int a=50;
        int sum=0;
        while(a>=1){
            if(a%2==0){
                sum=sum+a;
            }
            a--;
        }
        System.out.println("the sum of even number from 50 to 1 is="+sum);
    }
}
