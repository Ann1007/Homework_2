package by.tsuprikova.masters;

import by.tsuprikova.Client;
import by.tsuprikova.Service;

public class MasterOfTattoo implements IMaster {
    @Override
    public void doService(Client client) {
        System.out.println("Татуировщик набивает тату " + client.getName());
    }

    @Override
    public Service myService() {
        return Service.TATTOO;
    }
}
