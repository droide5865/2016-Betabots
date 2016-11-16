package org.usfirst.frc5865.joysticks;

//import com.sun.squawk.util.MathUtils;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Interfaces with an Xbox 360 controller, allowing the user to control the
 * robot. It accesses all of the buttons and throttles on this controller.
 *
 * This class relies on the Joystick class to interface with the Drivers
 * Station, receiving input from the controller.
 *
 * @param port	The joystick's port
 */
public class Xbox360 extends Joystick {
	// TODO: Utiliser la classe suivante a la place???
	// 		 https://github.com/owatonnarobotics/XboxController/blob/master/XboxController.java
	

    //Axes
    public static final int LEFT_XAXIS = 0;
    public static final int LEFT_YAXIS = 1;
    public static final int LEFT_TRIGGER = 2;
    public static final int RIGHT_TRIGGER = 3;
    public static final int RIGHT_XAXIS = 4;
    public static final int RIGHT_YAXIS = 5;
    
    //Buttons
    public static final int ABUTTON = 1;
    public static final int BBUTTON = 2;
    public static final int XBUTTON = 3;
    public static final int YBUTTON = 4;
    public static final int LEFT_BUMPER = 5;
    public static final int RIGHT_BUMPER = 6;
    public static final int BACK_BUTTON = 7;
    public static final int START_BUTTON = 8;

    /**
     * Constructor creates an object to interface with an Xbox 360 controller
     *
     * @param	port	The port on the drivers station that the controller is
     * connected to
     * @return
     */
    public Xbox360(int port) {
        super(port);
    }
    
    //////////////// Raw Button Methods for Command/Subsystem Interface
    /**
     * Get the buttons of the controller, to be used by other functions.
     *
     * Use the public static variables to access to needed value (ex. ABUTTON,
     * LEFT_BUMBER, BACK_BUTTON, etc.)
     *
     * @param button The button to get the value of. Range 1-10.
     * @return The state of the button.
     */
    public boolean GetRawButton(int button) {
        return (super.getRawButton(button));
    }

    /**
     * Get the raw axes of the controller, to be used by other functions.
     *
     * Use the public static variables to access to needed value (ex. LEFT_XAXIS,
     * RIGHT_TRIGGER, etc.)
     *
     * @param axis The axis to get the value of. Range 1-6.
     * @return The value of the axis from -1 to 1.
     */
    public float GetRawAxis(int axis) {
        return (float) (super.getRawAxis(axis));
    }

    /**
     * Normalize outputs to be between -1 and 1.
     *
     * @param num The value to normalize.
     * @return The normalized value.
     */
    public double Limit(double num) {
        if (num > 1) {
            num = 1;
        } else if (num < -1) {
            num = -1;
        }
        return num;
    }

    /**
     * Get the value of X of the left joystick. The right side of the axis is
     * positive.
     *
     * @param
     * @return The value of the axis from -1 to 1.
     */
    public double GetLeftX() {
        return (GetRawAxis(LEFT_XAXIS));
    }

    /**
     * Get the value of Y of the left joystick. The upward part of the axis is
     * positive.
     *
     * @param
     * @return The value of the axis from -1 to 1.
     */
    public double GetLeftY() {
        return (-1 * GetRawAxis(LEFT_YAXIS));
        //Multiply output by -1 because GetAxis() returns the axis backwards.
    }

    /**
     * Get the value of X of the right joystick. The right side of the axis is
     * positive.
     *
     * @param
     * @return The value of the axis from -1 to 1.
     */
    public double GetRightX() {
        return (GetRawAxis(RIGHT_XAXIS));
    }

    /**
     * Get the value of Y of the right joystick. The upward part of the axis is
     * positive.
     *
     * @return The value of the axis from -1 to 1.
     */
    public double GetRightY() {
        return (-1 * GetRawAxis(RIGHT_YAXIS));
    }

