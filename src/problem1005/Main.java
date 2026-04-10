package problem1005;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException{
        double a,b,grade;
        Scanner read = new Scanner(System.in);

        a = read.nextDouble();
        b = read.nextDouble();
        grade = ((a+b)/2);

        System.out.printf("MEDIA =%.4f%n",grade);

    }
}
