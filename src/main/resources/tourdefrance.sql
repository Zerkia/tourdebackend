-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: tourdefrance
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `cykelhold`
--

DROP TABLE IF EXISTS `cykelhold`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cykelhold` (
  `id` int NOT NULL AUTO_INCREMENT,
  `holdname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cykelhold`
--

LOCK TABLES `cykelhold` WRITE;
/*!40000 ALTER TABLE `cykelhold` DISABLE KEYS */;
INSERT INTO `cykelhold` VALUES (1,'Team Arkéa Samsic'),(2,'TotalEnergies'),(3,'Team DSM');
/*!40000 ALTER TABLE `cykelhold` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cykelrytter`
--

DROP TABLE IF EXISTS `cykelrytter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cykelrytter` (
  `id` int NOT NULL AUTO_INCREMENT,
  `bjergpoint` int DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `spurtpoint` int DEFAULT NULL,
  `holdid` int DEFAULT NULL,
  `alder` int DEFAULT NULL,
  `bjergtid` double DEFAULT NULL,
  `spurttid` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK9crmr2ss8lserp7x4p8vxwh5y` (`holdid`),
  CONSTRAINT `FK9crmr2ss8lserp7x4p8vxwh5y` FOREIGN KEY (`holdid`) REFERENCES `cykelhold` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cykelrytter`
--

LOCK TABLES `cykelrytter` WRITE;
/*!40000 ALTER TABLE `cykelrytter` DISABLE KEYS */;
INSERT INTO `cykelrytter` VALUES (10,107,'Tadej Pogacar',154,1,23,3000.23,2400.43),(11,106,'Jonas Vingegaard',103,1,24,3000.66,2400.52),(12,105,'Carapaz Richard',65,1,35,3243.87,2500.73),(13,104,'Tom Johnson',55,1,32,3249.35,2322.64),(14,77,'John Tomson',43,1,32,3333.48,2432.11),(15,102,'Persona Paris',329,1,36,2044.99,2022.33),(16,192,'Alsoa Person',329,2,22,3033.55,2703.88),(17,106,'Emiratas Peronas',100,2,34,3222.77,2432.44),(18,99,'Mads Madsen',42,2,33,2302.54,3290.43),(19,44,'Villads Madsen',32,2,23,2392.77,2900.99),(20,55,'Jens Komae',55,2,25,3290.25,1924.63),(21,66,'Cedar Joeson',66,2,33,2533.23,3250.36),(22,55,'Alan Rickman',55,2,35,2564.54,2478.12),(23,155,'James Le Yung',155,3,22,2534.76,2132.14),(24,144,'Søren Østergaard',144,3,33,2392.99,2424.77),(25,133,'James Gordon',133,3,35,1900.11,1924.22),(26,122,'Donatello DiGordo',122,3,29,2203.22,2232.53),(27,111,'Chi Si Chun',111,3,25,2326.33,1996.67);
/*!40000 ALTER TABLE `cykelrytter` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-31  7:39:49
