/*함수처럼 입력에 대해 하늬 결과를 대응
반복적인 작업을 진행해야 하는 경우 메소드를 정의해 여러번 사용, 효율성 증가
public static [반환 자료형](input){(실행코드) return 리턴값 형태}
메소드 내에서만 쓰이는 변수를 지역변수(local variable)라고 함
전체 프로그램에 영향을 주는 변수는 전역변수, 지역변수와 전역변수의 이름은 같을 수 있지만 그 경우 지역변수 우선*/
class Method{
    public static int a = 1;
    public static void main(String[] args) {
        // int a = 1;
        System.out.println(a);
        plusA(a);

    }
    //method 정의
    public static void plusA(int a){
        a += 1; //a는 plusA메소드의 지역변수로 main 함수 안의 a와는 다른 변수, 지역변수 a를 1증가시켜도 main함수 a는 1증가 X
    }
    public static int plus(int a){
        return a += 1;
    }
}