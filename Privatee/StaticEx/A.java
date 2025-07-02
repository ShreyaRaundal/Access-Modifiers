package StaticEx;

public class A {
    private static int a=20;

    private A(){

    }
    private static void test(){
        System.out.println("Static method is present in this ");
    }
    public static void main(String[] args){
        A.test();
        System.out.println(A.a);
    }
}
