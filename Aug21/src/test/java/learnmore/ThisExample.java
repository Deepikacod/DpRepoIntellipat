package learnmore;

public class ThisExample {

    int a = 100;
    public static void main(String[] args) {
        ThisExample h = new ThisExample();
        h.m1();

    }

    public void m1(){
        int a = 10;
        System.out.println(a);
        System.out.println(this.a);

    }
}
