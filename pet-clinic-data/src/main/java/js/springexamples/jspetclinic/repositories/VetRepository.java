package js.springexamples.jspetclinic.repositories;

import js.springexamples.jspetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
