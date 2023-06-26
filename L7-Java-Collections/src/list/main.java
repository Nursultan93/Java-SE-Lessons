package list;

public class main {
  public static void main(String[] args) {
    System.out.println(get("Slama"));
  }

  public static String get(String deyer) {
    String md = "test1" + "."
        + "test2" + "."
        + "test3" + "."
        + "test4" + "."
        + "test5" + "."
        + "test6" + "."
        + "test6" + "."
        + "test7";
    if (deyer != null)
        md = md + "." + deyer;
    return md;
  }
}
