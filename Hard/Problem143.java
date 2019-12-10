//While문을 활용하여 영문자 q가 입력될 때까지 계속 반복하는 프로그램을 작성
import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the alphabet : ");
            ch = sc.next().charAt(0);
        }while(ch != 'q');
        System.out.println("Finish!");
    }
}
