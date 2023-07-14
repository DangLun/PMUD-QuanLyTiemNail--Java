use quanlytiemnail;
SELECT * FROM khachhang;
select * from hoadon;
ALTER DATABASE quanlytiemnail CHARACTER SET utf8mb4;
select * from quanlytiemnail.khachhang;
select * from quanlytiemnail.dichvu;
select * from khachhangquanlytiemnail.nhanvien;
select * from quanlytiemnail.hoadon;
select * from quanlytiemnail.chitiet_hd;
CREATE TABLE `quanlytiemnail`.`khachhang` (
  `idkh` INT NOT NULL AUTO_INCREMENT,
  `tenkh` varchar(45) NULL,
  `sdtkh` varchar(45) NULL,
  `email` varchar(45) NULL,
  `gioitinhkh` varchar(45) NULL,
  `diachikh` varchar(45) NULL,
  PRIMARY KEY (`idkh`)
  )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
  
  CREATE TABLE `quanlytiemnail`.`nhanvien` (
  `idnv` INT NOT NULL AUTO_INCREMENT,
  `tennv` varchar(45) NULL,
  `sdtnv` varchar(45) NULL,
  `ngaysinhnv` DATE NULL,
  `luongnv` INT NULL,
  PRIMARY KEY (`idnv`)
  )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
  
  CREATE TABLE `quanlytiemnail`.`dichvu` (
  `iddv` INT NOT NULL AUTO_INCREMENT,
  `tendv` VARCHAR(45) NULL,
  `giadv` INT NULL,
  PRIMARY KEY (`iddv`))ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
  
  CREATE TABLE `quanlytiemnail`.`hoadon` (
  `idhd` INT NOT NULL AUTO_INCREMENT,
  `idnv` INT NOT NULL,
  `ngaylap` DATETIME NULL,
  PRIMARY KEY (`idhd`),
  INDEX `idnv_idx` (`idnv` ASC) VISIBLE,
  CONSTRAINT `idnv`
    FOREIGN KEY (`idnv`)
    REFERENCES `quanlytiemnail`.`nhanvien` (`idnv`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
    
    
CREATE TABLE `quanlytiemnail`.`chitiet_hd` (
  `idchitiet_hd` INT NOT NULL AUTO_INCREMENT,
  `idhd` INT NOT NULL,
  `iddv` INT NOT NULL,
  `soluong` INT NULL,
  PRIMARY KEY (`idchitiet_hd`),
  INDEX `iddv_idx` (`idhd` ASC) VISIBLE,
  CONSTRAINT `iddv`
    FOREIGN KEY (`idhd`)
    REFERENCES `quanlytiemnail`.`dichvu` (`iddv`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idhd`
    FOREIGN KEY (`idhd`)
    REFERENCES `quanlytiemnail`.`hoadon` (`idhd`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
-- insert data
insert into quanlytiemnail.khachhang(tenkh, sdtkh, email, gioitinhkh, diachikh)
values('nguyễn tấn huy', '0123456789', 'huyxx@gmail.com','nam','Lấp vò'),
('trần duy đăng', '0868337747', 'danglun337747@gmail.com','nữ','Thanh Bình'); 
insert into quanlytiemnail.dichvu(tendv, giadv)
values('làm móng tay', 5000),
('làm móng chân', 5000),
('gội đầu', 15000),
('mát xa mặt', 20000),
('Sơn móng tay', 10000),
('Sơn móng chân', 10000);

insert into quanlytiemnail.nhanvien(tennv,sdtnv,ngaysinhnv,luongnv)
values('le van a', '589375983', '2003-08-20', 1000000),
('tran van b', '53489753', '2002-12-10', 5000);
insert into quanlytiemnail.hoadon(idnv,idkh,ngaylap)
values(2, 1,'2023-05-03 10:30:00'),
(2,2,'2023-04-30 10:52:00');

insert into quanlytiemnail.chitiet_hd(idhd, iddv, soluong)
values (1,1,2),
(2,1,2),
(2,1,1);
SELECT cthd.idhd, SUM(cthd.soluong * giadv), soluong, giadv
FROM (
    SELECT chitiet_hd.idhd, chitiet_hd.soluong, giadv, (chitiet_hd.soluong * giadv) 
    FROM hoadon 
    INNER JOIN nhanvien ON hoadon.idnv = nhanvien.idnv 
    INNER JOIN khachhang ON hoadon.idkh = khachhang.idkh 
    INNER JOIN chitiet_hd ON chitiet_hd.idhd = hoadon.idhd 
    INNER JOIN dichvu ON dichvu.iddv = chitiet_hd.iddv
    WHERE khachhang.tenkh = 'trần duy đăng'
    GROUP BY chitiet_hd.idhd, chitiet_hd.soluong, giadv
) cthd
GROUP BY cthd.idhd, soluong, giadv;

select idhd, tenkh, sdtkh, tennv, sdtnv, date(ngaylap)
                           from (quanlytiemnail.hoadon inner join quanlytiemnail.nhanvien
                           on quanlytiemnail.hoadon.idnv = quanlytiemnail.nhanvien.idnv) inner join quanlytiemnail.khachhang
                           on quanlytiemnail.hoadon.idkh = quanlytiemnail.khachhang.idkh
                            where quanlytiemnail.khachhang.tenkh = 'trần duy đăng';


SELECT chitiet_hd.idhd, khachhang.tenkh, khachhang.sdtkh, nhanvien.tennv, nhanvien.sdtnv, hoadon.ngaylap, sum(soluong * giadv)
    FROM hoadon 
    INNER JOIN nhanvien ON hoadon.idnv = nhanvien.idnv 
    INNER JOIN khachhang ON hoadon.idkh = khachhang.idkh 
    INNER JOIN chitiet_hd ON chitiet_hd.idhd = hoadon.idhd 
    INNER JOIN dichvu ON dichvu.iddv = chitiet_hd.iddv
    GROUP BY chitiet_hd.idhd
    having khachhang.tenkh = 'trần duy đăng';

SELECT chitiet_hd.idhd, khachhang.tenkh, khachhang.sdtkh, nhanvien.tennv, nhanvien.sdtnv, hoadon.ngaylap, sum(soluong * giadv) as 'Tổng tiền'
                                FROM hoadon 
                                INNER JOIN nhanvien ON hoadon.idnv = nhanvien.idnv 
                                INNER JOIN khachhang ON hoadon.idkh = khachhang.idkh 
                                INNER JOIN chitiet_hd ON chitiet_hd.idhd = hoadon.idhd 
                                INNER JOIN dichvu ON dichvu.iddv = chitiet_hd.iddv
                                GROUP BY chitiet_hd.idhd;
                                

select nhanvien.tennv from nhanvien inner join taikhoan
                           on nhanvien.idnv = taikhoan.idnv
                           where tentaikhoan = 'admin';
                select iddv, giadv from quanlytiemnail.dichvu where tendv = 'làm móng tay';          
                                
select * from quanlytiemnail.khachhang;
select * from quanlytiemnail.chitiet_hd;

select soluong, tendv, giadv, quanlytiemnail.nhanvien.gioitinhnv
from (quanlytiemnail.chitiet_hd inner join quanlytiemnail.hoadon on quanlytiemnail.chitiet_hd.idhd = quanlytiemnail.hoadon.idhd)
inner join quanlytiemnail.dichvu on quanlytiemnail.dichvu.iddv = quanlytiemnail.chitiet_hd.iddv inner join quanlytiemnail.nhanvien on quanlytiemnail.hoadon.idnv 
= quanlytiemnail.nhanvien.idnv
where quanlytiemnail.hoadon.idhd = 1;

CALL AddKhachHang('Nguyễn Phú Thịnh', '0923129710', 'Thinhxxx@gmail.com', 'Nam', 'Long an');
select idhd, tenkh, sdtkh, tennv, sdtnv, date(ngaylap)
                           from (quanlytiemnail.hoadon inner join quanlytiemnail.nhanvien
                           on quanlytiemnail.hoadon.idnv = quanlytiemnail.nhanvien.idnv) inner join quanlytiemnail.khachhang
                           on quanlytiemnail.hoadon.idkh = quanlytiemnail.khachhang.idkh;
select giadv from quanlytiemnail.dichvu where tendv like 'làm móng chân';

select idhd from quanlytiemnail.hoadon order by idhd desc;

select * from quanlytiemnail.taikhoan inner join quanlytiemnail.nhanvien
                               on quanlytiemnail.taikhoan.idnv = quanlytiemnail.nhanvien.idnv
                               where tentaikhoan like 'admin';
select year(ngaysinhnv) from quanlytiemnail.nhanvien;

select * from quanlytiemnail.dichvu where tendv like 'làm móng tay';
SELECT chitiet_hd.idhd, khachhang.tenkh, khachhang.sdtkh, nhanvien.tennv, nhanvien.sdtnv, hoadon.ngaylap, soluong, giadv
                                FROM hoadon 
                                INNER JOIN nhanvien ON hoadon.idnv = nhanvien.idnv 
                                INNER JOIN khachhang ON hoadon.idkh = khachhang.idkh 
                                INNER JOIN chitiet_hd ON chitiet_hd.idhd = hoadon.idhd 
                                INNER JOIN dichvu ON dichvu.iddv = chitiet_hd.iddv;
select idnv from nhanvien order by idnv desc;     
delete from quanlytiemnail.hoadon
where quanlytiemnail.hoadon.idkh = 3;
select * from khachhangtaikhoanlichsu
select * from hoadon
call dropItemNhanVien(1) 
select * from nhanvien
select * from khachhang
select * from hoadon
select * from chitiet_hd
delete from quanlytiemnail.hoadon
    where quanlytiemnail.hoadon.idkh = 1;
UPDATE quanlytiemnail.hoadon SET quanlytiemnail.hoadon.idkh = 0 WHERE quanlytiemnail.hoadon.idhd IN(
SELECT * FROM (SELECT quanlytiemnail.hoadon.idhd FROM quanlytiemnail.hoadon 
    WHERE quanlytiemnail.hoadon.idkh = 1) AS tmp);
insert into khachhang()
    value();
SELECT chitiet_hd.idhd, khachhang.tenkh, khachhang.sdtkh, nhanvien.tennv, nhanvien.sdtnv, hoadon.ngaylap, sum(soluong * giadv)
                                FROM hoadon 
                                INNER JOIN nhanvien ON hoadon.idnv = nhanvien.idnv 
                                INNER JOIN khachhang ON hoadon.idkh = khachhang.idkh 
                                INNER JOIN chitiet_hd ON chitiet_hd.idhd = hoadon.idhd 
                                INNER JOIN dichvu ON dichvu.iddv = chitiet_hd.iddv
                                GROUP BY chitiet_hd.idhd  
                                
