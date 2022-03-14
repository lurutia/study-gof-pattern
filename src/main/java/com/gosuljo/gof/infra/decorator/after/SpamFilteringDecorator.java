package com.gosuljo.gof.infra.decorator.after;

public class SpamFilteringDecorator extends CommentDecorator {
    public SpamFilteringDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        if (isNotSpam(comment)) {
            super.addComment(comment);
        }
    }

    private boolean isNotSpam(String comment) {
        return !comment.contains("http");
    }
}
