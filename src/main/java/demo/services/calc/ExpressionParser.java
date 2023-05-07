package demo.services.calc;

import java.util.Objects;

import static java.util.Objects.*;

public class ExpressionParser {
    private String line;
    private String[] lines;

    public ExpressionParser(String line) throws Exception {
        this.line = line;
        if (isNull(line) || line.isEmpty()) throw new Exception("Line is Empty");
        lines = line.split("\"");
        if (line.charAt(0) != '"') throw new Exception("First Line is Empty");
    }

    public char getDelimiter() throws Exception {
        if (lines[2].isEmpty()) throw new Exception("Line is Empty");

        return lines[2].trim().charAt(0);
    }

    public String getFirst() {
        return lines[1];
    }

    public String getSecond() {
        String second = lines[2].trim();
        if (lines.length == 3) {
            return second.substring(2);
        }
        return lines[3].trim();
    }
}
