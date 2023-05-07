package demo.services.calc;

import demo.utils.ConsoleHelper;

public class Main {
    public static void main(String... args) throws Exception {
        String expression = ConsoleHelper.getLine();


        System.out.println(new Main().service(expression));

    }

    public String  service(String line) throws Exception {
        ExpressionParser expressionParser = new ExpressionParser(line);
        char delimiter = expressionParser.getDelimiter();
        String first = expressionParser.getFirst();
        String second = expressionParser.getSecond();
        Calc calc = new Calc();
        return calc.calc(first, delimiter, second);
    }
}
