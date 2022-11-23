package haqnawaz.org.a20221031;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.widget.TextView;

import java.util.ArrayList;

public class JavaCollectionActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_collection);
        String [] names = {"Saad", "Ali", "Hashim", "Khadija"};

        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Ali");
        studentNames.add("Saadia");

        textView = findViewById(R.id.textViewCollections);
        textView.setText(studentNames.get(1).toString());
        textView.append("\nSize " + studentNames.size());
        textView.append("\nis Ali there " + studentNames.contains("Ali"));
        studentNames.remove(0);
        textView.append("\nis Ali there " + studentNames.contains("Ali"));
        textView.append("\nSize " + studentNames.size());
        textView.append("\nIndex of Ali " + studentNames.indexOf("Ali"));

       textView.setText(getString(R.string.textIT));


    }
}