// exam09 class 정의 (Car 클래스 오버라이딩한 Automobile 서브클래스 사용 예제)
public class exam09 {
    public static void main(String[] args) {
        Automobile auto = new Automobile();   // auto 인스턴스 객체 생성

        // 오버라이딩한 upSpeed 메소드가 실행된다.
        auto.upSpeed(250);    // speed = speed+value; -> 250 = 0 + 250
        System.out.println("승용차의 속도는 "
                + auto.getSpeed() + "km입니다.");
    }
}
