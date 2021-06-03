package factory;

import java.util.Objects;

public class Pessoa {
    private Long id;
    private String email;
    private String nomecompleto;

    public Pessoa(Long id, String email, String nomecompleto) {
        this.id = id;
        this.email = email;
        this.nomecompleto = nomecompleto;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nomecompleto, pessoa.nomecompleto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomecompleto);
    }
}
