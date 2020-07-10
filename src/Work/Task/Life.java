package Work.Task;

public class Life extends Provider {

    int gratis;

    public Life(String orgName, int numberOfClients, int tarif, int gratis) {
        super(orgName, numberOfClients, tarif);
        this.gratis = gratis;
    }

    public int getGratis() {
        return gratis;
    }

    public void setGratis(int gratis) {
        this.gratis = gratis;
    }

    @Override
    public String toString() {
        return super.toString() + "Life{" + "gratis=" + gratis + '}';
    }
}
