package js.springexamples.jspetclinic.repositories;

import js.springexamples.jspetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
