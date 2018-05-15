# AndroidCustomSlideToUnlockView
安卓自定义滑动解锁控件

添加依赖:
dependencies {
    // your dependencies ...
   compile 'com.linklink.views:slide_to_unlock_view:1.0.0'
}


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