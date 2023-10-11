/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crm;

/**
 *
 * @author gabriele.urban
 */
public class Membro {
    private String nome, cognome, genere, pianoIsc, dataNas, dataIsc;
    Membro(String nome, String cognome, String genere, String pianoIsc, String dataNas, String dataIsc){
        this.nome = nome;
        this.cognome = cognome;
        this.genere = genere;
        this.pianoIsc = pianoIsc;
        this.dataNas = dataNas;
        this.dataIsc = dataIsc;
    }
    
    public String toString(){
        return nome + "; " + cognome + "; " + genere + "; " + pianoIsc + "; " + dataNas + "; " + dataIsc;
    }
}
