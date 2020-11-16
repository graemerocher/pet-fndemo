package demo;

import javax.inject.Singleton;
import javax.validation.Valid;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Singleton
public class PetStorage {

    private final Map<String, Pet> map = new ConcurrentHashMap<>();

    Collection<Pet> list() {
        return map.values();
    }

    void save(@Valid Pet pet) {
        map.put(pet.getName(), pet);
    }

    Pet get(String name) {
        return map.get(name);
    }
}
