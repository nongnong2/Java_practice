//두 수를 입력받아 두 수의 합을 출력하는 프로그램을 작성하세요.
import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.printf("입력한 두 수의 합은 %d", num1 + num2);
    }
}