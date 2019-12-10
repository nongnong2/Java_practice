//년도를 입력받아 윤년인지 판정해주는 프로그램 작성
//연수가 4로 나눠떨어지는 해는 윤년
//그중에서 100으로 나눠떨어지는 해는 평년
//다만 400으로 나눠떨어지면 다시 윤년(ex. 2016년은 유년, 2100년은 평년, 2000년은 윤년)

import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 4 == 0){
            if(year % 400 == 0){
                System.out.printf("%d는 윤년입니다.", year);
            }
            else if(year % 100 == 0){
                System.out.printf("%d는 평년입니다.", year);
            }
            else{
                System.out.printf("%d는 윤년입니다.", year);
            }
        }
        else{
            System.out.printf("%d년은 평년입니다.", year);
        }
    }
}
