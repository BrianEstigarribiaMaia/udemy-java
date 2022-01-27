package se04_EstruturaSequencial;

/*
 *  area = (b+B)  
 *      ----------- x h
 *           2
 */
public class Trapezio {

	public static void main(String[] args) {
		
		double b = 6, B = 8, h = 5, area;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
	}
}
