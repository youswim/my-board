create table post (
    id bigint not null,
    title char(100),
    content TEXT,
    views bigint,
    likes bigint,
    rgsr_id char(20),
    rgst_dtm datetime(6),
    updr_id char(20),
    upd_dtm datetime(6),
    primary key (id)
) engine=InnoDB