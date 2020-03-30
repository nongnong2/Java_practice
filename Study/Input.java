/*자바에서 수나 문자를 입력받는 Scanner 클래스를 제공해줌
Scanner 클래스를 불러온 이후 Scanner 클래스 생성하면 메소드 활용 가능
메소드에는 next(): 공백단위로 읽음, nextLine(): Enter단위로 읽음, nextDouble(), nextInt()등이 있음*/

import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름은? : ");
        String name = sc.next();
        sc.close();

        System.out.print("공백단위로 읽은 이름은 " + name + " 입니다.");
    }
}