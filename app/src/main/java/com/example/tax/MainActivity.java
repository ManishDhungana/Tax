package com.example.tax;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private EditText input;
    private Button calculate;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.inputet);
        output = findViewById(R.id.outputtv);
        calculate = findViewById(R.id.calcbttn);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float salary = Float.parseFloat(input.getText().toString());
                output.setText("Your tax is: "+calculate(salary*12));
            }
        });
    }
    private float calculate(float salary){
        float tax;
            if (salary>=1 && salary<=200000){
                tax = salary / 100;
            }else if (salary>200000 && salary<=350000){
                tax = (salary - 200000)*(15f/100) + (200000f/100);
            }else {
                tax = (salary-350000)*(25f/100) + (150000*15f)/100 + (200000f/100);
            }
            return tax;
        }
    }