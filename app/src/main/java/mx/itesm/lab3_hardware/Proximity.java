package mx.itesm.lab3_hardware;

import android.content.DialogInterface;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Proximity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximity);

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        final Sensor proximitySensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        final AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("Esta es una alerta del Lab4");
        myAlert.setTitle("Saludo");
        myAlert.setPositiveButton("Enterado", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which){
                dialog.cancel();
            }
        });

        final AlertDialog dialog = myAlert.create();

        if(proximitySensor == null) {
            //no sensor available

        }

        SensorEventListener proximitySensorListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                /*if(sensorEvent.values[0] == 0) {
                    // Near
                    dialog.show();
                } else {
                    // Nothing is nearby

                } */
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {
            }
        };

    }
}
