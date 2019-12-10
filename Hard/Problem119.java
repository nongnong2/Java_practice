//숫자 하나를 입력받아 홀수이면 odd number 짝수이면 even number 출력
import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }


    }
}