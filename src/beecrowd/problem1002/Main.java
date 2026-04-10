package beecrowd.problem1002;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException{
        double pi = 3.14159;
        Scanner read = new Scanner(System.in);
        double radius = read.nextDouble();
        double area = (pi * (radius * radius));

        System.out.printf("A=%.4f%n",area);

    }
}
