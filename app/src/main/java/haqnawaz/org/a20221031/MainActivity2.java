package haqnawaz.org.a20221031;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button btnIncrement, btnDecrement, btnReset;
    TextView textViewCounter;
    int value=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnDecrement = findViewById(R.id.itDecrement);
        btnIncrement = findViewById(R.id.itIncrement);
        btnReset = findViewById(R.id.itReset);
        textViewCounter = findViewById(R.id.textViewValue);

        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value--;
                textViewCounter.setText(Integer.toString(value));

            }
        });

        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value++;
                textViewCounter.setText(Integer.toString(value));
            }
        });

    }

    public void ResetIT(View view) {
        value=0;
        textViewCounter.setText(Integer.toString(value));
    }

    @Override
    public void onClick(View view) {

    }
    //Todo
}