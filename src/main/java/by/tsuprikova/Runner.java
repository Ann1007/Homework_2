package by.tsuprikova;

import by.tsuprikova.masters.*;
import by.tsuprikova.salonOfBeauty.SalonOfBeautyByIfImpl;
import by.tsuprikova.salonOfBeauty.SalonOfBeautyByMapImpl;
import by.tsuprikova.salonOfBeauty.SalonOfBeautyBySwitchImpl;

import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Client client1 = new Client("клиент1", 23, Service.OTHER);
        Client client2 = new Client("клиент2", 27, Service.MAKE_UP);
        Client client3 = new Client("клиент3", 43, Service.MANICURE);


        SalonOfBeautyBySwitchImpl switchSalon = new SalonOfBeautyBySwitchImpl();

        System.out.println("--switch --");
        switchSalon.serviceProvision(client1);
        switchSalon.serviceProvision(client2);
        switchSalon.serviceProvision(client3);


        SalonOfBeautyByIfImpl salonIf = new SalonOfBeautyByIfImpl();
        System.out.println("--if--");
        salonIf.serviceProvision(client1);
        salonIf.serviceProvision(client2);
        salonIf.serviceProvision(client3);

        List<IMaster> masters = List.of(new Hairdresser(), new DefaultMaster(), new MakeupArtist(), new Masseur(), new MasterOfManicure(), new MasterOfTattoo());

        SalonOfBeautyByMapImpl salonOfMap = new SalonOfBeautyByMapImpl(masters);
        System.out.println("--map--");

        salonOfMap.serviceProvision(client1);
        salonOfMap.serviceProvision(client2);
        salonOfMap.serviceProvision(client3);


    }
}
