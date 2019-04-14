package js.springexamples.jspetclinic.repositories;

import js.springexamples.jspetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
