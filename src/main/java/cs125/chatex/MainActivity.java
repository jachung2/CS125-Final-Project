package cs125.chatex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (findViewById(R.id.textView1));

        final Button integral = (findViewById(R.id.IntegralButton));
        integral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                textView.setText("\\\\int");
            }
        });

        final Button clear = (findViewById(R.id.ClearButton));
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                textView.setText("");
            }
        });
    }
}
