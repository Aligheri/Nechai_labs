DROP TABLE IF EXISTS ENROLLMENT CASCADE;
DROP TABLE IF EXISTS COURSE CASCADE;
DROP TABLE IF EXISTS STUDENT CASCADE;
DROP TABLE IF EXISTS PROFESSOR CASCADE;
DROP TABLE IF EXISTS CLASSROOM CASCADE;
DROP TABLE IF EXISTS DEPARTMENT CASCADE;

CREATE TABLE DEPARTMENT (
    department_id SERIAL PRIMARY KEY,
    department_name VARCHAR(100),
    department_code VARCHAR(10),
    building VARCHAR(50),
    phone VARCHAR(15)
);

CREATE TABLE CLASSROOM (
    classroom_id SERIAL PRIMARY KEY,
    room_number VARCHAR(20),
    building VARCHAR(50),
    capacity INTEGER,
    equipment VARCHAR(200)
);

CREATE TABLE PROFESSOR (
    professor_id SERIAL PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    phone VARCHAR(15),
    office_location VARCHAR(50),
    hire_date DATE,
    department_id INTEGER
);

CREATE TABLE STUDENT (
    student_id SERIAL PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100),
    date_of_birth DATE,
    phone VARCHAR(15),
    enrollment_date DATE,
    department_id INTEGER
);

CREATE TABLE COURSE (
    course_id SERIAL PRIMARY KEY,
    course_code VARCHAR(10),
    course_name VARCHAR(100),
    credits INTEGER,
    max_capacity INTEGER,
    semester VARCHAR(20),
    year INTEGER,
    professor_id INTEGER,
    department_id INTEGER,
    classroom_id INTEGER
);

CREATE TABLE ENROLLMENT (
    enrollment_id SERIAL PRIMARY KEY,
    student_id INTEGER,
    course_id INTEGER,
    enrollment_date DATE,
    grade DECIMAL(5,2),
    status VARCHAR(20)
);