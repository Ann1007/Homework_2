package by.tsuprikova;

public class Runner {
    public static void main(String[] args) {

        Client client = new Client("клиент11", 23, Service.OTHER);

        SalonOfBeautyBySwitchImpl switchSalon = new SalonOfBeautyBySwitchImpl();
        switchSalon.serviceProvision(client);

        SalonOfBeautyByIfImpl salonIf = new SalonOfBeautyByIfImpl();
        salonIf.serviceProvision(client);

        SalonOfBeautyByMapImpl salonOfMap = new SalonOfBeautyByMapImpl();
        salonOfMap.serviceProvision(client);


    }
}
