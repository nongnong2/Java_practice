//년도를 입력하면 해당년도의 지수의 나이를 출력해주는 프로그램 작성
import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int birth, year;
        String name;

        System.out.print("년도를 입력하세요.: ");
        year = sc.nextInt();

        System.out.print("탄생년도를 입력하세요.: ");
        birth = sc.nextInt();

        System.out.print("이름 입력하세요.:");
        name = sc.next();

        System.out.printf("%d년 %s의 나이는 %d입니다.",year,name,year - birth);
    }
}