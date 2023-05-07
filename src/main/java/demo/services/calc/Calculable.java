package demo.services.calc;

public interface Calculable {

     default String checkString(String line) throws Exception {
         //toDo реализовать проверка строки на длинну, пробрасываем исключение line should be less 10
    }

    default String checkRes(String res) {
        //toDo реализовать проверка строки на длинну, если длиннее 40 то ...
       }
}
