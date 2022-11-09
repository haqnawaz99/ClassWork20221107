package haqnawaz.org.a20221031;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    Button btnAdd, btnMinus, btnReset;
    TextView textView;
    int value=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd =findViewById(R.id.buttonIncrement);
        textView = findViewById(R.id.textCount);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value++;
                textView.setText(Integer.toString(value));
            }
        });
    }

    public void DecreseNumber(View view) {
        value--;
        textView.setText(Integer.toString(value));
    }

//    @Override
//    public void onClick(View view) {
//        switch (view.getId())
//    }
}