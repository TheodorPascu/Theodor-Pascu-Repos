package Observer.main;

import Observer.clase.Autobuz;
import Observer.clase.Calator;
import Observer.clase.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect autobuz = new Autobuz(313);

        Calator calator1 = new Calator("Popescu");
        Calator calator2 = new Calator("Ionescu");
        Calator calator3 = new Calator("Florescu");
        Calator calator4 = new Calator("Sorescu");

        autobuz.adaugaCalator(calator1);
        autobuz.adaugaCalator(calator2);
        autobuz.notificaCalatori();
        autobuz.adaugaCalator(calator3);
        autobuz.adaugaCalator(calator4);
        autobuz.notificaCalatori();
    }
}
