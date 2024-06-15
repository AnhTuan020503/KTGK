package com.hutech.TruongAnhTuan_8451.services;

import com.hutech.TruongAnhTuan_8451.entity.NHANVIEN;
import com.hutech.TruongAnhTuan_8451.repository.INhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhanVienService {

    @Autowired
    private INhanVienRepository nhanVienRepository;

    public List<NHANVIEN> getAllNHANVIEN() {
        return nhanVienRepository.findAll();
    }

    public Optional<NHANVIEN> getNHANVIENById(String id) {
        return nhanVienRepository.findById(id);
    }

    public void addNHANVIEN(NHANVIEN nhanvien) {
        nhanVienRepository.save(nhanvien);
    }

    public void deleteNHANVIEN(String id) {
        nhanVienRepository.deleteById(id);
    }

    public void updateNHANVIEN(NHANVIEN book) {
        nhanVienRepository.save(book);
    }
}
