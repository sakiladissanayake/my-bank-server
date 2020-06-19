-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: bankdb
-- ------------------------------------------------------
-- Server version	5.7.18-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bank`
--

DROP TABLE IF EXISTS `bank`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bank` (
  `bank_id` int(11) NOT NULL,
  `bank_name` varchar(255) NOT NULL,
  PRIMARY KEY (`bank_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bank`
--

LOCK TABLES `bank` WRITE;
/*!40000 ALTER TABLE `bank` DISABLE KEYS */;
INSERT INTO `bank` VALUES (1,'Sampath Bank'),(2,'Commercial Bank');
/*!40000 ALTER TABLE `bank` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bank_branches`
--

DROP TABLE IF EXISTS `bank_branches`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bank_branches` (
  `bank_bank_id` int(11) NOT NULL,
  `branches_branch_id` int(11) NOT NULL,
  UNIQUE KEY `UK_ba1oqi4y1rd7nmlpw9bsas7uf` (`branches_branch_id`),
  KEY `FKp4ybfw9u7ktshqna49pwfqmcu` (`bank_bank_id`),
  CONSTRAINT `FKc7ryrjxifl3m74w8fuocxox9d` FOREIGN KEY (`branches_branch_id`) REFERENCES `branch` (`branch_id`),
  CONSTRAINT `FKp4ybfw9u7ktshqna49pwfqmcu` FOREIGN KEY (`bank_bank_id`) REFERENCES `bank` (`bank_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bank_branches`
--

LOCK TABLES `bank_branches` WRITE;
/*!40000 ALTER TABLE `bank_branches` DISABLE KEYS */;
/*!40000 ALTER TABLE `bank_branches` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `branch`
--

DROP TABLE IF EXISTS `branch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `branch` (
  `branch_id` int(11) NOT NULL,
  `branch_address` varchar(255) NOT NULL,
  `branch_name` varchar(255) NOT NULL,
  `bank_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`branch_id`),
  KEY `FKpolhgo6c86h7rrcwvg3hqm32l` (`bank_id`),
  CONSTRAINT `FKpolhgo6c86h7rrcwvg3hqm32l` FOREIGN KEY (`bank_id`) REFERENCES `bank` (`bank_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branch`
--

LOCK TABLES `branch` WRITE;
/*!40000 ALTER TABLE `branch` DISABLE KEYS */;
INSERT INTO `branch` VALUES (1,'Kandy Road','Kandy',1),(2,'Mathale Road','Mathale',1),(3,'Polonnaruwa Road','Polonnaruwa',2);
/*!40000 ALTER TABLE `branch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `branch_employees`
--

DROP TABLE IF EXISTS `branch_employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `branch_employees` (
  `branch_branch_id` int(11) NOT NULL,
  `employees_emp_id` int(11) NOT NULL,
  UNIQUE KEY `UK_qsm7ifhgvdbukb6q0ttivj2g9` (`employees_emp_id`),
  KEY `FKk3nvmo0vpp4ejw9p2smcgedxm` (`branch_branch_id`),
  CONSTRAINT `FKk3nvmo0vpp4ejw9p2smcgedxm` FOREIGN KEY (`branch_branch_id`) REFERENCES `branch` (`branch_id`),
  CONSTRAINT `FKqht12fob0xth6n77jyqv34wl1` FOREIGN KEY (`employees_emp_id`) REFERENCES `employee` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branch_employees`
--

LOCK TABLES `branch_employees` WRITE;
/*!40000 ALTER TABLE `branch_employees` DISABLE KEYS */;
/*!40000 ALTER TABLE `branch_employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `emp_id` int(11) NOT NULL,
  `emp_address` varchar(255) NOT NULL,
  `emp_email` varchar(255) NOT NULL,
  `emp_name` varchar(255) NOT NULL,
  `emp_password` varchar(255) NOT NULL,
  `emp_photo` varchar(255) NOT NULL,
  `branch_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`emp_id`),
  KEY `FKcvhlsx8tao1rxt7mpxrot61jt` (`branch_id`),
  CONSTRAINT `FKcvhlsx8tao1rxt7mpxrot61jt` FOREIGN KEY (`branch_id`) REFERENCES `branch` (`branch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Kandy','anne@gmail.com','Anne','anne','https://koreyhowellphotography.com/wp-content/uploads/2017/04/AdobeStock_94026210-1024x689.jpeg',1),(2,'Polonnaruwa','frank@gmail.com','Frank','frank','https://ocgworks.org/wp-content/uploads/2015/05/young-professional-man-portrait.jpg',3),(3,'Mathale','selina@hotmail.com','Selina','selina','https://www.wcu.edu/WebGraphicsNew/GettyImages-501671458.jpg',2);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-19 21:26:51
