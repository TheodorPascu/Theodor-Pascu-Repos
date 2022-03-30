package com.CTS;

import Familie.MijlocTransport;
import Familie.TipTransport;
import com.CTS.Factory;

public class main {
    public static void main(String[] args) {
        Factory fabrica = new Factory();
        MijlocTransport a = fabrica.createObject(TipTransport.AUTOBUZ, "B100");
        MijlocTransport b = fabrica.createObject(TipTransport.TRAMVAI, "B101");
        MijlocTransport c = fabrica.createObject(TipTransport.TROLEIBUZ, "B102");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
