package com.sgh.gestiondestock.repository;

import com.sgh.gestiondestock.model.LigneVentes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneVenteRepository extends JpaRepository<LigneVentes, Integer> {
}
