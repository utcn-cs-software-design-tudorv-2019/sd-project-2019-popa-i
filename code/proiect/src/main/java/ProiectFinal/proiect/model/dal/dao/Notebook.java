package ProiectFinal.proiect.model.dal.dao;

import lombok.*;

import javax.persistence.Entity;



@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Notebook extends BaseEntity {
    private String name, processor,GPU,price;



}
