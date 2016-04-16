package com.MrRobot.truecolor;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ShareActionProvider;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

	static final int REQUEST_IMAGE_CAPTURE = 1;
	ImageButton capture;
	ImageButton save;
	TextView showColorName;
	TextView showColor;
	ImageView image;
	Bitmap bitmap;
	Bitmap photo;
	MenuItem item;
	ShareActionProvider shareActionProvider;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   
    
        capture = (ImageButton)findViewById(R.id.imageButton1);
        save = (ImageButton)findViewById(R.id.SaveButton);
        showColorName = (TextView)findViewById(R.id.showColorName);
        showColor = (TextView)findViewById(R.id.textView1);
        image = (ImageView)findViewById(R.id.imageView1);
          
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/font.otf");
        showColorName.setTypeface(font);
        
    }

    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//Share Button
		getMenuInflater().inflate(R.menu.main, menu);
		item = menu.findItem(R.id.Share);
		shareActionProvider = (ShareActionProvider)item.getActionProvider();
        setIntent("Hello");

		return  true;
		
	}
	
    /*check if the device has camera*/
    private boolean hasCamera(){
    	
    	return getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY);
    	
    }
    
    public void launchCamera(View view){
    	/*Clear cache before action */
    	image.invalidate();
    	image.setImageDrawable(null);
    	image.refreshDrawableState();
    	image.destroyDrawingCache();
    	bitmap = null;
    	
    	Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    	startActivityForResult(intent, REQUEST_IMAGE_CAPTURE);
    	
    }
    
    
    
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

		super.onActivityResult(requestCode, resultCode, data);
		
		bitmap = null;
		
		if(requestCode == REQUEST_IMAGE_CAPTURE){
			Bundle extras = data.getExtras();
			photo = (Bitmap)extras.get("data");
			image.setImageBitmap(photo);
			
		}
		
	}

	private void setIntent(String text){
		//Post from share button
		Intent intent = new Intent(Intent.ACTION_SEND);
		intent.setType("text/plain");
		intent.putExtra(Intent.EXTRA_TEXT, text);
		shareActionProvider.setShareIntent(intent);
	}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        
    	switch(item.getItemId()){
    	
    	case R.id.About:
    		Toast.makeText(getApplicationContext(), "About", Toast.LENGTH_SHORT).show();
    		String message  = "App name: True Color \nCreated By: Mr.Robot \nHackathon Serres 2016 TEICM ";
			AlertDialog.Builder ABuilder =  new AlertDialog.Builder(MainActivity.this);
			ABuilder.setMessage(message)
					.setCancelable(false)
				    .setPositiveButton("OK",new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							
							dialog.cancel();
							
							
						}
					});
			AlertDialog alert = ABuilder.create();
			alert.setTitle("About");
			alert.show();
    		break;
    	case R.id.Help:
    		Toast.makeText(getApplicationContext(), "Help", Toast.LENGTH_SHORT).show();
    		String helpMessage= "option 1: Capture image and tap the screen to get the color" +
    				"\noption 2: load picture from file" +
    				"\noption 3: Share the app";
    		AlertDialog.Builder BBuilder =  new AlertDialog.Builder(MainActivity.this);
			BBuilder.setMessage(helpMessage)
					.setCancelable(false)
				    .setPositiveButton("OK",new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							
							dialog.cancel();
							
							
						}
					});
    		break;
    	case R.id.Save:
    		Toast.makeText(getApplicationContext(), "Save", Toast.LENGTH_SHORT).show();
    		break;
    		
    	}
        
        return super.onOptionsItemSelected(item);
    }
}
