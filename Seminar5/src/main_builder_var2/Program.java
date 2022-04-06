package main_builder_var2;

import builder.AutobuzBuilder;
import builder.AutobuzLinie;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setTextRulat("END LINE");
        AutobuzLinie autobuzLinie = autobuzBuilder.builder();
        System.out.println(autobuzLinie);
    }
}
