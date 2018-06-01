package org.login.com.calculator6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {

    /*   Button mBtnOne;
       Button mBtnTwo;*/
    @BindView(R.id.edt_value)
    EditText mEdtValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

       /* mBtnOne = findViewById(R.id.btn_one);
        mBtnOne.setOnClickListener(this);
        mBtnTwo = findViewById(R.id.btn_two);
        mBtnTwo.setOnClickListener(this);*/

        /* mEdtValue = findViewById(R.id.edt_value);*/

//        mBtnOne.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mEdtValue.setText(mBtnOne.getText().toString());
//            }
//        });
    }

   /* @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_one:
                mEdtValue.setText(mBtnOne.getText().toString());
                break;
            case R.id.btn_two:
                mEdtValue.setText(mBtnTwo.getText().toString());
                break;
        }
    }*/

    public void setValue(View view) {
        mEdtValue.setText(String.valueOf(view.getTag()));

    }
}
