/*클래스는 여러 변수와 메소드를 하나의 객체에 담아 관리하게 해주는 도구
클래스를 통해 객체를 생성하는 것이 가능하며 만들어진 객체는 클래스에 정의된 내용대로 메모리 공간에 생성됨
'Simple'이라는 클래스를 통해 'a'라는 객체를 만들 경우 'a'를 'simple'의 인스턴스라고 함
학생의 학년, 이름, 생년월일은 배열에 저장하는 것보다는 클래스를 만들어 관리하는게 효율적 
클래스명 인스턴스명 = new 클래스명(인자)
하나의 .java 파일에서 여러 클래스를 선언할 수 있지만 public 키워드는 파일명과 일치하는 클래스명에만, main 메소드역시 해당 클래스에만
자기 자신의 인스턴스 변수를 가리킬 때 this로 표현
생성자는 특수 메소드로 클래스와 이름이 같음, 생성자를 통해 인스턴스 생성시 입력받을 인자 강제화 가능 
생성자 오버로딩 가능(하나의 클래스에서 인자가 다른 여러 개의 생성자 만들기 가능)*/
class Class{
    public static void main(String[] args) {
        SalesHistory obj1 = new SalesHistory(1000); // 정보제공 동의하지 않은 경우;
        SalesHistory obj2 = new SalesHistory("강성민", 'M', 1000, 20); //정보제공 동의
        System.out.printf("%s %d %s %d\n",obj1.custName, obj1.custAge, obj1.gender, obj1.price);
        System.out.printf("%s %d %s %d",obj2.custName, obj2.custAge, obj2.gender, obj2.price);
    }
}

class SalesHistory{
    String custName;
    Character gender;
    Integer price;
    Integer custAge;

    //개인정보 제공 동의한 경우
    SalesHistory(String custName, Character gender, Integer price, Integer custAge){
        this.custName = custName;
        this.gender = gender;
        this.price = price;
        this.custAge = custAge;
    }

    //개인정보 제공 동의하지 않은 경우
    SalesHistory(Integer price){
        this.price = price;
        custName = null;
        gender = '?';
        gender = '?';
        custAge = -1;
    }
}
