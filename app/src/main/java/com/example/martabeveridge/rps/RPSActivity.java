package com.example.martabeveridge.rps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class RPSActivity extends AppCompatActivity {

    EditText playerName;
    TextView resultText;
    ImageButton rockButton;
    ImageButton paperButton;
    ImageButton scissorsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rps);

        playerName = findViewById(R.id.playerNameID);
        resultText = findViewById(R.id.resultTextID);
        rockButton = findViewById(R.id.rockButtonID);
        paperButton = findViewById(R.id.paperButtonID);
        scissorsButton = findViewById(R.id.scissorButtonID);
    }

    public void onRockButtonClicked(View rockButton) {
        String playerChoice = "Rock";
        String computerChoice = RPS.randomComputerChoice();
        String result = RPS.compareAnswers( playerChoice, computerChoice);
        resultText.setText(result);
    }

    public void onPaperButtonClicked(View paperButton) {
        String playerChoice = "Paper";
        String computerChoice = RPS.randomComputerChoice();
        String result = RPS.compareAnswers( playerChoice, computerChoice);
        resultText.setText(result);
    }

    public void onScissorButtonClicked(View scissorButton) {
        String playerChoice = "Scissors";
        String computerChoice = RPS.randomComputerChoice();
        String result = RPS.compareAnswers( playerChoice, computerChoice);
        resultText.setText(result);
    }

}
