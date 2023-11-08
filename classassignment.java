public class classassignment {//declaring atleast one class to run main method

    public static void main(String args[]) {//main method which is mandatory for all java program
        A myObj = new A();//creating instance of A class
        myObj.add();
        myObj.mult();
        myObj.multall();

    }
}
class D{
int a=10;
int b=50;
int addition=a+b;

public void add(){
System.out.println("Method in D added a and b the result is"+addition);
}
}
class C extends D{
public void mult(){
     int m=a*b;
System.out.println("The Method in C multiplied a and b the result is"+m);
}

}
class B extends C{
public void multall(){
    int sub=a-b;
System.out.println("The Method in B substracted a and b"+sub);
}
}
interface E{
void practiceInterface();
}
class A extends B implements E{
@Override
public void practiceInterface(){
    System.out.println("This Method was implemented in Class A From Interface E");
}

public void last(){
    System.out.println("This is the Last Method");
}
}
