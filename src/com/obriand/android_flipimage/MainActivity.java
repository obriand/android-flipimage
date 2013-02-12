package com.obriand.android_flipimage;

import android.os.Bundle;

// http://code.google.com/p/android-3d-flip-view-transition/

import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ViewFlipper;

public class MainActivity extends Activity {

	private ViewFlipper mViewFlipper;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mViewFlipper=(ViewFlipper) findViewById(R.id.imageflipper); 
		
		mViewFlipper.setInAnimation(this, R.anim.grow_from_middle);
		mViewFlipper.setOutAnimation(this, R.anim.shrink_to_middle); 
		
		mViewFlipper.setOnTouchListener( new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent touchevent) {
                switch (touchevent.getAction()) {
	                case MotionEvent.ACTION_DOWN: {
	                	mViewFlipper.showNext();
	                    break;
	                }
                }
				return false;
            }
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
