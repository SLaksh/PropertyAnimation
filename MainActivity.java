package com.example.propertyanim;

import android.os.Bundle;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ImageView wheel = (ImageView)findViewById(R.id.wheel);
		
		AnimatorSet wheelset = (AnimatorSet)AnimatorInflater
				.loadAnimator(this, R.animator.wheel_spin);		
		wheelset.setTarget(wheel);
		wheelset.start();
		
		ImageView sun = (ImageView)findViewById(R.id.sun);
		
		AnimatorSet sunset = (AnimatorSet)AnimatorInflater
				.loadAnimator(this, R.animator.sun_swing);
		sunset.setTarget(sun);
		sunset.start();
		
	}
}
