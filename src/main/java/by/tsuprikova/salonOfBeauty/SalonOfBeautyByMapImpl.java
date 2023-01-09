package by.tsuprikova.salonOfBeauty;

import by.tsuprikova.Client;
import by.tsuprikova.Service;
import by.tsuprikova.masters.*;


import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SalonOfBeautyByMapImpl implements IBeautySalon {

    private Map<Service, IMaster> map;

    public SalonOfBeautyByMapImpl(List<IMaster> masters) {
        map = masters.stream().collect(Collectors.toMap(IMaster::getService, Function.identity()));


    }

    @Override
    public void serviceProvision(Client client) {
        IMaster master = map.getOrDefault(client.getService(), new DefaultMaster());
        master.doService(client);
    }
}
