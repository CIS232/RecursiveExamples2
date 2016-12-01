package edu.cis232;

import javax.swing.*;
import java.awt.*;

public class ConcentricCircles extends JApplet{
	
	public void init(){
		setBackground(Color.WHITE);
	}
	
	public void paint(Graphics g){
		drawCircles(g, 10, 5, 300);
	}
	
	private void drawCircles(Graphics g, int n, int topXY, int size){
		//Base Case
		if(n <= 0){
			return;
		}
		
		g.drawOval(topXY, topXY, size, size);
		drawCircles(g, n - 1, topXY + 15, size - 30);
	}
}