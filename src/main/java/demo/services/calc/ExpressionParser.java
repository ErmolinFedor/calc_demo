package demo.services.calc;

import java.util.Objects;

import static java.util.Objects.*;

public class ExpressionParser {
    private String line;
    private String[] lines;

    public ExpressionParser(String line) throws Exception {
        //toDo релизовать контсруктор
        //коструктор инициализирует lines и провереят строку и пробрасывает исключения Line is Empty
        // и "First Line is Empty
    }

    public char getDelimiter() throws Exception {
        //toDo релизовать метод
        // метод должен пробрасывать исключение "Line is Empty" и возвращать символ
    }

    public String getFirst() {
        //toDo релизовать метод
        //метод должен возвращать первую часть строки в ковычках
    }

    public String getSecond() {
        //toDo релизовать метод
        //метод должен возвращать вторую часть строки в ковычках либо число в виде строки
    }
}
