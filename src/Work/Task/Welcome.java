package Work.Task;

public class Welcome extends Provider {

    private String clients;

    public Welcome(String orgName, int numberOfClients, int tarif, String clients) {
        super(orgName, numberOfClients, tarif);
        this.clients = clients;
    }

    public String getClients() {
        return clients;
    }

    public void setClients(String clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return super.toString()+ "Welcome{" + "clients='" + clients + '\'' + '}';
    }
}
