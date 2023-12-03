package com.example.project_06_02;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

// Android 5.0(롤리팝) 이후에서 탭액티비티를 사용하면 경고가 나오는 것을 막기 위한 코드
@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity {

    // activity_main.xml의 4개 위젯에 대응할 위젯 변수 4개를 전역변수로 선언합니다
    EditText edtUrl;
    Button btnGo, btnBack;
    WebView web;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.web);

        // 4개의 변수에 위젯을 대입합니다.
        edtUrl = (EditText) findViewById(R.id.edtUrl);
        btnGo = (Button) findViewById(R.id.btnGo);
        btnBack = (Button) findViewById(R.id.btnBack);
        web = (WebView) findViewById(R.id.webView1);

        // CookWebViewClient 클래스를 생성하여 웹뷰에 대입
        web.setWebViewClient(new CookWebViewClient());

        // WebSettings 클래스를 이용하여 줌 버튼 컨트롤이 화면에 보이게 합니다
        WebSettings webSet = web.getSettings();
        webSet.setBuiltInZoomControls(true);

        // 웹뷰에서 자바스크립트가 작동되게 합니다.
        webSet.setJavaScriptEnabled(true);

        // 이동 버튼에 대한 클릭리스너 정의
        btnGo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 에디트텍스트에 입력한 URL 웹페이지가 웹뷰에 나오게 합니다.
                web.loadUrl(edtUrl.getText().toString());
            }
        });

        // 이전 버튼에 대한 클릭리스너 정의
        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // 웹뷰의 이전 화면으로 돌아갑니다.
                web.goBack();
            }
        });
    }

    // WebViewClient의 상속을 받는 CookWebViewClient 클래스를 정의
    class CookWebViewClient extends WebViewClient {
        @Override
        // shouldOverrideUrlLoading() :WebView에서 새로운 URL을 로딩할 때 호출되는 메서드
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
