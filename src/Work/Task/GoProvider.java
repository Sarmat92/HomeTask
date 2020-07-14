package Work.Task;

public class GoProvider {


    private static void maxClients(Provider[] providerArray, int max) {
        for (int i = 0; i < providerArray.length; i ++){
            if (providerArray[i].getNumberOfClients() > max)
                max = providerArray[i].getNumberOfClients();
        }
        System.out.println("Максимум клиентов " + max);
    }


    public static void print(Provider[] providerArray) {
        for (Provider prov : providerArray) {
            System.out.println(prov);
        }
    }

    public static void main(String[] args) {

        Life life = new Life("BEST", 1268, 6, 15);
        MTS mts = new MTS("OOO \"MTC\" ", 5416, 26, "V.I.P");
        Welcome welcome = new Welcome("A1", 3688, 31, "All");

        Provider[] providerArray = new Provider[3];
        providerArray[0] = life;
        providerArray[1] = mts;
        providerArray[2] = welcome;

        print(providerArray);
        int max = providerArray[0].getNumberOfClients();
        maxClients(providerArray, max);

        int connect = 0;
        connect += life.active();
        connect += mts.active();
        connect += welcome.active();
        System.out.println(connect);

        connect -= life.blocked();
        connect -= mts.blocked();
        connect -= welcome.blocked();
        System.out.println(connect);


    }
}
