package org.login.com.calculator6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {


    @BindView(R.id.edt_value)
    EditText mEdtValue;


    Values values = new Values();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    public void setValue(View view) {
        if (values.isResult) {
            mEdtValue.setText("" + String.valueOf(view.getTag()));
            values.setResult(false);
        } else {
            mEdtValue.setText(mEdtValue.getText().toString() + String.valueOf(view.getTag()));

        }

    }

    public void setAction(View view) {

        switch (String.valueOf(view.getTag())) {
            case "Add":
                values.setActionName("Add");
               // values.setFirstValue(Integer.parseInt(mEdtValue.getText().toString()));
                mEdtValue.setText(mEdtValue.getText().toString() + " + ");


                break;

            case "Sub":
                values.setActionName("Sub");
               // values.setFirstValue(Integer.parseInt(mEdtValue.getText().toString()));
                mEdtValue.setText(mEdtValue.getText().toString() + " - ");

                break;

            case "Mul":
                values.setActionName("Mul");
                //values.setFirstValue(Integer.parseInt(mEdtValue.getText().toString()));
                mEdtValue.setText(mEdtValue.getText().toString() + " * ");

                break;

            case "Div":
                values.setActionName("Div");
                //values.setFirstValue(Integer.parseInt(mEdtValue.getText().toString()));
                mEdtValue.setText(mEdtValue.getText().toString() + " / ");


                break;

            case "Equal":
                Calculation calculation = new Calculation();

                values.setValue(mEdtValue.getText().toString());
                mEdtValue.setText(String.valueOf(calculation.getResult(values)));
                values.setResult(true);
                break;
        }

    }
}
