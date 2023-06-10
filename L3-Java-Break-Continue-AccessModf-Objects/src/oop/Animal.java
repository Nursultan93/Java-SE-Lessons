package oop;

public class Animal {

  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this.name.equals(((Animal)obj).name))
      return true;
    else
      return false;
  }
}
