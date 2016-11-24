// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5865;

import org.usfirst.frc5865.commands.*;
import org.usfirst.frc5865.commands.SetHauteurPince.HauteurCmdMode;
import org.usfirst.frc5865.joysticks.Xbox360;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.buttons.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public Xbox360 pilote;
    public Xbox360 copilote;
    public JoystickButton boutonMonter;
    public JoystickButton boutonDescendre;
    public JoystickButton boutonToggleOuverture;


    public OI() {
        pilote = new Xbox360(0);
        copilote = new Xbox360(1);
        
        boutonMonter = new JoystickButton(pilote, Xbox360.RIGHT_BUMPER);
        boutonMonter.whileHeld(new SetHauteurPince(HauteurCmdMode.mMonterManuel));
        
        boutonDescendre = new JoystickButton(pilote, Xbox360.LEFT_BUMPER);
        boutonDescendre.whileHeld(new SetHauteurPince(HauteurCmdMode.mDescendreManuel));      
        
        boutonToggleOuverture = new JoystickButton(pilote, Xbox360.ABUTTON);
        boutonToggleOuverture.whenPressed(new SetOuverturePince());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Descendre", new SetHauteurPince(HauteurCmdMode.mDescendreManuel));
        SmartDashboard.putData("Monter", new SetHauteurPince(HauteurCmdMode.mMonterManuel));
        SmartDashboard.putData("DriveCommand", new DriveCommand());
    }

    public Xbox360 getPilote() {
        return pilote;
    }

    public Xbox360 getCopilote() {
        return copilote;
    }

}

