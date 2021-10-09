package senatarde1;

import javax.swing.JOptionPane;

public class punto2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int n,invitados,horas,cedula;
		int hora1=0,hora2=0,hora3=0,total,sumainvitados=0,conth1=0,conth2=0,conth3=0;
		int valor1=800,valor2=600,valor3=400, precio1=100000,precio2=200000,precio3=300000,sumahoras1=0,sumahoras2=0,sumahoras3=0 ;
		
		n =Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de fiestas en el mes"));
		
		
		for(int i=1 ; i<=n; i++) {
			
			invitados=Integer.parseInt(JOptionPane.showInputDialog("la cantidad de invitados "));
			sumainvitados=sumainvitados+invitados;
			//primera categoria
		 if (invitados>=1 && invitados <=100) {
			 
			 cedula=Integer.parseInt(JOptionPane.showInputDialog("ingrese cedula del contratante"));
			 
			
			 
			 horas=Integer.parseInt(JOptionPane.showInputDialog("la cantidad de horas"));
			 
			  if(horas>=1 && horas <=3) {
				   hora1=hora1+1;  
				   System.out.println("monto a pagar de "+cedula+ " es: "+ valor1 +" adicional "+precio1);
				   conth1=conth1+1;
				  
			  }
			   else if(horas>=4 && horas <=6) {
				   hora2=hora2+1;  
				   System.out.println("monto a pagar de "+cedula+ " es: "+valor1+ " adicional "+precio2);
				   
				   conth2=conth2+1;
			   }
			   else if(horas > 6) {
				   hora3=hora3+1;  
				   System.out.println("monto a pagar  de "+cedula+" es : "+valor1 + " adicional "+ precio3);
				   conth3=conth3+1;
				   }
			  
			  sumahoras1=sumahoras1+horas;
			  
		 }
				//segunda categoria
				 if (invitados>=101 && invitados <=500) {
					
					 
					 cedula=Integer.parseInt(JOptionPane.showInputDialog("ingrese cedula del contratante"));
					 
					 horas=Integer.parseInt(JOptionPane.showInputDialog("la cantidad de horas"));
					 
					  if(horas>=1 && horas <=3) {
						   hora1=hora1+1;  
						   System.out.println("monto a pagar de "+cedula+ " es: "+ valor2 +" adicional "+precio1);
						   conth1=conth1+1;
					  }
					   else if(horas>=4 && horas <=6) {
						   hora2=hora2+1;  
						   System.out.println("monto a pagar de "+cedula+ " es: "+valor2+ " adicional "+precio2);
						   conth1=conth2+2;
						   
					   }
					   else if(horas > 6) {
						   hora3=hora3+1;  
						   System.out.println("monto a pagar  de "+cedula+" es : "+valor2 + " adicional "+ precio3);
						   conth1=conth3+3;
						   }
					  sumahoras2=sumahoras2+horas;
				 }
					  
						//tercera categoria
						 if (invitados>=501) {
							 
							 cedula=Integer.parseInt(JOptionPane.showInputDialog("ingrese cedula del contratante"));
						 
							 
							 horas=Integer.parseInt(JOptionPane.showInputDialog("la cantidad de horas"));
							 
							  if(horas>=1 && horas <=3) {
								   hora1=hora1+1;  
								   System.out.println("monto a pagar de "+cedula+ " es: "+ valor3 +" adicional "+precio1);
								   conth1=conth1+1;
							  }
							   else if(horas>=4 && horas <=6) {
								   hora2=hora2+1;  
								   System.out.println("monto a pagar de "+cedula+ " es: "+valor3+ " adicional "+precio2);
								   conth2=conth2+1;
							   }
							   else if(horas > 6) {
								   hora3=hora3+1;  
								   System.out.println("monto a pagar  de "+cedula+" es : "+valor3 + " adicional "+ precio3);
								   conth3=conth3+1;
								   }
							  
							  sumahoras3=sumahoras3+horas;
							  
							  }
			  
			  
			  }
		   
		   total= sumahoras1+sumahoras2+sumahoras3;
		   System.out.println("la duracion total de las fiestas es de: "+total);
		   System.out.println("promedio de duracion de las fiestas: " + total/n );
		   System.out.println("promedio de los invitados de las fiestas:"+sumainvitados /n  );
		   System.out.println("cuantas fiestas se realizan por cada rango:" );
		   System.out.println("rango 1- de 1 a 3 horas: "+conth1 );
		   System.out.println("rango 2- de 4 a 6 horas: "+conth2 );
		   System.out.println("rango 3- mas de 6 horas: "+conth3 );
		   
		   
		   
		
		 }
}
		 
			  
			  
			  
			 
			 
	
	
	

			
		
		
		
	


