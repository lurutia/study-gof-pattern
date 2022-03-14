package com.gosuljo.gof.decorator;

import com.gosuljo.gof.infra.decorator.after.CommentService;
import com.gosuljo.gof.infra.decorator.after.DefaultCommentService;
import com.gosuljo.gof.infra.decorator.after.SpamFilteringDecorator;
import com.gosuljo.gof.infra.decorator.after.TrimmingCommentDecorator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DecoratorAfterTests {

    @Test
    public void decorator_test_2() {
        boolean isEnableTrimming = true;
        boolean isSpamFiltering = true;

        CommentService commentService = new DefaultCommentService();

        if (isEnableTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        if (isSpamFiltering) {
            commentService = new SpamFilteringDecorator(commentService);
        }

        commentService.addComment("오징어게임");
        commentService.addComment("보는게 하는거 보다 재밌을 수가 없지...");
        commentService.addComment("http://gosuljo.com");
    }
}
