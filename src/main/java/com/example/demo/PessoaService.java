package com.example.demo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PessoaService {
    public Pessoa getPessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Exemplo Pessoa");
        pessoa.setCpf("12345678901");
        pessoa.setDataNascimento(LocalDate.of(1990, 1, 1));
        pessoa.setId(1);
        return pessoa;
    }
}
