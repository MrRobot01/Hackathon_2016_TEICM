package com.MrRobot.truecolor;

import android.graphics.Color;

public class Colors {

	String color;
	
	public Colors(){
		
		
		
	}
	
	public String getColor(int r, int g, int b, float[] hsv){
		
		Color.RGBToHSV(r, g, b, hsv);
		
		
		/*if(hsv[2] < 0.1){
			return "black";		
	    }else if(hsv[2] > 0.9){
			return "white";	
	    }else if(hsv[1]>=0.15 && hsv[1]<=0.25){
			return "gray";
	    }else if(hsv[0]>=0 && hsv[0]<=11 ){
			return "red";
		}else if(hsv[0]>=12 && hsv[0]<=20 ){
			return "Dark Orange";
		}else if( hsv[0]>=21 && hsv[0]<=32 ){
			return "Orange";
		}else if( hsv[0]>=33 && hsv[0]<=48 ){
			return "Orange-Yellow (Mustard)";
		}else if( hsv[0]>=49 && hsv[0]<=65 ){
			return "Yellow";
		}else if( hsv[0]>=66 && hsv[0]<=72 ){
			return "Yellow-Green (Olive)";
		}else if( hsv[0]>=73 && hsv[0]<=130 ){
			return "Lime";
		}else if( hsv[0]>=131 && hsv[0]<=153)
			return "Faded Green";
		else if( hsv[0]>=154 && hsv[0]<=184){
			return "Turquoise";
		}else if( hsv[0]>=185 && hsv[0]<=202){
			return "Light Blue";
		}else if( hsv[0]>=203 && hsv[0]<=212){
			return "Blue";
		}else if( hsv[0]>=213 && hsv[0]<=264){
			return "Dark Blue";
		}else if( hsv[0]>=265 && hsv[0]<=277){
			return "Violet";
		}else if( hsv[0]>=278 && hsv[0]<=289){
			return "Purple";
		}else if( hsv[0]>=290 && hsv[0]<=297){
			return "Lilac";
		}else if(hsv[0]>=298 && hsv[0]<=319){
			return "Fuchsia";
		}else if( hsv[0]>=320 && hsv[0]<=337){
			return "Magenta";
		}else if( hsv[0]>=338 && hsv[0]<=343){
			return "Watermelon";
		}else if(hsv[0]>=345 && hsv[0]<=359){
			return "Red";
		}
	*/		
		
	 return "whateva";
		
	}
	
	
}
