//영어 문장 하나 입력받아 처음 시작하는 알파벳이 모음이면 Good Sentence를 출력하는 프로그램
import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sec = sc.nextLine();
        String check_sec = sec.toLowerCase();
        if(check_sec.indexOf("a") == 0 || check_sec.indexOf("e") == 0 || check_sec.indexOf("i") == 0 || check_sec.indexOf("o") == 0 || check_sec.indexOf("u") == 0){
            System.out.println("Good Sentence");
        }
        else{
            return;
        }
    }
}
