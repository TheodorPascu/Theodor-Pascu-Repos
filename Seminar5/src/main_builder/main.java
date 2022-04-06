package main_builder;

import builder.AutobuzBuilder;
import builder.AutobuzLinie;
import org.w3c.dom.ls.LSOutput;

public class main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder  = new AutobuzBuilder();
        autobuzBuilder.setNumeSofer("Sofer CTS");
        autobuzBuilder.setTextRulat("END LINE");
        AutobuzLinie autobuzLinie = autobuzBuilder.builder();

        System.out.println(autobuzLinie);    }
}
