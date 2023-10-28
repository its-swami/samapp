package com.app.sam.optional;


import java.util.Optional;

class Insurance {
    private String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getInsuranceName() {
        return insuranceName;
    }
}

class Car {
    private Optional<Insurance> insurance;

    public Car(Optional<Insurance> insurance) {
        this.insurance = insurance;
    }

    public Optional<Insurance> getInsurance() {
        return insurance;
    }
}

class Person {
    private Optional<Car> car;

    public Person(Optional<Car> car) {
        this.car = car;
    }

    public Optional<Car> getCar() {
        return car;
    }
}

public class MapFlatMap {
    public static void main(String[] args) {
        // Create an optional for insurance
        Optional<Insurance> insuranceOptional = Optional.of(new Insurance("AutoShield"));

        // Create an optional for a car with optional insurance
        Optional<Car> carOptional = Optional.of(new Car(insuranceOptional));

        // Create an optional for a person with optional car
        Optional<Person> personOptional = Optional.of(new Person(carOptional));

        // Using flatMap to get the insurance name from the nested optionals
        String insuranceName = personOptional.flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getInsuranceName)
                .orElse("No Insurance");

        System.out.println("Insurance Name: " + insuranceName);
    }

    // Output:
    // Insurance Name: AutoShield

    // Explanation:
    // The flatMap() method is used to flatten the Optional object to an Optional object of the same type.
    // The map() method is used to map the value of the Optional object to another value.
    // The orElse() method is used to return the value if present in the Optional object, otherwise return the default value.

}


