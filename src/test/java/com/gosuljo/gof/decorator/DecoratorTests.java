package com.gosuljo.gof.decorator;

import com.gosuljo.gof.infra.decorator.before.CommentService;
import com.gosuljo.gof.infra.decorator.before.SpamFilteringCommentService;
import com.gosuljo.gof.infra.decorator.before.TrimmingCommentService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DecoratorTests {

    @Test
    public void decorator_test_1() {
        CommentService commentService = new SpamFilteringCommentService();
        commentService.addComment("오징어게임");
        commentService.addComment("보는게 하는거 보다 재밌을 수가 없지...");
        commentService.addComment("http://gosuljo.com");

        CommentService commentService2 = new TrimmingCommentService();
        commentService2.addComment("오징어게임");
        commentService2.addComment("보는게 하는거 보다 재밌을 수가 없지...");
        commentService2.addComment("http://gosuljo.com");

        // 만약 둘다 적용하고 싶다면??
    }
}
