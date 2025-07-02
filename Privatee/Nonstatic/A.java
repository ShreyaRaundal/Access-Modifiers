package Nonstatic;
public class A{
    int a=10;

    private A(){

    }
    private void test(){
        System.out.println("From class A");
    }
    
    public static void main(String[] args) {
        A a1=new A();
        a1.test();
        System.out.println(a1.a);
    }
}