package meu_local;

import java.util.Locale;

public class MyLocal {
    public static void setarUs() {
        Locale us = new Locale("en","us");
        Locale.setDefault(us);
    }

}
