package example;

public abstract class Herbi {

    private String ad;
    private String rutbe;

    private String vezife;

    public Herbi() {
    }

    public Herbi(String ad, String rutbe, String vezife) {
        this.ad = ad;
        this.rutbe = rutbe;
        this.vezife = vezife;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getRutbe() {
        return rutbe;
    }

    public void setRutbe(String rutbe) {
        this.rutbe = rutbe;
    }

    public String getVezife() {
        return vezife;
    }

    public void setVezife(String vezife) {
        this.vezife = vezife;
    }
}
