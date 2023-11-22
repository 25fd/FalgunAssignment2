INSERT into Course (id, name) values (1001, 'Spring Boot');
INSERT INTO COURSE (id, name) VALUES (1002, 'Spring MVC');
INSERT INTO COURSE (id, name) VALUES (1003, 'Spring AOP');
INSERT INTO COURSE (id, name) VALUES (1004, 'Spring Security');


INSERT INTO  STUDENT (id, name) VALUES (2001, 'Ranga');
INSERT INTO  STUDENT (id, name) VALUES (2002, 'Satish');
INSERT INTO  STUDENT (id, name) VALUES (2003, 'Ravi');
INSERT INTO  STUDENT (id, name) VALUES (2004, 'Sathya');


INSERT INTO student_courses (course_id, student_id) VALUES (1001, 2001);
INSERT INTO student_courses (course_id, student_id) VALUES (1002, 2001);
INSERT INTO student_courses (course_id, student_id) VALUES (1003, 2003);
INSERT INTO student_courses (course_id, student_id) VALUES (1004, 2004);
INSERT INTO student_courses (course_id, student_id) VALUES (1001, 2002);
INSERT INTO student_courses (course_id, student_id) VALUES (1002, 2003);
INSERT INTO student_courses (course_id, student_id) VALUES (1003, 2004);
INSERT INTO student_courses (course_id, student_id) VALUES (1004, 2002);