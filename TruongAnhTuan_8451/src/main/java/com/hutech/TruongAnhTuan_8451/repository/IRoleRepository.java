package com.hutech.TruongAnhTuan_8451.repository;
import com.hutech.TruongAnhTuan_8451.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IRoleRepository extends JpaRepository<Role, Long> {

    @Query("SELECT r.id FROM Role r WHERE r.name = ?1")
    Long getRoleIdByName(String roleName);
}
