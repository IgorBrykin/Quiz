package space.igorbanza.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class GameLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button button_back = (Button)findViewById(R.id.button_back); // искать View по индификатору
        button_back.setOnClickListener(new View.OnClickListener() {     // установка слушителя на щелчек и выполняет команду
            @Override
            public void onClick(View v) {
                    try {
                        Intent intent = new Intent(GameLevels.this, MainActivity.class);  // намериние перейти ->
                        startActivity(intent);finish(); // открыть -> и сразу же закрыть

                    } catch (Exception e) {

                    }
            }
        });
    }
}
