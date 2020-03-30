/*자바에서는 try-catch, throws, throw등의 키워드를 사용해 예외처리 가능
try{(예외 발생 코드)} catch (예외 인스턴스 e){해당 예외 발생시 실행 코드} finally{예외 유무 상관없이 꼭 실행 코드}
메소드의 선언부에 throws 키워드를 사용하면 메소드를 호출하는 부분에 예외처리를 넘길 수 있음*/

public class Exception_handling{
    public static void main(String[] args) {
        int[] myList = {2, 3, 6, 0};
        try{
            Calculator.divide(myList, 5, 0);
        } catch (Exception e){
            System.out.println("Exception 발생");
        }
        try{
            Calculator.divide(myList, 2, 0);
        } catch (Exception e){
            System.out.println("Exception 발생");
        }
    }
}
class Calculator{
    static void divide(int[] intList, int a, int b) throws Exception{
        //divide 메소드가 호출되는 곳으로 예외처리 넘기기
            System.out.println(intList[a]/intList[b]);
        }
}
