package com.example.gym;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("URL_DEL_FORMULARIO");
    }

    public void enviarRespuesta(View view) {
        // Aquí puedes agregar el código para enviar datos a tu hoja de cálculo.
    }
}
