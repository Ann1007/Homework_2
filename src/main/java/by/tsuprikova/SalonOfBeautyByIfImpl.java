package by.tsuprikova;

import by.tsuprikova.Client;
import by.tsuprikova.IBeautySalon;
import by.tsuprikova.masters.*;

public class SalonOfBeautyByIfImpl implements IBeautySalon {
    private MakeupArtist makeupArtist = new MakeupArtist();
    private DefaultMaster defaultMaster = new DefaultMaster();
    private Hairdresser hairdresser = new Hairdresser();
    private Masseur masseur = new Masseur();
    private MasterOfManicure masterOfManicure = new MasterOfManicure();
    private MasterOfTattoo masterOfTattoo = new MasterOfTattoo();

    @Override
    public void serviceProvision(Client client) {
        if (client.getService() == Service.MAKE_UP) {
            makeupArtist.doService(client);
        } else if (client.getService() == Service.HAIRDRESSING) {
            hairdresser.doService(client);
        } else if (client.getService() == Service.MASSAGE) {
            masseur.doService(client);
        } else if (client.getService() == Service.MANICURE) {
            masterOfManicure.doService(client);
        } else if (client.getService() == Service.TATTOO) {
            masterOfTattoo.doService(client);
        } else {
            defaultMaster.doService(client);
        }


    }
}
