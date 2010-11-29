package no.allegiance.tempcontacts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AllContacts extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.allcontacts);

        TextView textview = new TextView(this);
        textview.setText("This is the AllContacts tab");
        setContentView(textview);
        
    }

}
