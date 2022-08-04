public class Main2 {

    public static void main(String [] args){
        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();
        System.out.println(miCoche.puertas);
    }

    static class Coche {
        public int puertas = 0;

        public void IncrementarPuertas() {
            this.puertas++;
        }
    }

}
