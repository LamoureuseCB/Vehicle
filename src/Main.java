import advertising.AdsService;
import advertising.VehicleAd;
import bodyTypes.*;
import fuelTypes.*;
import purposeTypes.*;

import bodyTypes.Sedan;
import bodyTypes.Truck;
import fuelTypes.Diesel;
import fuelTypes.Gasoline;
import purposeTypes.Cargo;
import purposeTypes.Passenger;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();

        VehicleAd volvoAd = new VehicleAd("Volvo", "1", new Passenger("Пассажирский"),
                new Sedan("Седан"), new Gasoline("Бензин"));
        VehicleAd kamazAd = new VehicleAd("Kamaz", "2", new Cargo("Грузоперевозки"),
                new Truck("Грузовик"), new Diesel("Дизель"));

        VehicleAd toyotaAd = new VehicleAd("Toyota", "3", new Light("Легковой"),
                new Van("Универсал"), new Electric("Электричество"));
        VehicleAd mercedesAd = new VehicleAd("Mercedes", "4", new Passenger("Пассажирский"),
                new Bus("Автобус"), new Hybrid("Гибрид"));

        adsService.setAdList(new VehicleAd[]{volvoAd, kamazAd, toyotaAd, mercedesAd});
        adsService.filterByVehicleTypeByFuelTypes(new Electric("Электричество"));
        System.out.println();
        adsService.filterByVehicleTypeByPurpose(new Passenger("Пассажирский"));
        System.out.println();
        adsService.filterByVehicleTypeByBodyTypes(new Truck("Грузовик"));
        System.out.println();
        adsService.filterByVehicleTypeByBodyTypes(new Van("Универсал"));
        System.out.println();


    }
}