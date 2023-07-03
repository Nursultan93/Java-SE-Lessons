import exception.PersonNotFoundException;

public class Run1 {
    public static void main(String[] args) {

        try {
            // 1) ownership yoxla
            // if (ownersip deyilse) throw new RuntineException("Bu kartin sahibi deyilsiz");
            //2) balansi yoxla
            //if (balans sifirdirsa) throw new RuntineException("Balansinizda kifayert qeder vesait yoxdur");
            //3) kartdan vesaiti sil
            //4) qarsi terefe pulu gonder

            Person p = null;

            int c = 8/0;

            if (p == null){
                throw new NullPointerException("Person yoxdur");
            }

            p.getName();

            System.out.println("Salam");

        }catch (ArithmeticException e) {
            System.out.println("Riyazi sehv bas verdi");
        }catch (Exception e) {
            //5) vesait cixilan karta cixilan vesatit qaytar
            System.out.println("nese sehv oldu");
        }



    }
}
