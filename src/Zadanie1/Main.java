package Zadanie1;

import Zadanie1.Accountant;
import Zadanie1.Director;

public class Main {

    public static void main (String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        director.gdeRabotaesh();
        worker.gdeRabotaesh();
        accountant.gdeRabotaesh();
    }
}