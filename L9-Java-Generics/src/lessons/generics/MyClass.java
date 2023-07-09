package lessons.generics;

public class MyClass<T> {

    T clazz;

    public void add(T obj){
        this.clazz = obj;
    }

    public T get(){
        return this.clazz;
    }

}
