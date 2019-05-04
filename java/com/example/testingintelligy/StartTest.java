package com.example.testingintelligy;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.testingintelligy.Generator.Deutsche;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class StartTest extends AppCompatActivity implements View.OnClickListener{
    private final static long startTimeInMillis= 600000;
    int[] questions;
    int[] imageAnswers;
    String[] answers;

    private int  counterLimit = 0;
    private TextView counterTV;
    private TextView condownTV;

    private ImageView imageView;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button  weiterBtn;
    private Button configBtn;
    private int current_img ;
    private int rightAnswerCounter;

    private boolean rbclicked = false;


    private long timeLeftInMillisecends ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_test);

       Bundle bundle = getIntent().getExtras();
        questions = bundle.getIntArray("questions");
        answers = bundle.getStringArray("answers");
        imageAnswers = bundle.getIntArray("ImageAnswers");
        timeLeftInMillisecends = (questions.length/20)*startTimeInMillis;


        rightAnswerCounter = 0;
        counterLimit = questions.length;
        current_img = 0;


        counterTV = findViewById(R.id.questcounter);
        condownTV = findViewById(R.id.condowntimer);
        imageView = findViewById(R.id.imageView);
        radioGroup = findViewById(R.id.radioGroup);
        weiterBtn = findViewById(R.id.nextBtn);
        configBtn = findViewById(R.id.configBtn);

        imageView.setImageResource(questions[current_img]);
        counterTV.setText(String.valueOf(current_img+1)  + " / " + String.valueOf(counterLimit));


        weiterBtn.setOnClickListener(this);
        configBtn.setOnClickListener(this);




        startTimer();
    }


    public void startTimer(){
        CountDownTimer countDownTimer = new CountDownTimer(timeLeftInMillisecends, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillisecends = millisUntilFinished;
                updateTimer();
            }

            @Override
            public void onFinish() {
                timeLeftInMillisecends = startTimeInMillis;
               goToResult();
            }
        }.start();
    }
    public void updateTimer(){
        int minutes = (int) (timeLeftInMillisecends/1000)/60;
        int seconds = (int) (timeLeftInMillisecends/1000)%60;

        String timeLeftFomated = String.format(Locale.getDefault(),"%02d:%02d", minutes,seconds);

        condownTV.setText(timeLeftFomated);
    }

    public void rbClick(View view){
        int checkedRB = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(checkedRB);
        rbclicked = true;
    }







    public static Intent makeIntent(Context context){

        return new Intent(context, StartTest.class);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.nextBtn:
                if (radioButton.getText() == answers[current_img]) rightAnswerCounter++;
                if (current_img >= counterLimit) {
                    goToResult();
                }
                current_img++;
                if (current_img == counterLimit - 1) {
                    weiterBtn.setText("Result !!!");
                }
                radioButton.setChecked(false);
                imageView.setImageResource(questions[current_img]);
                counterTV.setText(String.format("%s-Frage / %s", String.valueOf(current_img + 1), String.valueOf(counterLimit)));
                break;


            case R.id.configBtn:
                if (!rbclicked) {
                    weiterBtn.setText("Click one answer");
                }
                imageView.setImageResource(imageAnswers[current_img]);
                break;
        }

    }

public void goToResult(){
    double quotient = rightAnswerCounter*100.00/counterLimit;

    Intent intent = ResultTest.makeIntent(StartTest.this);
    Bundle bundle = new Bundle();
    bundle.putDouble("quotient",quotient);
    bundle.putInt("rightAnswerCount", rightAnswerCounter);

    intent.putExtras(bundle);
    startActivity(intent);
}









}
