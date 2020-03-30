/*자바에서 상속은 클래스와 클래스 사이에서 발생, 하위클래스는 상위클래스의 멤버 변수들과 메소드들을 물려받음
하위클래스 extends 상위클래스 형태로 작성
하위클래스에서 상위클래스의 변수나 메소드에 접근할고자 할때는 super 키워드를 사용 
하위클래스 생성시 자바에서는 상위 클래스의 생성자를 먼저 초기화 하기때문에 상위클래스에 생성자가 따로 정의된 경우
super(인자)를 선언해줘야 함 + 하위 클래스의 생성자 맨 첫 부분에 있어야 함
하위 클래스가 상위클래스의 메소드를 다시 구현하는 오버라이딩 가능
메소드 오버로딩은 한 클래스에서 인자가 다른 메소드를 구현(메소드 명은 동일)
생성자 오버로딩은 클래스명과 같은 생성자를 입력받는 인자를 다르게 구현 */
class Inheritance{
    public static void main(String[] args) {
        Student test = new Student("john", 21, "KNPU");
        System.out.printf("%s %d %s", test.name, test.age, test.school);
    }
}
class Person{
    String name;
    int age;
    Person(String name, Integer age){
        //생성자 선언
        this.name = name;
        this.age = age;
    }
}

class Student extends Person{// Student 클래스는 Person 클래스를 상속
    String school;
    Student(String n, Integer a, String s){
        super(n,a); // 하위클래스 생성자 설정 시 상위클래스가 기본 생성자가 아니라면 먼저 맞춰주어야 함
        this.school = s;
    }
} 