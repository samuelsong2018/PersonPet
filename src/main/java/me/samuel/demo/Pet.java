package me.samuel.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
    private int age;
    private String breed;

    @ManyToMany
    private Set<Person> owners;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Set<Person> getOwners() {
        return owners;
    }

    public void setOwners(Set<Person> owners) {
        this.owners = owners;
    }
}
