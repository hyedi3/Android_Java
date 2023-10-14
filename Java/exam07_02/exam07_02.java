// exam07_02 class 정의 (Car2 클래스의 생성자를 이용한 인스턴스 생성 코드 예제)
public class exam07_02 {
    public static void main(String[] args) {
        Car2 myCar1 = new Car2("Red", 50);
        Car2 myCar2 = new Car2("Blue", 0);
        Car2 myCar3 = new Car2("Green", 200);

        myCar1.downSpeed(20);   // speed=speed-value; -> 30 = 50 - 20
        System.out.println("myCar1의 Color는 " + myCar1.getColor()
                + "이며, Speed는 "
                + myCar1.getSpeed() + "km입니다.");

        myCar2.downSpeed(0);   // if(speed-value<=0) -> speed=0;
        System.out.println("myCar2의 Color는 " + myCar2.getColor()
                + "이며, Speed는 "
                + myCar2.getSpeed() + "km입니다.");

        myCar3.downSpeed(100);   // speed=speed-value; -> 100 = 200 - 100
        System.out.println("myCar3의 Color는 " + myCar3.getColor()
                + "이며, Speed는 "
                + myCar3.getSpeed() + "km입니다.");

    }
}
