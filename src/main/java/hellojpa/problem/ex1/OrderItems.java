package hellojpa.problem.ex1;

import jakarta.persistence.*;

@Entity
public class OrderItems {

    @Id
    @Column(name = "ORDERITEMS_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private ItemEx item;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    private int orderPrice;
    private int count;

}
