package com.example.blackmonk.parcelerv1alpha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.blackmonk.parcelerv1alpha.serializable.PersonSerial;

public class SerializationActivity extends AppCompatActivity {

    TextView firstName;
    TextView lastName;
    TextView age;

    private String TAG = "SerializationTAG_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serialization);

        firstName = (TextView)findViewById(R.id.first_name);
        lastName = (TextView)findViewById(R.id.last_name);
        age = (TextView)findViewById(R.id.age);

        Bundle serial = getIntent().getExtras();

        if(serial.get("Serial") == null){
            Log.d(TAG, "onCreate: SORRY");
        }

        PersonSerial ps = (PersonSerial) serial.get("Serial");

        Log.e(TAG, "onCreate: PersonSerial " + ps.getFirstName().toString() );

        firstName.setText(ps.getFirstName().toString());
        lastName.setText(ps.getLastName().toString());
        age.setText(new Integer(ps.getAge()).toString());


    }
}
