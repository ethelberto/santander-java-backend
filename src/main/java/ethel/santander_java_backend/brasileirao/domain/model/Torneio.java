package ethel.santander_java_backend.brasileirao.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_torneio")
public class Torneio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 4)
    private int ano;
    @OneToOne(cascade = CascadeType.ALL)
    private Campeonato campeonato;
    private char divisao;

    public long getId() {
        return id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public char getDivisao() {
        return divisao;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setDivisao(char divisao) {
        this.divisao = divisao;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }
}
