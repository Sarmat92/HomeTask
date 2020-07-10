package Work.Task;

import java.lang.reflect.Array;
import java.util.Arrays;

import static jdk.nashorn.internal.objects.Global.print;

public class GoProvider {

    public static void main(String[] args) {

        Life life = new Life("BEST",1268,6,15);
        MTS mts = new MTS("OOO MTC",5416,26,"V.I.P" );
        Welcome welcome = new Welcome("A1", 3688,31,"All");

        Provider[]providerArray = new Provider[]{life, mts, welcome};

        System.out.println(providerArray);
        //Arrays.sort(providerArray);
        //print(providerArray);

    }
}
