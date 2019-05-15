package ProiectFinal.proiect.model.dal.dao;

import lombok.*;

import javax.persistence.Entity;


@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Television extends BaseEntity {
    private String name, diagonal,price;
}
