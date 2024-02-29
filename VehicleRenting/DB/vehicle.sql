/*
SQLyog Ultimate v8.82 
MySQL - 5.1.50-community : Database - vehicle
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`vehicle` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `vehicle`;

/*Table structure for table `company` */

DROP TABLE IF EXISTS `company`;

CREATE TABLE `company` (
  `com` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `company` */

insert  into `company`(`com`) values ('Audi'),('Maruti'),('Hyundai'),('asdsdf');

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `cid` int(5) DEFAULT NULL,
  `name` varchar(25) DEFAULT NULL,
  `gen` varchar(10) DEFAULT NULL,
  `addr` varchar(50) DEFAULT NULL,
  `usage` varchar(20) DEFAULT NULL,
  `bookdate` varchar(20) DEFAULT NULL,
  `rentingdays` varchar(20) DEFAULT NULL,
  `mobile` varchar(15) DEFAULT NULL,
  `carc` varchar(20) DEFAULT NULL,
  `seat` varchar(25) DEFAULT NULL,
  `carno` varchar(20) DEFAULT NULL,
  `carmo` varchar(20) DEFAULT NULL,
  `did` int(5) DEFAULT NULL,
  `rentperday` varchar(10) DEFAULT NULL,
  `totrent` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `customer` */

insert  into `customer`(`cid`,`name`,`gen`,`addr`,`usage`,`bookdate`,`rentingdays`,`mobile`,`carc`,`seat`,`carno`,`carmo`,`did`,`rentperday`,`totrent`) values (1201,'Akiidc','Female','fvdfvdfvdfv','Individual Rent','12-22-2121','10','23423423','Hyundai','15 seater','678','678',101,'5455','54550.0');

/*Table structure for table `driver` */

DROP TABLE IF EXISTS `driver`;

CREATE TABLE `driver` (
  `did` int(5) DEFAULT NULL,
  `name` varchar(25) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `addr` varchar(50) DEFAULT NULL,
  `exp` varchar(20) DEFAULT NULL,
  `dob` varchar(15) DEFAULT NULL,
  `qual` varchar(20) DEFAULT NULL,
  `mob` varchar(15) DEFAULT NULL,
  `carc` varchar(20) DEFAULT NULL,
  `seat` varchar(20) DEFAULT NULL,
  `carno` varchar(15) DEFAULT NULL,
  `carmo` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `driver` */

insert  into `driver`(`did`,`name`,`gender`,`addr`,`exp`,`dob`,`qual`,`mob`,`carc`,`seat`,`carno`,`carmo`) values (101,'Inshaal','Female','sdjcnkjdsnc','3 year','12-12-1212','Graduate','121212','Hyundai','15 seater','678','678');

/*Table structure for table `emp` */

DROP TABLE IF EXISTS `emp`;

CREATE TABLE `emp` (
  `name` varchar(30) DEFAULT NULL,
  `gen` varchar(10) DEFAULT NULL,
  `addr` varchar(50) DEFAULT NULL,
  `dob` varchar(15) DEFAULT NULL,
  `qual` varchar(30) DEFAULT NULL,
  `mob` varchar(15) DEFAULT NULL,
  `user` varchar(20) DEFAULT NULL,
  `doj` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `emp` */

insert  into `emp`(`name`,`gen`,`addr`,`dob`,`qual`,`mob`,`user`,`doj`) values ('Inshaal','Male','dvdfv2323','323231','Graduate','2323231','inshu','232311');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `utype` varchar(20) DEFAULT NULL,
  `uname` varchar(20) DEFAULT NULL,
  `upass` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`utype`,`uname`,`upass`) values ('Admin','admin','admin'),('Employee','inshu','1234');

/*Table structure for table `vehic` */

DROP TABLE IF EXISTS `vehic`;

CREATE TABLE `vehic` (
  `model` varchar(20) DEFAULT NULL,
  `com` varchar(20) DEFAULT NULL,
  `carno` varchar(15) DEFAULT NULL,
  `myear` varchar(15) DEFAULT NULL,
  `useas` varchar(25) DEFAULT NULL,
  `seat` varchar(25) DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `ec` varchar(20) DEFAULT NULL,
  `rent` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `vehic` */

insert  into `vehic`(`model`,`com`,`carno`,`myear`,`useas`,`seat`,`type`,`ec`,`rent`) values ('jhjh','Hyundai','678','687','Individual Rent','15 seater','Ac','666','5455');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
