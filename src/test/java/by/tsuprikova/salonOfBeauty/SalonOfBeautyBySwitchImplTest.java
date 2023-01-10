package by.tsuprikova.salonOfBeauty;

import by.tsuprikova.Client;
import by.tsuprikova.Service;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SalonOfBeautyBySwitchImplTest {

    Client client;
    SalonOfBeautyBySwitchImpl salon;

    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {

        client = new Client("клиент1", 27, Service.MANICURE);

        salon = new SalonOfBeautyBySwitchImpl();
        System.setOut(new PrintStream(output));
    }


    @Test
    void serviceProvisionTestBySwitch() {
        salon.serviceProvision(client);
        assertEquals("Мастер маникюра делает маникюр + " + client.getName() + "\r\n", output.toString());


    }


    @AfterEach
    public void cleanUpStreams() {
        System.setOut(null);
    }
}