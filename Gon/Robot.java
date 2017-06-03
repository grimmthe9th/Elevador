package Gon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Robot {
	boolean pedirNuevamente = true ;
    public float leer(){
 	   
 	  String valorleido = " ";
 	  float valorConvertido = 0;
 	  try { 
			InputStreamReader io = new InputStreamReader (System.in);
			BufferedReader leer = new BufferedReader(io);
			valorleido = leer.readLine();
			valorConvertido = Float.parseFloat(valorleido);
			pedirNuevamente= false;
			
		} catch (NumberFormatException nf) {
			System.out.println("Disculpe ud ha colocado un valor erroneo");
			pedirNuevamente = true ;
		}catch (Exception e) {
			 System.out.println("Ha ocurrido un error general");
	        pedirNuevamente = true ; 	
		}
 	  
 	  return valorConvertido;
 	   
    }
    public String leertexto(){
		   
	 	  String valorleido = " ";
	 	 
	 	  try { 
				InputStreamReader io = new InputStreamReader (System.in);
				BufferedReader leer = new BufferedReader(io);
				valorleido = leer.readLine();
				pedirNuevamente= false;
				
			} catch (IOException objException) {
				System.out.println("Disculpe ocurrio un error");
				pedirNuevamente = true ;
			}catch (Exception e) {
				 System.out.println("Ha ocurrido un error general");
		        pedirNuevamente = true ; 	
			}
	 	 return valorleido;
	  
    
    
    }


    public void lineaHorizontal(int A){
 		 for (int x = 0; x < A ; x++) {
 			System.out.print("*");
 		}
 	}
    
 	public void lineaVertical(int A){
 		
 		for (int i = 0; i < A; i++) {
				
 			System.out.println();
 			
 			for (int y = 0; y < A; y++) {
     			if (y==0 ||(y+1)==A) {
     				System.out.print("*");
     			}else {
     				System.out.print(" ");
     		}
     	  }
		}
     }


 	public int[] ordenarMagicamente(int[]arr){
 		Arrays.sort(arr);
 		return arr;
 	}
 	
}
