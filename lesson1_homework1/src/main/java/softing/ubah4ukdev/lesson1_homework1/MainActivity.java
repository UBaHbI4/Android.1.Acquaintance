package softing.ubah4ukdev.lesson1_homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/*
1. Создать проект со следующими пользовательскими элементами: TextView, EditText,
    Button, Switch, CheckBox, ToggleButton. Для работы использовать LinearLayout.
    Использовать различные шрифты, цвета, размеры, прочие атрибуты.
2. Создать ещё один макет (если не получается, то проект) с несколькими EditText,
    где использовать атрибут inputType: text, textPersonName, phone, number, textPassword,
    textEmailAddress и другие значения.
3. Добавить в проект элемент CalendarView.
4. * Разобраться, что такое параметр ems.

*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("1-е задание");

        Button btnSecond = findViewById(R.id.btnSecond);
        btnSecond.setOnClickListener(v -> {
            setContentView(R.layout.activity_slave);
            setTitle("2, 3, 4-е задания");
        });
    }
}