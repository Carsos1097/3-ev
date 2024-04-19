package miCodigo;

public class ManejaPersona {

   public static void main(String[] args) {
       // TODO Auto-generated method stub
       Persona alumnos[];
       alumnos=new Persona[3];
       alumnos[0]=new Persona("García","Rodríguez","Ana");
       alumnos[1]=new Persona("Plou","Ledesma","Manuel");
       alumnos[2]=new Persona("de la Vega","Próspera","Juana");
       for(int cont=0;cont<3;cont++) {
           System.out.println("\n- "+alumnos[cont].getNombreCompleto());    
           
       }
   }

}
