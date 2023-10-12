//exam06 class 정의 (try~catch 문에 대한 예제)
public class exam06 {
    public static void main(String[] args) {
        int num1=100, num2=0;
        // 오류가 없을 시 예외 처리 없이 try 문 실행
        try {
            System.out.println(num1/num2);   // num2로 num1값을 나눈 값을 출력
        }
        // 오류 발생 시 catch 문을 통해 예외처리 실행
        catch (java.lang.ArithmeticException e) {
            System.out.println("계산에 문제가 있습니다.");
        }
    }
}
