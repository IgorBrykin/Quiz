package space.igorbanza.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class GameLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels); // строка, которая отвечает за выбор уровня

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); // растягивают во весь экран

        Button button_back = (Button) findViewById(R.id.button_back); // искать View по индификатору -> кнопка назад
        button_back.setOnClickListener(new View.OnClickListener() {     // установка слушителя на щелчек и выполняет команду -> новый слушатель, мы должны вернуться назад по кнопке
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, MainActivity.class);  // намериние перейти -> GameLevels.this в MainActivity.class
                    startActivity(intent); // активность окна - старое закрывается
                    finish();     //   открыть -> и сразу же закрыть

                } catch (Exception e) {

                }
            }
        });

        // Кнопка для перехода на 1 уровень - начало

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(GameLevels.this, Level1.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {
                    // пусто
                }
            }
        });

        // Кнопка для перехода на первый уровень - конец


    }

    // системная кнопка "Назад"  -  начало
    @Override // код системной кнопки назад
    public void onBackPressed() {

        try {
            Intent intent = new Intent(GameLevels.this, MainActivity.class);  // намериние перейти ->
            startActivity(intent);
            finish();     // открыть    ->   и сразу же закрыть

        } catch (Exception e) {

        }
    }
    // Системная кнопка "Назад"  = конец
}
