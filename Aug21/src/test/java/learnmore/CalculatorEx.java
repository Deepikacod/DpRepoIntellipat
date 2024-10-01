package learnmore;

public class CalculatorEx {

    public static void main(String[] args) {

        int a = 20;
        int b = 30;

        String operator = "-";

        if(operator.equals("+")) {
            System.out.println(a + b);
        }
        else if(operator.equals("-")) {
            if(a > b) {
                System.out.println(a - b);
            } else {
                System.out.println(b - a);
            }
        }
        else if(operator.equals("*")) {
            System.out.println(a * b);
        }
        else if(operator.equals("/")) {
            System.out.println(a / b);
        }
        else {
            System.out.println("Enter the valid operator");
        }
    }

}


