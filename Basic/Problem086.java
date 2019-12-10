import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean check = num % 2 == 0 || num %3 == 0;
        System.out.println(check);
    }
}