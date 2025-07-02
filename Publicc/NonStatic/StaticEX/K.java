package Publicc.NonStatic.StaticEX;

public class K {
   public int a = 100;                

    public K() {
        System.out.println("Public constructor of X");
    }

    public void test() {
        System.out.println("Public non-static method of X");
    }

    public static void display() {
         K k = new K();               
        System.out.println(k.a);  
        k.test(); 
    }
}
    
