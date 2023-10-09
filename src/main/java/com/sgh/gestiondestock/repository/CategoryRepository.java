package com.sgh.gestiondestock.repository;

import com.sgh.gestiondestock.model.Catogorie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Locale;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Catogorie, Integer> {

    Optional<Catogorie> findCategoryByCode(String code);

}