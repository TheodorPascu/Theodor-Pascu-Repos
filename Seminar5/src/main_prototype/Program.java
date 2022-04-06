package main_prototype;


import prototype.Autobuz;
import prototype.MijlocTransport;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Dorian");

        try {
            MijlocTransport autobuz1 = autobuz.copiaza();
            System.out.println(autobuz);
            System.out.println(autobuz1);
        } catch (CloneNotSupportedException var3) {
            var3.printStackTrace();
        }

    }
}
