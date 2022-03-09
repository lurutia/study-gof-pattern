package com.gosuljo.gof.prototype;

import com.gosuljo.gof.infra.prototype.before.GithubIssue;
import com.gosuljo.gof.infra.prototype.before.GithubRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class PrototypeTests {
    // 프로토타입 없이 새로운 객체 생성하기
    @Test
    public void prototype_test_1() {
        GithubRepository repository = new GithubRepository();
        repository.setUser("gosuljo");
        repository.setName("study-gof-pattern");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제 : 싱글톤 패턴은 무엇이고 어떤 장점이 있는가");

        String url = githubIssue.getUrl();
        assertEquals("https://github.com/gosuljo/study-gof-pattern/issues/1", url);

        GithubIssue githubIssue2 = new GithubIssue(repository);
        githubIssue2.setId(2);
        githubIssue2.setTitle("2주차 과제 : 팩토리 메소드 패턴은 무엇이고 언제 쓰는가");

        String url2 = githubIssue2.getUrl();
        assertEquals("https://github.com/gosuljo/study-gof-pattern/issues/2", url2);
    }

    // 프로토타입 생성 테스트
    @Test
    public void prototype_test_2() throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("gosuljo");
        repository.setName("study-gof-pattern");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제 : 싱글톤 패턴은 무엇이고 어떤 장점이 있는가");

        String url = githubIssue.getUrl();
        assertEquals("https://github.com/gosuljo/study-gof-pattern/issues/1", url);

        GithubIssue githubIssue2 = (GithubIssue) githubIssue.clone();
        assertTrue(githubIssue != githubIssue2);
        assertTrue(githubIssue.equals(githubIssue2));
        assertTrue(githubIssue.getClass() == githubIssue2.getClass());
    }
}
