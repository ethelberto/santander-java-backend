package ethel.santander_java_backend.brasileirao.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_score")
public class Participacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(cascade = CascadeType.ALL)
    private Torneio torneio;
    @OneToOne(cascade = CascadeType.ALL)
    private Time time;
    private int partidasJogadas;
    private int pontuacao;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int golsPara;
    private int golsContra;
}
