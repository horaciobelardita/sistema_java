drop database if exists gestor_comercio2;
create database gestor_comercio2;
use gestor_comercio2;
create table usuarios (
	id int auto_increment primary key,
    nombre varchar(30) not null,
    nick varchar(15) not null unique,
    password varchar(250) not null,
    tipo_usuario enum('Admin', 'Usuario') not null
);

insert into usuarios values (null, 'root', 'root', '0RnBDAOrVJvaALhiHLSaCQ==', 'Admin');
insert into usuarios values (null, 'vampi', 'vampi', 'RVUYIoUJ9xkydl05+xUKUg==', 'Admin');
insert into usuarios values (null, 'usuario', 'vendedor', 'RVUYIoUJ9xkydl05+xUKUg==', 'Usuario');

create table proveedores (
    id char(12)   primary key,
    nombre varchar(100) not null unique,
   direccion varchar(100),
   telefono varchar(15) not null,
   email varchar(30) unique
);

insert into proveedores VALUES ('232536985221', 'Distribuidora uno','alguna calle', '460333', 'uno@gmail.com'),
 ('232536989921', 'Distribuidora dos',  'alguna calle', '460333', 'dos@gmail.com');

create table productos (
	
    codigo varchar(13)  primary key,
    nombre varchar(40) not null unique,
    descripcion varchar(100),
    precio_venta float(8,2) not null,
    precio_compra float(8,2) not null,
    stock int unsigned not null,
imagen MEDIUMBLOB default NULL
  # id_proveedor int not null,
   #foreign key (id_proveedor) references proveedores(id)
);

insert into productos values ('1234567891', 'Coca-cola', 'bebida', 150.5, 110.0, 10, null);
insert into productos values ('1234567892', 'Pan Blanco', 'panificado', 65.0, 45.0, 10, null);
insert into productos values ('1234567893', 'Manaos Uva 2.15 lts', 'bebida', 65.0, 45.0, 3, null);

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

insert into clientes values ('33256378', 'Gabriel', 'Benitez', '460225', 'Av. Islas Malvinas', 'Consumidor final');

create table ventas (
    id_venta char(8) primary key,
    fecha date not null,
    dni char(8) not null,
    iva INT(3) UNSIGNED  NOT NULL,
    total_bruto FLOAT(10,2) NOT NULL,
    total_neto FLOAT(10,2) NOT NULL,
    foreign key (dni) references clientes(dni)
);



create table detalle_venta (
    num_detalle int not null,
    id_venta char(8) not null,
    codigo_producto varchar(13) not null,
    cantidad int unsigned not null,
    precio float(10, 2),
    primary key(num_detalle, id_venta),
    foreign key (id_venta) references ventas(id_venta),
    foreign key (codigo_producto) references productos(codigo)
);
