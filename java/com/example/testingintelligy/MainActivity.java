package com.example.testingintelligy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.testingintelligy.Generator.Deutsche;
import com.example.testingintelligy.Generator.Kyrgyz;
import com.example.testingintelligy.Generator.Russion;
import com.example.testingintelligy.Generator.Test;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Test testK ;
    Test testR;
    Test testD;

    public Button kr20,kr40,kr65,de20,de40,de65,ru20,ru40,ru65;
    private int questionsSize;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testD = new Deutsche();
        testK = new Kyrgyz();
        testR = new Russion();

        kr20 = findViewById(R.id.kr20);
        kr40 = findViewById(R.id.kr40);
        kr65 = findViewById(R.id.kr65);

        de20 = findViewById(R.id.de20);
        de40 = findViewById(R.id.kr40);
        de65 = findViewById(R.id.de65);

        ru20 = findViewById(R.id.ru20);
        ru40 = findViewById(R.id.ru40);
        ru65 = findViewById(R.id.ru65);

        questionsSize = 0;


        kr20.setOnClickListener(this);kr40.setOnClickListener(this);kr65.setOnClickListener(this);

        de20.setOnClickListener(this); de40.setOnClickListener(this); de65.setOnClickListener(this);

        ru20.setOnClickListener(this); ru40.setOnClickListener(this);  ru65.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = StartTest.makeIntent(MainActivity.this);

        Bundle bundle=new Bundle();

        switch (view.getId()){
            case R.id.kr20:
                questionsSize=20;
               bundle.putIntArray("questions", testK.getQues(questionsSize));
               bundle.putIntArray("ImageAnswers",testK.getimgs(questionsSize));
               bundle.putStringArray("answers",testK.getans(questionsSize));
                //bundle.putIntegerArrayList("ImageAnswers",(ArrayList<Integer>) testK.getImageAnswers(questionsSize));
                //bundle.putStringArrayList("answers",(ArrayList<String>) testK.getAnswers(questionsSize));
                intent.putExtras(bundle);
                break;
            case R.id.kr40:
                questionsSize=40;
                bundle.putIntArray("questions", testK.getQues(questionsSize));
                bundle.putIntArray("ImageAnswers",testK.getimgs(questionsSize));
                bundle.putStringArray("answers",testK.getans(questionsSize));
                intent.putExtras(bundle);
                break;
            case R.id.kr65:
                questionsSize = 65;
                bundle.putIntArray("questions", testK.getQues(questionsSize));
                bundle.putIntArray("ImageAnswers",testK.getimgs(questionsSize));
                bundle.putStringArray("answers",testK.getans(questionsSize));
                intent.putExtras(bundle);
                break;
            case R.id.ru20:
                questionsSize = 20;
                bundle.putIntArray("questions", testR.getQues(questionsSize));
                bundle.putIntArray("ImageAnswers",testR.getimgs(questionsSize));
                bundle.putStringArray("answers",testR.getans(questionsSize));


                intent.putExtras(bundle);
                break;
            case R.id.ru40:
                questionsSize = 40;
                bundle.putIntArray("questions", testR.getQues(questionsSize));
                bundle.putIntArray("ImageAnswers",testR.getimgs(questionsSize));
                bundle.putStringArray("answers",testR.getans(questionsSize));
                intent.putExtras(bundle);
                break;
            case R.id.ru65:
                questionsSize = 65;
                bundle.putIntArray("questions", testR.getQues(questionsSize));
                bundle.putIntArray("ImageAnswers",testR.getimgs(questionsSize));
                bundle.putStringArray("answers",testR.getans(questionsSize));
                intent.putExtras(bundle);
                break;
            case R.id.de20:
                questionsSize = 20;
                bundle.putIntArray("questions", testD.getQues(questionsSize));
                bundle.putIntArray("ImageAnswers",testD.getimgs(questionsSize));
                bundle.putStringArray("answers",testD.getans(questionsSize));
                intent.putExtras(bundle);
                break;
            case R.id.de40:
                questionsSize = 40;
                bundle.putIntArray("questions", testD.getQues(questionsSize));
                bundle.putIntArray("ImageAnswers",testD.getimgs(questionsSize));
                bundle.putStringArray("answers",testD.getans(questionsSize));
                intent.putExtras(bundle);
                break;
            case R.id.de65:
                questionsSize = 65;
                bundle.putIntArray("questions", testD.getQues(questionsSize));
                bundle.putIntArray("ImageAnswers",testD.getimgs(questionsSize));
                bundle.putStringArray("answers",testD.getans(questionsSize));
                intent.putExtras(bundle);
                break;

        }
        startActivity(intent);

    }

    public static Intent makeIntent(Context context){

        return new Intent(context, MainActivity.class);
    }
}
