package by.tsuprikova;

import by.tsuprikova.masters.*;

import java.util.HashMap;
import java.util.Map;

public class SalonOfBeautyByMapImpl implements IBeautySalon {

    private Map<Service, IMaster> map;

    public SalonOfBeautyByMapImpl() {
        map = new HashMap<>();
        map.put(Service.HAIRDRESSING, new Hairdresser());
        map.put(Service.MAKE_UP, new MakeupArtist());
        map.put(Service.MANICURE, new MasterOfManicure());
        map.put(Service.MASSAGE, new Masseur());
        map.put(Service.TATTOO, new MasterOfTattoo());

    }

    @Override
    public void serviceProvision(Client client) {
        IMaster master = map.getOrDefault(client.getService(), new DefaultMaster());
        master.doService(client);
    }
}
