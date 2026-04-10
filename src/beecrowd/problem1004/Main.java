package beecrowd.problem1004;
import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        int num1, num2,prod;
        Scanner read = new Scanner(System.in);

        num1 = read.nextInt();
        num2 = read.nextInt();

        prod = num1*num2;
        System.out.println("PROD = "+prod);



    }
}
