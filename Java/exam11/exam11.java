// exam11 class 정의 (main 클래스, 클래스 변수에 각 인스턴스를 대입하는 예제)
public class exam11 {
    public static void main(String[] args) {
        Animal animal;    // Animal 클래스 변수 선언

        animal = new Tiger();   // Animal 클래스 변수에 Tiger 서브 클래스의 인스턴스(객체)를 생성
        animal.move();          // animal 객체에 Tiger 객체에서 move() 메소드를 호출함

        animal = new Eagle();   // Animal 클래스 변수에 Eagle 서브 클래스의 인스턴스(객체)를 생성
        animal.move();          // animal 객체에 Eagle 객체에서 move() 메소드를 호출함
    }
}
