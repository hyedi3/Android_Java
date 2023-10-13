// exam07 class 정의 (Car 클래스를 인스턴스로 생성한 코드 예제)
public class exam07 {
    public static void main(String[] args) {
        Car myCar1 = new Car();   // myCar1 인스턴스 객체 생성
        myCar1.color = "Red";     // myCar1 인스턴스 객체 색상 Red로 설정
        myCar1.speed = 0;         // myCar1 인스턴스 객체 속도 0으로 설정

        Car myCar2 = new Car();   // myCar2 인스턴스 객체 생성
        myCar2.color = "Blue";    // myCar2 인스턴스 객체 색상 Blue로 설정
        myCar2.speed = 0;         // myCar2 인스턴스 객체 속도 0으로 설정

        Car myCar3 = new Car();   // myCar3 인스턴스 객체 생성
        myCar3.color = "Green";   // myCar3 인스턴스 객체 색상 Green으로 설정
        myCar3.speed = 0;         // myCar3 인스턴스 객체 속도 0으로 설정

        myCar1.upSpeed(50);   // speed = speed+value; -> 50 = 0 + 50
        System.out.println("myCar1의 Color는 " + myCar1.getColor()
                + "이며, Speed는 "
                + myCar1.getSpeed() + "km입니다.");

        myCar2.upSpeed(0);   // speed = speed+value; -> 0 = 0 + 0
        System.out.println("myCar2의 Color는 " + myCar2.getColor()
                + "이며, Speed는 "
                + myCar2.getSpeed() + "km입니다.");

        myCar3.upSpeed(200);   // if(speed+value >= 200) -> speed=200;
        System.out.println("myCar3의 Color는 " + myCar3.getColor()
                + "이며, Speed는 "
                + myCar3.getSpeed() + "km입니다.");

    }
}
