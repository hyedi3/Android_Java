package com.example.ex06_01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPrev, btnNext;
        final ViewFlipper vFlipper;    // 내부 클래스 안에서  vFilpper에 접근하기 위한 약속된 문법

        btnPrev = (Button) findViewById(R.id.btnPrev);
        btnNext = (Button) findViewById(R.id.btnNext);

        vFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);

        // 버튼 <이전화면>에 대한 클릭 리스너 선언
        btnPrev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vFlipper.showPrevious();    // <이전화면>을 클릭 시 뷰플리퍼의 이전화면이 나옵니다.
            }
        });

        // 버튼 <다음화면>에 대한 클릭 리스너 선언
        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vFlipper.showNext();     // <다음화면>을 클릭시 뷰플리퍼의 다음 화면이 나옵니다.
            }
        });
    }
}