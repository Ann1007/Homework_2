package by.tsuprikova.masters;

import by.tsuprikova.Client;

public class MasterOfTattoo implements IMaster {
    @Override
    public void doService(Client client) {
        System.out.println("Татуировщик набивает тату " + client.getName());
    }
}
