public class ExpExample {
    public static void main(String[] args) {

        ExpExample e = new ExpExample();
        e.mehtod3();

        System.out.println("Emeliyyat daveme edir");

    }

    public void method1(){
        int c = 4/0;
    }

    public void method2(){
        method1();
    }

    public void mehtod3(){
        try {
            method2();
        }catch (Exception e){
            System.out.println("sifira bolme bas verdi");
        }finally {

        }

    }

}
