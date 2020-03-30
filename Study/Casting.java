/* 자바에서 자료형은 매우 중요!
정해진 자료형에 맞는 값만을 변수에 저장할 수 있기 때문 
int형 -> String형: Integer.toString(i)
String형 -> int형: Integer.parseInt(str) or Integer.valueOf(str).intValue()
long형 - String형 동일
double - String, float - String 형은 String에서 바꿀때 valueof().doubleValue(), valueof().floatValue()
자바 자료형 확인하기: 객체.getClass().getName()*/

public class Casting{
    public static void main(String[] args) {
        //int to string 
        int test = 3;
        String test2 = Integer.toString(test);
        printType(test);
        printType(test2);
        
        //string to int 
        String test3 = "3";
        int test4 = Integer.valueOf(test3).intValue();
        printType(test3);
        printType(test4);
    }
    //method overriding
    public static void printType(int x){
        System.out.println(x + " is an int");
    }
    public static void printType(String x){
        System.out.println(x + " is an String");
    }
    public static void printType(double x){
        System.out.println(x + " is an double");
    }
    public static void printType(float x){
        System.out.println(x + " is an float");
    }

}