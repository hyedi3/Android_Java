
//exam03 class 정의 (프로젝트 파일 이름과 동일해야함)
public class exam03 {

    public static void main(String[] args) {
        // count 변수를 선언, count 변수에 85라는 int 값을 대입함
        int count = 85;

        // count 값이 90 이상일 경우 true(일치)-println[합격(장학생)] 반환, false 일 경우 else if 문 실행
        if(count >= 90) {
            System.out.println("if문 : 합격(장학생)");
        } else if (count >= 60) {
            // count 값이 60이상 90미만일 경우 true(일치)-println[합격] 반환, false 일 경우 else 문 실행
            System.out.println("if문 : 합격");
        } else {
            // count 값이 60미만일 경우 true(일치)-println[불합격] 반환
            System.out.println("if문 : 불합격");
        }

        /* switch()~case 문에서 case 절 다음에는 하나의 문자나 숫자만 사용되므로,
           점수 값에 10으로 나누고, 정수와 정수 연산 결과는 정수가 된다는 특징을 이용해,
           소수점 자리를 없앤 후, 10을 곱해 10 단위로 값을 인식할 수 있게 정수형으로 변환함
         */
        int score = (count/10) * 10;
        switch (score) {
            // 100, 90에 score 값이 일치(true)하면, break 문을 통해 switch 문 탈출 후 println 값 출력 [합격(장학생)]
            case 100:
            case 90:
                System.out.println("switch문 : 합격(장학생)");
                break;
            // 80, 70, 60에 score 값이 일치(true)하면, break 문을 통해 switch 문 탈출 후 println 값 출력 [합격]
            case 80:
            case 70:
            case 60:
                System.out.println("switch문 : 합격");
                break;
            // 어떠한 case 문에 해당하지 않는 경우, default문 실행 후 println 값 출력 [불합격]
            default:
                System.out.println("switch문 : 불합격");
        }
    }
}