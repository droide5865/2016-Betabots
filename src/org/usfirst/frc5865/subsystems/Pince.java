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
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Pince extends Subsystem {
	
	private final CANTalon actuatorDrive = RobotMap.pinceCANTalonDrive;
	private final DoubleSolenoid pinceSolenoid = RobotMap.pinceDoubleSolenoid;
	
	public static enum EtatPince {
		pOuvert,
		pFermee,
		pInconnu
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void monter(double valeur) {
    	actuatorDrive.set(valeur);	
    }
    
    public void descendre(double valeur) {
    	actuatorDrive.set(-valeur);
    }
    
    public void arreter() {
    	actuatorDrive.set(0.0);	
    }
    
    public void fermer() {
    	pinceSolenoid.set(Value.kForward);
    }
    
    public void ouvrir() {
    	pinceSolenoid.set(Value.kReverse);
    }
    
    public EtatPince getEtatOuverture() {
    	switch (pinceSolenoid.get())
    	{
    	case kForward:
    		return EtatPince.pOuvert;
    	case kReverse:
    		return EtatPince.pFermee;
		default:
			return EtatPince.pInconnu;    	
    	}
    }
}

