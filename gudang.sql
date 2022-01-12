-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 12 Jan 2022 pada 11.47
-- Versi server: 10.4.18-MariaDB
-- Versi PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gudang`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `kd_barang` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `merek` varchar(50) NOT NULL,
  `jenis` varchar(50) NOT NULL,
  `no_order` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`kd_barang`, `nama_barang`, `merek`, `jenis`, `no_order`) VALUES
('YSI9123', 'Laptop', 'Asus', 'Gadget', 'YD823');

-- --------------------------------------------------------

--
-- Struktur dari tabel `gudang`
--

CREATE TABLE `gudang` (
  `no_order` varchar(50) NOT NULL,
  `jumlah` varchar(50) NOT NULL,
  `tgl_masuk` varchar(50) NOT NULL,
  `tgl_keluar` varchar(50) NOT NULL,
  `no_barang` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `gudang`
--

INSERT INTO `gudang` (`no_order`, `jumlah`, `tgl_masuk`, `tgl_keluar`, `no_barang`) VALUES
('RYU92', '10', '12/01/2022', '15/01/2022', 'YFU32');

-- --------------------------------------------------------

--
-- Struktur dari tabel `suplayer`
--

CREATE TABLE `suplayer` (
  `kd_sup` varchar(50) NOT NULL,
  `nama_sup` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_order` varchar(50) NOT NULL,
  `telepon` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `suplayer`
--

INSERT INTO `suplayer` (`kd_sup`, `nama_sup`, `alamat`, `no_order`, `telepon`) VALUES
('9123', 'Ichalasul', 'Banjarbaru', 'UD039', '081964739875');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kd_barang`);

--
-- Indeks untuk tabel `gudang`
--
ALTER TABLE `gudang`
  ADD PRIMARY KEY (`no_order`);

--
-- Indeks untuk tabel `suplayer`
--
ALTER TABLE `suplayer`
  ADD PRIMARY KEY (`kd_sup`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
