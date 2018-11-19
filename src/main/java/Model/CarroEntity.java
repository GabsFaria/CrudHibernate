package Model;

import javax.persistence.*;

@Entity
@Table(name ="carro", schema = "crudcarro")
public class CarroEntity {

    @Id
    @SequenceGenerator(name="id", schema = "crudcarro", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "id",strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome",length = 50,nullable = false)
    private String nome;
    @Column(name = "marca", length = 50, nullable = false)
    private String marca;
    @Column(name = "ano", length = 4, nullable = false)
    private String ano;
    @Column(name = "placaDoCarro",length = 8,nullable = false,unique = true)
    private String placa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String   getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    @Override
    public String toString() {
        return "Carro{"+
                "  nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", ano='" + ano + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }
}
