package it.andreadipaola;

/**
 * Normalmente per estendere una classe si utilizza questo metodo, ossia si crea una superclasse dalla quale si fa estendere la nuova classe figlia che salveremo su un file separato come nel caso della classe Direttore.
 * In caso di classi anonime, ossia quelle classi che ci servono soltanto in un occasione possiamo usare la sintassi seguente
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("CLASSI ANONIME");
        // Classe anonima che estende da persona e fa l'override del suo metodo
        Persona p = new Persona("Andrea", "Di Paola", 37) {
            public String calcolaCodiceFiscale(){
                return getNome() + " superDirector";
            }
        };
        System.out.println(p.calcolaCodiceFiscale());
    }
}