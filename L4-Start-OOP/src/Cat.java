public class Cat extends Animal{


  public void catchedMouse() {
    System.out.println("Pisik sican yaxaladi");
  }

  public void catchedMouse(String name) {
    System.out.println(name + " sican yaxaladi");
  }

  public void catchedMouse(String name, int count) {
    System.out.println(name+" "+count+" sican yaxaladi");
  }

  public void catchedMouse(int count, String name) {
    System.out.println(name+" "+count+" sican yaxaladi");
  }

  public void catchedMouse(String name, int count, int age) {
    System.out.println(name +" "+age+" yasinda "+ count+" sican tutdu");
  }

  protected String catchedMouse(int age, String name, int count){
    System.out.println(name +" "+age+" yasinda"+ count+" sican tutdu");
    return "Salam";
  }


}
