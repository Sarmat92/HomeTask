package Work.Task;

public class Provider {

   private String orgName;
   private int numberOfClients;
   private int tarif;

    public Provider(String orgName, int numberOfClients, int tarif) {
        this.orgName = orgName;
        this.numberOfClients = numberOfClients;
        this.tarif = tarif;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
    }

    public int getTarif() {
        return tarif;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "orgName='" + orgName + '\'' +
                ", numberOfClients=" + numberOfClients +
                ", tarif=" + tarif +
                '}';
    }
}
