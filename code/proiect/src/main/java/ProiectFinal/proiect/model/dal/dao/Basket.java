package ProiectFinal.proiect.model.dal.dao;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Basket extends BaseEntity {
    @OneToOne
    Notebook notebook;

    @OneToOne
    Television television;


}
