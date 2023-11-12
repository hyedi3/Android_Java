// Animal 클래스를 상속받은 Tiger 서브 클래스
class Tiger extends Animal {
    int age;     // 호랑이 나이 필드

    // Animal 클래스의 추상 메소드인 move()를 오버라이딩
    @Override
    void move() {
        System.out.println("네발로 이동한다.");
    }
}
