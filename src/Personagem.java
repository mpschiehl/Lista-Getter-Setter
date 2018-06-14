/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcio Pedro Schiehl
 */
public class Personagem {
    private String nome,cla,aldeia;
    private long nivelChaKra;
    private char sexo;
    private byte idade, idadeMental;

    public void setNome(String nome){
       /* if(nome.trim().equals("")){
            throw new
            IllegalArgumentException("Nome não pode ser vazio!!");
        }
        if(nome.trim().length()<3){
            throw new IllegalArgumentException
        ("Nome tem que conter no minimo 3 caracteres");
        }*/
        this.nome = nome;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public void setNivelChaKra(long nivelChaKra) {
        this.nivelChaKra = nivelChaKra;
    }

    public String getNome() {
        return nome;
    }

    public String getCla() {
        return cla;
    }

    public String getAldeia() {
        return aldeia;
    }

    public long getNivelChaKra() {
        return nivelChaKra;
    }
    
   public void setSexo(char sexo){
       this.sexo= sexo;
   } 

    public char getSexo() {
        return sexo;
    }
    public void setIdade(){
        this.idade = idade;
    }

    public byte getIdade() {
        return idade;
    }
    public void setIdademental(byte idadeMental){
        this.idadeMental = idadeMental;
    }

    public byte getIdadeMental() {
        return idadeMental;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public void setIdadeMental(byte idadeMental) {
        this.idadeMental = idadeMental;
    }
  
}
