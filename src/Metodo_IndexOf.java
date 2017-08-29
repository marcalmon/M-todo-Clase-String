/*El método indexOf retorna la posicion de la primera ocurrencia de un caracter
 *dentro del String. Si la cadena no contiene ese caracter entonces retorna un
 *valor negativo.
 * @author Ingles
 */
public class Metodo_IndexOf {
    
    
    public static void main(String[] args){
    
        String cadena="Hoy Es un Dia Lluvioso";
        
        System.out.println(cadena.indexOf("D"));
        
        System.out.println(cadena.toLowerCase());
        
        System.out.println(cadena.startsWith("H"));
        
        System.out.println(cadena.endsWith("e"));
        
        System.out.println(cadena.equals("Hoy Es un Dia Lluvioso"));
        
        System.out.println(cadena.toUpperCase());
        
        System.out.println(cadena.replace('o', 'e'));
        
        System.out.println(cadena.charAt(2));
        
        System.out.println(cadena.length());
    
    }
}
