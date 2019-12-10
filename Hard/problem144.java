//While문을 활용하여 두 수를 입력받아 작은 수에서 큰 수까지 5의 배수를 순서대로 출력하는 프로그램
import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("first num : ");
        int num1 = sc.nextInt();
        
        System.out.print("Second num : ");
        int num2 = sc.nextInt();

        int i = 1;
        while(5*i <= num2){
            if(5*i >= num1){
                System.out.println(5*i);
                ++i;
            }
            else{
                ++i;
            }
        }
    }
}
