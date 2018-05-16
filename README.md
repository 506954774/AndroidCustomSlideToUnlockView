# AndroidCustomSlideToUnlockView
## 安卓自定义滑动解锁控件

### 添加依赖:</br>
dependencies {</br>
    // your dependencies ...</br>
   compile 'com.linklink.views:slide_to_unlock_view:1.0.0'</br>
}</br>

### 效果图:</br>

 ![img](https://github.com/506954774/AndroidCustomSlideToUnlockView/blob/master/demo.gif?raw=true)

 ## 可以自定义的属性:</br>
 >>name="slideImageViewWidth" format="dimension" //滑块宽度 </br>
 >>name="slideImageViewResId" format="reference"//滑块资源id </br>
 >>name="slideImageViewResIdAfter" format="reference"//滑动到右边时,滑块资源id </br>
 >>name="viewBackgroundResId" format="reference"//背景资源id</br>
 >>name="textHint" format="string"//文本内容</br>
 >>name="textSize" format="integer"/>//文本字号</br>
 >>name="textColorResId" format="color"//文本字色</br>
 >>name="slideThreshold" format="float"//滑动阈值,默认是0.5,当右滑距离不满整个控件宽度的0.5,就会回弹至左边</br> </br>

 ## xml : </br>
  <com.qdong.slide_to_unlock_view.CustomSlideToUnlockView</br>
  android:id="@+id/slide_to_unlock"</br>
  android:layout_width="match_parent"</br>
  android:layout_height="50dp"</br>
  chuck:viewBackgroundResId="@drawable/shape_round_normal_green"</br>
  chuck:slideImageViewWidth="@dimen/slide_width"</br>
  chuck:slideImageViewResId="@mipmap/icon_slide"</br>
  chuck:slideImageViewResIdAfter="@mipmap/ic_launcher"</br>
  chuck:slideThreshold="0.5"</br>
  chuck:textSize="6"</br>
  chuck:textHint="@string/hint"</br>
  chuck:textColorResId="@color/colorWhite"</br>
  </com.qdong.slide_to_unlock_view.CustomSlideToUnlockView></br>

  ## MainActivity.java : </br>
  ```Java
  package com.qdong.slidetounlockdemo;
  import android.os.Bundle;
  import android.support.v7.app.AppCompatActivity;
  import android.view.View;
  import android.widget.TextView;
  import com.qdong.slide_to_unlock_view.CustomSlideToUnlockView;


  public class MainActivity extends AppCompatActivity {

      private CustomSlideToUnlockView mCustomSlideToUnlockView;
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
  ```