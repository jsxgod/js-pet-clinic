package js.springexamples.jspetclinic.repositories;

import js.springexamples.jspetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
