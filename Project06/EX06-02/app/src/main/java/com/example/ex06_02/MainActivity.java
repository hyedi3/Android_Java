package com.example.ex06_02;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")    // Android 5.0(롤리팝) 이후에서 탭액티비티를 사용하면 경고가 나오는 것을 막기 위한 코드
public class MainActivity extends TabActivity {    // 상속받는 클래스는 TabActivity여야 합니다.

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();   // 탭호스트 변수에 XML에서 선언한 탭호스트를 불러옵니다.

        // "음악별" 탭 설정
        TabSpec tabSpecSong = tabHost.newTabSpec("SONG").setIndicator("음악별");
        tabSpecSong.setContent(R.id.tabSong);  // "음악별" 탭이 선택되었을 때 표시될 내용 설정
        tabHost.addTab(tabSpecSong);          // 탭 호스트에 탭 추가

        // "가수별" 탭 설정
        TabSpec tabSpecArtist = tabHost.newTabSpec("ARTIST").setIndicator("가수별");
        tabSpecArtist.setContent(R.id.tabArtist);  // "가수별" 탭이 선택되었을 때 표시될 내용 설정
        tabHost.addTab(tabSpecArtist);             // 탭 호스트에 탭 추가

        // "앨범별" 탭 설정
        TabSpec tabSpecAlbum = tabHost.newTabSpec("ALBUM").setIndicator("앨범별");
        tabSpecAlbum.setContent(R.id.tabAlbum);   // "앨범별" 탭이 선택되었을 때 표시될 내용 설정
        tabHost.addTab(tabSpecAlbum);             // 탭 호스트에 탭 추가

        // 앱 시작 시 표시될 기본 탭 설정 (여기서는 "음악별" 탭)
        tabHost.setCurrentTab(0);
    }
}