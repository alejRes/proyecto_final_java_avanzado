package com.alejrest.proyectoSesion1.repositories;

import com.alejrest.proyectoSesion1.entities.partsCar.*;
import com.alejrest.proyectoSesion1.entities.typesCar.Car;
import com.alejrest.proyectoSesion1.entities.typesCar.CombustionCar;
import com.alejrest.proyectoSesion1.entities.typesCar.ElectricCar;
import com.alejrest.proyectoSesion1.entities.typesCar.HydrogenCar;
import com.alejrest.proyectoSesion1.utils.CarFacade;
import com.alejrest.proyectoSesion1.utils.Switchboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepositoryFileImpl implements CarRepository {

    private static final String CAR_FILE_DB = "CarFileDB.txt";
    private static final String DIESEL = "DIESEL";
    private static final String GASOLINE = "GASOLINE";
    private static final String ELECTRIC_CAR = "ELECTRIC";
    private static final String HYDROGEN_CAR = "HYBRID";
    private static final String DIRECT = "DIRECT";
    private File file = new File(CAR_FILE_DB);
    @Autowired
    CarFacade carFacade;

    @Override
    public Car getRandomCar(String typeCar) {
        return carFacade.getCar(typeCar);
    }

    @Override
    public void saveCar(Car car) {
        try {
            FileOutputStream out = new FileOutputStream(file, true);
            PrintStream printout = new PrintStream(out);
            printout.write(refactorCarForFile(car));
            printout.flush();
            printout.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Car> listAllCars() {
        List<Car> carsToFile = new ArrayList();
        try {
            FileReader in = new FileReader(file);
            BufferedReader br = new BufferedReader(in);
            String line = br.readLine();
            while (line != null) {
                carsToFile.add(convertStringToObjectCar(line));
                line = br.readLine();
            }
            br.close();
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return carsToFile;
    }

    @Override
    public Car carByCarRegistration(String carRegistration){
        FileReader in = null;
        Car car = null;
        try {
            in = new FileReader(file);
            BufferedReader br = new BufferedReader(in);
            String[] properties;
            String line = br.readLine();
            while(line != null){
                properties = line.split(",");
                if(properties[0].equalsIgnoreCase(carRegistration)){
                    car =convertStringToObjectCar(line);
                    break;
                }
                line = br.readLine();
            }

            br.close();
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return car;
    }

    /*
        método que se va a encargar de coger la información del objeto de la clase Car
        y la prepara separada por comas para introducirla en el fichero.
         */
    private byte[] refactorCarForFile(Car car) {
        String sb = car.getCarRegistration() + "," +
                car.getBrand() + "," +
                car.getModel() + "," +
                car.getColor() + "," +
                car.getNumberOfDoors() + "," +
                car.getMotor().getTypeMotor() + "," +
                car.getMotor().getHorsePower() + "," +
                car.getMotor().getCubicCapacity() + "," +
                car.getMotor().isMotorTurnOn() + "," +
                car.getBatery().getAmps() + "," +
                car.getBatery().getVolts() + "," +
                car.getBatery().isBateryTurnOn() + "," +
                car.getAirConditioning().isTurnOn() + "," +
                specificPropertiesTypeCar(car);

        return sb.getBytes();
    }

    private String specificPropertiesTypeCar(Car car) {
        StringBuilder sb = new StringBuilder();
        if (car instanceof CombustionCar) {
            sb.append(((CombustionCar) car).getInjection().getTypeInjection()).append(",")
                    .append(((CombustionCar) car).getInjection().getNumberCylinders()).append("\n");
        } else if (car instanceof ElectricCar) {
            sb.append(((ElectricCar) car).getElectricBatery().getCapacityKws()).append(",")
                    .append(((ElectricCar) car).getElectricBatery().getAutonomy()).append("\n");
        } else if (car instanceof HydrogenCar) {
            sb.append(((HydrogenCar) car).getHydrogenTank().getCapacity()).append("\n");
        }
        return sb.toString();
    }

    private Car convertStringToObjectCar(String carInfo) {

        Car car;
        List<String> carProperties = new ArrayList<>(List.of(carInfo.split(",")));


        if (carProperties.contains(DIESEL) || carProperties.contains(GASOLINE)) {
            TypeMotor typeMotorCombustion = carProperties.get(5).equalsIgnoreCase(DIESEL) ? TypeMotor.DIESEL : TypeMotor.GASOLINE;
            TypeInjection typeInjection = carProperties.get(12).equalsIgnoreCase(DIRECT) ? TypeInjection.DIRECT : TypeInjection.INDIRECT;
            car = new CombustionCar(carProperties.get(0), carProperties.get(1),
                    carProperties.get(2),carProperties.get(3),Integer.parseInt(carProperties.get(4)),
                    new Motor(typeMotorCombustion,Integer.parseInt(carProperties.get(6)),Double.parseDouble(carProperties.get(7))),
                    new Batery(Integer.parseInt(carProperties.get(9)),Integer.parseInt(carProperties.get(10))),
                    new AirConditioning(),new Injection(typeInjection,Integer.parseInt(carProperties.get(9))));
        } else if (carProperties.contains(ELECTRIC_CAR)) {
            car = new ElectricCar(carProperties.get(0), carProperties.get(1),
                    carProperties.get(2),carProperties.get(3),Integer.parseInt(carProperties.get(4)),
                    new Motor(TypeMotor.ELECTRIC,Integer.parseInt(carProperties.get(6)),Double.parseDouble(carProperties.get(7))),
                    new Batery(Integer.parseInt(carProperties.get(9)),Integer.parseInt(carProperties.get(10))),
                    new AirConditioning(),new ElectricBatery(Integer.parseInt(carProperties.get(12)),Integer.parseInt(carProperties.get(13))));
        } else {
            car = new HydrogenCar(carProperties.get(0), carProperties.get(1),
                    carProperties.get(2),carProperties.get(3),Integer.parseInt(carProperties.get(4)),
                    new Motor(TypeMotor.HYBRID,Integer.parseInt(carProperties.get(6)),Double.parseDouble(carProperties.get(7))),
                    new Batery(Integer.parseInt(carProperties.get(9)),Integer.parseInt(carProperties.get(10))),
                    new AirConditioning(),new HydrogenTank(Integer.parseInt(carProperties.get(12))));
        }
        new Switchboard().StarUp(car);
        return car;
    }
}
