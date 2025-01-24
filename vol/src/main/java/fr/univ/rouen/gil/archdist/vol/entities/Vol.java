package fr.univ.rouen.gil.archdist.vol.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "vols")
public class Vol {
    @Id
    private Integer volId ;
    private BigDecimal prix ;

    @ManyToOne
    @JoinColumn(name="pays_depart" ,referencedColumnName="codeIso")
    private Pays paysDepart ;

    @ManyToOne
    @JoinColumn(name="pays_arrive" ,referencedColumnName="codeIso")
    private Pays paysArrive ;

}
