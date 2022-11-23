package haqnawaz.org.a20221031;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityDataPass extends AppCompatActivity {

    EditText editTextNumber;
    Button buttnSendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_pass);
        editTextNumber = findViewById(R.id.editTextNumber);
        buttnSendData = findViewById(R.id.buttonSendData);

        buttnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityDataPass.this, ReceiveDataActivity.class);
                int number = Integer.parseInt(editTextNumber.getText().toString());

                intent.putExtra("WelcomeMessage","السلام علیکم");
                intent.putExtra("nmbr",number);



                startActivity(intent);
            }
        });
    }
}