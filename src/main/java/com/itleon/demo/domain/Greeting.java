package com.itleon.demo.domain;

import lombok.Data;

@Data
public class Greeting {
    private final String message;

    public Greeting(Person person) {
        message = new StringBuilder()
            .append("Hola: ").append(person.getName()).append(". ")
            .append("Eres un: ").append(describeFromAge(person.getAge())).append(". ")
            .append("Saludos hasta: ").append(person.getResidence()).append(".")
            .toString();
    }

    private static String describeFromAge(int age) {
        if (age < 0)
            return "Edad invalida";

        if (age < 18)
            return "Niño";

        if (age < 30)
            return "Joven";

        if (age < 60)
            return "Adulto";

        return "Adulto Mayor";
    }

    public static Greeting greet(Person person) {
        return new Greeting(person);
    }

}
