package org.usfirst.frc5865.commands;

import org.usfirst.frc5865.Const;
import org.usfirst.frc5865.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoDrive extends Command {
	
	public static enum AutoDriveCmdMode {
		mAvancer,
		mReculer,
		mTournerDroite,
		mTournerGauche,
		mArret
	}
	
	private AutoDriveCmdMode m_mode;
	private double m_startTime;
	private double m_timeout;
	
    public AutoDrive(AutoDriveCmdMode mode, double seconds) {
        // Use requires() here to declare subsystem dependencies
         requires(Robot.driveTrain);
         m_timeout = seconds;
         m_mode = mode;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	m_startTime = Timer.getFPGATimestamp();    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() { 
    	double m_speed = Const.AUTO_MAX_SPEED;
    	
    	switch (m_mode) {
    		case mAvancer:    			
    			Robot.driveTrain.drive(m_speed, 0);
    			break;
    		case mReculer:
    			Robot.driveTrain.drive(-m_speed, 0);
    			break;
    		case mTournerDroite:
    			Robot.driveTrain.drive(m_speed, 1);
    			break;
    		case mTournerGauche:
    			Robot.driveTrain.drive(m_speed, -1);
    			break;
    		case mArret:
    			Robot.driveTrain.stop();
			default:
				break;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return (Timer.getFPGATimestamp() - m_startTime > m_timeout);
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.driveTrain.stop();
    }
}
