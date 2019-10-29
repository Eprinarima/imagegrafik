package com.polinema.imagegrafik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.content.Context;
import android.opengl.GLSurfaceView;

public class MainActivity extends AppCompatActivity {
    private Button tekan;
    private GLSurfaceView grafik1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagegrafik);
        tekan=(Button)findViewById(R.id.button1);
        grafik1 = new HelloESSurfaceView(this);
        setContentView(grafik1);
    }
    @Override
    protected void onPause() {
        super.onPause();
        grafik1.onPause();
    }
    @Override
    protected void onResume(){
        super.onResume();
        grafik1.onResume();
    }

    class HelloESSurfaceView extends GLSurfaceView {
        public HelloESSurfaceView(Context context) {
            super(context);
            setRenderer(new segitiga());
        }
    }
    public boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.activity_latih7_grafik_klasik,menu);
        return true;
    }

}
