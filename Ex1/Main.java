package Ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {

   private static List<Forma> formas = new ArrayList<>();


    private static void PopulaArray(){
        formas.add(new Circulo(32));
        formas.add(new Cubo(3,3,3));
        formas.add(new Quadrado(3,3));
        formas.add(new Esfera(20));
        formas.add(new Triangulo(10,5));
        formas.add(new Tetraedro(20, 20, 20));
    }




    public static void main(String[] args) {
         PopulaArray();
         formas.forEach(e -> {
             System.out.printf("Area: %.2f\n", e.ObterArea());
             if(e instanceof FormaTridimensional){
                 System.out.printf("Volume: %.2f\n", ((FormaTridimensional) e).ObterVolume());
             }

         });





    }

}
