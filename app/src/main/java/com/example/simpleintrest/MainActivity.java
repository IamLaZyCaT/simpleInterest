package com.example.simpleintrest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText p,r,t;
    Button btn;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p = (EditText)findViewById(R.id.principal);
        r = (EditText)findViewById(R.id.rate);
        t = (EditText)findViewById(R.id.time);
        btn= (Button)findViewById(R.id.button);
        res=(TextView)findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int pr = Integer.parseInt(p.getText().toString());
                int ti =Integer.parseInt(t.getText().toString());
                int ra =Integer.parseInt(r.getText().toString());
                int re=(pr*ti*ra)/100;

                res.setText("Required Intrest : "+re);

            }
        });



    }
}