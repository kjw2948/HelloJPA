package hellojpa;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

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

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    @Column(name = "USERNAME") // DB 테이블에 저장되는 column 이름이 name
    private String username;

    @Column(name = "TEAM_ID")
    private Long teamId;

    public Member() {
    }
}
