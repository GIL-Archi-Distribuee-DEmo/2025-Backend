package fr.univ.rouen.gil.archdist.vol.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="pays")
public class Pays {

    @Id
    private String codeIso ;

    private String nom ;

}
