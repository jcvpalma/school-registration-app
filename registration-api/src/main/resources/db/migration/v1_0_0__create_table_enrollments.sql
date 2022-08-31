CREATE TABLE enrollments (
  id bigint not null auto_increment,
  course_id bigint not null,
  student_id bigint not null,
  dt_enrollment date not null,
  constraint pk_enrollments primary key(id)
);