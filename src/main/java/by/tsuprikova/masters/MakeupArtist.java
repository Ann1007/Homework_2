package by.tsuprikova.masters;

import by.tsuprikova.Client;
import by.tsuprikova.Service;

public class MakeupArtist implements IMaster {

    @Override
    public void doService(Client client) {
        System.out.println("визажист делает макияж " + client.getName());
    }

    @Override
    public Service getService() {
        return Service.MAKE_UP;
    }
}
