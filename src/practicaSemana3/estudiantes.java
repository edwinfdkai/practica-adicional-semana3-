package practicaSemana3;

import java.util.Iterator;
import java.util.Scanner;

public class estudiantes {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int cantEst;
		int i;
		double suma = 0;
		double promedio;
		
		//Evitar que el programa se rompa si nos ponen un numero negativo
		
		do {
			System.out.println("Digite la cantidad de alumnos a evaluar: ");
			cantEst = entrada.nextInt();
		
	}while (cantEst <=0);
		
		String[] nombres = new String[cantEst];
		
		for(i=0; i<cantEst;i++) {
			System.out.println("Digite el nombre del estudiante :"+(i+1));
			nombres[i] =entrada.next();
		}
		String[]apellidos=new String[cantEst];
		for (i=0;i<cantEst;i++) {
  			System.out.print("Digite el apellido del estudiante: "+(i+1));
  			apellidos[i]=entrada.next();

		}
		System.out.print("Digite por favor la cantidad de examenes realizados: ");
  		int cantidadExamenes=entrada.nextInt();
  		
  		int[]examen=new int[cantidadExamenes];// 
  		int[]agruNotas = new int[examen.length];
  		double[]promedioNo =new double[nombres.length];
  		
  		for(i=0;i<cantEst;i++) {
  			for(int o=0;o<agruNotas.length;o++) {
  			System.out.println("Digite la nota del examen numero: " + (o+1));
  			agruNotas[o]=entrada.nextInt();
  			suma = suma +agruNotas[o];
  			}
  			promedio =suma / agruNotas.length;
  			System.out.println("El promedio de las notas es: " + promedio + "numero de estudiante "+(i+1));
  			suma=0;
  			promedioNo[i]=promedio;
  			
  		}
  		
  		double notaMax = 0.0;
  		String mejorResul="";
  		String apMejor = "";
  		
  		for (i=0; i< promedioNo.length;i++) {
       	 if(promedioNo[i]>notaMax) {
       		notaMax=promedioNo[i];
       		mejorResul=nombres[i];
       		apMejor=apellidos[i];
       	 }
       }
  		System.out.println("La mejor nota es de  :"+mejorResul +" "+ apMejor+" su nota fue " +notaMax);
        
  		Double notaMin = 10.0 ;
        String minResul = " ";
        String apMin =" ";
        for (i=0; i<promedioNo.length;i++) {
       	 if(promedioNo[i]<notaMin) {
       		notaMin=promedioNo[i];
       		minResul=nombres[i];
       		apMin=apellidos[i]; 
       		 
       	 }
       }
        System.out.println("La peor nota es de  :"+minResul +" "+ apMin+" su nota fue " +notaMin);
        for(i=0;i<promedioNo.length;i++) {
	    	   if(promedioNo[i]<7) {System.out.println("El estudiante :"+ nombres[i]+" "+apellidos[i] + " repetir el curso");
	    		   
	    	   }else {
	    		  System.out.println("El estudiante :"+ nombres[i]+" "+apellidos[i] +" aprobo el curso y avanzo"); 
	    	   }
	       }
        entrada.close();
	}
}
