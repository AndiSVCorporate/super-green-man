package com.hwjzp.suman.view;

import com.hwjzp.suman.imp.setOnGmanMoveListener;

import android.content.Context;
import android.view.View;

public class GmanView extends View{
	setOnGmanMoveListener setGmanMoveListener;
	public GmanView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public void setGmanMoveListener(setOnGmanMoveListener setGmanmoveListener){
		this.setGmanMoveListener=setGmanmoveListener;
	}

}
