-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: localhost
-- Thời gian đã tạo: Th12 19, 2022 lúc 04:14 PM
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
  `_ID` int(11) NOT NULL,
  `_Name` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `_Identi` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `_IDRoom` int(11) NOT NULL,
  `_TimeCheckIn` datetime NOT NULL,
  `_TimeCheckOut` datetime DEFAULT NULL,
  `_Pay` double NOT NULL DEFAULT '0',
  `_IDEmloyee` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `_Start` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT 'Chưa thanh toán'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `bill`
--

INSERT INTO `bill` (`_ID`, `_Name`, `_Identi`, `_IDRoom`, `_TimeCheckIn`, `_TimeCheckOut`, `_Pay`, `_IDEmloyee`, `_Start`) VALUES
(4, 'efw', '092HD678D8', 3, '2022-12-08 00:00:00', NULL, 0, '1', 'Chưa thanh toán');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `employee`
--

CREATE TABLE `employee` (
  `_ID` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `_Name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `_Identi` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `_Address` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `_DayOfBirth` date NOT NULL,
  `_DayOfJoining` date NOT NULL,
  `_NumPhone` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `gioitinh` varchar(10) COLLATE utf8_unicode_ci NOT NULL DEFAULT 'Nam'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `employee`
--

INSERT INTO `employee` (`_ID`, `_Name`, `_Identi`, `_Address`, `_DayOfBirth`, `_DayOfJoining`, `_NumPhone`, `gioitinh`) VALUES
('1', 'Nguyễn Thanh Lâm', '092HD678D8', 'Linh Chiểu, Thủ Đức, TP.HCM', '1995-11-01', '2020-12-22', '0908377777', 'Nam');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `room`
--

CREATE TABLE `room` (
  `_ID` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `_Name` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `_Place` int(11) NOT NULL,
  `_Price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `room`
--

INSERT INTO `room` (`_ID`, `_Name`, `_Place`, `_Price`) VALUES
('1', 'Phòng 1', 1, 300000),
('2', 'Phòng 2', 1, 200000),
('3', 'Phòng 3', 1, 400000);

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
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`_UserName`, `_PassWord`, `_Name`, `_IDEmloyee`) VALUES
('1', '123456789', 'Addmind', '1');

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

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `bill`
--
ALTER TABLE `bill`
  MODIFY `_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
