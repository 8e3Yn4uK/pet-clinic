package org.oko.petclinic.bootstrap;

import org.oko.petclinic.model.Owner;
import org.oko.petclinic.model.Vet;
import org.oko.petclinic.services.OwnerService;
import org.oko.petclinic.services.VetService;
import org.oko.petclinic.services.map.OwnerMapService;
import org.oko.petclinic.services.map.VetMapService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by 8e3Yn4uK on 12.05.2020.
 */

@Component
public class DataInitializer implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(DataInitializer.class);

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer() {
        this.ownerService = new OwnerMapService();
        this.vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jack");
        owner1.setLastName("Sparrow");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("John");
        owner1.setLastName("Doe");
        ownerService.save(owner2);

        log.info("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Ivan");
        vet1.setLastName("Dorn");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Phil");
        vet2.setLastName("Kirkorov");
        vetService.save(vet2);

        log.info("Loaded vets...");



    }
}
