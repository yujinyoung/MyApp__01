package kr.hs.emirim.dbwlsdud0407.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import static android.support.v4.app.ActivityCompat.startActivity;

/**
 * Created by appcreator08 on 2016. 6. 20..
 */
public class SplashActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        try {
            Thread.sleep(4000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

}
