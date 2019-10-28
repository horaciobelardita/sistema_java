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
insert into usuarios values (null, 'vampi', 'vampi', '1234', 'Admin');

create table proveedores (
    cuit varchar(11) not null unique primary key,
    nombre_empresa varchar(40) not null,
    nombre_contacto varchar(40) ,
   direccion varchar(100),
   telefono varchar(15) not null,
   email varchar(30) not null
);

insert into proveedores values ('11111111111', 'Distribuidora uno', 'Juan Perez', 'alguna calle', '460333', 'uno@gmail.com');

create table productos (
	
    codigo varchar(13)  primary key,
    nombre varchar(40) not null unique,
    descripcion varchar(100),
    precio_venta float(8,2) not null,
    precio_compra float(8,2) not null,
    stock int unsigned not null,
   id_proveedor varchar(11) not null,
   foreign key (id_proveedor) references proveedores(cuit)
);

insert into productos values ('123456789101', 'Coca-cola', 'bebida', 150.5, 110.0, 10, '11111111111');
insert into productos values ('123456789102', 'Pan Blanco', 'panificado', 65.0, 45.0, 10, '11111111111');