package Principal;

import java.util.Iterator;
import java.util.Locale;

import javax.swing.JOptionPane;
public class Rota {

    public void planejarDia() {   	
    	Integer rota = Integer.parseInt(JOptionPane.showInputDialog("Quantas rotas serão feitas?"));
    	Integer qOnibus = Integer.parseInt(JOptionPane.showInputDialog("Quantas ônibus a empresa possui?"));
//    	Double valorDiesel = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do litro do óleo diesel atualmente?").replace(",","."));
    	
	
    	Integer[] kmRota = new Integer [qOnibus];
      	for(int i=0; i<rota; i++) {
    	   kmRota[i] = Integer.parseInt(JOptionPane.showInputDialog("Quantos quilômetros serão percorridos na rota "+ i).replace(",","."));    	      	   
       };
       
//       for(int i=0; i<qOnibus; i++) {
//    	   System.out.println(kmRota[i]);
//    	   };
       
////// Km por litro cada ônibus faz;       
       Double[] kmCadaBus = new Double[qOnibus];
       for(int i=0; i<qOnibus; i++) {
    	   kmCadaBus[i] = Double.parseDouble(JOptionPane.showInputDialog("Quantos km/l o ônibus "+i+" faz?").replace(",","."));
    	   
       };
       
/////  Quantidade de litros de óleo diesel cada ônibus precisará;
       Double[][] litrosRota = new Double[rota][qOnibus];
       for(int i=0; i<rota;i++) {
    	   for(int j=0;j<qOnibus;j++) {
    		   litrosRota[i][j] = kmRota[i] / kmCadaBus[j];    		   
       }   
    	  	}
             
       
/////  Cálculos finais;
            
       //Total de quilômetros
       Double totalKM=0.0;
       
       for(int i=0; i<rota;i++) {
    	   totalKM = totalKM + kmRota[i];
       }
              
       
       //Total de litros
       Double totalL=0.0;
       for(int i=0;i<rota;i++) {
    	   for(int j=0;j<qOnibus;j++) {
    		  totalL = totalL + litrosRota[i][j];
    	   }
       }
       
       JOptionPane.showMessageDialog(null, "Serão percorridos " + totalKM + " quilômetros no total." + "\nSerão necessários " + totalL+  " litros para realizar todas a rotas.");
       
   
                   
}
	
	
	
}
