package by.tsuprikova.masters;

import by.tsuprikova.Client;
import by.tsuprikova.Service;

public interface IMaster {

    void doService(Client client);
    Service getService();

}
