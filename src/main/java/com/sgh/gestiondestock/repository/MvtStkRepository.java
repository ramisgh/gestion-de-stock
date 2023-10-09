package com.sgh.gestiondestock.repository;

import com.sgh.gestiondestock.model.Mvtstock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvtStkRepository extends JpaRepository<Mvtstock, Integer> {
}
