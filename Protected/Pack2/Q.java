package Protected.Pack2;

import Protected.Nonstatic.F; 

public class Q extends F {
    public static void main(String[] args){
        Q d1=new Q();
        System.out.println(d1.a);
        Q.test();
    }
}
