package de.abas.training.java.interfaces.userdefined;

/**
 * User defined interface for a vehicle's functions.
 *
 * @author abas Software AG
 *
 */
public interface VehicleFunctions {
	/**
	 * Method for accelerating.
	 *
	 * @param increment Value by which the speed is incremented due to
	 * accelerating.
	 */
	abstract public void accelerate(int increment);

	/**
	 * Method stub for breaking.
	 *
	 * @param decrement Value by which the speed is decremented due to breaking.
	 */
	abstract public void applyBreak(int decrement);

	/**
	 * Method stub for starting the engine.
	 */
	abstract public void startEngine();

	/**
	 * Method stub for stopping the engine.
	 */
	abstract public void stopEngine();
}
