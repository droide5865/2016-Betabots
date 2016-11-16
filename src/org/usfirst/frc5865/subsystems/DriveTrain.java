// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5865.subsystems;

import org.usfirst.frc5865.RobotMap;
import org.usfirst.frc5865.commands.*;
import edu.wpi.first.wpilibj.RobotDrive;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {

    private final RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {

        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveCommand());
    }
    
    // This function determines whether tank drive is enabled and will
    // consequently take joystick input from one or two motors.
    public void takeJoystickInput(double yspeed, double xspeed) {	
    	robotDrive.arcadeDrive(yspeed, xspeed, true /*SquareInput*/);
    }
    
    public void stop() {
    	robotDrive.drive(0, 0);
    }
    
    
}

