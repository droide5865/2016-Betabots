package org.usfirst.frc5865;

public class Utils {

	public static double Limit (double num) {
		return Limit(num, 1, -1);
	}
    public static double Limit(double num, double max, double min) {
        if (max < min)
        	throw new IllegalArgumentException("Le minimum doit être plus petit que le maximum");
    	
    	if (num > max) {
            num = 1;
        } else if (num < min) {
            num = -1;
        }
        return num;
    }
}
