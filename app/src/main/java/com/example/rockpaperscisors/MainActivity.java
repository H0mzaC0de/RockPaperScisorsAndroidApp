package com.example.rockpaperscisors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
ImageView userMove;
ImageView androidMove;
TextView userScore;
TextView androidScore;
ImageView rock,paper,scissors;
int counterUser=0;
int counterAndroid=0;
Integer moves[]={R.drawable.paper,R.drawable.scissors,R.drawable.rock};
String tags[]={"paper","scissors","rock"};
Random r = new Random();
int randomMove = r.nextInt(3);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userMove=findViewById(R.id.userMove);
        androidMove=findViewById(R.id.androidMove);
        userScore=findViewById(R.id.userScore);
        androidScore=findViewById(R.id.androidScore);
        androidMove=findViewById(R.id.androidMove);
        rock=findViewById(R.id.rock);
        paper=findViewById(R.id.paper);
        scissors=findViewById(R.id.scissors);
        rock.setOnClickListener(this);
        paper.setOnClickListener(this);
        scissors.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==paper.getId()){
            randomMove = r.nextInt(3);
            androidMove.setImageResource(moves[randomMove]);
            androidMove.setTag(tags[randomMove]);
            userMove.setImageResource(moves[0]);
            userMove.setTag(moves[0]);
            if(androidMove.getTag().toString().equals("rock")){
                counterUser++;
                userScore.setText(Integer.toString(counterUser));
            }else if(androidMove.getTag().toString().equals("scissors")){
                counterAndroid++;
                androidScore.setText(Integer.toString(counterAndroid));
            }

        }
        if(v.getId()==rock.getId()){
            randomMove = r.nextInt(3);
            androidMove.setImageResource(moves[randomMove]);
            androidMove.setTag(tags[randomMove]);
            userMove.setImageResource(moves[2]);
            userMove.setTag(moves[2]);
            if(androidMove.getTag().toString().equals("scissors")){
                counterUser++;
                userScore.setText(Integer.toString(counterUser));
            }else if(androidMove.getTag().toString().equals("paper")){
                counterAndroid++;
                androidScore.setText(Integer.toString(counterAndroid));
            }
        }
        if(v.getId()==scissors.getId()){
            randomMove = r.nextInt(3);
            androidMove.setImageResource(moves[randomMove]);
            androidMove.setTag(tags[randomMove]);
            userMove.setImageResource(moves[1]);
            userMove.setTag(moves[1]);
            if(androidMove.getTag().toString().equals("paper")){
                counterUser++;
                userScore.setText(Integer.toString(counterUser));
            }else if(androidMove.getTag().toString().equals("rock")){
                counterAndroid++;
                androidScore.setText(Integer.toString(counterAndroid));
            }
        }
    }


}