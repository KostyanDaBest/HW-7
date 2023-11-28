package Zadanie3;

public class PersonClone implements Cloneable{
    private String name;
    private int age;
    public PersonClone(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public String toString () {
        return "Челикс{имя=' " + name + " ', возраст='" + age + "'}" ;
    }
}
