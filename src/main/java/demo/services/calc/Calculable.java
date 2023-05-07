package demo.services.calc;

public interface Calculable {

     default String checkString(String line) throws Exception {
        if (line.length() > 10) throw new Exception("line should be less 10");
        return line;
    }

    default String checkRes(String res) {
        if (res.length() > 40) {
            return res.substring(0, 40) + "...";
        }
        return res;
    }
}
