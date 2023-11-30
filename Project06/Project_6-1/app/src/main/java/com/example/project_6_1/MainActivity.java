package com.example.project_6_1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.annotation.NonNull;

public class MainActivity extends Activity {
    // 위젯 변수 12개 선언합니다 (전역 변수)
    Chronometer chrono;        // 타이머로 사용할 크로노미터 변수
    Button btnStart, btnEnd;   // <예약 시작>과 <예약 완료> 변수
    RadioButton rdoCal, rdoTime;  // 라디오 버튼 변수 2개
    CalendarView calView;      // 날짜를 설정할 캘린더뷰 변수
    TimePicker tPicker;        // 시간을 설정할 타임피커 변수

    // 맨 아래에 출력될 연, 월, 일, 시, 분의 숫자에 해당하는 텍스트 변수 5개
    TextView tvYear, tvMonth, tvDay, tvHour, tvMinute;
    int selectYear, selectMonth, selectDay;   // 캘린더뷰에서 선택한 연, 월, 일에 해당하는 변수

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("시간 예약");   // 앱 제목 변경

        // 위젯 변수 12개에 위젯을 대입합니다.
        btnStart = (Button) findViewById(R.id.btnStart);
        btnEnd = (Button) findViewById(R.id.btnEnd);

        chrono = (Chronometer) findViewById(R.id.chronometer1);
        rdoCal  = (RadioButton) findViewById(R.id.rdoCal);
        rdoTime = (RadioButton) findViewById(R.id.rdoTime);

        tPicker = (TimePicker) findViewById(R.id.timePicker1);
        calView = (CalendarView) findViewById(R.id.calendarView1);

        tvYear = (TextView) findViewById(R.id.tvYear);
        tvMonth = (TextView) findViewById(R.id.tvMonth);
        tvDay = (TextView) findViewById(R.id.tvDay);
        tvHour = (TextView) findViewById(R.id.tvHour);
        tvMinute = (TextView) findViewById(R.id.tvMinute);

        // 타임피커와 캘린더뷰가 보이지 않게 설정합니다.
        tPicker.setVisibility(View.INVISIBLE);
        calView.setVisibility(View.INVISIBLE);

        // 라디오 버튼을 클릭하면 CalenderView와 TimePicker 중 하나씩만 보이도록 클릭 이벤트 리스너를 작성합니다.
        // CalenderView 클릭시 CalenderView만 보이게 설정
        rdoCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tPicker.setVisibility(View.INVISIBLE);
                calView.setVisibility(View.VISIBLE);
            }
        });

        // TimePicker 클릭시 TimePicker만 보이게 설정
        rdoTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tPicker.setVisibility(View.VISIBLE);
                calView.setVisibility(View.INVISIBLE);
            }
        });

        // 〈예약 시작〉을 클릭하면 크로노미터가 시작되고 〈예약완료〉를 클릭하면 정지되도록 클릭 이벤트 리스너를 작성합니다.
        // <예약 시작> 시 크로노미터 시작 및 텍스트 컬러 빨강색으로 작동
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.setBase(SystemClock.elapsedRealtime());   // chronometer를 0으로 초기화한다. (예약시작을 클릭할 때마다 초기화됨)
                chrono.start();    // chronometer 시작
                chrono.setTextColor(Color.RED);   // 타이머 시작시 글자색 빨간색으로 설정
            }
        });

        // <예약 종료> 시 크로노미터 종료 및 텍스트 컬러 파랑색으로 작동
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.stop();   // chronometer 종료
                chrono.setTextColor(Color.BLUE);

                // <예약완료>를 클릭하면 캘린더뷰에서 설정한 연, 월, 일과 타임피커에서 설정한 시, 분이 맨 아래 텍스트뷰에 채워지게 합니다.
                // 캘린더뷰에서 선택한 연,월,일을 해당하는 텍스트뷰에 채웁니다.
                tvYear.setText(Integer.toString(selectYear));
                tvMonth.setText(Integer.toString(selectMonth));
                tvDay.setText(Integer.toString(selectDay));

                // 타임피커에서 설정한 시각과 분을 구하여 해당하는 텍스트뷰에 채웁니다.
                tvHour.setText(Integer.toString(tPicker.getCurrentHour()));
                tvMinute.setText(Integer.toString(tPicker.getCurrentMinute()));
            }
        });

        // 캘린더뷰를 클릭하면 선택한 년, 월, 일이 전역변수에 대입됩니다. 월은 0부터 시작하므로 +1을 더해줍니다.
        calView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
                selectYear=year;
                selectMonth=month+1;
                selectDay=dayOfMonth;
            }
        });

    }
}