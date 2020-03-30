/*변수 값을 공유하고 싶으면 static, 
변수 초기화된 후 바꾸지 않게 하려면 final 사용
Static을 붙이면(메소드, 변수 둘다 가능) 클래스명.(메소드명, 변수명)으로 접근이 가능
메소드는 인스턴스 만드는게 의미 없는 경우 변수명은 모든 인스턴스가 공유하는 변수의 경우 사용하면 좋음  */
class Static_Final{
    public static void main(String[] args) {
        System.out.println(MyClass.myStaticVariable);
        System.out.println(new MyClass().myVariable); //static 선언 안된 myVariable은 인스턴스 생성 해줘야함 
        new MyClass().myMethod();
        System.out.println("myStaticVariable의 값에 집중하세요");
        new MyClass().myMethod(); // myStaticVariable의 값은 공유되기 때문에 객체 생성시미다 200 -> 201이 되는게 아니라 201->202가 됨 
    }
}
class MyClass{
    static int myStaticVariable = 100;
    int myVariable = 200;
    public void myMethod(){
        myStaticVariable++;
        myVariable++;
        System.out.println(myStaticVariable);
        System.out.println(myVariable);
    }
}