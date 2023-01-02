package by.tsuprikova.masters;

import by.tsuprikova.Client;
import by.tsuprikova.Service;

public class DefaultMaster implements IMaster {

    @Override
    public void doService(Client client) {
        System.out.println("Мастер на все руки делает все, что хочет клиент ");
    }

    @Override
    public Service myService() {
        return Service.OTHER;
    }
}
