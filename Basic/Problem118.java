//6개의 정수를 입력받아, 모두 붙여서 문자열로 저장, 그 이후 숫자 세 개씩 나누어서, 그 수들의 합을 출력하는 프로그램
import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Sum = 0;
        System.out.print("Enter six numbers : ");
        String num1 = String.valueOf(sc.nextInt());
        String num2 = String.valueOf(sc.nextInt());
        String num3 = String.valueOf(sc.nextInt());
        String num4 = String.valueOf(sc.nextInt());
        String num5 = String.valueOf(sc.nextInt());
        String num6 = String.valueOf(sc.nextInt());
        String NUM = (num1 + num2 +num3 + num4 +num5 + num6);

        int len = (NUM.length() % 3);

        for(int i = 0; i <= len + 1; i++){
            if(i == len + 1){
                int A = Integer.parseInt(NUM.substring(3*i));
                Sum += A;
            }
            else{
                int A = Integer.parseInt(NUM.substring(3 * i, 3*i + 3));
                Sum += A;
            }
        }
        System.out.println(Sum);
        // System.out.println(num1 + num2 +num3 + num4 +num5 + num6);
       }
}