create table students (
    id bigint not null AUTO_INCREMENT,
    first_name varchar(150) not null,
    last_name varchar(200) null,
    birth_date date not null,
    constraint pk_student primary key(id)
) engine=innoDB;