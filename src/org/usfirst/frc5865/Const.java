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
	public static final double AUTO_MAX_SPEED = 0.4;
	// Temps pour avancer jusqu'a la fondation a partir du depar
	public static final double AUTO_TIME_START_2_FONDATION = 2.5;
	// Temps pour faire une rotation de 90 degres
	public static final double AUTO_TIME_CENTRE_ROTATION = 1.25;
	// Delai entre chacune des etapes
	public static final double AUTO_TIME_DELAI = 0.5;
	
	// Temps pour reculer apres avoir deposer la fleche sur la fondation (devrait etre la 
	// moitier du temps necessaire pour se rendre a la fondation
	public static final double AUTO_TIME_FONDATION_2_CENTRE = AUTO_TIME_START_2_FONDATION / 2;
	// Temps pour se rendre au centre du terrain
	public static final double AUTO_TIME_CENTRE_2_POINT_FINAL = AUTO_TIME_FONDATION_2_CENTRE;
}
