package onready;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import onready.Vehiculo;
/**
 *
 * @author Nahu
 */
public class Main {
    public static void main(String[] args) {
        
        // Creamos el ArrayList
        
        ArrayList <Vehiculo> vehiculoList;
         vehiculoList = new ArrayList <Vehiculo>();
         
         // Se crean los objetos y los metemos dentro del array
        
        Vehiculo veh0 = new Vehiculo("Peugeot" , "206" , "4" , (float) 200000.00);
        vehiculoList.add(veh0);
        
        Vehiculo veh1 = new Vehiculo("Honda" , "Titan" , "125c", (float) 60000.00);
        vehiculoList.add(veh1);
        
        Vehiculo veh2 = new Vehiculo("Peugeot" , "208" , "5" , (float) 250000.00);
        vehiculoList.add(veh2);
        
        Vehiculo veh3 = new Vehiculo("Yamaha" , "YBR" , "160c" , (float) 80500.50);
        vehiculoList.add(veh3);
        
        //Mostramos los vehiculos
        System.out.println("Marca: " + vehiculoList.get(0).marca + " // " + "Modelo: " + vehiculoList.get(0).modelo + " // " + "Puertas: " + vehiculoList.get(0).tipo + " // " + "Precio: " + "$" + vehiculoList.get(0).precio);
	System.out.println("Marca: " + vehiculoList.get(1).marca + " // " + "Modelo: " + vehiculoList.get(1).modelo + " // " + "Cilindradas: " + vehiculoList.get(1).tipo + " // " + "Precio: " + "$" + vehiculoList.get(1).precio);
	System.out.println("Marca: " + vehiculoList.get(2).marca + " // " + "Modelo: " + vehiculoList.get(2).modelo + " // " + "Puertas: " + vehiculoList.get(2).tipo + " // " + "Precio: " + "$" + vehiculoList.get(2).precio);
	System.out.println("Marca: " + vehiculoList.get(3).marca + " // " + "Modelo: " + vehiculoList.get(3).modelo + " // " + "Cilindradas: " + vehiculoList.get(3).tipo + " // " + "Precio: " + "$" + vehiculoList.get(3).precio);
        
        //Salto de linea
        System.out.println("=============================\t");
        
        //Vehículo más caro
        Vehiculo vehiculoMayorPrecio = Collections.max(vehiculoList, Comparator.comparing(c -> c.getPrecio()));
       System.out.println("Vehículo más caro: " + vehiculoMayorPrecio.marca + " " + vehiculoMayorPrecio.modelo);
       
       //Vehiculo mas barato
       Vehiculo vehiculoMenorPrecio = Collections.min(vehiculoList, Comparator.comparing(c -> c.getPrecio()));
       System.out.println("Vehículo más barato: " + vehiculoMenorPrecio.marca + " " + vehiculoMenorPrecio.modelo);
       
       // Vehiculo con la letra "Y"
      // Vehiculo vehiculoY = Collections.sort();
      //  System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + vehiculoY); 
       //Salto de linea
        System.out.println("=============================\t");
        
       //Vehiculos ordenados por precio de mayor a menor
       float fArr[] = {(float) 250000.00,(float) 60000.00, (float)200000.00,(float) 80500.50};
        
        Arrays.sort(fArr);
        System.out.println("Vehiculos ordenados por precio de menor a mayor: ");
        for(float number : fArr){
            System.out.println("Number " + number);
        }
   // Vehiculo vehiculoOrdenado = Collections.EMPTY_MAP.keySet("Y");
     // System.out.println("Vehículos ordenados por precio de mayor a menor: " + vehiculoOrdenado.marca + " " + vehiculoOrdenado.modelo);
    
    }
    }
