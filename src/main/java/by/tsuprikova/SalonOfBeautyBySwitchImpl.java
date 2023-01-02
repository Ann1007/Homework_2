package by.tsuprikova;

import by.tsuprikova.masters.*;

public class SalonOfBeautyBySwitchImpl implements IBeautySalon {

    private MakeupArtist makeupArtist = new MakeupArtist();
    private DefaultMaster defaultMaster = new DefaultMaster();
    private Hairdresser hairdresser = new Hairdresser();
    private Masseur masseur = new Masseur();
    private MasterOfManicure masterOfManicure = new MasterOfManicure();
    private MasterOfTattoo masterOfTattoo = new MasterOfTattoo();


    @Override
    public void serviceProvision(Client client) {
        switch (client.getService()) {
            case MANICURE:
                masterOfManicure.doService(client);
                break;
            case MASSAGE:
                masseur.doService(client);
                break;
            case MAKE_UP:
                makeupArtist.doService(client);
                break;
            case HAIRDRESSING:
                hairdresser.doService(client);
                break;
            case TATTOO:
                masterOfTattoo.doService(client);
                break;
            default:
                defaultMaster.doService(client);
                break;
        }
    }
}
