package in.raman.raman.trickery;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class question_Activity extends AppCompatActivity {

    private int count=0;
    private String result="";
    private TextView r1,r2,r3,r4,r5,r6,r7;
    private Button yes,no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_);

        yes = (Button) findViewById(R.id.yes);
        no = (Button) findViewById(R.id.no);

        r1 = (TextView) findViewById(R.id.row1);
        r2 = (TextView) findViewById(R.id.row2);
        r3 = (TextView) findViewById(R.id.row3);
        r4 = (TextView) findViewById(R.id.row4);
        r5 = (TextView) findViewById(R.id.row5);
        r6 = (TextView) findViewById(R.id.row6);
        r7 = (TextView) findViewById(R.id.row7);

        checkCount();

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(count<6) {

                    count++;
                    result = result + "1";
                    animate();
                    checkCount();
                }

                else{

                    result = result + "1";
                    String reverse = new StringBuffer(result).reverse().toString();
                    int answer = Integer.parseInt(reverse,2);

                    Intent i = new Intent(question_Activity.this,Guess.class);
                    i.putExtra("result",String.valueOf(answer));
                    startActivity(i);
                    finish();

                }

            }
        });


        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(count<6) {

                    count++;
                    result = result + "0";
                    animate();
                    checkCount();
                }

                else{

                    result = result + "0";
                    String reverse = new StringBuffer(result).reverse().toString();
                    int answer = Integer.parseInt(reverse,2);

                    Intent i = new Intent(question_Activity.this,Guess.class);
                    i.putExtra("result",String.valueOf(answer));
                    startActivity(i);
                    finish();
                }


            }
        });



    }

    private void animate() {

        r1.setAlpha( (float) 0.3 );
        r2.setAlpha( (float) 0.3 );
        r3.setAlpha( (float) 0.3 );
        r4.setAlpha( (float) 0.3 );
        r5.setAlpha( (float) 0.3 );
        r6.setAlpha( (float) 0.3 );
        r7.setAlpha( (float) 0.3 );

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                r1.setAlpha( (float)  0);
                r2.setAlpha( (float)  0);
                r3.setAlpha( (float)  0);
                r4.setAlpha( (float)  0);
                r5.setAlpha( (float)  0);
                r6.setAlpha( (float)  0);
                r7.setAlpha( (float)  0);

                final Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        r1.setAlpha( (float) 0.7 );
                        r2.setAlpha( (float) 0.7 );
                        r3.setAlpha( (float) 0.7 );
                        r4.setAlpha( (float) 0.7 );
                        r5.setAlpha( (float) 0.7 );
                        r6.setAlpha( (float) 0.7 );
                        r7.setAlpha( (float) 0.7 );

                        final Handler handle2 = new Handler();
                        handle2.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                r1.setAlpha( (float) 1 );
                                r2.setAlpha( (float) 1 );
                                r3.setAlpha( (float) 1 );
                                r4.setAlpha( (float) 1 );
                                r5.setAlpha( (float) 1 );
                                r6.setAlpha( (float) 1 );
                                r7.setAlpha( (float) 1 );

                            }
                        }, 10);

                    }
                }, 400);

            }
        }, 0);

    }

    private void checkCount() {

        if(count==0){

            r1.setText(" 1        3       5       7        9      11      13      15");
            r2.setText("17     19     21     23     25     27      29      31");
            r3.setText("33     35     37     39     41     43      45      47");
            r4.setText("49     51     53     55     57     59      61      63");
            r5.setText("65     67     69     71     73     75      77      79");
            r6.setText("81     83     85     87     89     91      93      95");
            r7.setText("97     99");

        }

        if(count==1){

            r1.setText(" 2       3       6       7       10      11      14      15");
            r2.setText("18     19     22     23      26     27     30      31");
            r3.setText("34     35     38     39      42     43     46      47");
            r4.setText("50     51     54     55      58     59     62      63");
            r5.setText("66     67     70     71      74     75     78      79");
            r6.setText("82     83     86     87      90     91     94      95");
            r7.setText("98     99");

        }

        if(count==2){

            r1.setText(" 4       5       6        7       12      13      14       15");
            r2.setText("20     21     22     23      28     29     30      31");
            r3.setText("36     37     38     39      44     45     46      47");
            r4.setText("52     53     54     55      60     61     62      63");
            r5.setText("68     69     70     71      76     77     78      79");
            r6.setText("84     85     86     87      92     93     94      95");
            r7.setText("100");

        }

        if(count==3){

            r1.setText(" 8      9      10     11     12     13     14      15");
            r2.setText("24     25      26     27     28     29     30      31");
            r3.setText("40     41      42     43     44     45     46      47");
            r4.setText("56     57      58     59     60     61     62      63");
            r5.setText("72     73      74     75     76     77     78      79");
            r6.setText("88     89      90     91     92     93     94      95");
            r7.setText("");

        }

        if(count==4){

            r1.setText("16     17     18     19     20     21     22      23");
            r2.setText("24     25     26     27     28     29     30      31");
            r3.setText("48     49     50     51     52     53     54      55");
            r4.setText("56     57     58     59     60     61     62      63");
            r5.setText("80     81     82     83     84     85     86      87");
            r6.setText("88     89     90     91     92     93     94      95");
            r7.setText("");

        }

        if(count==5){

            r1.setText("32     33     34     35     36     37     38     39");
            r2.setText("40     41     42     43     44     45     46     47");
            r3.setText("48     49     50     51     52     53     54     55");
            r4.setText("56     57     58     59     60     61     62     63");
            r5.setText("96     97     98     99    100");
            r6.setText("");
            r7.setText("");

        }

        if(count==6){

            r1.setText("64     65     66     67     68     69     70     71");
            r2.setText("72     73     74     75     76     77     78     79");
            r3.setText("80     81     82     83     84     85     86     87");
            r4.setText("88     89     90     91     92     93     94     95");
            r5.setText("96     97     98     99     100");
            r6.setText("");
            r7.setText("");

        }




    }
}
