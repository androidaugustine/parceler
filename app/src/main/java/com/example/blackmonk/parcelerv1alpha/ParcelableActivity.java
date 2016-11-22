package com.example.blackmonk.parcelerv1alpha;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.blackmonk.parcelerv1alpha.parcelable.PersonTest;
import com.example.blackmonk.parcelerv1alpha.serializable.PersonSerial;

import org.parceler.Parcels;

public class ParcelableActivity extends AppCompatActivity{

    private static final String TAG = "ParcelableActivityTAG_";
    TextView firstName;
    TextView lastName;
    TextView age;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);

        firstName = (TextView)findViewById(R.id.first_name);
        lastName = (TextView)findViewById(R.id.last_name);
        age = (TextView)findViewById(R.id.age);

        Bundle parcel = getIntent().getExtras();

        PersonTest pt = Parcels.unwrap(parcel.getBundle("Parcel").getParcelable("Parcel"));

        //PersonTest pt = Parcels.unwrap(getIntent().getExtras().getParcelable("Parcel"));
        //Object pt = Parcels.unwrap(parcel.getParcelable("Parcel"));

        if (pt == null) {
            Log.d(TAG, "onCreate: " + "NULL");
            return;
        } else {
            Log.d(TAG, "onCreate: " + "NULLPLUS");
        }

        firstName.setText(pt.getFirstName().toString());
        lastName.setText(pt.getLastName().toString());
        age.setText(new Integer(pt.getAge()).toString());

        //firstName.setText("Will");
        //lastName.setText("Zimmerman");
        //age.setText("36");
    }


}
