package de.abas.training.java.interfaces.userdefined;

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
	abstract public Date getServiceAppointment();

	/**
	 * Method stub to get the servicing interval.
	 *
	 * @return The servicing interval.
	 */
	abstract public int getServiceInterval();

	/**
	 * Method stub to set the service appointment.
	 *
	 * @param serviceAppointment The service appointment as Date object.
	 */
	abstract public void setServiceAppointment(Date serviceAppointment);

	/**
	 * Method stub to set the servicing interval.
	 *
	 * @param serviceIntervalDays Servicing interval in days.
	 */
	abstract public void setServiceInterval(int serviceIntervalDays);
}
