package Default.Nonstatic;

import Default.StaticEx.C;

public class D {
    
    int a=20;
    D(){

    }

    static void test(){
        System.out.println("The method is default nonstatic ");
    }

    public static void main(String[] args){
        D d1=new D();
          D.test();

        // ✅ Accessing non-static variable using object
        // System.out.println(D.a);
      

    }
}
