drop database if exists ejercicio2;
create database ejercicio2;
use ejercicio2;

drop table if exists cientificos;
create table cientificos(
dni varchar(8) primary key,
nomapels nvarchar(255)
);

insert into cientificos(dni,nomapels) value ('1111111A','Cientifico 1');
insert into cientificos(dni,nomapels) value ('1111111B','Cientifico 2');
insert into cientificos(dni,nomapels) value ('1111111C','Cientifico 3');

drop table if exists proyecto;
create table proyecto(
id char(4) primary key,
nombre nvarchar(255),
horas int
);

insert into proyecto(id,nombre,horas) value ('AAA1','proveedor1',100);
insert into proyecto(id,nombre,horas) value ('AAA2','proveedor2',200);
insert into proyecto(id,nombre,horas) value ('AAA3','proveedor3',300);

drop table if exists asignadoa;
create table asignadoa(
id int auto_increment primary key,
cientifico varchar(8),
proyecto char(4),
foreign key (cientifico) references cientificos(dni) on delete cascade on update cascade,
foreign key (proyecto) references proyecto(id) on delete cascade on update cascade
);

insert into asignadoa(cientifico,proyecto) value ('1111111A','AAA1');
insert into asignadoa(cientifico,proyecto) value ('1111111B','AAA2');
insert into asignadoa(cientifico,proyecto) value ('1111111C','AAA3');