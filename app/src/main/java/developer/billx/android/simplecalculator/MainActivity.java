package developer.billx.android.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private EditText mEditText1;
    private EditText mEditText2;
    private Button mAddBtn;
    private TextView mAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText1 = findViewById(R.id.textField1);
        mEditText2 = findViewById(R.id.textField2);
        mAddBtn = findViewById(R.id.add);
        mAnswer = findViewById(R.id.answer);

        mAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int input1 = Integer.parseInt(mEditText1.getText().toString());
                int input2 = Integer.parseInt(mEditText2.getText().toString());
                String answer = input1 + input2 + "";
                mAnswer.setText(answer);
            }
        });

    }
}
