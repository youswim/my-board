INSERT INTO post (id, title, content) values (1, 'title1', 'content1');
INSERT INTO post (id, title, content) values (2, 'title2', 'content2');
INSERT INTO post (id, title, content) values (3, 'title3', 'content3');

INSERT INTO post_comment (id, comment, post_id, parent_comment_id) values (1, 'comment1-1', 1, null);
INSERT INTO post_comment (id, comment, post_id, parent_comment_id) values (2, 'comment1-2', 1, null);
INSERT INTO post_comment (id, comment, post_id, parent_comment_id) values (3, 'comment2-1', 2, null);