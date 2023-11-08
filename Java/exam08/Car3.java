// Car3 class 정의 (정적 필드, 정적 메소드, 상수 필드 구현 예제)
public class Car3 {
    String color;
    int speed;

    static int carCount = 0;            // 정적 필드를 선언, 생성된 차의 대수를 세는데 이용할 필드
    final static int MAXSPEED = 200;    // 상수 필드 선언(값 변경 불가), 모든 차량의 최대 속도
    final static int MINSPEED = 0;      // 상수 필드 선언(값 변경 불가), 모든 차량의 최소 속도

    // Car3 객체(차량)의 수, 즉 현재 차량 대수를 반환하는 정적 메소드
    static int currentCarCount(){
        return carCount;
    }

    // Car3 클래스의 생성자
    Car3(String color, int speed) {
        this.color = color;
        this.speed = speed;
        carCount ++;   // 생성자가 생성될 때마다 carCount 값이 하나씩 증가된다.
    }

    // 현재 속도를 얻는 메소드 정의
    int getSpeed() {
        return speed;
    }

    // 추가 속도(value)를 파라미터로 받아서 현재 속도 증가 메소드 정의
    void upSpeed(int value) {
        // 현재 속도와 추가 속도를 더한 값이 200보다 크거나 같으면 최대값인 200으로 설정됨
        if(speed+value >= 200)
            speed=200;
            // 그렇지 않은 경우, 현재 속도에 추가 속도를 더하여 업데이트
        else
            speed = speed+value;
    }

    // 감속할 속도(value)를 매개변수로 받아 현재 속도를 감소시키는 메소드 정의
    void downSpeed(int value) {
        // 현재 속도에서 감속할 속도를 뺀 값이 0보다 작거나 같으면 최소값인 0으로 설정
        if(speed-value<=0)
            speed=0;
            // 그렇지 않은 경우, 현재 속도에서 감속할 속도만큼 빼고 업데이트
        else
            speed=speed-value;
    }

    // 자동차 색상을 반환하는 메서드 정의
    String getColor() {
        return color;
    }
}
