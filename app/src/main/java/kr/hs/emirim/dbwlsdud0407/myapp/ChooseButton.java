package kr.hs.emirim.dbwlsdud0407.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

/**
 * Created by appcreator08 on 2016. 6. 20..
 */

public class ChooseButton  extends Activity{
    ViewFlipper flip;
    @Override
public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);
        /*Button korea = (Button)findViewById(R.id.but_kor);
        korea.setOnClickListener(new View.OnClickListener(){
        Button japen = (Button) findViewById(R.id.but_japen);
        japen.setOnClickListener(new View.OnClickListener()
        Button china = (Button) findViewById(R.id.but_china);
        china.setOnClickListener(new View.OnClickListener);
        {
            @Override
            public void onClick(View v) {
                switch(v.getId()){
                    case R.id.but_kor:
                        flip.setFlipInterval(50);
                        flip.startFlipping();
                        break;
                    case R.id.but_japen:
                        flip.stopFlipping();
                        break;
                    case R.id.but_china:

                }
            }
        });
}
    public void onClick(View v){
        if(v.getId()==R.id.but_kor){
            flip.setFlipInterval(50);
        }
    }*/
    }
    public void korean(View v){
        Intent intent=new Intent(ChooseButton.this,ImageActivity.class);
        startActivity(intent);
    }

    public void japenes(View v){
        Intent intent=new Intent(ChooseButton.this,ImageActivity.class);
        startActivity(intent);
    }
    public void china(View v){
        Intent intent=new Intent(ChooseButton.this,ImageActivity.class);
        startActivity(intent);
    }

}
