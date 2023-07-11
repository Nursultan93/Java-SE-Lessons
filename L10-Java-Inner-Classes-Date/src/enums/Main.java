package enums;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Heftenin ucunu daxil edin (heftenin 7 gunu var):");

        String gun = sc.next();

        if (gun.equals(HefteninGunleri.BAZAR.name())){
            System.out.println("bazar");

        }


    }



}
