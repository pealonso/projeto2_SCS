package com.unicsul.Projeto1.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.relation.Role;
import java.io.Serializable;
import java.util.Objects;


@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;
    @Column(name = "nome_usuario", nullable = false, unique = true, length = 100)
    private String nomeUsuario;
    @Column(name = "senha", nullable = false, length = 200)
    private String senha;
    @Column(name = "celular", length = 11)
    private Long celular;
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false, length = 25)
    private Role role;

    public enum Role{
        ROLE_ADM, ROLE_USUARIO
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode(){return Objects.hash(id);}

    @Override
    public String toString(){
        return "Usuario{" +
                "id=" + id +
                "}";
    }
}
