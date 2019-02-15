package com.hfad.nicoleampornbinette.converter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.EditText;

public class Convert extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);
    }

    public void onClickConvert(View view) {
        //TextView reference
        TextView message = (TextView) findViewById(R.id.textView);

        //Spinner reference
        Spinner conversion = (Spinner) findViewById(R.id.spinner);

        //Get spinner value
        String convertTo = String.valueOf(conversion.getSelectedItem());

        //EditText reference
        EditText editText = (EditText) findViewById(R.id.editText);

        //Get editText value
        String value = editText.getText().toString();

        //Remove extra characters
        value = value.replaceAll("\\s","");
        value = value.replaceAll(",", "");

        //Get number value for user input
        int number = parseInt(value);

        if (convert(convertTo, number) == -1)
        {
            message.setText("Invalid entry");
        }
        else {
            double convertedNumber = convert(convertTo, number);
            boolean convertedToCentimeters = convertTo.endsWith(" centimeters");
            boolean convertedToMillimeters = convertTo.endsWith(" millimeters");
            boolean convertedToMeters = convertTo.endsWith(" meters");
            if (convertedToCentimeters) message.setText(convertedNumber + " centimeters.");
            if (convertedToMillimeters) message.setText(convertedNumber + " millimeters.");
            if (convertedToMeters) message.setText(convertedNumber + " meters.");
        }

    }
    public int parseInt(String string) {
        //Parse the string into an integer
        int number = 0;
        int multiplier = 1;

        for (int index =0; index < string.length(); index++)
        {
            char current = string.charAt(index);

            switch(current) {
                case '0':
                    number += 0;
                    break;
                case '1':
                    number += multiplier;
                    break;
                case '2':
                    number += 2 * multiplier;
                    break;
                case '3':
                    number += 3 * multiplier;
                    break;
                case '4':
                    number += 4 * multiplier;
                    break;
                case '5':
                    number += 5 * multiplier;
                    break;
                case '6':
                    number += 6 * multiplier;
                    break;
                case '7':
                    number += 7 * multiplier;
                    break;
                case '8':
                    number += 8 * multiplier;
                    break;
                case '9':
                    number += 9 * multiplier;
                    break;
                default:
                    number = -1;
                    return number;
            }

            multiplier = multiplier * 10;
        }

        return number;
    }

    public double convert(String c, int number) {

        double n = number;
        switch (number) {
            case -1:
            return -1;
        }
        switch (c) {

            case "centimeters to millimeters":
                n = n/10;
                break;
            case "decimeters to centimeters":
                n = n*10;
                break;
            case "meters to centimeters":
                n = n*100;
                break;
            case "kilometers to meters":
                n = n*1000;
                break;
        }

        return n;
    }
}
