package Default.StaticEx;

public class C {
    // make public to access from other package
    // static int a=100;

    public static int a=200;

    C(){

    }
     public static void test(){
        System.out.println("From public test() in C ");
     }

    // static void test(){
    //     System.out.println("From default test of C");
    // }

    public static void main(String[] args){
        C.test();
        
        System.out.println(C.a);
    }
}
