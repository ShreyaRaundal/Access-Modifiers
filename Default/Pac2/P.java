package Default.Pac2;

import Default.StaticEx.C;  // ✅ Import the class from other package

public class P {
    public static void main(String[] args) {
        C c1 = new C();     // ✅ Works — constructor is public
        C.test();           // ✅ Works — method is public
        System.out.println(C.a); // ✅ Works — variable is public
    }
}
// default access modifier is not visiting outside package