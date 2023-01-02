package by.tsuprikova.masters;

import by.tsuprikova.Client;
import by.tsuprikova.Service;

public class Masseur implements IMaster {

    @Override
    public void doService(Client client) {
        System.out.println("Массажист делает массаж " + client.getName());
    }

    @Override
    public Service myService() {
        return Service.MASSAGE;
    }
}
