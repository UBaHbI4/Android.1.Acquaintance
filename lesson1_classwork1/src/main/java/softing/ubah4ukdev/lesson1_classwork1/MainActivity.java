package softing.ubah4ukdev.lesson1_classwork1;
//Классная работа №1.

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText numberOne = findViewById(R.id.number_one);
        EditText numberTwo = findViewById(R.id.number_two);
        Button btnCompare = findViewById(R.id.btn_compare);
        TextView result = findViewById(R.id.result);

        btnCompare.setOnClickListener(v -> {
            try {
                Integer valueOne = Integer.valueOf(numberOne.getText().toString());
                Integer valueTwo = Integer.valueOf(numberTwo.getText().toString());

                if (valueOne.equals(valueTwo)) {
                    result.setText("Equal");
                } else {
                    result.setText("Not equal");
                }
            } catch (NumberFormatException e) {
                Log.d("ClassWork1", "Incorrect input");
                result.setText("Please enter a number");
            }
        });
    }
}