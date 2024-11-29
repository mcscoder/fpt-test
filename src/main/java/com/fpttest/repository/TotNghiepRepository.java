package com.fpttest.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fpttest.entity.SinhVien;
import com.fpttest.entity.TotNghiep;

public interface TotNghiepRepository extends JpaRepository<TotNghiep, Long> {
    Optional<TotNghiep> findBySinhVien(SinhVien sinhVien);
}
