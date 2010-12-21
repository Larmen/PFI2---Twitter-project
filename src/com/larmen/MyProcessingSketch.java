package com.larmen;
import mah.k3.pfi2.twitterstream.Main;
import processing.core.*;

public class MyProcessingSketch extends PApplet {
	
	private double plat;
	private double plongt;
	
	
	  public void setup() {
	    size(360,180);
	    background(0);
	  }

	  public void draw() {
	    stroke(255);
	    fill(255);
	    ellipseMode(CENTER);
	    ellipse((float)plongt+180,(float)plat+90, 5, 5);
	  
	  }
public void setPos(double lat, double longt){
	plat = lat;
	plongt = longt;
	
}
}


