package in.raman.raman.trickery;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Guess extends AppCompatActivity {

    private TextView comment,answer;
    private Button retry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);

        retry = (Button) findViewById(R.id.retry);
        comment = (TextView) findViewById(R.id.comment);
        answer = (TextView) findViewById(R.id.answer);

        final String result = getIntent().getStringExtra("result");
        int value = Integer.parseInt(result);

        if(value>100){

            answer.setVisibility(View.INVISIBLE);
            comment.setText("You have a weird brain!");
        }
        else
        {

            if(value==0){

                answer.setVisibility(View.INVISIBLE);
                comment.setText("Zero? Huh!");
            }

            else {

                comment.setText("Your number is :");
                answer.setText(result);

            }
        }


        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Guess.this,question_Activity.class);
                startActivity(i);
                finish();

            }
        });

    }
}
