package haqnawaz.org.a20221031;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity1 extends AppCompatActivity {

    Button btn6;
    EditText textInp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        btn6=findViewById(R.id.btn6);
        textInp=findViewById(R.id.textInput);


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=textInp.getText().toString();

                Intent intent=new Intent(activity1.this,MainActivity.class);
                intent.putExtra("myText",text);

                startActivity(intent);

            }
        });



    }
}