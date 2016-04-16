package com.MrRobot.truecolor;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

	ImageButton capture;
	ImageButton save;
	TextView showColorName;
	TextView showColor;
	ImageView image;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   
    
        //capture = (ImageButton)
    
    
    
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        
    	switch(item.getItemId()){
    	
    	case R.id.About:
    		Toast.makeText(getApplicationContext(), "About", Toast.LENGTH_SHORT).show();
    		break;
    	case R.id.Help:
    		Toast.makeText(getApplicationContext(), "Help", Toast.LENGTH_SHORT).show();
    		break;
    	case R.id.Save:
    		Toast.makeText(getApplicationContext(), "Save", Toast.LENGTH_SHORT).show();
    		break;
    	case R.id.Share:
    		Toast.makeText(getApplicationContext(), "Share Everywhere", Toast.LENGTH_SHORT).show();
    		break;
    		
    	}
        
        return super.onOptionsItemSelected(item);
    }
}
