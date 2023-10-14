# exam06

### **자바 기본 문법 6 (예외처리 - try~catch문)**
**예외(exception)** 는 Java 프로그램 실행 중에 발생하는 오류를 말한다. Java에서는 try~catch문을 통해 해당 오류를 처리한다.  <br></br>

### **exam06 구현 내용**
- 나누기 연산 시 0으로 값을 나눌 경우 오류를 발생한다는 사실, 즉 0으로 값을 나누는 예외 발생을 막기 위해 try catch문을 구현

   ```java
    // 오류가 없을 시 예외 처리 없이 try 문 실행
    try {
        System.out.println(num1/num2);   // num2로 num1값을 나눈 값을 출력
    }
    // 오류 발생 시 catch 문을 통해 예외처리 실행
    catch (java.lang.ArithmeticException e) {
        System.out.println("계산에 문제가 있습니다.");
    }
   ```

   > 오류가 없을 경우에는 try 문을 통해 나누기 연산식을 정상 작동시키고, 오류 발생 시 catch문을 통해 예외처리문을 출력하도록 구현
<br></br>

### **ArithmeticException이란**
산술, 캐스팅 또는 변환 작업에서 오류가 발생한 경우 throw되는 예외이다.
> ArithmeticException 클래스는 DivideByZeroException, OverflowException를 자식 클래스로 갖는 클래스이므로 해당 클래스들의 오류를 한번에 처리하거나 예외처리하고 싶을 떄 사용하는 클래스이다.

> DivideByZeroException 클래스 : 수수가 0일 때 정수 나누기에서 throw.

> OverflowException 클래스 : 작업의 결과가 대상 데이터 형식의 범위를 벗어나면 throw.