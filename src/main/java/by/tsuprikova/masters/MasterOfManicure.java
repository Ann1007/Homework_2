package by.tsuprikova.masters;

import by.tsuprikova.Client;

public class MasterOfManicure implements IMaster {
    @Override
    public void doService(Client client) {
        System.out.println("Мастер маникюра делает маникюр + " + client.getName());
    }
}
