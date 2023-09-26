package com.example.fourbutton_project;  // 패키지 이름, 자동완성됨

//관련 클래스, 인터페이스 import 문
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// AppCompatActivity 클래스의 상속을 받아서 MainActivity 클래스를 정의함 (가장 기본적인 클래스이자 화면을 표시하는 클래스)
public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4;  // 버튼에 대한 변수를 전역 변수(클래스 변수)로 선언

    @Override   // 다음에 나오는 메소드가 오버라이드 됨
    public void onCreate(Bundle savedInstanceState) {    //오버라이딩한 onCreate() 메소드로, 가장 기본이 되는 메소드임 - main 함수 개념
        super.onCreate(savedInstanceState);        // 슈퍼 클래스인 Activity 클래스의 onCreate() 메소드를 호출함
        setContentView(R.layout.activity_main);    // setContentView()는 레이아웃을 화면에 표시해줌, (R.layout.activity_main) : activity_main.xml 파일을 의미

        //button1,2,3,4 변수에 버튼 객체를 대입함 (activity_main.xml에서 만든 버튼을 button1,2,3,4 변수로 제어 가능)
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        // 버튼 배경 색상 변경 (setBackgroundColor)
        button1.setBackgroundColor(Color.GRAY);
        button2.setBackgroundColor(Color.GREEN);
        button3.setBackgroundColor(Color.RED);
        button4.setBackgroundColor(Color.YELLOW);

        // 버튼 글자 색상 변경 (setTextColor)
        button1.setTextColor(Color.BLACK);
        button2.setTextColor(Color.BLACK);
        button3.setTextColor(Color.BLACK);
        button4.setTextColor(Color.BLACK);

        // 버튼을 클릭했을 때 작동하는 클래스를 익명 내부 클래스(anonymous inner class)로 정의함
        button1.setOnClickListener(new View.OnClickListener() {
            // 버튼을 클릭했을 때 실제로 작동하는 오버라이드 된 메소드 (버튼을 클릭했을 때 작동하는 코드)
            @Override
            // onClick 메소드 : 버튼을 클릭했을 때 작동하기 원하는 모든 코드들을 기입하는 공간
            public void onClick(View view) {
                // 홈페이지 열기
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nate.com"));
                startActivity(mIntent);
            }
        });

        // 버튼을 클릭했을 때 작동하는 클래스를 익명 내부 클래스(anonymous inner class)로 정의함
        button2.setOnClickListener(new View.OnClickListener() {
            // 버튼을 클릭했을 때 실제로 작동하는 오버라이드 된 메소드 (버튼을 클릭했을 때 작동하는 코드)
            @Override
            // onClick 메소드 : 버튼을 클릭했을 때 작동하기 원하는 모든 코드들을 기입하는 공간
            public void onClick(View view) {
                // 전화 걸기
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"));
                startActivity(mIntent);
            }
        });

        // 버튼을 클릭했을 때 작동하는 클래스를 익명 내부 클래스(anonymous inner class)로 정의함
        button3.setOnClickListener(new View.OnClickListener() {
            // 버튼을 클릭했을 때 실제로 작동하는 오버라이드 된 메소드 (버튼을 클릭했을 때 작동하는 코드)
            @Override
            // onClick 메소드 : 버튼을 클릭했을 때 작동하기 원하는 모든 코드들을 기입하는 공간
            public void onClick(View view) {
                // 갤러리 열기
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(mIntent);
            }
        });

        // 버튼을 클릭했을 때 작동하는 클래스를 익명 내부 클래스(anonymous inner class)로 정의함
        button4.setOnClickListener(new View.OnClickListener() {
            // 버튼을 클릭했을 때 실제로 작동하는 오버라이드 된 메소드 (버튼을 클릭했을 때 작동하는 코드)
            @Override
            // onClick 메소드 : 버튼을 클릭했을 때 작동하기 원하는 모든 코드들을 기입하는 공간
            public void onClick(View view) {
                // 애플리케이션 종료
                finish();
            }
        });
    }
}