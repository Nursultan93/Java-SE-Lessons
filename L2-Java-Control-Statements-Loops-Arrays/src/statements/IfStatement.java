package statements;

public class IfStatement {

  public static void main(String[] args) {

    int a = 10;

    if (a <= 10){
      System.out.println("deyer 10'dan kicikdir");
    }

    if (a<10){
      System.out.println("deyer 10 dan kicikdir");
    } else {
      System.out.println("Deyer 10dan ferqdir");
    }

    if (a<10){
      System.out.println("deyer 10'dan kicikdir");
    }else if(a > 10) {
      System.out.println("deyer 10dan boyukdur");
    }else {
      System.out.println("deyer 10'a beraberdir");
    }

    if (a == 10) {
      if (a%2 == 0){
        System.out.println("tam ededdir");
      }
    }

    if (a == 10 && a%2 == 0){
      System.out.println("bu tam ededdir");
    }

  }

}
