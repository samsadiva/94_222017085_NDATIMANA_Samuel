public class classassignment {//declaring atleast one class to run main method

    public static void main(String args[]) {//main method which is mandatory for all java program
        A ob = new A();//creating instance of A class
        ob.myname();
        ob.hisname();
        ob.hername();
        ob.thisisname();
        ob.last();

    }
}
class D{
public void myname(){
System.out.println("NDATIMANA SAMUEL");
}
}
class C extends D{
    public void hisname(){
System.out.println("niyomungri daniel");
    }
}
class B extends C{
public void hername(){
System.out.println("Imanizabayo valentine");
}
}
interface E{
void thisisname();
}
class A extends B implements E{
@Override
public void thisisname(){
    System.out.println("all names are correctly");
}

public void last(){
    System.out.println("this is last class");
}
}
