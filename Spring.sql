CREATE DATABASE SpringTask;

USE SpringTask;

INSERT INTO school (school_name) VALUES ('Oman');
INSERT INTO course (course_name) VALUES ('Java');
INSERT INTO mark(obtain_mark) VALUES (50);
INSERT INTO student(student_name) VALUES ('Java');


UPDATE course SET created_date = getdate() where created_date is null;