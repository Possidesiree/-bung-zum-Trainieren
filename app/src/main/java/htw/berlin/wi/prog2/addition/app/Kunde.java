package htw.berlin.wi.prog2.addition.app;

public class Kunde {
    public Kunde(String name, String strasse) {
        this.name = name;
        this.strasse = strasse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String strasse;

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }
}
