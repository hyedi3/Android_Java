# exam09

### **자바 기본 문법 9 - 상속, 오버라이딩**

### **클래스 상속(inheritance)**
- 기존 클래스가 가지고 있는 것을 그대로 물려받으면서 필요한 필드나 메소드를 추가로 정의하는 것을 말합니다.
- 자바에서는 extends 키워드를 사용하여 상속을 구현합니다.
- **슈퍼 클래스(super class, 부모 클래스)** : 자동차 클래스
- **서브 클래스(subclass, 자식 클래스)** : 승용차 클래스 / 트럭 클래스
    * 서브 클래스는 슈퍼클래스의 모든 필드와 메소드를 상속받으므로 별도의 선언이나 정의 없이도 슈퍼클래스의 필드와 메소드를 사용할 수 있습니다.
      →  자식 클래스는 부모 클래스의 모든 public / protected 멤버에 접근할 수 있습니다.
   <br></br>

### **메소드 오버라이딩**
- 메소드 오버라이딩은 서브 클래스가 슈퍼 클래스로부터 상속받은 메소드를 재정의하는 것을 말합니다.
- 메소드 오버라이딩을 통해 같은 이름의 메소드가 다른 동작을 수행하도록 할 수 있습니다. (다형성 개념 중 하나입니다.)
- 오버라이딩된 메서드는 원본 메서드와 같은 이름, 매개변수 리스트, 반환타입을 가져야 합니다.
 <br></br>

- **메소드 오버라이딩 구현 예제**
   ```java
    public class Car {   
        public void move() {
            System.out.println("The car moves");
        }
    }

    // Vehicle 클래스가 Car 클래스를 상속받음
    public class Vehicle extends Car {
        // Car부터 받아온 move() 메소드를 재정의(오버라이딩)       
        @Override
        public void move() {
            System.out.println("The vehicle drives");
        }
    }
  ```
<br></br>

### **자동차 클래스를 상속받은 승용차 클래스 예제 (Automobile.java)**
승용차 클래스를 Java 코드로 구현하기 위해, Car 클래스를 상속받아(extends) Automobile 클래스를 정의하고, 승용차 클래스의 필드(승용차 좌석 수)와 승용차 클래스의 메소드(좌석 수 알아보기) 및 오버라이딩한 메소드(upSpeed)를 적용해봅니다.
<br></br>

- **Car 클래스 상속 코드**
   ```java
    public class Automobile extends Car{
    }
   ```
<br></br>

- **upSpeed 메서드 오버라이딩 코드** </br>
    메서드를 오버라이딩하여 제한 속도 값을 재정의한 코드이다. 
   ```java
    // Car 클래스의 upSpeed 메소드를 오버라이딩 (속도 올리기 메소드)
    void upSpeed(int value) {
        if(speed + value >= 300)   // 새로운 제한 속도 300으로 upSpeed 클래스를 재정의 (원래 제한 속도 200)
            speed = 300;           // speed 필드를 선언하진 않았지만, Car 클래스 speed 필드를 그대로 상속받아 사용

        else    // 그렇지 않은 경우, 현재 속도에 추가 속도를 더하여 업데이트
            speed = speed + value;
    }
   ```
<br></br>