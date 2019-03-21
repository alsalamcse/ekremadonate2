package com.example.owner.ekremadonate2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class AddingActivity extends AppCompatActivity {
    private EditText etname4,eting4,etprice4;
    private ImageView imgfood4;
    private Button btnsave4;
    private Spinner spinner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding);

        etname4 = findViewById( R.id.etname4 );
        eting4 = findViewById( R.id.eting4 );
        etprice4 = findViewById( R.id.etprice4 );
        imgfood4 = findViewById( R.id.imgfood4 );
        btnsave4 = findViewById( R.id.btnsave4 );

        // Get reference of widgets from XML layout
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // Initializing a String Array
        String[] Categories = new String[]{
                "Sweets",
                "Homemade Food",
                "Cakes",
        };
        Spinner();

//        // Initializing an ArrayAdapter
//        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
//                this,R.layout.spinner_item,Categories
//        );
//        spinnerArrayAdapter.setDropDownViewResource(R.layout.spinner_item);
//        spinner.setAdapter(spinnerArrayAdapter);



    }


    public void Spinner()
    {
        SpinnerAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(0);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view,
                                       int position, long id) {
                String value = (String) spinner.getItemAtPosition(position);
                //Toast.makeText(ScheduleActivity.this, "Month : " + value , Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
//                Toast.makeText(ScheduleActivity.this,"Select Month",Toast.LENGTH_LONG).show();

            }
        });
    }
}


