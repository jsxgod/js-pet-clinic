package js.springexamples.jspetclinic.services;

import js.springexamples.jspetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
