package strategy.main;

import strategy.clase.PlataCardSTB;
import strategy.clase.Validator;

public class Main {
    public static void main(String[] args) {
        PlataCardSTB plataCardSTB = new PlataCardSTB();
        Validator validator = new Validator(plataCardSTB, 3);

        validator.platesteCalatorie();
    }
}