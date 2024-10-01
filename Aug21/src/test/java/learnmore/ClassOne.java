package learnmore;

public class ClassOne {

    static int a= 90;

    public void m1(){ //non static method
        System.out.println("abc");
        System.out.println(a);
    }

    public void m2(){
        System.out.println(a);
    }

    public static void m3(){
        System.out.println(a);
    }
}
