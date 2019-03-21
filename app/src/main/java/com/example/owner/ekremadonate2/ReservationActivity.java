package com.example.owner.ekremadonate2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class ReservationActivity extends AppCompatActivity {
    private EditText etaddress;
    private Button btndate2;
    private Button btntime2;
    private Button btnsave10;
    private CheckBox cbready;
    private CheckBox cbnotready;
    private EditText etdatepicker;
    private EditText ettime2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_reservation );

        etaddress = findViewById( R.id.etaddress );
        etdatepicker = findViewById( R.id.etdatepicker );
        ettime2 = findViewById( R.id.ettime2 );
        btndate2 = findViewById( R.id.btndate2 );
        btntime2 = findViewById( R.id.btntime2 );
        btnsave10 = findViewById( R.id.btnsave10 );

    }
}
