package inheritance.polimorfizim;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    //OdemeSirketleri o = new BOdenisSirketi();

    List<OdemeSirketleri> l = getSystems();

    for (OdemeSirketleri o : l){

      o.pay();


    }


  }









  private static List<OdemeSirketleri> getSystems(){

    List<OdemeSirketleri> list = new ArrayList<>();

    list.add(new AOdenisSirketi());
    list.add(new BOdenisSirketi());
    list.add(new COdenisSirketi());

    return list;
  }

}
