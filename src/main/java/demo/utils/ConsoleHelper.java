package demo.utils;

import java.util.Scanner;

public class ConsoleHelper {
    private static Scanner scanner= new Scanner((System.in));

    public static String getLine() {
        return scanner.nextLine();
    }
}
