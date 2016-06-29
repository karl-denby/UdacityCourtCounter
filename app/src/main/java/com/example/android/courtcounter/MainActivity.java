package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Global Variables.
     */
    int scoreForTeamA = 0;
    int scoreForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team's.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add to the scores for each team, every time a button is pressed.
     */
    public void threeForTeamA(View view) {
        scoreForTeamA += 3;
        displayForTeamA(scoreForTeamA);
    }

    public void twoForTeamA(View view) {
        scoreForTeamA += 2;
        displayForTeamA(scoreForTeamA);
    }

    public void oneForTeamA(View view) {
        scoreForTeamA += 1;
        displayForTeamA(scoreForTeamA);
    }

    public void threeForTeamB(View view) {
        scoreForTeamB += 3;
        displayForTeamB(scoreForTeamB);
    }

    public void twoForTeamB(View view) {
        scoreForTeamB += 2;
        displayForTeamB(scoreForTeamB);
    }

    public void oneForTeamB(View view) {
        scoreForTeamB += 1;
        displayForTeamB(scoreForTeamB);
    }

    public void resetScores(View view) {
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }

}
