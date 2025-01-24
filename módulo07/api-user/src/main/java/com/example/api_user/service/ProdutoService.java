package com.example.api_user.service;

import com.example.api_user.Repository.ProdutoRepository;
import com.example.api_user.model.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;


    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }
    public List<Produto> listarProdutos() {
        return (List<Produto>) produtoRepository.findAll();
    }
    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }
    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }
}
