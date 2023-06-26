package example;

public class Esger extends Herbi implements SilahdanAtesAcabilme{
    private String bolme;

    public Esger() {
    }

    public Esger(String ad, String rutbe, String vezife, String bolme) {
        super(ad, rutbe, vezife);
        this.bolme = bolme;
    }

    public String getBolme() {
        return bolme;
    }

    public void setBolme(String bolme) {
        this.bolme = bolme;
    }

    @Override
    public void atesAc(Herbi herbi) {

    }
}
