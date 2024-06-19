package hellojpa.problem.ex1;

import jakarta.persistence.*;

@Entity
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;
    private String city;
    private String zipcode;
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
}