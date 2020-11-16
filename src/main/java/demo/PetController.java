package demo;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Arrays;
import java.util.Collection;

@Controller("/pets")
public class PetController {
    private final PetStorage petStorage;

    public PetController(PetStorage petStorage) {
        this.petStorage = petStorage;
        petStorage.save(new Pet("Dino", 10));
        petStorage.save(new Pet("Dolly", 8));
    }

    @Get("/")
    Collection<Pet> list() {
        return petStorage.list();
    }

    @Get("/{name}")
    Pet get(String name) {
        return petStorage.get(name);
    }
}
