create table courses (
    id bigint not null AUTO_INCREMENT,
    course_name varchar(200) not null,
    active bit not null default 1,
    constraint pk_course primary key(id)
) engine=innodb;