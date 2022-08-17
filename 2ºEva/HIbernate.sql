-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-04-2016 a las 13:15:32
-- Versión del servidor: 5.5.27
-- Versión de PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `Hibernate`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Empleados`
--

CREATE TABLE IF NOT EXISTS `Empleados` (
  `Nombre` varchar(100) DEFAULT NULL,
  `Apellidos` varchar(200) DEFAULT NULL,
  `Departamento` varchar(100) DEFAULT NULL,
  `Sitio` int(11) NOT NULL,
  PRIMARY KEY (`Sitio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Empleados`
--

INSERT INTO `Empleados` (`Nombre`, `Apellidos`, `Departamento`, `Sitio`) VALUES
('Juan', 'Cholo', 'Ventas', 25);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Ordenadores`
--

CREATE TABLE IF NOT EXISTS `Ordenadores` (
  `Placa` varchar(256) DEFAULT NULL,
  `Procesador` varchar(256) DEFAULT NULL,
  `Tarjeta_grafica` varchar(256) DEFAULT NULL,
  `Memoria_ram` varchar(256) DEFAULT NULL,
  `Alimentacion` varchar(256) DEFAULT NULL,
  `Disco_duro` varchar(256) DEFAULT NULL,
  `Disco_ssd` varchar(256) DEFAULT NULL,
  `Ventilacion` varchar(256) DEFAULT NULL,
  `Sitio` int(11) NOT NULL,
  PRIMARY KEY (`Sitio`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Volcado de datos para la tabla `Ordenadores`
--

INSERT INTO `Ordenadores` (`PLaca`, `Procesador`, `Tarjeta_grafica`, `Memoria_ram`, `Alimentacion`, `Disco_duro`, `Disco_ssd`, `Ventilacion`, `Sitio`) VALUES
('Placa-A', 'Procesador-A', 'Tarjeta_grafica-A', 'Memoria-A', 'Alimentacion', 'Disco-A', 'Disco-B', 'Ventilacion-A', 25);


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Perifericos`
--

CREATE TABLE IF NOT EXISTS `Perifericos` (
  `Monitor1`varchar(120)  DEFAULT NULL,
  `Monitor2` varchar(120) DEFAULT NULL,
  `Raton` varchar(100) DEFAULT NULL,
  `Teclado` varchar(120) DEFAULT NULL,
  `Disco_portatil` varchar(120) DEFAULT NULL,
  `Sitio` int(11) NOT NULL,
  PRIMARY KEY (`Sitio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `Perifericos`
--

INSERT INTO `Perifericos` (`Monitor1`, `Monitor2`, `Raton`, `Teclado`, `Disco_portatil`, `Sitio`) VALUES
('Monitor-A', 'Monitor-B', 'Raton-A', 'Teclado-A', 'Discopor-A', 25);


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
