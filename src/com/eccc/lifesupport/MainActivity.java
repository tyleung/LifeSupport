package com.eccc.lifesupport;

import android.os.Bundle;
import android.app.Activity;
//import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TabHost tabHost=(TabHost)findViewById(R.id.tabHost);
		tabHost.setup();
		
		TabSpec spec1=tabHost.newTabSpec("Tab 1");
		spec1.setContent(R.id.tab1);
		spec1.setIndicator("LS");
		
		TabSpec spec2=tabHost.newTabSpec("Tab 2");
		spec2.setIndicator("Events");
		spec2.setContent(R.id.tab2);

		TabSpec spec3=tabHost.newTabSpec("Tab 3");
		spec3.setIndicator("Contact");
		spec3.setContent(R.id.tab3);
		
        TabSpec spec4=tabHost.newTabSpec("Tab 4");
        spec4.setIndicator("Prayer");
        spec4.setContent(R.id.tab4);
        
        TabSpec spec5=tabHost.newTabSpec("Tab 5");
        spec5.setIndicator("Verse");
        spec5.setContent(R.id.tab5);

        tabHost.addTab(spec1);
        tabHost.addTab(spec2);
        tabHost.addTab(spec3);
        tabHost.addTab(spec4);
        tabHost.addTab(spec5);
	}

/*	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}*/

}
