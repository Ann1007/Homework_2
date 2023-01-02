package by.tsuprikova.masters;

import by.tsuprikova.Client;

public class Masseur implements IMaster {

    @Override
    public void doService(Client client) {
        System.out.println("Массажист делает массаж " + client.getName());
    }
}
