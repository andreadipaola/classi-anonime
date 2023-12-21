package it.andreadipaola;

public class Direttore extends Persona {
    @Override
    public String calcolaCodiceFiscale() {
        return getNome() + "superDirector";
    }
}
