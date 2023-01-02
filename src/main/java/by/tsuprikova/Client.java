package by.tsuprikova;

public class Client {
    private String name;
    private int age;
    private Service service;


    public Client() {
    }

    public Client(String name, int age, Service service) {
        this.name = name;
        this.age = age;
        this.service = service;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
