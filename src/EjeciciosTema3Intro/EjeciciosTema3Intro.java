package EjeciciosTema3Intro;

/**
 *
 * @author JEASS
 */
public class EjeciciosTema3Intro {

    public static void main(String[] args) {
        System.out.println("El resultado de la suma de 3 numeros es: "+suma(10, 20, 30));
        
        
        Coche miCoche = new Coche();
        miCoche.incrementaNumPuertas();
        System.out.println("El numero de puertas de miCoches es: "+miCoche.getNumPuertas());
    }
    
    public static int suma(int a, int b, int c){
       int resultado =  a+b+c;
       return resultado; 
    };
    
    static class Coche{
        private int numPuertas;

        public Coche() {
            this.numPuertas = 0;
        }
        
        public void incrementaNumPuertas(){
            numPuertas++;
        }

        public int getNumPuertas() {
            return numPuertas;
        }
    }
    
}
