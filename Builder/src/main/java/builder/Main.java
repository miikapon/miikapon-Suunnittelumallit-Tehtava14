package builder;

import java.util.List;
import java.util.stream.Collectors;

import builder.Ainesosa;

public class Main {

    public static void main(String[] args) {
        Builder<List<Ainesosa>> mcdonalds = new McDonalds();
        Builder<StringBuilder> hesburger = new Hesburger();

        hesburger.addPihvi().addSalaatti().addMajoneesi().addPihvi().addSämpylä().addHampurilaiskastike()
                .addPihvi().addSuolakurkku().addSämpylä();

        mcdonalds.addPihvi().addSalaatti().addMajoneesi().addPihvi().addSämpylä().addHampurilaiskastike()
                .addPihvi().addSuolakurkku().addSämpylä();

        StringBuilder hesburgerHampurilainen = hesburger.getPurilainen();
        List<Ainesosa> mcdonaldsHampurilainen = mcdonalds.getPurilainen();

        System.out.println(hesburgerHampurilainen.toString());

        String mcdonaldsHampurilainenString = mcdonaldsHampurilainen.stream().map(ainesosa -> ainesosa.getClass().getSimpleName())
                .collect(Collectors.joining(", "));
        System.out.println(mcdonaldsHampurilainenString);
    }
}
