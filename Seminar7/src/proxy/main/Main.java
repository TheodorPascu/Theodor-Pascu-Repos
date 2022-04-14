package proxy.main;

import proxy.clase.Autobuz;
import proxy.clase.AutobuzNoapte;
import proxy.clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz = new Autobuz("George", 20, 10);
        autobuz.opreste();

        MijlocTransport autobuzNoapte = new AutobuzNoapte((Autobuz) autobuz);
        autobuzNoapte.opreste();
    }
}