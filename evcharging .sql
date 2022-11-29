-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 29, 2022 at 07:15 PM
-- Server version: 5.5.39
-- PHP Version: 5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `evcharging`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
`AdminID` int(40) NOT NULL,
  `AdminEmail` varchar(40) NOT NULL,
  `AdminPassword` int(40) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`AdminID`, `AdminEmail`, `AdminPassword`) VALUES
(1, 'rahul@dhoop.com', 1234);

-- --------------------------------------------------------

--
-- Table structure for table `charstation`
--

CREATE TABLE IF NOT EXISTS `charstation` (
`StationID` int(20) NOT NULL,
  `Name` varchar(40) NOT NULL,
  `Address` varchar(40) NOT NULL,
  `City` varchar(40) NOT NULL,
  `Taluka` varchar(40) NOT NULL,
  `District` varchar(40) NOT NULL,
  `OpenTime` varchar(40) NOT NULL,
  `CloseTime` varchar(40) NOT NULL,
  `Mobile` varchar(40) NOT NULL,
  `Latitude` int(20) NOT NULL,
  `Longitude` int(20) NOT NULL,
  `Password` varchar(40) NOT NULL,
  `Power` int(20) NOT NULL,
  `Status` varchar(40) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `charstation`
--

INSERT INTO `charstation` (`StationID`, `Name`, `Address`, `City`, `Taluka`, `District`, `OpenTime`, `CloseTime`, `Mobile`, `Latitude`, `Longitude`, `Password`, `Power`, `Status`) VALUES
(1, 'Rahul', 'Sambhajinagar', 'Kannad', 'Kannad', 'Sambhajinagar', '1pm', '1am', '7499515704', 0, 0, '123', 0, ''),
(3, 'tarun', 'dhule', 'dhule', 'shirpur', 'dhule', '1pm', '1am', '26654984982', 0, 0, '123', 0, 'Approved'),
(5, 'yash', 'nimjhari naka', 'dhule', 'shirpur', 'dhule', '7pm', '11pm', '7894561234', 0, 0, '12345', 9000, 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
`UserID` int(40) NOT NULL,
  `Name` varchar(40) NOT NULL,
  `Email` varchar(40) NOT NULL,
  `Mobile` varchar(40) NOT NULL,
  `City` varchar(40) NOT NULL,
  `Password` varchar(40) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`UserID`, `Name`, `Email`, `Mobile`, `City`, `Password`) VALUES
(2, 'vedant', 'vedant@421.com', '789456', 'jal', '753'),
(3, 'keshav', 'keshav756@gmail.com', '741023', 'ndb', '7412'),
(4, 'chandu', 'chandu75@gmail.com', '987654', 'amalner', '8529'),
(5, 'gopal', 'Gopal345@yahoo.com', '78945', 'shirpur', '745'),
(6, 'pranay', 'pranay@121', '7499515704', 'dhule', '123'),
(7, 'nilesh', 'nilesh@123', '7499515704', 'nashik', '101');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
 ADD PRIMARY KEY (`AdminID`);

--
-- Indexes for table `charstation`
--
ALTER TABLE `charstation`
 ADD PRIMARY KEY (`StationID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
 ADD PRIMARY KEY (`UserID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
MODIFY `AdminID` int(40) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `charstation`
--
ALTER TABLE `charstation`
MODIFY `StationID` int(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
MODIFY `UserID` int(40) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
