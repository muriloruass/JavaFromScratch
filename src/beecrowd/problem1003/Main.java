package beecrowd.problem1003;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        int a,b,sum;

        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        b = read.nextInt();

        sum = a + b;
        System.out.println("SOMA = "+sum);


    }
}
