package lessons.generics.strings;

public final class ImmutbleClass {

    private String ad;
    private String soyad;

    public ImmutbleClass(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }
}
