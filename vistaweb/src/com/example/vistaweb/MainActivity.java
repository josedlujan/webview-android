package com.example.vistaweb;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
	private WebView ventana;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ventana = (WebView) findViewById(R.id.webkit);
		
		ventana.getSettings().setJavaScriptEnabled(true);
		ventana.getSettings().setBuiltInZoomControls(true);
		
		ventana.loadUrl("http://ockhamti.com");
		
		ventana.setWebViewClient(new WebViewClient()
		{
			
			public boolean shouldOverrideUrlLoading(WebView view, String url){
				
				return false;
			}
		});
		
		
		
	}



}
