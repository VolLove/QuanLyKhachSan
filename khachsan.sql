-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: localhost
-- Thời gian đã tạo: Th12 11, 2022 lúc 01:51 PM
-- Phiên bản máy phục vụ: 5.7.22
-- Phiên bản PHP: 7.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `quanlykhachsan`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `bill`
--

CREATE TABLE `bill` (
  `_ID` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `_IDClient` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `_IDEmployee` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `_IDRoom` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `_TimeCheckIn` date NOT NULL,
  `_TimeChekOut` date NOT NULL,
  `_Pay` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `client`
--

CREATE TABLE `client` (
  `_Name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `_Identi` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `_NumPhone` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `employee`
--

CREATE TABLE `employee` (
  `_ID` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `_Name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `_Identi` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `_Address` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `_NumPhone` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `_DayOfBirth` date NOT NULL,
  `_DayOfJoining` date NOT NULL,
  `_Style` varchar(20) COLLATE utf8_unicode_ci NOT NULL
  
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `room`
--

CREATE TABLE `room` (
  `_ID` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `_Name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `_Place` int(11) NOT NULL,
  `price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `_UserName` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `_PassWord` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `_Name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `_IDEmloyee` varchar(10) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`_ID`);

--
-- Chỉ mục cho bảng `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`_Identi`);

--
-- Chỉ mục cho bảng `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`_ID`);

--
-- Chỉ mục cho bảng `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`_ID`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`_UserName`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
