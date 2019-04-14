package js.springexamples.jspetclinic.repositories;

import js.springexamples.jspetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
