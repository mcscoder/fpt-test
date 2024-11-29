package com.fpttest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fpttest.entity.Nganh;

public interface NganhRepository extends JpaRepository<Nganh, String> {
}
