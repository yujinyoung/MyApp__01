package kr.hs.emirim.dbwlsdud0407.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ViewFlipper;

public class ImageActivity extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper flip;
    EditText editTime;
    int time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        flip=(ViewFlipper)findViewById(R.id.but_flip);
        Button butstr=(Button)findViewById(R.id.but_start);
        butstr.setOnClickListener(this);
        Button butstop=(Button)findViewById(R.id.but_stop);
        butstop.setOnClickListener(this);
    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.but_start:
                flip.setFlipInterval(50);
                flip.startFlipping();
                break;
            case R.id.but_stop:
                flip.stopFlipping();
                break;

        }
    }



}


