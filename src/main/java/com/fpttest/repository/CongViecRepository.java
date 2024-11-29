package com.fpttest.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fpttest.entity.CongViec;
import com.fpttest.entity.SinhVien;

public interface CongViecRepository extends JpaRepository<CongViec, String> {
    Optional<CongViec> findBySinhVien(SinhVien sinhVien);
}
