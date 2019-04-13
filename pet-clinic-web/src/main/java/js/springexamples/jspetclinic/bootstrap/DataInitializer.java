package js.springexamples.jspetclinic.bootstrap;

import js.springexamples.jspetclinic.model.Owner;
import js.springexamples.jspetclinic.model.Pet;
import js.springexamples.jspetclinic.model.PetType;
import js.springexamples.jspetclinic.model.Vet;
import js.springexamples.jspetclinic.services.OwnerService;
import js.springexamples.jspetclinic.services.PetService;
import js.springexamples.jspetclinic.services.PetTypeService;
import js.springexamples.jspetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final PetService petService;

    public DataInitializer(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, PetService petService){
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Street");
        owner1.setCity("Miami");
        owner1.setTelephone("123321123");
        ownerService.save(owner1);

        Pet pet1 = new Pet();
        pet1.setPetType(savedDogPetType);
        pet1.setOwner(owner1);
        pet1.setBirthDate(LocalDate.now());
        pet1.setName("Owner1's dog");
        owner1.getPets().add(pet1);
        petService.save(pet1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner1.setAddress("321 Street2");
        owner1.setCity("New York");
        owner1.setTelephone("987456341");
        ownerService.save(owner2);

        Pet pet2 = new Pet();
        pet2.setPetType(savedCatPetType);
        pet2.setOwner(owner2);
        pet2.setBirthDate(LocalDate.now());
        pet2.setName("Owner2's cat");
        owner2.getPets().add(pet2);
        petService.save(pet2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
