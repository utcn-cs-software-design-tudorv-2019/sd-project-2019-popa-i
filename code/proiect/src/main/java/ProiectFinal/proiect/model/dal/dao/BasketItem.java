package ProiectFinal.proiect.model.dal.dao;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class BasketItem extends BaseEntity{
    private Integer number;

    @JoinColumn(name = "BASKET_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Basket basket;

    @JoinColumn(name = "Television_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Television television;


    @JoinColumn(name = "Notebooks_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Notebook notebook;



    @Column(name = "BASKET_ID", updatable = false, insertable = false)
    private Long basketId;

    @Column(name = "TELEVISION_ID", updatable = false, insertable = false)
    private Long televisionId;

    @Column(name = "NOTEBOOK_ID", updatable = false, insertable = false)
    private Long notebookId;


}
