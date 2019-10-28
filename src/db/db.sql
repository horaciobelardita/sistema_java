drop database if exists gestor_comercio;
create database gestor_comercio;
use gestor_comercio;
create table usuarios (
	id int auto_increment primary key,
    nombre varchar(30) not null,
    nick varchar(15) not null,
    password varchar(60) not null,
    tipo_usuario enum('Admin',
		'Compras, Proveedores',
		'Inventario',
		'Ventas')
);

insert into usuarios values (null, 'root', 'root', 'root', 'Admin');