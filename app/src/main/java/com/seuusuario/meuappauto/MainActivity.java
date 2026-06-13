package com.seuusuario.meuappauto;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true); // Permite rodar scripts do seu HTML
        webView.getSettings().setDomStorageEnabled(true); // Ajuda a carregar elementos modernos do Lovable
        webView.setWebViewClient(new WebViewClient());
        
        // Carrega o seu arquivo index.html da pasta assets
        webView.loadUrl("file:///android_asset/index.html");
        
        setContentView(webView);
    }
}
