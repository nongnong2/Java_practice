//이름을 입력받아 이름의 글자 수를 출력하는 프로그램을 출력하세요.
import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름은? ");
        String name = sc.nextLine();
        System.out.printf("%d", name.length());
    }
}