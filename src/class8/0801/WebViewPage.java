package com.scjun.junny.app_0801;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewPage extends Activity {
    WebView web;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view);
        web = (WebView) this.findViewById(R.id.web1);   // 웹뷰에 아이디를 부여하고 웹뷰를 찾습니다.
        web.setWebViewClient(new WebViewClient());

        web.loadUrl("http://ecampus.konkuk.ac.kr/ilos/main/main_form.acl");   // 해당 주소로 사이트가 이동합니다.
    }
}
