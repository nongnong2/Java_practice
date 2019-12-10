import java.util.Scanner;
//애국가 1절의 글자 수(띄어쓰기 미포함)를 출력하는 프로그램을 작성하세요.
public class test{
    public static void main(String[] args) {
        String lyrics ="동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라만세. 무궁화 삼천리 화려강산 대한 사람 대한으로 길이 보전하세";
        String S_lyrics = lyrics.replaceAll(" ", "");
        System.out.println(S_lyrics.length());
    }
}