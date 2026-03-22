package com.oasw.GerenciamentoCategorias.Repositories;

import com.oasw.GerenciamentoCategorias.Models.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaModel,Long> {
}
