package no.allegiance.tempcontacts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TempContacts extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.tempcontacts);

        TextView textview = new TextView(this);
        textview.setText("This is the TempContacts tab");
        setContentView(textview);

    }

}
