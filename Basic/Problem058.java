import java.util.Scanner;
//num1, num2에 대하여, 문자열의 특정 구간[num1 : num2]에 해당하는 부분 문자열을 출력하는 프로그램을 작성하세요.
//ex. abcdefghijklmn에서 구간 [5,8]의 부분 문자열은 efgh입니다.
public class problem058{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String sec = "abcdefghijklmn";
        System.out.printf("%s에서 구간 [%d, %d]의 부분 문자열은 %s입니다.",sec, num1, num2, sec.substring(num1, num2+1));
    }
}