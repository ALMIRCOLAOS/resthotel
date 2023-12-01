CREATE DATABASE cusquito

USE cusquito

-- Definición de la tabla tb_cargo
CREATE TABLE tb_cargo (
    cod_cargo INT PRIMARY KEY AUTO_INCREMENT,
    nom_cargo VARCHAR(255)
);

-- Definición de la tabla tb_empleado
CREATE TABLE tb_empleado (
    cod_empleado INT PRIMARY KEY AUTO_INCREMENT,
    nom_empleado VARCHAR(255),
    pat_empleado VARCHAR(255),
    mat_empleado VARCHAR(255),
    dni_empleado VARCHAR(20),
    sexo_empleado VARCHAR(10),
    cod_cargo INTEGER,
    FOREIGN KEY (cod_cargo) REFERENCES tb_cargo (cod_cargo)
);


INSERT INTO tb_empleado (nom_empleado, pat_empleado, mat_empleado, dni_empleado, sexo_empleado, cod_cargo)
VALUES
    ('Juan', 'Pérez', 'Gómez', '12345678', 'Masculino', 1),
    ('María', 'López', 'Martínez', '87654321', 'Femenino', 2);



-- Inserción de datos en la tabla tb_cargo
INSERT INTO tb_cargo (nom_cargo) VALUES
('Recepcionista'),
('Camarero'),
('Cocinero'),
('Limpieza'),
('Gerente');



SELECT * FROM tb_cargo
SELECT * FROM Tb_empleado