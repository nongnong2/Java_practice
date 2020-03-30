/*추상클래스는 추상 메소드를 가질 수 있는데 추상 메소드는 실행 코드 없이 선언만 되어 있음
추상클래스를 상속받는 자식클래스는 추상메소드를 꼭 오버라이딩해야함!(생성자 느낌처럼 하위 클래스의 메소드 강제)
추상클래스는 하위클래스들이 어떤 메소드를 구현하도록 할 필요가 있지만 하위클래스들끼리 구현 방법다른 경우 유용함
추상클래스의 메소드를 실행하기 위해서는 하위 클래스 인스턴스를 만든 후 접근 해야함  */
class Abstract_Class{
    public static void main(String[] args) {
        Batter obj1 = new Batter();
        obj1.name = "KSM";
        obj1.getname(); //getname 메소드 사용을 위해서는 하위클래스에서 접근해야 함 
        obj1.training();
    }
}
abstract class BaseballPlayer{
    String name;
    String getname(){ //일반메소드 포함 가능 
        return this.name;
    }
    abstract void training(); //추상메소드
}

class Batter extends BaseballPlayer{
    int BattingAbility;
    void training(){
        this.BattingAbility++;
        System.out.println("배팅 훈련 완료");
    }
}