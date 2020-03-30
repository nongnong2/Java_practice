/*전체 프로그램 전체에 영향을 주는 변수는 전역변수로 선언해줘야 함
전역변수는 클래스 영역에 선언하며 앞에 public static을 붙임(일단은 private, protected 등은 나중에)
지역변수와 전역변수가 동일한 이름을 가질 수는 있지만 겹치는 경우 지역변수가 우선*/
public class Variable{
    public static String str = "global variable";
    public static void function(){
        System.out.println(str);
    }
    public static void main(String[] args) {
        String str = "local variable";
        System.out.println(str); // 지역변수와 전역변수 중첩시 지역변수 우선 
        function(); 
    }
}