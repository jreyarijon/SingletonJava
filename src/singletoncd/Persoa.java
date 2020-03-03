/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletoncd;

/**
 *
 * @author Josemolamazo
 */
public class Persoa {
    
    private static Persoa unica;
    static String nome;
    static String apelido;
    static int idade;

    private Persoa() {
    }

    private Persoa(String nome, String apelido, int idade) {
        unica.nome = nome;
        unica.apelido = apelido;
        unica.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        unica.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        unica.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        unica.idade = idade;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", apelido=" + apelido + ", idade=" + idade;
    }

    public static Persoa getSingletonInstance(String nome, String apelido, int idade) {
        if (unica==null){
            unica= new Persoa(nome,apelido,idade);
           
        }
        else{
            System.out.println("Non se pode crear o obxecto"+ nome+", "+apelido+", "+idade);
        }
        return unica;
    }

}
