package by.tsuprikova.masters;

import by.tsuprikova.Client;
import by.tsuprikova.Service;

public class Hairdresser implements IMaster {

    @Override
    public void doService(Client client) {
        System.out.println("Парихмахер делает прическу " + client.getName());
    }

    @Override
    public Service getService() {
        return Service.HAIRDRESSING;
    }
}
