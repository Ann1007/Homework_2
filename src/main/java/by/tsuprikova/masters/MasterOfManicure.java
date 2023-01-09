package by.tsuprikova.masters;

import by.tsuprikova.Client;
import by.tsuprikova.Service;

public class MasterOfManicure implements IMaster {
    @Override
    public void doService(Client client) {
        System.out.println("Мастер маникюра делает маникюр + " + client.getName());
    }

    @Override
    public Service getService() {
        return Service.MANICURE;
    }
}
