package demo;

import io.micronaut.core.annotation.Introspected;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

@Introspected
public class Pet {

    @NotBlank
    private final String name;
    @Max(20)
    private final int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
