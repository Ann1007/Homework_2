package by.tsuprikova.salonOfBeauty;

import by.tsuprikova.Client;
import by.tsuprikova.Service;
import by.tsuprikova.masters.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalonOfBeautyByMapImplTest {

    Client client;
    SalonOfBeautyByMapImpl salon;

    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {

        client = new Client("клиент1", 27, Service.OTHER);
        List<IMaster> masters = List.of(new Hairdresser(), new DefaultMaster(), new MakeupArtist(), new Masseur(), new MasterOfManicure(), new MasterOfTattoo());
        salon = new SalonOfBeautyByMapImpl(masters);
        System.setOut(new PrintStream(output));
    }


    @Test
    void serviceProvisionTestByMap() {
        salon.serviceProvision(client);
        assertEquals("Мастер на все руки делает все, что хочет клиент \r\n", output.toString());

    }


    @AfterEach
    public void cleanUpStreams() {
        System.setOut(null);
    }
}