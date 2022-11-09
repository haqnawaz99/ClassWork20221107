package haqnawaz.org.a20221031;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class KidsMathactivity extends AppCompatActivity {
    TextView tvFirstNumber, tvSecondNumber, tvThirdNumber, tvMathResult;
    int firstNumber, secondNumber, resultNumber, whatToDo ;
    RadioButton rbAdd, rbMinus;
    String answer = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_mathactivity);

        tvFirstNumber = findViewById(R.id.textViewFirstNumber);
        tvSecondNumber = findViewById(R.id.textViewSecondNumber);
        tvThirdNumber = findViewById(R.id.textViewThirdNumber);
        tvMathResult = findViewById(R.id.textViewMathAnswer);

        rbAdd = findViewById(R.id.RBAdd);
        rbMinus = findViewById(R.id.RBMinus);

        GetRandomNumber();

    }

    private void GetRandomNumber() {
        Random rnd = new Random();

        firstNumber = rnd.nextInt(100);
        secondNumber = rnd.nextInt(100);
        whatToDo = rnd.nextInt(1);

        tvFirstNumber.setText(Integer.toString(firstNumber));
        tvSecondNumber.setText(Integer.toString(secondNumber));
        tvThirdNumber.setText(Integer.toString(resultNumber));

        if (whatToDo == 1) {
            resultNumber = firstNumber + secondNumber;
            answer = "Addition";

        }
        else{ resultNumber = firstNumber - secondNumber;
            answer = "Subtraction";}
    }

    public void RadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.RBAdd:
                if (checked){
                rbAdd.setChecked(false);
                if (answer == "Addition"){
                    tvMathResult.setText("Congratulations");
                    GetRandomNumber();

                }
                else{
                    tvMathResult.setText("Oops");
                    GetRandomNumber();
                }
                }
                break;
            case R.id.RBMinus:
                if (checked){
                    rbAdd.setChecked(false);
                    if (answer == "Subtraction"){
                        tvMathResult.setText("Congratulations");
                        GetRandomNumber();

                    }
                    else{
                        tvMathResult.setText("Oops");
                        GetRandomNumber();
                    }
                }
                break;
        }
    }
}