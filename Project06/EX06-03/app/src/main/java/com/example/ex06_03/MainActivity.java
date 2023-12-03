package com.example.ex06_03;

import android.graphics.Color;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

// Android 5.0(롤리팝) 이후에서 탭액티비티를 사용하면 경고가 나오는 것을 막기 위한 코드
@SuppressWarnings("deprecation")
// TabListener 인터페이스를 구현합니다.
public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {
    ActionBar.Tab tabSong, tabArtist, tabAlbum;       // Tab 변수를 3개 선언
    MyTabFragment myFrags[] = new MyTabFragment[3];   // MyTabFragment 배열을 선언합니다. (3개의 프래그먼트(화면)가 배열로 저장됩니다)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 액션바 설정 (현재 액티비티에 연결된 액션바 객체를 반환하는 getSupportActionBar 메서드)
        ActionBar bar = getSupportActionBar();
        // 액션바의 모드를  탭호스트 모양인 NAVIGATION_MODE_TABS로 설정합니다.
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        // "음악별" 탭 설정
        tabSong = bar.newTab();
        tabSong.setText("음악별");
        tabSong.setTabListener(this);  // 액션바의 각 탭에 대한 이벤트를 수신하는 리스너를 설정하는 부분(this -> MainActivity)
        bar.addTab(tabSong);     // 액션바에 탭 추가

        // "가수별" 탭 설정
        tabArtist = bar.newTab();
        tabArtist.setText("가수별");
        tabArtist.setTabListener(this);
        bar.addTab(tabArtist);    // 액션바에 탭 추가

        // "앨범별" 탭 설정
        tabAlbum = bar.newTab();
        tabAlbum.setText("앨범별");
        tabAlbum.setTabListener(this);
        bar.addTab(tabAlbum);     // 액션바에 탭 추가
    }

    // onTabSelected 메소드 구현 (선택된 탭에 대한 동작을 정의)
    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        MyTabFragment myTabFrag = null;      // 현재 선택한 프래그먼트(화면)으로 사용할 변수

        //// 해당 탭의 프래그먼트 생성 또는 기존에 생성된 프래그먼트 가져오기
        // 선택한 탭이 기존에 한번도 선택된 적 없는 탭이라면 프래그먼트(화면)를 생성하여 위에 선언한 배열(myFrags[])의 위치에 넣는다.
        if (myFrags[tab.getPosition()] == null) {
            // 새로운 프래그먼트를 생성합니다.
            myTabFrag = new MyTabFragment();

            // 현재 프래그먼트의 값을 지정하는데，선택한 탭의 텍스트를 tabName 변수에 저장합니다.
            Bundle data = new Bundle();
            data.putString("tabName", tab.getText().toString());
            myTabFrag.setArguments(data);

            // 생성한 프래그먼트를 프래그먼트 배열의 해당 위치[tab.getPosition()]에 저장합니다.
            myFrags[tab.getPosition()] = myTabFrag;
        }

        // 기존에 해당 탭을 선택한 적이 있다면 프래그먼트 배열에 이미 해당 프래그먼트가 생성되어 있으므로 재사용합니다.
        else {
            myTabFrag = myFrags[tab.getPosition()];
        }

        // 프래그먼트 교체 (새로 생성한 프래그먼트 또는 기존의 프래그먼트를 액션바 아래쪽에 출력합니다.)
        ft.replace(android.R.id.content, myTabFrag);
    }

    // onTabUnselected 메소드 구현 (선택 해제된 탭에 대한 동작을 정의)
    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        // 이 예제에서는 구현되지 않음
    }

    // onTabReselected 메소드 구현 (선택된 탭이 다시 선택되었을 때 동작을 정의)
    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
        // 이 예제에서는 구현되지 않음
    }

    //// 탭을 클릭하면 해당 프래그먼트 클래스 호출
    // Fragment를 상속받는 MyTabFragment 클래스를 내부 클래스로 생성
    public static class MyTabFragment extends androidx.fragment.app.Fragment {
        String tabName;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            // 프래그먼트가 생성될 때 인자로 전달된 데이터 가져오기
            // (3개의 탭을 클릭할 때마다 다른 프래그먼트(화면)가 나오도록，탭을 클릭할 때 지정한 데이터로 각 프래그먼트를 지정)
            Bundle data = getArguments();
            tabName = data.getString("tabName");
        }

        // 프래그먼트에 나타날 화면을 구성합니다. (최종적으로 구성한 화면(View)을 반환합니다.)
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // 레이아웃 파라미터 설정 (빈 리니어레이아웃 생성)
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT);

            // 기본 레이아웃 생성 및 설정
            LinearLayout baseLayout = new LinearLayout(super.getActivity());
            baseLayout.setOrientation(LinearLayout.VERTICAL);
            baseLayout.setLayoutParams(params);

            // 탭 이름에 따라 배경색 설정
            if ("음악별".equals(tabName))
                baseLayout.setBackgroundColor(Color.RED);
            if ("가수별".equals(tabName))
                baseLayout.setBackgroundColor(Color.GREEN);
            if ("앨범별".equals(tabName))
                baseLayout.setBackgroundColor(Color.BLUE);

            return baseLayout;   // 구성한 레이아웃을 반환합니다. (해당 레이아웃이 액션바의 아래쪽에 출력됩니다.)
        }
    }
}
