public class if1 {
    public static void main(String args[]) {
        int a = 10;
        int b = 15;
        int c = 20;

        if (a > b && a > c) {
            System.out.println(" a is greater");
        } else if (b > a && b > a) {
            System.out.println(" b is greater");

        } else if (c > a && c > b) {
            System.out.println(" c is greater");
        } else {
            System.out.println(" numbers are equal");
        }

    }

}
