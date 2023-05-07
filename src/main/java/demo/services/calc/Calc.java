package demo.services.calc;

public class Calc {
    //toDo Calc должен реализовывать интерфейс Calculable

    public String calc(String first, char delimiter, String second) throws Exception {
        String res = "";
        //toDo реализовать при помощи switch используя методы plus, minus, multiply, divide, checkString, parse, checkRes
    }

    private String plus(String first, String second) {
        //toDo реализовать
    }

    private String minus(String first, String second) {
        //toDo реализовать
    }

    private String multiply(String line, int multiply) {
        //toDo реализовать
    }

    private String divide(String line, int div) {
        //toDo реализовать
    }

    private int parse(String num) throws Exception {
        //toDo реализовать проверки перевода второй строки в число, пробрасывем исключения  Second should be number,
        // number should be whole, number should be less 10

    }
}
