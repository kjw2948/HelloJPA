package hellojpa.problem;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Item {
    @Id @GeneratedValue
    private Long id;

    private String name;
    private int price;
}
