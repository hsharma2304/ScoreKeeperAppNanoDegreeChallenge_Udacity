package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public int scoreAllianceA;
    public int scoreAllianceB;
    TextView scoreViewB;
    TextView scoreViewA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreViewB = findViewById(R.id.alliance_b_score);
        scoreViewA = findViewById(R.id.alliance_a_score);

    }

    /**
     * Adding the score Value by 1 for Team AllianceA.
     */
    public void addMainAttackA(View v) {
        scoreAllianceA++;
        displayForTeamAllianceA(scoreAllianceA);
    }

    /**
     * Adding the score Value by 2  for Team AllianceA.
     */
    public void addSpecialAttackA(View v) {
        scoreAllianceA += 2;
        displayForTeamAllianceA(scoreAllianceA);
    }

    /**
     * Adding the score Value by 1 for Team AllianceB.
     */
    public void addMainAttackB(View v) {
        scoreAllianceB++;
        displayForTeamAllianceB(scoreAllianceB);
    }

    /**
     * Adding the score Value by 2 for Team AllianceA.
     */
    public void addSpecialAttackB(View v) {
        scoreAllianceB += 2;
        displayForTeamAllianceB(scoreAllianceB);
    }

    /**
     * Display the resetScore Button.
     */
    public void resetScore(View v) {
        scoreAllianceA = 0;
        scoreAllianceB = 0;
        displayForTeamAllianceA(scoreAllianceA);
        displayForTeamAllianceB(scoreAllianceB);
    }

    /**
     * Displays the given score for Team AllianceA.
     */
    public void displayForTeamAllianceA(int score) {

        scoreViewA.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team AllianceB.
     */
    public void displayForTeamAllianceB(int score) {
        scoreViewB.setText(String.valueOf(score));
    }

    /**
     * This code is to save the ScoreValue.
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("teamA", scoreAllianceA);
        outState.putInt("teamB", scoreAllianceB);
    }

    /**
     * This code is to restore the value.
     */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreAllianceA = savedInstanceState.getInt("teamA");
        scoreAllianceB = savedInstanceState.getInt("teamB");
        displayForTeamAllianceA(scoreAllianceA);
        displayForTeamAllianceB(scoreAllianceB);
    }
}