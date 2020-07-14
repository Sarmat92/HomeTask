package Work.Task;

public abstract class Provider implements Status, Comparable<Provider> {

    private String orgName;
    private int numberOfClients;
    private int tarif;
    private boolean state = false;

    public Provider(String orgName, int numberOfClients, int tarif) {
        this.orgName = orgName;
        this.numberOfClients = numberOfClients;
        this.tarif = tarif;
    }


    @Override
    public int active() {
        if (state) {
            return 0;
        }
        state = true;
        System.out.println("Я активен " + orgName + " и у меня " + numberOfClients + " довольных клиентов.");
        return 0;
    }

    @Override
    public int blocked() {
        if (!state) {
            return 0;
        }
        state = false;
        System.out.println("Я заблокирован " + orgName + " и у меня " + numberOfClients + " несчастных клиентов.");
        return 0;
    }


    @Override
    public int compareTo(Provider o) {
        if (numberOfClients > o.numberOfClients) {
            return 1;
        } else if (numberOfClients < o.numberOfClients) {
            return -1;
        }
        return 0;
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
