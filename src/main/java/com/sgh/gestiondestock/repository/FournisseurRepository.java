package com.sgh.gestiondestock.repository;

import com.sgh.gestiondestock.model.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer>
{
}
