-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: localhost
-- Thời gian đã tạo: Th12 26, 2022 lúc 12:50 PM
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
  `_ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `_Name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `_Identi` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `_IDEmloyee` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `_IDRoom` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `_TimeCheckIn` datetime NOT NULL,
  `_TimeCheckOut` datetime DEFAULT NULL,
  `_Pay` double DEFAULT NULL,
  `_Start` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `bill`
--

INSERT INTO `bill` (`_ID`, `_Name`, `_Identi`, `_IDEmloyee`, `_IDRoom`, `_TimeCheckIn`, `_TimeCheckOut`, `_Pay`, `_Start`) VALUES
('DH2022360185045', 'Quốc Việt', '66DH67788D', '2022360NV3491', 'RM215', '2022-12-26 18:58:08', '2022-12-26 19:26:56', 0, 1),
('DH2022360185112', 'Nguyễn Văn Tú', '67HD899UG7', '2022360NV3709', 'RM759', '2022-12-26 18:51:11', '2000-01-01 00:00:00', 0, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `employee`
--

CREATE TABLE `employee` (
  `_ID` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `_Name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `_Identi` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `_Gender` varchar(10) COLLATE utf8_unicode_ci NOT NULL DEFAULT 'Nam',
  `_Address` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `_DayOfBirth` date NOT NULL,
  `_NumPhone` varchar(10) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `employee`
--

INSERT INTO `employee` (`_ID`, `_Name`, `_Identi`, `_Gender`, `_Address`, `_DayOfBirth`, `_NumPhone`) VALUES
('2022360NV3491', 'Nguyễn Văn Dũng', '092HD678D8', 'Nam', 'Linh Chiểu, Thủ Đức, TP.HCM', '1995-11-01', '0908377777'),
('2022360NV3709', 'Nguyễn Thanh Lâm', '092HD678D8', 'Nam', 'Linh Chiểu, Thủ Đức, TP.HCM', '1995-11-01', '0908377777');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `room`
--

CREATE TABLE `room` (
  `_ID` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `_Name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `_Price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `room`
--

INSERT INTO `room` (`_ID`, `_Name`, `_Price`) VALUES
('RM215', 'Phòng 3', 30000),
('RM759', 'Phòng 1', 25000),
('RM973', 'Phòng 2', 30000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `_UserName` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `_PassWord` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`_UserName`, `_PassWord`) VALUES
('1', '123456789');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`_ID`);

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
