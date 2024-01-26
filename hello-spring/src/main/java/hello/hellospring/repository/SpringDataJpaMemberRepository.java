package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    //자동으로 query문을 생성한다 "Name", param = String name -> select m from member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
