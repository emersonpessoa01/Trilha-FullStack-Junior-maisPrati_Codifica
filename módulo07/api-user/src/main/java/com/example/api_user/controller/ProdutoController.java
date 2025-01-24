package com.example.api_user.controller;

import com.example.api_user.model.Produto;
import com.example.api_user.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }
    @GetMapping
    public List<Produto> listarProdutos() {
        return produtoService.listarProdutos();
    }
    @GetMapping("/api/produtos/{id}")
    public Optional<Produto> buscarPorId(@PathVariable Long id) {
        return produtoService.buscarPorId(id);
    }
    @PostMapping
    public Produto produtoSalvar(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
    }
    @DeleteMapping("/api/produtos/{id}")
    public void deletarPorId(@PathVariable Long id) {
        produtoService.deletar(id);
    }
}

