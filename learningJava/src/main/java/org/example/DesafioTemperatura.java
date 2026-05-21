package org.example;

public class DesafioTemperatura {

    public static void main(String[] args){
        double temperaturaEmCelcius = 30.4;
        double tempereaturaEmFahrenheit = (temperaturaEmCelcius *1.8) +32;
        String msg = String.format("A temperatura de %.3f Celcius é equivalente a %.3f Fahrenheit", temperaturaEmCelcius, tempereaturaEmFahrenheit);

        System.out.println(msg);

        int tempFahInt = (int) tempereaturaEmFahrenheit;
        System.out.println("A temperatura fahrenheit inteira é "+tempFahInt);
    }
}
