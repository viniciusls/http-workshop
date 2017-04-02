package br.com.viniciusls.rest.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Vinicius Luiz on 02/04/2017.
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class User {
    private int codigo;
    private String nome;
    private String email;
    private String biografia;
}
