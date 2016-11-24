package org.usfirst.frc5865.commands;

import org.usfirst.frc5865.Robot;
import org.usfirst.frc5865.subsystems.Pince.EtatPince;

import edu.wpi.first.wpilibj.command.Command;

public class SetOuverturePince extends Command {
	
	public static enum OuvertureCmdMode {
		mToggle,
		mOuvrir,
		mFermer
	}
	
	private OuvertureCmdMode m_mode;	
	private EtatPince etat;
	
	public SetOuverturePince() {
		this(OuvertureCmdMode.mToggle);
	}
	
	public SetOuverturePince(OuvertureCmdMode mode) {
		etat = EtatPince.pOuvert;
		m_mode = mode;
	}
	
	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		switch (m_mode) {
			case mToggle :
				if (etat == EtatPince.pOuvert) {
					Robot.pince.fermer();
					etat = EtatPince.pFermee;
				}		
				else {
					Robot.pince.ouvrir();
					etat = EtatPince.pOuvert;
				}
				break;
				
			case mOuvrir :
				Robot.pince.ouvrir();
				etat = EtatPince.pOuvert;
				break;
				
			case mFermer :
				Robot.pince.fermer();
				etat = EtatPince.pFermee;
				break;				
		}		
	}

	@Override
	protected boolean isFinished() {
		return true;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
	}

}
