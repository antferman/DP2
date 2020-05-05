package org.springframework.samples.petclinic.repository;





import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Appointment;



public interface AppointmentRepository {

	void save(Appointment appointment);

	Appointment findAppById(int appointementId);

	List<Appointment> findAll() throws DataAccessException;

}
