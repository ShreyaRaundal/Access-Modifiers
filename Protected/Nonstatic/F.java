package Protected.Nonstatic;

public class F {
protected int a=10;

    public F(){

    }

    public static void test(){
        System.out.println("from protected method test ofclass F");
    }

    public static void main(String[] args){
        F f=new F();
        System.out.println(f.a);
        F.test();

    }
    
}
