package org.usfirst.frc5865.commands;

import org.usfirst.frc5865.Robot;
import org.usfirst.frc5865.RobotMap;
import org.usfirst.frc5865.subsystems.Pince.EtatPince;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;

public class ToggleOuverture extends Command {
	
	private EtatPince etat;
	
	public ToggleOuverture() {
		// TODO Auto-generated constructor stub
		etat = EtatPince.pOuvert;
	}
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
	
		if (etat == EtatPince.pOuvert) {
			Robot.pince.fermer();
			etat = EtatPince.pFermee;
		}		
		else {
			Robot.pince.ouvrir();
			etat = EtatPince.pOuvert;
		}
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
