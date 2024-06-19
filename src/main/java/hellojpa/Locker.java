package hellojpa;

import jakarta.persistence.*;

@Entity
public class Locker {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne(mappedBy = "locker") // Member에 locker가 연관관계 주인
    private Member member; // 읽기 전용
}
