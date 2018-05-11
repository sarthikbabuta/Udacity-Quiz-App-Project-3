package com.example.sarthikbabuta.udacity3app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        int Right_answer=0,flag=0;
        CheckBox op8_1;
        CheckBox op8_2;
        CheckBox op8_3;
        CheckBox op8_4;
        //checkbox lai lite hai
        boolean o1;
        boolean o2;
        boolean o3;
        boolean o4;
        //ques1_2 apni onclick method da hai
    //radiobox di sanu sirf correct answer di id laini
    public void que1_3(View v)
    {
        //id liti
        RadioButton op1_3=(RadioButton) findViewById(R.id.q1_3);
        //je op1_3 check hai
        if (op1_3.isChecked())
        {
            //right answer nu add krduga
            Right_answer++;
        }
    }
    public void que2_2(View v)
    {
        RadioButton op2_2=(RadioButton) findViewById(R.id.q2_2);
        if (op2_2.isChecked())
        {
            Right_answer++;
        }
    }
    public void que3_1(View v)
    {
        RadioButton op3_1=(RadioButton) findViewById(R.id.q3_1);
        if (op3_1.isChecked())
        {
            Right_answer++;
        }
    }
    public void que4_4(View v)
    {
        RadioButton op4_4=(RadioButton) findViewById(R.id.q4_4);
        if (op4_4.isChecked())
        {
            Right_answer++;
        }
    }
    public void que5_1(View v)
    {
        RadioButton op5_1=(RadioButton) findViewById(R.id.q5_1);
        if (op5_1.isChecked())
        {
            Right_answer++;
        }
    }
    public void que6_4(View v)
    {
        RadioButton op6_4=(RadioButton) findViewById(R.id.q6_4);
        if (op6_4.isChecked())
        {
            Right_answer++;
        }
    }

    public void que7_2(View v)
    {
        RadioButton op7_2=(RadioButton) findViewById(R.id.q7_2);
        if (op7_2.isChecked()) {
            Right_answer++;
        }
    }
    //jehra ques8 hai ohdi asi sare click krna paine
    //check box de sanu saraya di id laini paini
    public void que8_1(View v)
    {
        //pehla id la lai
        op8_1 = (CheckBox) findViewById(R.id.q8_1);
        //je check hai kisi variable vich save kra diti
        o1=op8_1.isChecked();
    }
    public void que8_2(View v)
    {
        CheckBox op8_2 = (CheckBox) findViewById(R.id.q8_2);
        o2=op8_2.isChecked();
    }
    public void que8_3(View v)
    {
        CheckBox op8_3 = (CheckBox) findViewById(R.id.q8_3);
        o3=op8_3.isChecked();
    }
    public void que8_4(View v)
    {
        CheckBox op8_4 = (CheckBox) findViewById(R.id.q8_4);
        o4=op8_4.isChecked();
    }
    public void onsubmit(View view) {
        //je option 1 and 4 na click hon
        //te option 2 and 3 click hoya hon
        //ta hi add kruaga
        if(!o1 && o2 && o3 && !o4 )
        {
            Right_answer++;
        }
        //apne name di id liti
        EditText text = (EditText) findViewById(R.id.name);
        //ohnu string vich get kita
        String name = text.getText().toString();

        //ques9 di id liti
        EditText q9 = (EditText) findViewById(R.id.q9);
        //ohnu string vich convert krke likhyaa
        String name_android = q9.getText().toString();

        //jehra name asi dalya oh pranvav mukherjee de equal hai ta ++ krde right answer nu
        if ((name_android.equals("java")))
            Right_answer++;
        //toast vich this,message,length_short
        Toast.makeText(this, name + ",You give " + Right_answer + " correct Answer!!!", Toast.LENGTH_SHORT).show();

        //je right answer 6 toh greater ne ta eh print krde
        if (Right_answer > 6) {
            Toast.makeText(this, name + ", You are awesome ", Toast.LENGTH_SHORT).show();
        } else if (Right_answer > 6 && Right_answer <6) {
            Toast.makeText(this, name + ", You are good ", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, name + ", please try again!!! ", Toast.LENGTH_SHORT).show();
        }
    }
}