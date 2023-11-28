package Zadanie3;

public class Run2 {
    public static void main(String[] args) {
        PersonClone person = new PersonClone("Kostyan", 19);
        try {
            PersonClone person2 = (PersonClone) person.clone();
            System.out.println("Орига: " + person);
            System.out.println("Клон: " + person2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
