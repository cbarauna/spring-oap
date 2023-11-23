package com.example.demo;

import lombok.Data;

import java.time.LocalDate;


public class Pessoa {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private LocalDate dataNascimento;
    private int id;

    @FormatarCPF
    public String getCpf() {
        return cpf;
    }
    @FormatarCPF
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
