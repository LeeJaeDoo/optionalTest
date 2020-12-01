package com.company;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Insurance insurance = new Insurance("cam");
        Optional<Insurance> optInsurance = Optional.ofNullable(insurance);
        optInsurance.filter(i -> "cam".equals(i.getName()))
                    .ifPresent(x -> System.out.println("ok"));
    }

    /*private static String getCarInsuranceName(Person person) {
        if (person != null) {
            Car car = person.getCar();
            if (car != null) {
                Insurance insurance = car.getInsurance();
                if (insurance != null) {
                    return insurance.getName();
                }
            }
        }
        return "Unknown";
    }

    private static String getCarInsuranceName1(Person person) {
        if (person == null) {
            return "Unknown";
        }
        Car car = person.getCar();
        if (car == null) {
            return "Unknown";
        }
        Insurance insurance = car.getInsurance();
        if (insurance == null) {
            return "Unknown";
        }
        return insurance.getName();
    }*/
}
