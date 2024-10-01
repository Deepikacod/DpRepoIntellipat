package learnmore;

public class ConditionEx {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;

        if(a == b){
            System.out.println("Both are equal");
        }
        else if(a>b){
            System.out.println("a is greater");
        }
        else {
            System.out.println("b is greater");
        }

        String name = "lmti";
        String name1 = "LMTI";

        if(name.equals(name1)) {
            System.out.println("both are equal");
        }
        else {
            System.out.println("not equal");
        }


    }
}
