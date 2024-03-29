// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5865.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc5865.Const;
import org.usfirst.frc5865.Robot;

/**
 *
 */
public class SetHauteurPince extends Command {
	
	private double vitesse = 0.1;
	private double vitesseMax = 0.5;
	
	
	public static enum HauteurCmdMode {
		mMonterManuel,
		mDescendreManuel,
		mMonterMax,
		mDescendreMax		
	}
	
	private HauteurCmdMode m_mode;
    
    public SetHauteurPince(HauteurCmdMode mode) {
    	requires(Robot.pince);
    	m_mode = mode;
    	
    	switch (m_mode) {
			case mMonterManuel:
				vitesseMax = Const.ELEVATOR_UP_MAX_SPEED;
				break;
			case mDescendreManuel:
				vitesseMax = Const.ELEVATOR_DOWN_MAX_SPEED;
				break;
			case mMonterMax:
				// TODO
			case mDescendreMax:
				// TODO
			default:
				break;
    	}
    }
    
    // Called just before this Command runs the first time
    protected void initialize() {
    }
    
    public void start() {
    	super.start();
//    	vitesse = 0.1;
    }
    
    public void cancel() {
    	Robot.pince.arreter();
    	vitesse = 0.1;
    	super.cancel();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(vitesse< vitesseMax){
    		vitesse = vitesse + 0.01;
    	}
    	switch (m_mode) {
    		case mMonterManuel:
    			Robot.pince.monter(vitesse);
    			break;
    		case mDescendreManuel:
    			Robot.pince.descendre(vitesse);
    			break;
    		case mMonterMax:
    			// TODO
    		case mDescendreMax:
    			// TODO
			default:
				break;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.pince.arreter();
    	vitesse = 0.1;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.pince.arreter();
    	vitesse = 0.1;
    }
}
