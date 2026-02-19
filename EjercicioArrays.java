package ProblemaArray;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class EjercicioArrays {
    
    public static void main(String[] args) {
        int numAlumnos = 40;
        

        Integer[] control = new Integer[numAlumnos];
        int[] listaClase = new int[numAlumnos];
        int[] practicas = new int[numAlumnos];
        float[] calificaciones = new float[numAlumnos];
        

        for (int i = 0; i < numAlumnos; i++) {
            control[i] = (int)(Math.random() * 11);
            practicas[i] = (int)(Math.random() * 11);
            calificaciones[i] = (((float) control[i] + (float) practicas[i]) / 2);
            listaClase[i] = i + 1;
        }


        List<Integer> notas = Arrays.asList(control);
        int minNota = Collections.min(notas);
        int maxNota = Collections.max(notas);
        int indMinNota = notas.indexOf(minNota) + 1;
        int indMaxNota = notas.indexOf(maxNota) + 1;


        System.out.println("Mínimo es: " + minNota);
        System.out.println("Máximo es: " + maxNota);
        System.out.println("Indice del mínimo es : " + indMinNota);
        System.out.println("Indice del máximo es : " + indMaxNota);
        System.out.println("Lista de clase :" + Arrays.toString(listaClase));
        System.out.println("Array de Notas :" + notas);
        System.out.println("Prácticas      :" + Arrays.toString(practicas));
        System.out.println("Calificaciones :" + Arrays.toString(calificaciones));
        

        float[] estadistica = new float[10];
        for (int i = 0; i < 10; i++){
            float count = 0;
            for (int j = 0; j < numAlumnos; j++){
                if ((i < calificaciones[j]) && ((i+1) >= calificaciones[j] )) {
                    count += 1;
                }
            }
            if (count != 0){
                estadistica[i] = (count / numAlumnos);
            } else { 
                estadistica[i] = 0;
            }
            double sol = (Math.round(estadistica[i] * 10000.0)) / 100.0;
            System.out.println("Estadística nota tramo <=" + (i+1) + " = " + sol + "%");
        }
        

        List<Integer> listaAprobados = new ArrayList<>();
        List<Integer> listaSuspensos = new ArrayList<>();

        for (int i = 0; i < numAlumnos; i++){
            if (calificaciones[i] < 5){
                listaSuspensos.add(listaClase[i]);
            } else { 
                listaAprobados.add(listaClase[i]);
            }
        }        
        
        System.out.println("Relación de aprobados por nº de lista: " + listaAprobados);
        System.out.println("Relación de suspensos por nº de lista: " + listaSuspensos);
    

        double[] calif = new double[40];
        for (int j = 0; j < 31; j++){
            calif[j] = (int)(Math.random() * 11);
        }
        System.out.println("Nota antigua alumno nº4: " + calif[3]); 
        calif[3] = 6;
        System.out.println("Nota nueva   alumno nº4: " + calif[3]);
    }
}
