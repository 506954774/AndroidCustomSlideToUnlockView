package com.qdong.slidetounlockdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.qdong.slide_to_unlock_view.CustomSlideToUnlockView;

public class MainActivity extends AppCompatActivity {

    private com.qdong.slide_to_unlock_view.CustomSlideToUnlockView mCustomSlideToUnlockView;
    private TextView tv_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCustomSlideToUnlockView= (com.qdong.slide_to_unlock_view.CustomSlideToUnlockView) findViewById(R.id.slide_to_unlock);
        tv_text= (TextView) findViewById(R.id.tv_text);

        CustomSlideToUnlockView.CallBack callBack=new CustomSlideToUnlockView.CallBack() {
            @Override
            public void onSlide(int distance) {
                tv_text.setText("slide distance:"+distance);
            }

            @Override
            public void onUnlocked() {
                tv_text.setText("onUnlocked");
            }
        };
        mCustomSlideToUnlockView.setmCallBack(callBack);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCustomSlideToUnlockView.resetView();
            }
        });
    }
}
