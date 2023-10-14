// Car2 class 정의 (자동차 클래스 구조 + 생성자 코드 추가에 대한 예제)
public class Car2 {
    String color;  // color라는 문자열 타입의 필드가 선언됨, 자동차의 색상을 저장하는 필드
    int speed=0;   // speed라는 정수 타입의 필드가 선언됨, 자동차의 속도를 저장하는 필드, 초기값은 0으로 설정

    // 생성자는 클래스 이름과 동일하게 지정, color와 speed를 파라미터(매개변수)로 지정함.
    Car2(String color, int speed) {
        this.color = color;
        this.speed = speed;
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
