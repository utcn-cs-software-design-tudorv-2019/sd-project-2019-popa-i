package ProiectFinal.proiect.model.dal.dao;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class BasketUser extends BaseEntity {

    @JoinColumn(name = "APPLICATION_USER_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private ApplicationUser applicationUser;

    @JoinColumn(name = "LECTURE_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Basket basket;

    @Column(name = "APPLICATION_USER_ID", updatable = false, insertable = false)
    private Long applicationUserId;

    @Column(name = "LECTURE_ID", updatable = false, insertable = false)
    private Long basketId;

}
