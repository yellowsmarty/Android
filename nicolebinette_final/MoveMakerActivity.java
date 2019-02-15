package com.hfad.nicoleampornbinette.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MoveMakerActivity extends AppCompatActivity {
    String lastMove = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_maker);
    }

    public void onMakeMove(View view) {
        TextView firstSource = findViewById(R.id.srcTView);
        TextView sourceDestination = findViewById(R.id.dstTView);
        switch (view.getId())
        {
            case R.id.a1Button:
                if (lastMove == "")
                {
                    firstSource.setText("A1");
                    lastMove = "A1";
                }
                else {
                    sourceDestination.setText("A1");
                }
                break;
            case R.id.a2Button:
                if (lastMove == "")
                {
                    firstSource.setText("A2");
                    lastMove = "A2";
                }
                else {
                    sourceDestination.setText("A2");
                }
                break;
            case R.id.a3Button:
                if (lastMove.equals("")) {
                    firstSource.setText("A3");
                    lastMove = "A3";
                }
                else {
                    sourceDestination.setText("A3");
                }

                break;
            case R.id.a4Button:
                if (lastMove.equals(""))
                {
                    firstSource.setText("A4");
                    lastMove = "A4";
                }
                else {
                    sourceDestination.setText("A4");
                }
                break;
            case R.id.b1Button:
                if (lastMove.equals(""))
                {
                    firstSource.setText("B1");
                    lastMove = "B1";
                }
                else {
                    sourceDestination.setText("B1");
                }
                break;
            case R.id.b2Button:
                if (lastMove.equals(""))
                {
                    firstSource.setText("B2");
                    lastMove = "B2";
                }
                else {
                    sourceDestination.setText("B2");
                }
                break;
            case R.id.b3Button:
                if (lastMove.equals(""))
                {
                    firstSource.setText("B3");
                    lastMove = "B3";
                }
                else {

                    sourceDestination.setText("B3");
                }
                break;
            case R.id.b4Button:
                if (lastMove.equals(""))
                {
                    firstSource.setText("B4");
                    lastMove = "B4";
                }
                else {
                    sourceDestination.setText("B4");
                }
                break;
            case R.id.c1Button:
                if (lastMove.equals(""))
                {
                    firstSource.setText("C1");
                    lastMove = "C1";
                }
                else {

                    sourceDestination.setText("C1");
                }
                break;
            case R.id.c2Button:
                if (lastMove.equals(""))
                {
                    firstSource.setText("C2");
                    lastMove = "C2";
                }
                else {

                    sourceDestination.setText("C2");
                }
                break;
            case R.id.c3Button:
                if (lastMove.equals(""))
                {
                    firstSource.setText("C3");
                    lastMove = "C3";
                }
                else {

                    sourceDestination.setText("C3");
                }
                break;
            case R.id.c4Button:
                if (lastMove.equals(""))
                {
                    firstSource.setText("C4");
                    lastMove = "C4";
                }
                else {

                    sourceDestination.setText("C4");
                }
                break;
            case R.id.d1Button:
                if (lastMove.equals(""))
                {
                    firstSource.setText("D1");
                    lastMove = "D1";
                }
                else {

                    sourceDestination.setText("D1");
                }
                break;
            case R.id.d2Button:
                if (lastMove.equals(""))
                {
                    firstSource.setText("D2");
                    lastMove = "D2";
                }
                else {

                    sourceDestination.setText("D2");
                }
                break;
            case R.id.d3Button:
                if (lastMove.equals(""))
                {
                    firstSource.setText("D3");
                    lastMove = "D3";
                }
                else {

                    sourceDestination.setText("D3");
                }
                break;
            case R.id.d4Button:
                if (lastMove.equals("")) {
                    firstSource.setText("D1");
                    lastMove = "D1";
                }
                else {

                    sourceDestination.setText("D1");
                }
                break;
        }

    }

    public void onOk(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        TextView firstSource = findViewById(R.id.srcTView);
        TextView sourceDestination = findViewById(R.id.dstTView);
        String text = "" + firstSource.getText() + sourceDestination.getText();
        intent.putExtra("source", text);
        startActivity(intent);
    }

    public void onClear(View view) {
        TextView firstSource = findViewById(R.id.srcTView);
        firstSource.setText("first click source");
        TextView sourceDestination = findViewById(R.id.dstTView);
        sourceDestination.setText("then click destination");
    }

    public void onCancel(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
