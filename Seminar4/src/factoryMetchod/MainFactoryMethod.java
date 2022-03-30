package factoryMetchod;



public class MainFactoryMethod {
    public static void main(String[] args) {
        MijlocTransport autobuz = new AutobuzFactory().createObject("456");
        System.out.println(autobuz.toString());

        MijlocTransport troleibuz = new TroleibuzFactory().createObject("458");
        System.out.println(troleibuz.toString());


    }
}
