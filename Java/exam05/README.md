# exam05

### **자바 기본 문법 5 (전역변수, 지역변수)**
변수 선언에는 **전역변수(global variable)** 선언과 **지역변수(local variable)** 선언이 있다. <br></br>

### **전역변수**
전역 변수는 모든 메소드에 사용되는 변수이다. (클래스 바로 아래, 메소드 외부에 변수 선언)
```java
public class 클래스명 {
    static int var = 100;     // 전역변수 선언
}
```
<br/>

### **지역변수**
지역 변수는 메소드 내부에서만 사용되는 변수이다. 
```java
public static void main(String[] args) {
    int var=0;     // main 메서드 내부에 지역변수 선언
}
```
<br/>
