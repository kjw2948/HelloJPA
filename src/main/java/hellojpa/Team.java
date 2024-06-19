package hellojpa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {
    @Id
    @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;
    private String username;

    @OneToMany(mappedBy = "team") // mappedBy -> 단순 읽기만 가능
    private List<Member> members = new ArrayList<>();
    // DB상에는 나타나지 않는 값이지만 Team 하나당 여러 Member가 존재하므로 생성하고 매핑

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
