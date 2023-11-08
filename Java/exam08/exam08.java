// Math 클래스 임포트
import java.lang.Math;

// exam08 class 정의 (정적 구성 요소를 사용한 코드 예제)
public class exam08 {
    public static void main(String[] args) {
        Car3 myCar1 = new Car3("Red", 0);
        Car3 myCar2 = new Car3("Blue", 0);
        Car3 myCar3 = new Car3("Green", 0);

        System.out.println("생산된 차의 대수(정적 필드) -> " + Car3.carCount);
        System.out.println("생산된 차의 대수(정적 메소드) -> " + Car3.currentCarCount());
        System.out.println("차의 최고 제한 속도 -> " + Car3.MAXSPEED);

        System.out.println("PI의 값 -> " + Math.PI);             // Math 클래스의 상수 필드 PI 출력
        System.out.println("3의 5제곱 -> " + Math.pow(3, 5));    // Math 클래스의 정적 메소드 pow() 사용
    }
}
