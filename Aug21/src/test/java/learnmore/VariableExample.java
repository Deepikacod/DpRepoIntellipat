package learnmore;

public class VariableExample {

    int b=700; //global variable
    int c;

    public void m1() {
        int a = 100; //local variable
        System.out.println(a);
        System.out.println(b);
        c = 400;
    }

    public void m2(){
        //System.out.println(a); a is a local variable
        System.out.println(b);
    }
}
