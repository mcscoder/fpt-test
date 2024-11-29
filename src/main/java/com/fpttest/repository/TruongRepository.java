package com.fpttest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fpttest.entity.Truong;

public interface TruongRepository extends JpaRepository<Truong, String> {
}
