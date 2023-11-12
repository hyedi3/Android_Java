// exam10 class 정의 (main 클래스, 인스턴스 생성 후, 해당 인스턴스에서 move()메소드 호출하는 예제)
public class exam10 {
    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();  // Tiger 클래스의 인스턴스(객체)를 생성, 인스턴스에 대한 참조를 tiger1 변수에 저장
        Eagle eagle1 = new Eagle();  // Eagle 클래스의 인스턴스(객체)를 생성, 인스턴스에 대한 참조를 eagle1 변수에 저장

        tiger1.move();   // tiger1 객체에서 move() 메소드 호출
        eagle1.move();   // eagle1 객체에서 move() 메소드 호출
    }
}
