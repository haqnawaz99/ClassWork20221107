package haqnawaz.org.a20221031;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveDataActivity extends AppCompatActivity {
    TextView textViewReceiveMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_data);

        textViewReceiveMessage = findViewById(R.id.textViewActivityReceiveData);

        Intent intent = getIntent();
            //textViewReceiveMessage.setText(intent.getStringExtra("WelcomeMessage"));
            int number = intent.getIntExtra("nmbr",0);
            textViewReceiveMessage.setText(Integer.toString(number));


    }
}