CREATE DATABASE  IF NOT EXISTS `sisodonto` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `sisodonto`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: sisodonto
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `agenda`
--

DROP TABLE IF EXISTS `agenda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agenda` (
  `idAgenda` int NOT NULL AUTO_INCREMENT,
  `idFuncionario` int DEFAULT NULL,
  `dataMarcada` date DEFAULT NULL,
  `Hora_Início` time DEFAULT NULL,
  `Hora_Fim` time DEFAULT NULL,
  `tipoDisponibilidade` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`idAgenda`),
  KEY `idFuncionario` (`idFuncionario`),
  CONSTRAINT `agenda_ibfk_1` FOREIGN KEY (`idFuncionario`) REFERENCES `funcionarios` (`idFuncionario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agenda`
--

LOCK TABLES `agenda` WRITE;
/*!40000 ALTER TABLE `agenda` DISABLE KEYS */;
/*!40000 ALTER TABLE `agenda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consultas`
--

DROP TABLE IF EXISTS `consultas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consultas` (
  `idConsulta` int NOT NULL AUTO_INCREMENT,
  `fk_cpfPaciente` char(11) DEFAULT NULL,
  `fk_idFuncionario` int DEFAULT NULL,
  `dataConsulta` date DEFAULT NULL,
  `horaConsulta` time DEFAULT NULL,
  `tipoConsulta` varchar(20) DEFAULT NULL,
  `Descrição` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idConsulta`),
  KEY `fk_cpfPaciente` (`fk_cpfPaciente`),
  KEY `fk_idFuncionario` (`fk_idFuncionario`),
  CONSTRAINT `consultas_ibfk_1` FOREIGN KEY (`fk_cpfPaciente`) REFERENCES `pacientes` (`cpfPaciente`),
  CONSTRAINT `consultas_ibfk_2` FOREIGN KEY (`fk_idFuncionario`) REFERENCES `funcionarios` (`idFuncionario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consultas`
--

LOCK TABLES `consultas` WRITE;
/*!40000 ALTER TABLE `consultas` DISABLE KEYS */;
/*!40000 ALTER TABLE `consultas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionarios`
--

DROP TABLE IF EXISTS `funcionarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionarios` (
  `idFuncionario` int NOT NULL AUTO_INCREMENT,
  `cpfFuncionario` char(11) NOT NULL,
  `nomeFuncionario` varchar(40) NOT NULL,
  `funcao` varchar(25) NOT NULL,
  `telefone` varchar(10) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `cep` char(8) DEFAULT NULL,
  `endereço` varchar(70) DEFAULT NULL,
  `dataAdimissao` date DEFAULT NULL,
  PRIMARY KEY (`idFuncionario`),
  UNIQUE KEY `idFuncionario` (`idFuncionario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionarios`
--

LOCK TABLES `funcionarios` WRITE;
/*!40000 ALTER TABLE `funcionarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcionarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pacientes`
--

DROP TABLE IF EXISTS `pacientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pacientes` (
  `cpfPaciente` char(11) NOT NULL,
  `nomePaciente` varchar(40) NOT NULL,
  `nascimento` date DEFAULT NULL,
  `sexo` enum('M','F') DEFAULT NULL,
  `cep` char(8) DEFAULT NULL,
  `endereço` varchar(70) DEFAULT NULL,
  `telefone` varchar(11) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cpfPaciente`),
  UNIQUE KEY `cpfPaciente` (`cpfPaciente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pacientes`
--

LOCK TABLES `pacientes` WRITE;
/*!40000 ALTER TABLE `pacientes` DISABLE KEYS */;
INSERT INTO `pacientes` VALUES ('09769734136','Joao Vitor de Freitas','2005-06-30','M','72318101','rua da abóbora','61999999989','joaovitor@gmail.com'),('70875339103','Victor Cardoso Fiuza','2001-11-29','F','72318101','RUA DA AGUA','61999999999','victor@gmail.com');
/*!40000 ALTER TABLE `pacientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagamentos`
--

DROP TABLE IF EXISTS `pagamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagamentos` (
  `idPagamento` int NOT NULL AUTO_INCREMENT,
  `idConsulta` int DEFAULT NULL,
  `dataPagamento` date DEFAULT NULL,
  `Valor` decimal(10,2) DEFAULT NULL,
  `Forma_Pagamento` varchar(8) DEFAULT NULL,
  `situação` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`idPagamento`),
  KEY `idConsulta` (`idConsulta`),
  CONSTRAINT `pagamentos_ibfk_1` FOREIGN KEY (`idConsulta`) REFERENCES `consultas` (`idConsulta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagamentos`
--

LOCK TABLES `pagamentos` WRITE;
/*!40000 ALTER TABLE `pagamentos` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tratamentos`
--

DROP TABLE IF EXISTS `tratamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tratamentos` (
  `idTratamento` int NOT NULL AUTO_INCREMENT,
  `categoriaTratamento` varchar(25) DEFAULT NULL,
  `descricao` varchar(100) DEFAULT NULL,
  `Custo` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`idTratamento`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tratamentos`
--

LOCK TABLES `tratamentos` WRITE;
/*!40000 ALTER TABLE `tratamentos` DISABLE KEYS */;
INSERT INTO `tratamentos` VALUES (1,'MANUTENCAO','30min, troca de aparelho ',120.00);
/*!40000 ALTER TABLE `tratamentos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-22 11:45:26
