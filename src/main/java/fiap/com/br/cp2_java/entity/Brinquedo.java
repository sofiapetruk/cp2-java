package fiap.com.br.cp2_java.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TDS_TB_Brinquedos")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Brinquedo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name="BrinquedoSeq", sequenceName="BrinquedoSeq")
    @Column(name = "id_brinquedo")
    private Long id;

    @NotNull
    @Column(name = "nome")
    private String nome;

    @Size(min = 2, max = 50)
    @Column(name = "tipo")
    private String tipo;

    @Column(name = "tamanho")
    private double tamanho;

    @NotNull
    @Column(name = "preco")
    private double preco;
}
