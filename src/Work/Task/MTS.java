package Work.Task;

public class MTS extends Provider {

    private String parking;

    public MTS(String orgName, int numberOfClients, int tarif, String parking) {
        super(orgName, numberOfClients, tarif);
        this.parking = parking;
    }

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    @Override
    public String toString() {
        return super.toString()+ "MTS{" + "parking='" + parking + '\'' + '}';
    }
}
