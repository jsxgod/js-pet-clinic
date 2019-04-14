package js.springexamples.jspetclinic.repositories;

import js.springexamples.jspetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
