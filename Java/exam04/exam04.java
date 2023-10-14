//exam04 class 정의 (프로젝트 파일 이름과 동일해야함)
public class exam04 {
    public static void main(String[] args) {
        int one[] = new int[3];   // 3개짜리 정수형 배열을 선언함, [3] = 0~2
        // i를 0으로 초기화하고, 배열의 개수인 one.length(3개)보다 작은 동안 반복문 실행
        for (int i=0; i<one.length; i++) {
            one[i] = 10*i;          // i값은 1씩 증가하고, one[i] 값은 10*i씩 적용된다.
            System.out.println(one[i]);   // 콘솔에 one[i] 값을 출력함
        }

        String two[] = {"하나", "둘", "셋"};   //배열 two를 선언하고, 값을 대입함
        /* for each 문 활용 (for each문은 for문의 int i=0; i<two.length; i++을 생략한 것)
           i를 0으로 초기화하고, 배열의 개수인 two.length(3개)보다 작은 동안 반복문 실행
        */
        for (String str : two) {
            System.out.println(str);    //콘솔에 str 값을 출력함
        }

        int j=0;     // 정수 j를 선언하고, 0으로 초기화
        // 배열 one의 개수가 3개이므로 j가 3보다 작은 동안 반복 수행함
        while (j<one.length) {
            System.out.println(one[j]);   // 콘솔에 one[j] 값을 출력함
            j++;            //j를 1씩 증가
        }
    }
}
