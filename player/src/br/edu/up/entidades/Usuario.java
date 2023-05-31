package br.edu.up.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private Reprodutor reprodutor;

    private String cpf;
    private String nome;

    public int getId(){
        return id;
    }
    public Reprodutor getReprodutor() {
        return reprodutor;
    }
    public void setReprodutor(Reprodutor reprodutor) {
        this.reprodutor = reprodutor;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }    
}