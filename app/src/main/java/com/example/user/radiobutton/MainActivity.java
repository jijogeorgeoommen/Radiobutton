package com.example.user.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    RadioButton genderbutton;
    RadioGroup radiogroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radiogroup=findViewById(R.id.rgroup);
    }

    public void bttun(View view) {
        int selectedid=radiogroup.getCheckedRadioButtonId();
        genderbutton=findViewById(selectedid);
        if (selectedid==-1){
            Toast.makeText(this, "Nothing Selected", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,genderbutton.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
