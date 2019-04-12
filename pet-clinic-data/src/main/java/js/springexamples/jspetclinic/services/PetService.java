package js.springexamples.jspetclinic.services;

import js.springexamples.jspetclinic.model.Pet;

import java.util.Set;

public interface PetService {


    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
