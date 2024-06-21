package hellojpa.problem.ex1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class MemberEx {

    @Id
    @Column(name = "MEMBER_ID")
    private Long id;

    private String name;
    private String street;
    private String zipcode;

    @OneToMany(mappedBy = "member")
    private List<Order> orderList = new ArrayList<>();
}
