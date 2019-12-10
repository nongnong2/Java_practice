//이름을 입력받아 이름의 글자 수를 출력하는 프로그램을 출력하세요.
import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("first number? ");
        int num1 = sc.nextInt();
        System.out.print("second number? ");
        int num2 = sc.nextInt();
        boolean check = num1 - num2 > 0;
        System.out.println(check);
    }
}