package by.tsuprikova.masters;

import by.tsuprikova.Client;

public class MakeupArtist implements IMaster {

    @Override
    public void doService(Client client) {
        System.out.println("визажист делает макияж " + client.getName());
    }
}