    /**
     * Get the value corresponding to the triggers. The left stick adds to it,
     * the right stick subtracts. Range -1 to 1.
     *
     * @param
     * @return The value corresponding to the triggers.
     */
    public double GetTriggers() {
        return (GetRightTrigger() - GetLeftTrigger());
    }
    
    public double GetLeftTrigger() {
    	return (GetRawAxis(LEFT_TRIGGER));
    }
    
    public double GetRightTrigger() {
    	return (GetRawAxis(RIGHT_TRIGGER));
    }

    /**
     * Get the current state of the A button.
     *
     * @param
     * @return The current state of the button
     */
    public boolean GetAValue() {
        return (GetRawButton(ABUTTON));
    }

    /**
     * Get the current state of the B button.
     *
     * @param
     * @return The current state of the button
     */
    public boolean GetBValue() {
        return (GetRawButton(BBUTTON));
    }

    /**
     * Get the current state of the X button.
     *
     * @param
     * @return The current state of the button
     */
    public boolean GetXValue() {
        return (GetRawButton(XBUTTON));
    }

    /**
     * Get the current state of the Y button.
     *
     * @param
     * @return The current state of the button
     */
    public boolean GetYValue() {
        return (GetRawButton(YBUTTON));
    }

    /**
     * Get the current state of the Left Bumper.
     *
     * @param
     * @return The current state of the button
     */
    public boolean GetLeftBumperValue() {
        return (GetRawButton(LEFT_BUMPER));
    }

    /**
     * Get the current state of the Right Bumper.
     *
     * @param
     * @return The current state of the button
     */
    public boolean GetRightBumperValue() {
        return (GetRawButton(RIGHT_BUMPER));
    }

    /**
     * Get the current state of the Back button.
     *
     * @param
     * @return The current state of the button
     */
    public boolean GetBackValue() {
        return (GetRawButton(BACK_BUTTON));
    }

    /**
     * Get the current state of the Start button.
     *
     * @param
     * @return The current state of the button
     */
    public boolean GetStartValue() {
        return (GetRawButton(START_BUTTON));
    }

    ////////////////Get Raw Button Methods to be used by Command/Subsystem Interface
    // TODO : Revoir les fonctions ci-dessous. Ne devrait probablement pas retourner 
    // 		  une nouvelle instance a chaque appel... Il faudrait probablement ajouter
    //	      des variables membres pour conserver les JoystickButton associes a chaque
    //		  bouton.
    /**
     * Get A Button
     *
     * @param
     * @return
     * @return A Button
     */
    public JoystickButton GetAButton() {
        return (new JoystickButton(this, ABUTTON));
    }

    /**
     * Get B Button
     *
     * @param
     * @return
     * @return B Button
     */
    public JoystickButton GetBButton() {
        return (new JoystickButton(this, BBUTTON));
    }

    /**
     * Get X Button
     *
     * @param
     * @return X Button
     */
    public JoystickButton GetXButton() {
        return (new JoystickButton(this, XBUTTON));
    }

    /**
     * Get Y Button
     *
     * @param
     * @return Y Button
     */
    public JoystickButton GetYButton() {
        return (new JoystickButton(this, YBUTTON));
    }

    /**
     * Get Back Button
     *
     * @param
     * @return Back Button
     */
    public JoystickButton GetBackButton() {
        return (new JoystickButton(this, BACK_BUTTON));
    }

    /**
     * Get Start Button
     *
     * @param
     * @return Start Button
     */
    public JoystickButton GetStartButton() {
        return (new JoystickButton(this, START_BUTTON));
    }

    /**
     * Get Left Bumper
     *
     * @param
     * @return Left Bumper
     */
    public JoystickButton GetLeftBumper() {
        return (new JoystickButton(this, LEFT_BUMPER));
    }

    /**
     * Get Right Bumper
     *
     * @param
     * @return Right Bumper
     */
    public JoystickButton GetRightBumper() {
        return (new JoystickButton(this, RIGHT_BUMPER));
    }


}
