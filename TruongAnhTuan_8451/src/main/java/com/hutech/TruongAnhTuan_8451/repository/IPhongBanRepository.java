package com.hutech.TruongAnhTuan_8451.repository;

import com.hutech.TruongAnhTuan_8451.entity.PHONGBAN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhongBanRepository extends JpaRepository<PHONGBAN, Long> {
}
