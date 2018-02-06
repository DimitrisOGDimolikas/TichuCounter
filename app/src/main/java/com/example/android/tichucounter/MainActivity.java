package com.example.android.tichucounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /* Scores */
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /* Team A*/
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /*Grand Team A*/
    public void GrandforTeamA (View view){
        scoreTeamA = scoreTeamA + 200;
        displayForTeamA(scoreTeamA);
    }
    /*Tichu Team A*/
    public void TichuforTeamA(View view){
        scoreTeamA = scoreTeamA + 100;
        displayForTeamA(scoreTeamA);
    }
    /*+10 Team A*/
    public void TenforTeamA (View view){
        scoreTeamA = scoreTeamA + 10;
        displayForTeamA(scoreTeamA);
    }
    /*+5 Team A */
    public void FiveforTeamA (View view){
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);
    }
    /*Drake Team A */
    public void DrakeforTeamA (View view){
        scoreTeamA = scoreTeamA + 25;
        displayForTeamA(scoreTeamA);
    }
    /* Phoenix Team A*/
    public void PhoenixforTeamA (View view){
        scoreTeamA = scoreTeamA - 25;
        displayForTeamA(scoreTeamA);
    }


    /* Team B */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /*Grand Team B*/
    public void GrandforTeamB (View view){
        scoreTeamB = scoreTeamB + 200;
        displayForTeamB(scoreTeamB);
    }
    /*Tichu Team B*/
    public void TichuforTeamB(View view){
        scoreTeamB = scoreTeamB + 100;
        displayForTeamB(scoreTeamB);
    }
    /*+10 Team B*/
    public void TenforTeamB (View view){
        scoreTeamB = scoreTeamB + 10;
        displayForTeamB(scoreTeamB);
    }
    /*+5 Team B */
    public void FiveforTeamB (View view){
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB(scoreTeamB);
    }
    /*Drake Team B */
    public void DrakeforTeamB (View view){
        scoreTeamB = scoreTeamB + 25;
        displayForTeamB(scoreTeamB);
    }
    /* Phoenix Team B*/
    public void PhoenixforTeamB (View view){
        scoreTeamB = scoreTeamB - 25;
        displayForTeamB(scoreTeamB);
    }

    /* Reset Button*/
    public void Reset (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
