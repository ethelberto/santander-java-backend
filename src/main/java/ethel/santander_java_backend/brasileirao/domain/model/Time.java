package ethel.santander_java_backend.brasileirao.domain.model;

import jakarta.persistence.*;
@Entity(name = "tb_time")
public class Time {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 20)
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private Participacao score;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Participacao getScore() {
        return score;
    }

    public void setScore(Participacao score) {
        this.score = score;
    }
}
