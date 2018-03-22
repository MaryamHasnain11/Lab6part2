-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Mar 22, 2018 at 02:36 AM
-- Server version: 5.1.53
-- PHP Version: 5.3.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `university`
--

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `ID` int(11) NOT NULL,
  `RegNo` int(11) NOT NULL,
  `Name` text NOT NULL,
  `Class` varchar(20) NOT NULL,
  `Section` varchar(11) NOT NULL,
  `Contact` int(50) NOT NULL,
  `Address` varchar(60) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`ID`, `RegNo`, `Name`, `Class`, `Section`, `Contact`, `Address`) VALUES
(2, 128300, 'Tayyaba', 'SE6', 'B', 444, 'Islamabad'),
(1, 126136, 'Amal', 'SE6', 'B', 333, 'Rawalpindi'),
(3, 120013, 'Maryam ', 'SE6', 'B', 125, 'Rawalpindi'),
(4, 134252, 'Marium', 'SE6', 'B', 678, 'Islamabad'),
(5, 120013, 'Mana ', 'SE6', 'B', 1365, 'Rawalpindi');
