package ProiectFinal.proiect.model.dal.dao;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToOne;


@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class UserInfo extends BaseEntity {
    private String name,cnp,address,surname;

    @OneToOne
    private ApplicationUser applicationUser;
}
