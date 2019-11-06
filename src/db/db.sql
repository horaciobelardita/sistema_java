drop database if exists gestor_comercio2;
create database gestor_comercio2;
use gestor_comercio2;
create table usuarios (
	id int auto_increment primary key,
    nombre varchar(30) not null,
    nick varchar(15) not null,
    password varchar(60) not null,
    tipo_usuario enum('Admin',
		'Compras, Proveedores',
		'Inventario',
		'Ventas') not null
);

insert into usuarios values (null, 'root', 'root', 'root', 'Admin');
insert into usuarios values (null, 'vampi', 'vampi', '1234', 'Admin');

create table proveedores (
    id int auto_increment  primary key,
    nombre_empresa varchar(40) not null,
    nombre_contacto varchar(40) ,
   direccion varchar(100),
   telefono varchar(15) not null,
   email varchar(30) not null
);

insert into proveedores values (NULL, 'Distribuidora uno', 'Juan Perez', 'alguna calle', '460333', 'uno@gmail.com'),
 (NULL, 'Distribuidora dos', 'Ramon Garcia', 'alguna calle', '460333', 'dos@gmail.com');

create table productos (
	
    codigo varchar(13)  primary key,
    nombre varchar(40) not null unique,
    descripcion varchar(100),
    precio_venta float(8,2) not null,
    precio_compra float(8,2) not null,
    stock int unsigned not null,
imagen MEDIUMBLOB default null,
   id_proveedor int not null,
   foreign key (id_proveedor) references proveedores(id)
);

insert into productos values ('123456789101', 'Coca-cola', 'bebida', 150.5, 110.0, 10, null, 1);
insert into productos values ('123456789102', 'Pan Blanco', 'panificado', 65.0, 45.0, 10, null, 1);
insert into productos values ('123456789103', 'Manaos Uva 2.15 lts', 'bebida', 65.0, 45.0, 3, null, 1);

create table clientes (
    dni char(8) primary key,
    nombre varchar(30) not null,
    apellidos varchar(45) not null,
    telefono varchar(18) ,
    direccion varchar(100),
    categoria_iva enum(
    'Consumidor final',
'Exento',
'Exterior',
'Monotributista',
'Responsable inscripto'
    ) not null
);

create table ventas (
    id_venta int auto_increment primary key,
    fecha date not null,
    importe float(10, 2) not null,
    dni char(8) not null,
    foreign key (dni) references clientes(dni)
);



create table detalle_venta (
    id_venta int not null,
    codigo_producto varchar(13) not null,
    cantidad int unsigned not null,
    primary key(id_venta, codigo_producto),
    foreign key (id_venta) references ventas(id_venta),
    foreign key (codigo_producto) references productos(codigo)
);

