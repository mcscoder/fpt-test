package com.fpttest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fpttest.entity.SinhVien;

public interface SinhVienRepository extends JpaRepository<SinhVien, String> {
}
