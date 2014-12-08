package de.abas.training.java.interfaces.userdefined.easy;

import java.util.Date;

/**
 * User defined interface to for service.
 *
 * @author abas Software AG
 *
 */
public interface Service {
	/**
	 * Method stub to get the service appointment.
	 *
	 * @return The service appointment.
	 */
	abstract Date getServiceAppointment();

	/**
	 * Method stub to set the service appointment.
	 *
	 * @param serviceAppointment The service appointment as Date object.
	 */
	abstract void setServiceAppointment(Date serviceAppointment);
}
