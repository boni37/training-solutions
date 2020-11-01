package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("John Smith");
        client.setAddress("5th Avenue NY NY");
        client.setYear(1945);
        System.out.println("Name:" + client.getName() + ",Address:" + client.getAddress() + ",Year:" + client.getYear());
        client.migrate("Downing str. 10 London London");
        System.out.println("Name:" + client.getName() + ",Address:" + client.getAddress() + ",Year:" + client.getYear());

    }
}
