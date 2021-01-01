package com.example.simplecalculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button   button0, button1, button2, button3, button4, button5, button6,
                     button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
                     buttonMul, button10, buttonC, buttonEqual;

    private EditText simpleEditText;

    private  float mValueOne, mValueTwo;

    private  boolean simpleAddition, simpleSubtract, simpleMultiplication, simpleDivision;


    private Button exitButton;
    private AlertDialog.Builder alterDialogBuilder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        simpleEditText = (EditText) findViewById(R.id.edt1);

        exitButton = (Button) findViewById(R.id.buttonId);





            button1.setOnClickListener(new View.OnClickListener() {
                @Override

                public void onClick(View v) {

                    simpleEditText.setText(simpleEditText.getText() + "1");

                }
            });



            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    simpleEditText.setText(simpleEditText.getText() + "2");
                }
            });

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    simpleEditText.setText(simpleEditText.getText() + "3");
                }
            });

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    simpleEditText.setText(simpleEditText.getText() + "4");
                }
            });

            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    simpleEditText.setText(simpleEditText.getText() + "5");
                }
            });

            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    simpleEditText.setText(simpleEditText.getText() + "6");
                }
            });

            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    simpleEditText.setText(simpleEditText.getText() + "7");
                }
            });

            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    simpleEditText.setText(simpleEditText.getText() + "8");
                }
            });

            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    simpleEditText.setText(simpleEditText.getText() + "9");
                }
            });

            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    simpleEditText.setText(simpleEditText.getText() + "0");
                }
            });

            buttonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (simpleEditText == null) {
                        simpleEditText.setText("");
                    } else {
                        mValueOne = Float.parseFloat(simpleEditText.getText() + "");
                        simpleAddition = true;
                        simpleEditText.setText(null);
                    }
                }
            });

            buttonSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(simpleEditText.getText() + "");
                    simpleSubtract = true;
                    simpleEditText.setText(null);
                }
            });

            buttonMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(simpleEditText.getText() + "");
                    simpleMultiplication = true;
                    simpleEditText.setText(null);
                }
            });

            buttonDivision.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(simpleEditText.getText() + "");
                    simpleDivision = true;
                    simpleEditText.setText(null);
                }
            });


            buttonEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueTwo = Float.parseFloat(simpleEditText.getText() + "");

                    if (simpleAddition == true) {
                        simpleEditText.setText(mValueOne + mValueTwo + "");
                        simpleAddition = false;
                    }

                    if (simpleSubtract == true) {
                        simpleEditText.setText(mValueOne - mValueTwo + "");
                        simpleSubtract = false;
                    }

                    if (simpleMultiplication == true) {
                        simpleEditText.setText(mValueOne * mValueTwo + "");
                        simpleMultiplication = false;
                    }

                    if (simpleDivision == true) {
                        simpleEditText.setText(mValueOne / mValueTwo + "");
                        simpleDivision = false;
                    }
                }
            });

            buttonC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    simpleEditText.setText("");
                }
            });

            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    simpleEditText.setText(simpleEditText.getText() + ".");
                }
            });



            exitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    alterDialogBuilder = new AlertDialog.Builder(MainActivity.this);

                    //for setting title
                    alterDialogBuilder.setTitle(R.string.title_text);

                    //for setting message
                    alterDialogBuilder.setMessage(R.string.message_text);

                    //for setting icon
                    alterDialogBuilder.setIcon(R.mipmap.ic_launcher);

                    alterDialogBuilder.setCancelable(false);
                    alterDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            //exit
                            Toast.makeText(MainActivity.this,"You are exit from the calculator",Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    });

                    alterDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            Toast.makeText(MainActivity.this,"You are still inside the Calculator",Toast.LENGTH_SHORT).show();
                            dialog.cancel();
                        }
                    });

                    alterDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {


                            Toast.makeText(MainActivity.this,"Your attempt has been canceled !",Toast.LENGTH_SHORT).show();
                        }
                    });

                    AlertDialog alertDialog = alterDialogBuilder.create();
                    alertDialog.show();

                }
            });



    }
}