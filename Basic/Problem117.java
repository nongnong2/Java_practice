//3자리 정수를 입력받아 2진수로 변환하였을때, 오른쪽에서 두번째 비트와 다섯번째 비트 출력
import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.printf("두 번째 : %d\n다섯 번째: %d", (num>>1)&1,(num>>4)&1);
    }
}