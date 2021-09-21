-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.13-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema manpower
--

CREATE DATABASE IF NOT EXISTS manpower;
USE manpower;

--
-- Definition of table `alumnos`
--

DROP TABLE IF EXISTS `alumnos`;
CREATE TABLE `alumnos` (
  `ALU_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `ALU_NOMBRE` varchar(45) NOT NULL,
  `ALU_APELLIDO` varchar(45) NOT NULL,
  `ALU_ESTUDIOS` varchar(200) NOT NULL,
  `ALU_LINKGIT` varchar(200) NOT NULL,
  PRIMARY KEY (`ALU_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `alumnos`
--

/*!40000 ALTER TABLE `alumnos` DISABLE KEYS */;
INSERT INTO `alumnos` (`ALU_ID`,`ALU_NOMBRE`,`ALU_APELLIDO`,`ALU_ESTUDIOS`,`ALU_LINKGIT`) VALUES 
 (1,'Guillermo','López Leganés','Desarrollo de aplicaciones web',' https://gitlab.com/elliotstrike/cursojava2021.git'),
 (2,'David','Tomé del Arco','Ciencias de la computación','https://gitlab.com/davidtome/cursojava.git '),
 (3,'Ursu','Bogdan','Desarrollo de Aplicaciones Multiplataforma',''),
 (4,'Geovanny','Calle Rivera','Grado superior desarrollo de aplicaciones multiplataforma y estudio de desarrollo de aplicaciones web',' https://gitlab.com/geovaxd/cursojava2021.git'),
 (5,'Monsef','Bakhtaoui Dahraoui','FP2  Desarrollo De Aplicaciones Multiplataforma',' https://github.com/JMonsef/JavaCourse.git'),
 (6,'Víctor','Fuentes  Soriano','Grado en Ciencias Físicas ','https://github.com/vicfuen02/CursoJava2021.git'),
 (7,'Joel','Sebastián','Grado superior en Desarrollo de Aplicaciones Multiplataforma',' https://gitlab.com/joelscfs/cursojava2021.git'),
 (8,'Marina','Calvo Pereña','Grado en Física','https://gitlab.com/marinacalvo/cursojava2021.git'),
 (9,'Danilo','de Jesus Joia','Desarrollo de Aplicaciones Multiplataforma','https://github.com/danilo-17/CursoJava2021.git'),
 (10,'Sebastián','Riojo Fernández','Desarrollo de Aplicaciones Multiplataforma','https://github.com/Sebastian-Riojo/CursoJava2021.git'),
 (11,'Ángel','Guerreiro Guzmán','Desarrollo de Aplicaciones Multiplataforma','https://gitlab.com/angelotidas/cursojava2021.git'),
 (12,'Luis','Navarro Pashinian','Desarrollo de Aplicaciones Multiplataforma','https://github.com/Pashinian/CursoJava2021.git'),
 (13,'Aarón','Sánchez Sánchez','Desarrollo de Aplicaciones Multiplataforma','https://github.com/Pashinian/CursoJava2021.git'),
 (14,'Mauro','Barreiro','Grado en Física','https://gitlab.com/maurobn98/cursojava2021.git'),
 (15,'Iván','Altares Palacios','Desarrollo de Aplicaciones Multiplataforma','https://gitlab.com/ivanaltares/ivanaltaresproyecto.git (fetch)'),
 (16,'Guillermo','Jiménez-Mendaño de Fuentes','Graduado en Ciclo Superior de FP de DAM','https://gitlab.com/Nahasu/cursojava2021.git'),
 (17,'Ángel','Eduardo Alvitres','Desarrollo de Aplicaciones Multiplataforma (DAM)','https://gitlab.com/Nahasu/cursojava2021.git'),
 (18,'Javier','García-Duarte Sáenz','Grado superior DAM','https://gitlab.com/javigarciaduarte/cursojava2021.git'),
 (19,'Alberto','Sánchez Sánchez','Grado en Física','https://github.com/alsansan/Curso-Java-1.git');
/*!40000 ALTER TABLE `alumnos` ENABLE KEYS */;


--
-- Definition of table `evaluaciones`
--

DROP TABLE IF EXISTS `evaluaciones`;
CREATE TABLE `evaluaciones` (
  `EVA_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `EVA_NOMBRE` varchar(45) NOT NULL,
  `EVA_FECHA` date NOT NULL,
  `EVA_RESULTADO` float NOT NULL,
  `EVA_OBSERVACIONES` varchar(45) NOT NULL,
  `ALU_ID` int(10) unsigned NOT NULL,
  PRIMARY KEY (`EVA_ID`),
  KEY `FK_EVALUACIONES_ALUMNOS` (`ALU_ID`),
  CONSTRAINT `FK_EVALUACIONES_ALUMNOS` FOREIGN KEY (`ALU_ID`) REFERENCES `alumnos` (`ALU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `evaluaciones`
--

/*!40000 ALTER TABLE `evaluaciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluaciones` ENABLE KEYS */;


--
-- Definition of table `practicas`
--

DROP TABLE IF EXISTS `practicas`;
CREATE TABLE `practicas` (
  `PRAC_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `PRAC_NOMBRE` varchar(45) NOT NULL,
  PRIMARY KEY (`PRAC_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `practicas`
--

/*!40000 ALTER TABLE `practicas` DISABLE KEYS */;
INSERT INTO `practicas` (`PRAC_ID`,`PRAC_NOMBRE`) VALUES 
 (1,'practica 1 - pantallas'),
 (2,'practica 2 - variables'),
 (3,'practica 3 - if-condiciones'),
 (4,'practica 4 - while');
/*!40000 ALTER TABLE `practicas` ENABLE KEYS */;


--
-- Definition of table `practicasresueltas`
--

DROP TABLE IF EXISTS `practicasresueltas`;
CREATE TABLE `practicasresueltas` (
  `PR_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `PRAC_ID` int(10) unsigned NOT NULL,
  `ALU_ID` int(10) unsigned NOT NULL,
  `PR_NOTA` float NOT NULL,
  `PR_OBSERVACIONES` varchar(200) NOT NULL,
  PRIMARY KEY (`PR_ID`),
  KEY `FK_practicasresuelta_PRACTICA` (`PRAC_ID`),
  KEY `FK_practicasresuelta_ALUMNOS` (`ALU_ID`),
  CONSTRAINT `FK_practicasresuelta_ALUMNOS` FOREIGN KEY (`ALU_ID`) REFERENCES `alumnos` (`ALU_ID`),
  CONSTRAINT `FK_practicasresuelta_PRACTICA` FOREIGN KEY (`PRAC_ID`) REFERENCES `practicas` (`PRAC_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `practicasresueltas`
--

/*!40000 ALTER TABLE `practicasresueltas` DISABLE KEYS */;
INSERT INTO `practicasresueltas` (`PR_ID`,`PRAC_ID`,`ALU_ID`,`PR_NOTA`,`PR_OBSERVACIONES`) VALUES 
 (1,1,1,1,'Al 18 esta no tiene nada'),
 (2,2,1,1,'Al 18 esta no tiene nada'),
 (3,3,1,1,'Al 18 esta no tiene nada'),
 (4,4,1,1,'Al 18 esta no tiene nada'),
 (5,1,2,7,'la practica 1 no tiene nada aunque estan los .class, posible fallo al subir'),
 (6,2,2,10,'tiene 5 ejercicios hechos y utilozo Math.pow'),
 (7,3,2,1,'nada'),
 (8,4,2,1,'nada'),
 (9,1,4,10,'todos los ejercicios resueltos'),
 (10,2,4,7,'2/5 para el la fecha 18/09 se considera bien quedamos esperando el resto'),
 (11,3,4,1,'del 1 al 15 no hay nada '),
 (12,4,4,1,'del 16 al 22 no hay nada '),
 (13,1,5,10,'del 1 al 3 todos los ejerecicios'),
 (14,2,5,9,'ejercicios 2,3 y 4 falta el 5'),
 (15,3,5,1,'no hay nada'),
 (16,4,5,1,'no hay nada'),
 (17,1,6,10,'ejercicios del 1 al 3 hata lo hecho en clase'),
 (18,2,6,10,'ejercicios del 1 al 4 falta uno pero te perdonamos'),
 (19,3,6,10,'TODOS del 1 al 15, utilzo charAt(0) para rescatar el char, ojo en el 8(piedra-papel-tijera) que tambien puede empatar, muy bueno los dedl switch para los meses, saco el de IFFF'),
 (20,4,6,10,'del 16 al 21 todos un genio '),
 (21,1,7,10,'todos los ejercicios'),
 (22,2,7,10,'ojo cuando se castea a byte puede no entrar el resutado conviene castear a int'),
 (23,3,7,3,'del 1 al 15 solo el ejemplo'),
 (24,4,7,1,'nada'),
 (25,1,8,10,'2 y 3 resueltos'),
 (26,2,8,7,'solamente el ejercicio2'),
 (27,3,8,1,'nada'),
 (28,4,8,1,'nada'),
 (30,1,9,10,'ejercicio resueltos '),
 (31,2,9,9,'El promedio esta mal sacado y deberian estar en otro paquete'),
 (32,3,9,1,'nada'),
 (33,4,9,1,'nada'),
 (34,1,10,10,'perfecto hasta los ejemplos de la clase estan'),
 (35,2,10,9,'muy buenos los comentarios faltaron 3'),
 (36,3,10,10,'del 1 al 15 todos utilizo String para el ejercicio 3, charAt en el 11'),
 (37,4,10,1,'nada'),
 (38,1,11,10,'del 1 al 3 todos'),
 (39,2,11,8,'no utilizo variables y faltaron 2 ejercicios'),
 (40,3,11,1,'nada'),
 (41,4,11,1,'nada'),
 (42,1,12,10,'del 1 al 3 completita'),
 (43,2,12,9,'conviene castear a int y el 5 esta faltando'),
 (44,3,12,7,'hasta el ejercicio 7 utilizo equals...'),
 (45,4,12,1,'nada de esto'),
 (46,1,13,10,'completa del 1 al 3'),
 (47,2,13,9,'falta el 5 ojo cuando se castea a byte puede no entrar'),
 (48,3,13,8,'del 1 al 7 uso equals y switch'),
 (49,4,13,1,'nada'),
 (50,1,14,10,'del 1 al 3 estan todos pero sin paquetes'),
 (51,2,14,8,'faltan el 4 y 5 pero sin paquetes'),
 (52,3,14,3,'solamente el ejemplo'),
 (53,4,14,1,'nada de esto'),
 (55,1,15,10,'completa'),
 (56,2,15,8,'utilizo Math.pow, el promedio debe ser float'),
 (57,3,15,1,'nada'),
 (58,4,15,1,'nada'),
 (59,1,16,10,'completa'),
 (60,2,16,10,'completa'),
 (61,3,16,3,'solamente el ejemplo'),
 (62,4,16,1,'nada'),
 (63,1,17,10,'completa'),
 (64,2,17,10,'completa'),
 (65,3,17,3,'solamente el ejemplo'),
 (66,4,17,1,'nada'),
 (67,1,18,10,'completa'),
 (68,2,18,9,'faltan 2 '),
 (69,3,18,3,'solo un ejercicio además del ejemplo'),
 (70,4,18,1,'nada'),
 (71,1,19,8,'falta el 3ro'),
 (72,2,19,8,'el promedio de goles debe ser float no tiene paquetes'),
 (73,3,19,1,'nada'),
 (74,4,19,1,'nada');
/*!40000 ALTER TABLE `practicasresueltas` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
