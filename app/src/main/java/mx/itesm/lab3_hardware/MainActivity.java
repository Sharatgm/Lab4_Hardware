package mx.itesm.lab3_hardware;

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

        Button button_vib = (Button)findViewById(R.id.btn_vib);
        Button button_prox = (Button)findViewById(R.id.btn_prox);
        Button button_sms = (Button)findViewById(R.id.btn_sms);

        button_vib.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Vibration.class);
                startActivity(intent);
            }

        });

        button_prox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Proximity.class);
                startActivity(intent);
                // --
            }
        });

        button_sms.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sms.class);
                startActivity(intent);
                // --
            }
        });
    }
}
