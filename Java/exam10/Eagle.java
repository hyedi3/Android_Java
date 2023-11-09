// Animal 클래스를 상속받은 Eagle 서브 클래스
class Eagle extends Animal {
    String home;    // 독수리 서식지 필드

    // Animal 클래스의 추상 메소드인 move()를 오버라이딩
    @Override
    void move() {
        System.out.println("날개로 이동한다.");
    }
}
