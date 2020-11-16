package demo;


import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.Collection;

@MicronautTest
public class PetControllerTest {

    @Inject PetClient client;

    @Test
    void testListPet() {
        Assertions.assertEquals(
                2,
                client.list().size()
        );
    }

    @Client("/pets")
    interface PetClient {

        @Get("/")
        Collection<Pet> list();
    }
}
