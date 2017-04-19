create database ok;
use ok;

create table Persona(nombre varchar(200),DNI varchar(20),direccion varchar(500));
create table Dept(deptno int(10) primary key ,dname varchar(100),loc varchar(100));
create table Emp(empno int(10) primary key, ename varchar(200), deptno int(10), foreign key (deptno) references Dept(deptno), fecha date);

desc dept;
desc emp;
desc persona;
