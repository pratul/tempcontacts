package no.allegiance.tempcontacts;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class TempContactsTabs extends TabActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tempcontactstabs);

        Resources res = getResources();
        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        intent = new Intent().setClass(this, TempContacts.class);

        spec = tabHost.newTabSpec("artists").setIndicator("Temporary", res.getDrawable(android.R.drawable.ic_menu_preferences)).setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, AllContacts.class);
        spec = tabHost.newTabSpec("albums").setIndicator("All", res.getDrawable(android.R.drawable.ic_menu_preferences)).setContent(intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(0);
    }
}
