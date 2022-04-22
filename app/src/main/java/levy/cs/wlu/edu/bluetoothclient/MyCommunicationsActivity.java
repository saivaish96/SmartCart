/*
Simple example of a Bluetooth communications activity

Provides a seek-bar (slider) to send values to the server, and a text widget to display the server's reply

Copyright 2018  Gunnar Bowman, Emily Boyes, Trip Calihan, Simon D. Levy, Shepherd Sims

MIT License
*/


package levy.cs.wlu.edu.bluetoothclient;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class MyCommunicationsActivity extends CommunicationsActivity {

    private String mMessageFromServer = "";

    private ImageButton stop, go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        /*------------------------------------------------------------------------*/

        stop = (ImageButton) findViewById(R.id.stop);
        stop.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                /***Do what you want with the click here***/
                mBluetoothConnection.write((byte)5);
            }
        });

        /*------------------------------------------------------------------------*/

        go = (ImageButton) findViewById(R.id.go);
        go.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                /***Do what you want with the click here***/
                mBluetoothConnection.write((byte)1);
            }
        });



    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
