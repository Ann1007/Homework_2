package by.tsuprikova;

public enum Service {
    MANICURE("маникюр"),
    MASSAGE("массаж"),
    MAKE_UP("макияж"),
    HAIRDRESSING("парикмахерские услуги"),
    TATTOO("татуировка"),
    OTHER;


    private String translate;

    Service() {

    }

    Service(String translate) {
        this.translate = translate;
    }


}
