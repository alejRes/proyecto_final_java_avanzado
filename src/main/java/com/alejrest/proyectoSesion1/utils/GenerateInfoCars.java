package com.alejrest.proyectoSesion1.utils;

import com.alejrest.proyectoSesion1.entities.partsCar.*;

import java.util.*;

public class GenerateInfoCars {

    private Map<String, List<String>> brandsAndModels;
    private List<Batery> bateries;
    private List<Motor> motors;
    private List<Injection> injections;

    private static int opcion = 0;

    public GenerateInfoCars() {
        brandsAndModels = generateBrandsAndModels();
        motors = generateListMotors();
        bateries = generateListBateries();
        injections = generateListInjection();
    }

    public String generateBrand() {
        int size = brandsAndModels.size();
        String brand = (String) brandsAndModels.keySet().toArray()[generateRandomNumber(size)];

        return brand;
    }

    public String generateModel(String brand) {
        List<String> modelsByBrand = brandsAndModels.get(brand);
        int size = modelsByBrand.size();

        return modelsByBrand.get(generateRandomNumber(size));
    }

    public String generateCarRegistration() {
        int numbersCar = 9999;
        String stringBuilder;
        int number = generateRandomNumber(numbersCar);
        String zeros ="";
        if (number < 10){
            zeros = "000";
        }else if( number >= 10 && number < 100){
            zeros = "00";
        } else if (number >=100 && number <1000) {
            zeros = "0";
        }

        StringBuilder sb = new StringBuilder(zeros)
                .append(String.valueOf(number))
                .append(generateLettersCarRegistration());

        return sb.toString();
    }

    public String generateColor() {
        String[] colors = {"Tangerine", "Orange", "Brown", "Green", "Pink", "Violet", "Yellow"};

        return colors[generateRandomNumber(colors.length)];
    }

    public int generateNumberDoors() {
        int doors = (generateRandomNumber(6) % 2 == 0) ? 2 : 5;
        return doors;
    }

    public Motor generateMotor(String typeCar) {
        Motor motor;

        while (true) {
            motor = motors.get(generateRandomNumber(motors.size()));
            if ((motor.getTypeMotor() == TypeMotor.DIESEL || motor.getTypeMotor() == TypeMotor.GASOLINE)
                    && typeCar.equalsIgnoreCase("combustion")) {
                break;
            } else if (motor.getTypeMotor() == TypeMotor.ELECTRIC && typeCar.equalsIgnoreCase("electric")) {
                break;
            } else if (motor.getTypeMotor() == TypeMotor.HYBRID && typeCar.equalsIgnoreCase("hybrid")) {
                break;
            }
        }

        return motor;
    }

    public Batery generateBatery() {
        return bateries.get(generateRandomNumber(bateries.size()));
    }

    public Injection generateInjection() {
        return injections.get(generateRandomNumber(injections.size()));
    }

    public HydrogenTank generateHydrogenTank() {
        HydrogenTank hydrogenTank;
        if (opcion % 2 == 0) {
            hydrogenTank = new HydrogenTank(50);
        }else{
            hydrogenTank = new HydrogenTank(25);
        }
        opcion++;
        return hydrogenTank;
    }

    public ElectricBatery generateElectricBatery(){
        ElectricBatery electricBatery;
        if(opcion % 2 == 0){
            electricBatery = new ElectricBatery(100,305);
        }else{
            electricBatery = new ElectricBatery(150,484);
        }
        opcion++;
        return electricBatery;
    }

    private Map<String, List<String>> generateBrandsAndModels() {

        Map<String, List<String>> brandsModels = new HashMap();
        String[] modelsPeugeuot = {"108", "208", "308", "508", "2008", "3008", "5008"};
        String[] modelsRenault = {"clio", "megane", "captur", "arkana", "laguna", "scenic"};
        String[] modelsSeat = {"ibiza", "panda", "leon", "arona", "ateca", "tarraco"};
        String[] modelsCitroen = {"C3", "C4", "C3 Aircross", "DS3", "Ds4", "Berlingo"};

        brandsModels.put("Peugueot", Arrays.asList(modelsPeugeuot));
        brandsModels.put("Seat", Arrays.asList(modelsSeat));
        brandsModels.put("Renault", Arrays.asList(modelsRenault));
        brandsModels.put("Citroen", Arrays.asList(modelsCitroen));

        return brandsModels;
    }

    private int generateRandomNumber(int size) {
        return (int) (Math.random() * size);
    }

    /*
       método que genera las tres letras de las matrículas excluyendo las vocales
       según el sistema de matriculación español
     */
    private String generateLettersCarRegistration() {
        String letters = "";
        char letter;
        for (int i = 0; i < 3; i++) {
            do {
                letter = (char) (generateRandomNumber(25) + 65);
            } while (isVocal(letter));

            letters += letter;
        }
        return letters;
    }

    private boolean isVocal(char letter) {
        return letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U';
    }

    private List<Motor> generateListMotors() {
        List<Motor> motors = new ArrayList();

        motors.add(new Motor(TypeMotor.DIESEL, 110, 1.9));
        motors.add(new Motor(TypeMotor.GASOLINE, 115, 1.2));
        motors.add(new Motor(TypeMotor.GASOLINE, 130, 1.4));
        motors.add(new Motor(TypeMotor.DIESEL, 150, 2.0));
        motors.add(new Motor(TypeMotor.HYBRID, 122, 1.8));
        motors.add(new Motor(TypeMotor.HYBRID, 135, 1.6));
        motors.add(new Motor(TypeMotor.ELECTRIC, 136, 0));
        motors.add(new Motor(TypeMotor.ELECTRIC, 204, 0));


        return motors;
    }

    private List<Batery> generateListBateries() {
        List<Batery> bateries = new ArrayList();

        bateries.add(new Batery(640, 12));
        bateries.add(new Batery(830, 12));
        bateries.add(new Batery(780, 12));
        bateries.add(new Batery(440, 12));
        bateries.add(new Batery(510, 12));

        return bateries;
    }

    private List<Injection> generateListInjection() {
        List<Injection> injections = new ArrayList();
        injections.add(new Injection(TypeInjection.DIRECT, 10));
        injections.add(new Injection(TypeInjection.DIRECT, 6));
        injections.add(new Injection(TypeInjection.DIRECT, 4));
        injections.add(new Injection(TypeInjection.INDIRECT, 10));
        injections.add(new Injection(TypeInjection.INDIRECT, 6));
        injections.add(new Injection(TypeInjection.INDIRECT, 4));

        return injections;
    }
}
