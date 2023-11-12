// Automobile class 정의 (Car 클래스를 상속받은 예제)
public class Automobile extends Car{
    int seatNum;   // 승용차 좌석 수 필드(Automobile 클래스의 정적 필드)

    int getSeatNum() {    // 좌석 수 알아보기 (Automobile 클래스의 정적 메소드)
        return seatNum;
    }

    // Car 클래스의 upSpeed 메소드를 오버라이딩 (속도 올리기 메소드)
    void upSpeed(int value) {
        if(speed + value >= 300)   // 새로운 제한 속도 300으로 upSpeed 클래스를 재정의 (원래 제한 속도 200)
            speed = 300;           // speed 필드를 선언하진 않았지만, Car 클래스 speed 필드를 그대로 상속받아 사용

        else    // 그렇지 않은 경우, 현재 속도에 추가 속도를 더하여 업데이트
            speed = speed + value;
    }
}
