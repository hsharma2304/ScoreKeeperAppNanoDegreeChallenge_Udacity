package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScoreAllianceA = 0;
    int ScoreAllianceB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addMainAttackA(View v) {
        ScoreAllianceA = ScoreAllianceA + 1;
        displayForTeamAllianceA(ScoreAllianceA);


    }

    public void addSpecialAttackA(View v) {
        ScoreAllianceA = ScoreAllianceA + 2;
        displayForTeamAllianceA(ScoreAllianceA);

    }

    public void addMainAttackB(View v) {
        ScoreAllianceB = ScoreAllianceB + 1;
        displayForTeamAllianceA(ScoreAllianceA);

    }

    public void addSpecialAttackB(View v) {
        ScoreAllianceB = ScoreAllianceB + 2;
        displayForTeamAllianceA(ScoreAllianceA);

    }

    public void resetScore(View v) {
        ScoreAllianceA = 0;
        ScoreAllianceB = 0;
        displayForTeamAllianceA(ScoreAllianceA);
        displayForTeamAllianceB(ScoreAllianceB);
    }

    /**
     * Displays the given score for Team AllianceA.
     */
    public void displayForTeamAllianceA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.alliance_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team AllianceB.
     */
    public void displayForTeamAllianceB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.alliance_b_score);
        scoreView.setText(String.valueOf(score));
    }

}