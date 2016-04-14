package practice.application.switchingscreens1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn2 = (Button) findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondScreen = new Intent(MainActivity.this, SecondScreen.class);
                startActivity(secondScreen);
            }
        });

    }

    public void Switch(View view){
        Intent secondScreen = new Intent(MainActivity.this, SecondScreen.class);
        startActivity(secondScreen);
    }
}
