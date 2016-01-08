package com.example.testtoast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    Button show1 = (Button)findViewById(R.id.show1);
    show1.setOnClickListener(new View.OnClickListener() {
      
      @Override
      public void onClick(View v) {
        SuperToast superToast = new SuperToast(MainActivity.this);
        
        //设置属性
        superToast.setAnimations(SuperToast.Animations.FLYIN); //显示动画
        superToast.setDuration(SuperToast.Duration.SHORT); //显示时间 长 中 短
        superToast.setBackground(SuperToast.Background.BLACK); //背景颜色
        superToast.setTextSize(SuperToast.TextSize.SMALL); //文字大小
        superToast.setIcon(R.drawable.icon_load, SuperToast.IconPosition.LEFT); //图片显示
        
        superToast.setText("登录中...");
        superToast.setGravity(Gravity.CENTER, 0, 0);
        
        superToast.show();
        
      }
    });
    
    Button show2 = (Button)findViewById(R.id.show2);
    show2.setOnClickListener(new View.OnClickListener() {
      
      @Override
      public void onClick(View v) {
        SuperToast superToast = new SuperToast(MainActivity.this);
        
        //设置属性
        superToast.setAnimations(SuperToast.Animations.FLYIN); //显示动画
        superToast.setDuration(SuperToast.Duration.SHORT); //显示时间 长 中 短
        superToast.setBackground(SuperToast.Background.BLACK); //背景颜色
        superToast.setTextSize(SuperToast.TextSize.SMALL); //文字大小
        
        superToast.setText("MeiID或密码错误,请重新输入");
        superToast.setGravity(Gravity.CENTER, 0, 0);
        
        superToast.show();
        
      }
    });
    
    Button show3 = (Button)findViewById(R.id.show3);
    show3.setOnClickListener(new View.OnClickListener() {
      
      @Override
      public void onClick(View v) {
        SuperToast superToast = new SuperToast(MainActivity.this);
        
        //设置属性
        superToast.setAnimations(SuperToast.Animations.FLYIN); //显示动画
        superToast.setDuration(SuperToast.Duration.SHORT); //显示时间 长 中 短
        superToast.setBackground(SuperToast.Background.BLACK); //背景颜色
        superToast.setTextSize(SuperToast.TextSize.SMALL); //文字大小
        superToast.setIcon(R.drawable.icon_ok, SuperToast.IconPosition.LEFT); //图片显示
        
        superToast.setText("重置密码成功");
        superToast.setGravity(Gravity.CENTER, 0, 0);
        
        superToast.show();
        
      }
    });
    
    Button show4 = (Button)findViewById(R.id.show4);
    show4.setOnClickListener(new View.OnClickListener() {
      
      @Override
      public void onClick(View v) {
        SuperToast superToast = new SuperToast(MainActivity.this);
        
        //设置属性
        superToast.setAnimations(SuperToast.Animations.FLYIN); //显示动画
        superToast.setDuration(SuperToast.Duration.SHORT); //显示时间 长 中 短
        superToast.setBackground(SuperToast.Background.BLACK); //背景颜色
        superToast.setTextSize(SuperToast.TextSize.SMALL); //文字大小
        
        superToast.setText("验证码已发送到您的手机，10分钟内\n有效，请注意查收短信");
        superToast.setGravity(Gravity.CENTER, 0, 0);
        
        superToast.show();
        
      }
    });
    
    
    
  }

}
