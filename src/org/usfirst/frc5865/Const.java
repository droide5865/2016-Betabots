package org.usfirst.frc5865;

public class Const {
	
	///// Drive   ///////////////////////////////////////////////////////
	public static final double DRIVE_COMPENSATION = 0;
	public static final double TELEOP_MAX_SPEED = 0.6;
	
	///// Pince    ///////////////////////////////////////////////////////
	public static final double ELEVATOR_UP_MAX_SPEED = 0.75;
	public static final double ELEVATOR_DOWN_MAX_SPEED = 0.5;

	///// Mode auto ///////////////////////////////////////////////////////
	// Vitesse maximal du robot
	public static final String AUTO_MAX_SPEED_ID = "Max speed auto";
	private static final double AUTO_MAX_SPEED = 0.4;
	// Temps pour avancer jusqu'a la fondation a partir du depar
	public static final String AUTO_TIME_START_2_FONDATION_ID = "Temps jusqu'a fondation (sec)";
	private static final double AUTO_TIME_START_2_FONDATION = 2.8;
	// Temps pour faire une rotation de 90 degres
	public static final String AUTO_TIME_CENTRE_ROTATION_ID = "Temps rot 90 degres (sec)";
	private static final double AUTO_TIME_CENTRE_ROTATION = 1.4;
	// Delai entre chacune des etapes
	public static final String AUTO_TIME_DELAI_ID = "Temps delai";
	private static final double AUTO_TIME_DELAI = 0.5;
	
	// Temps pour reculer apres avoir deposer la fleche sur la fondation (devrait etre la 
	// moitier du temps necessaire pour se rendre a la fondation
	public static final String AUTO_TIME_FONDATION_2_CENTRE_ID = "Temps de recul";
	private static final double AUTO_TIME_FONDATION_2_CENTRE = AUTO_TIME_START_2_FONDATION / 2;
	// Temps pour se rendre au centre du terrain
	public static final String AUTO_TIME_CENTRE_2_POINT_FINAL_ID = "Temps jusqu'au centre";
	public static final double AUTO_TIME_CENTRE_2_POINT_FINAL = AUTO_TIME_FONDATION_2_CENTRE;
	
	public static void initSmartDashboard() {
//		SmartDashboard.putNumber(AUTO_MAX_SPEED_ID, AUTO_MAX_SPEED);
//		SmartDashboard.putNumber(AUTO_TIME_START_2_FONDATION_ID, AUTO_TIME_START_2_FONDATION);
//		SmartDashboard.putNumber(AUTO_TIME_CENTRE_ROTATION_ID, AUTO_TIME_CENTRE_ROTATION);
//		SmartDashboard.putNumber(AUTO_TIME_DELAI_ID, AUTO_TIME_DELAI);
//		SmartDashboard.putNumber(AUTO_TIME_FONDATION_2_CENTRE_ID, AUTO_TIME_FONDATION_2_CENTRE);
//		SmartDashboard.putNumber(AUTO_TIME_CENTRE_2_POINT_FINAL_ID, AUTO_TIME_CENTRE_2_POINT_FINAL);
	}
//	
	public static double getValue(String key) {
		switch (key){
			case AUTO_MAX_SPEED_ID:
				return AUTO_MAX_SPEED;
			case AUTO_TIME_START_2_FONDATION_ID:
				return AUTO_TIME_START_2_FONDATION;
			case AUTO_TIME_CENTRE_ROTATION_ID:
				return AUTO_TIME_CENTRE_ROTATION;
			case AUTO_TIME_DELAI_ID:
				return AUTO_TIME_DELAI;
			case AUTO_TIME_FONDATION_2_CENTRE_ID:
				return AUTO_TIME_FONDATION_2_CENTRE;
			case AUTO_TIME_CENTRE_2_POINT_FINAL_ID:
				return AUTO_TIME_CENTRE_2_POINT_FINAL;
			default:
				break;
		}
		return 0;
//		return SmartDashboard.getNumber(key);
	}
}
