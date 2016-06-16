package kr.hs.emirim.dbwlsdud0407.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper flip;
    EditText editTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flip=(ViewFlipper)findViewById(R.id.but_flip);
        Button butstr=(Button)findViewById(R.id.but_start);
        butstr.setOnClickListener(this);
        Button butstop=(Button)findViewById(R.id.but_stop);
        butstop.setOnClickListener(this);
    }
    public void onClick(View v){

    }
}
