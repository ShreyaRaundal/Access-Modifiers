package Protected.StaticEx;

public class G {
    protected static int a=50;

    public G(){

    }

    protected static void test(){
        System.out.println("From protected sttaic method of F");
    }
    public static void main(String[] args){
        System.out.println(G.a);
        G.test();
    }
}
