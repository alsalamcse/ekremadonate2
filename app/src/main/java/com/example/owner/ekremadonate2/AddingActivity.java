package com.example.owner.ekremadonate2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class AddingActivity extends AppCompatActivity {
    private EditText etname4,eting4,etprice4;
    private ImageView imgfood4;
    private Button btnsave4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding);

        etname4 = findViewById( R.id.etname4 );
        eting4 = findViewById( R.id.eting4 );
        etprice4 = findViewById( R.id.etprice4 );
        imgfood4 = findViewById( R.id.imgfood4 );
        btnsave4 = findViewById( R.id.btnsave4 );

    }
}
