package demo.services.calc;

public class Calc implements Calculable {

    public String calc(String first, char delimiter, String second) throws Exception {
        String res = "";
        switch (delimiter) {
            case '+' : res = plus(checkString(first), checkString(second)); break;
            case '-' : res = minus(checkString(first), checkString(second)); break;
            case '*' : res = multiply(checkString(first), parse(second)); break;
            case '/' : res = divide(checkString(first), parse(second)); break;
        }
        return checkRes(res);
    }

    private String plus(String first, String second) {
        return first + second;
    }

    private String minus(String first, String second) {
        return first.replaceAll(second, "");
    }

    private String multiply(String line, int multiply) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < multiply; i++) {
            sb.append(line);
        }
        return sb.toString();
    }

    private String divide(String line, int div) {
        return line.substring(0, line.length() / div);
    }

    private int parse(String num) throws Exception {
        if (num.matches("^[a-zA-Z]*$")) {
            throw new Exception("Second should be number");
        }
        int number;
        try {
            number = Integer.parseInt(num);
        } catch (NumberFormatException e) { throw new Exception("number should be whole");}

        if (number > 10) throw new Exception("number should be less 10");

        return number;
    }
}
