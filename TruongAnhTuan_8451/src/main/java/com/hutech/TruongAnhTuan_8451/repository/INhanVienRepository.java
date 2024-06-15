package com.hutech.TruongAnhTuan_8451.repository;

import com.hutech.TruongAnhTuan_8451.entity.NHANVIEN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INhanVienRepository extends JpaRepository<NHANVIEN, String> {
}

