package cs125.chatex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayButton(android.view.View view) {
        TextView textView = (TextView)(findViewById(R.id.textView1));
        textView.setText("\\\\int");

    }
    public void clear(android.view.View view) {
        TextView textView = (TextView)(findViewById(R.id.textView1));
        textView.setText("");
    }
}
