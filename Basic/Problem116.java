//5자리의 정수를 입력받아서 만의 자리와 십의 자리의 곱을 출력하는 프로그램
import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String NUM = Integer.toString(num);
        int ten_thousand =  Integer.valueOf(NUM.substring(0,1));
        int ten = Integer.valueOf(NUM.substring(3, 4));
        System.out.printf("%d", ten_thousand * ten);      
       }
}