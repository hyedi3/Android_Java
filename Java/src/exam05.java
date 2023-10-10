//exam05 class 정의 (전역변수와 지역변수에 대한 예제)
public class exam05 {
    static int var = 100; // 전역변수로 var 선언 및 100을 대입 (전역변수 : 모든 메소드에서 사용됨)
    public static void main(String[] args) {
        int var=0;        // 지역변수로 var 선언하고 0을 대입
        System.out.println(var);   // 지역변수가 우선순위이므로 값 출력시 지역 변수 값이 먼저 출력됨

        int sum = addFunction(10,20);  // 13행에 생성한 addFunction()을 호출한다.
        System.out.println(sum);
    }

    // 사용자 정적메소드 생성 (메소드의 반환값은 int 형으로 설정, 파라미터(매개변수)로 정수형 2개를 받아들임)
    static int addFunction(int num1, int num2) {
        int hap;
        hap = num1+num2+var;
        return hap;  //(num1+num2+var = 10+20+100)값을 계산한 후 반환
    }
}
