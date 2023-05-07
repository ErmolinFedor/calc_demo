package demo.services.calc;

import demo.utils.ConsoleHelper;

public class Main {
    public static void main(String... args) throws Exception {
        String expression = ConsoleHelper.getLine();
        System.out.println(new Main().service(expression));

    }

    public String  service(String line) throws Exception {
        //toDo реализовать метод используя классы ExpressionParser и Calc

        return calc.calc(first, delimiter, second);
    }
}
