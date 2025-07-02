package Protected.Nonstatic;

public class I {
    public static void main(String[] args){
        F d1=new F();
        System.out.println(d1.a);
        F.test();
    }
}
