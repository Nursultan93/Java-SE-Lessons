package example;

public class Asbaz extends Herbi implements YemekBisirme{

    private int isTecrubesi;

    public Asbaz() {
    }

    public Asbaz(String ad, String rutbe, String vezife, int isTecrubesi) {
        super(ad, rutbe, vezife);
        this.isTecrubesi = isTecrubesi;
    }

    public int getIsTecrubesi() {
        return isTecrubesi;
    }

    public void setIsTecrubesi(int isTecrubesi) {
        this.isTecrubesi = isTecrubesi;
    }

    @Override
    public void yemekBisir(Herbi herbi) {

    }
}
