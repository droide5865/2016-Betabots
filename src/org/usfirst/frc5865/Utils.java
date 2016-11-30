package org.usfirst.frc5865;

public class Utils {

	public static double Limit (double num) {
		return Limit(num, 1, -1);
	}
    public static double Limit(double num, double max, double min) {
        if (max < min)
        	throw new IllegalArgumentException("Le minimum doit etre plus petit que le maximum");
    	
    	if (num > max)
    		num = max;
        
        if (num < min)
            num = min;
        
        return num;
    }
}
