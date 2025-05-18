package algorithmLv0;

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // N 입력받기
        int N = scanner.nextInt();
        // N단 출력하기
        for (int i = 1; i <= 9; i++) {
            System.out.println(N + " * " + i + " = " + (N * i));
        }
        scanner.close();
    }
}
