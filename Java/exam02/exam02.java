//exam02 class 정의 (프로젝트 파일 이름과 동일해야함)
public class exam02 {

    public static void main(String[] args) {
        // 변수명을 선언할 때는 해당 변수가 어떤 역할을 하는지 알 수 있게 적은 키워드 형식을 권장함
        int int_var = 10;                  // 정수형 변수를 선언하고 값을 대입
        float float_var = 10.1f;           // 실수형 변수를 선언, float 타입에 값을 대입할때는 값뒤에 f를 붙여줘야 함
        double double_var = 10.2;          // 실수형 변수를 선언
        char char_var = '안';              // char 타입은 문자 1개를 ''로 묶어 대입해야 함
        String string_var = "안드로이드";    // 문자열은 String으로 선언하고, ""로 묶어야 함

        System.out.println(int_var);
        System.out.println(float_var);
        System.out.println(double_var);
        System.out.println(char_var);
        System.out.println(string_var);

    }
}