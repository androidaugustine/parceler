package com.example.blackmonk.parcelerv1alpha;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.blackmonk.parcelerv1alpha.parcelable.PersonTest;
import com.example.blackmonk.parcelerv1alpha.serializable.PersonSerial;

import org.parceler.Parcels;

public class MainActivity extends AppCompatActivity {

    private Button serial;
    private Button parcel;

    private TextView firstNameSerial;
    private TextView lastNameSerial;
    private TextView ageSerial;

    private TextView firstNameParceble;
    private TextView lastNameParcelable;
    private TextView ageParcelable;

    Bundle serialBundle = new Bundle();
    Bundle parcelableBundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serial = (Button)findViewById(R.id.serializable_btn);
        parcel = (Button)findViewById(R.id.parcelable_btn);
    }

    public void runSerializable(View view){


        Intent intent = new Intent(this, SerializationActivity.class);
        intent.putExtra("Serial", new PersonSerial("James", "Bond", 50));
        startActivity(intent);


    }

    public void runParcelable(View view){

        Parcelable wrapped = Parcels.wrap(new PersonTest("Will", "Zimmerman", 36));
        parcelableBundle.putParcelable("Parcel", wrapped);

        Intent intent = new Intent(this, ParcelableActivity.class);
        intent.putExtra("Serial", new PersonSerial("James", "Bond", 50));
        intent.putExtra("Parcel", parcelableBundle);
        startActivity(intent);

    }
}
