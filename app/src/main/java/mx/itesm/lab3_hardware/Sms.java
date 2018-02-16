package mx.itesm.lab3_hardware;

import android.Manifest;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Sms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        ActivityCompat.requestPermissions(this,new String[]{
                Manifest.permission.SEND_SMS},1);
        Button smsButton =(Button)findViewById(R.id.btn_sms);
        smsButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                SmsManager smsManager = SmsManager.getDefault();

                smsManager.sendTextMessage("000000000000", null, "Hola!", null, null);
                Toast.makeText(getApplicationContext(), "Done", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
