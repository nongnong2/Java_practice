// 1000이하의 수들을 2진법으로 바꾼후 이를 다시 8진법으로 해석한 수로, 1000을 넘는 수들은 8진법으로 바꾼후 이를 다시 16진법으로 해석한 수를 암호화
//자연수를 하나 입력받아 암호화된 수를 출력하는 프로그램(ex. 17 -> 1001 -> 513)
import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num <= 1000){
            String level1 = Integer.toBinaryString(num);
            int level2 = Integer.parseInt(level1, 8);
            System.out.printf("level1 : %s\nlevel2 : %d",level1, level2);
        }
        else{
            String level1 = Integer.toOctalString(num);
            int level2 = Integer.parseInt(level1, 16);
            System.out.printf("level1 : %s\nlevel2 : %d",level1, level2);
        }
    }
}
