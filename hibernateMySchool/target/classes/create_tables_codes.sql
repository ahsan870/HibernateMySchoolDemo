create database my_school;
use my_school;


show tables;

create table departments(
id bigint(10) not null auto_increment,
`dname` varchar(20) not null,
`phone` varchar(200),
primary key (id));

create table students(
sid bigint(10) not null auto_increment,
`name` varchar(20) not null,
`phone` varchar(12),
`email` varchar(35),
dept_id bigint(10) not null,
primary key (sid),
foreign key (dept_id) references departments(id));

create table books(
bid bigint(10) not null auto_increment,
`bname` varchar(20) not null,
`writerName` varchar(35),
primary key (bid));

create table students_books(
id bigint(10) not null auto_increment,
student_id bigint(10) not null,
book_id bigint(10) not null,
primary key (id),
foreign key (student_id) references students(sid),
foreign key (book_id) references books(bid));