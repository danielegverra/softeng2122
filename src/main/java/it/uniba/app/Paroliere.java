package it.uniba.app;

/**
 * Questa classe è di tipo 'Control'.
 * Si occupa di gestire le azioni che può svolgere il paroliere.
 */
public class Paroliere {
    /**
     * METODI
     */
    
    /**
     * Questo metodo permette al paroliere di cambiare la parola segreta
     * da indovinare.
     */
    public static void impostaParolaSegreta(String s){
        Wordle.setParolaSegreta(s);
    }

    /**
     * Questo metodo permette al paroliere di visualizzare la parola
     * segreta corrente.
     */
    public static void  visualizzaParola(){

        if(!Wordle.getParolaSegreta().equals("")){
            System.out.println("La parola segreta e' " + Wordle.getParolaSegreta());
        } else{
            System.out.println("Non e' presente una parola segreta.");
        }
    }
}
