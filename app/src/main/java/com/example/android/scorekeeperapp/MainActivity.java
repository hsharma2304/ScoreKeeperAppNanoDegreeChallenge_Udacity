package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int ScoreAllianceA;
    public int ScoreAllianceB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Adding the score Value by 1 for Team AllianceA.
     */

    public void addMainAttackA(View v) {
        ScoreAllianceA = ScoreAllianceA + 1;
        displayForTeamAllianceA(ScoreAllianceA);


    }
    /**
     * Adding the score Value by 2  for Team AllianceA.
     */
    public void addSpecialAttackA(View v) {
        ScoreAllianceA = ScoreAllianceA + 2;
        displayForTeamAllianceA(ScoreAllianceA);

    }
    /**
     * Adding the score Value by 1 for Team AllianceB.
     */
    public void addMainAttackB(View v) {
        ScoreAllianceB = ScoreAllianceB + 1;
        displayForTeamAllianceB(ScoreAllianceB);

    }
    /**
     * Adding the score Value by 2 for Team AllianceA.
     */
    public void addSpecialAttackB(View v) {
        ScoreAllianceB = ScoreAllianceB + 2;
        displayForTeamAllianceB(ScoreAllianceB);

    }
    /**
     * Display the resetScore Button.
     */
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
        TextView scoreView = findViewById(R.id.alliance_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team AllianceB.
     */
    public void displayForTeamAllianceB(int score) {
        TextView scoreView =  findViewById(R.id.alliance_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * This code is to save the ScoreValue.
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("teamA",ScoreAllianceA);
        outState.putInt("teamB",ScoreAllianceB);
    }
    /**
     * This code is to restore the value.
     */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        ScoreAllianceA = savedInstanceState.getInt("teamA");
        ScoreAllianceB = savedInstanceState.getInt("teamB");
        displayForTeamAllianceA(ScoreAllianceA);
        displayForTeamAllianceB(ScoreAllianceB);
    }
}