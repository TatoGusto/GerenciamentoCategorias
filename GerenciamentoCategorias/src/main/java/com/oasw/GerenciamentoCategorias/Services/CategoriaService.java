package com.oasw.GerenciamentoCategorias.Services;

import com.oasw.GerenciamentoCategorias.Models.CategoriaModel;
import com.oasw.GerenciamentoCategorias.Repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public CategoriaModel create(CategoriaModel categoriaModel){
        return categoriaRepository.save(categoriaModel);
    }

    public List<CategoriaModel> getAll(){
        return categoriaRepository.findAll();
    }

    public CategoriaModel getById(Long id){
        return categoriaRepository.getById(id);
    }

    public void deleteById(Long id){
        categoriaRepository.deleteById(id);
    }

}
