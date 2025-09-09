package com.marlon.brasileirao.service;

import com.marlon.brasileirao.model.Clube;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TabelaService {

    private List<Clube> clubes = new ArrayList<>();

    public TabelaService() {
        clubes.add(new Clube("Fluminense", 21, 14, 5, 2, 45, 10, "https://upload.wikimedia.org/wikipedia/commons/1/1d/FFC_crest.svg"));
        clubes.add(new Clube("Palmeiras", 20, 13, 4, 3, 28, 16, "https://i.pinimg.com/1200x/d2/78/dc/d278dc04113600b07444d36fe0e9f6dd.jpg"));
        clubes.add(new Clube("Cruzeiro", 21, 12, 5, 4, 35, 15, "https://i.pinimg.com/736x/51/de/fd/51defd6bc815d773c545edec8126836a.jpg"));
        clubes.add(new Clube("Bahia", 20, 10, 6, 4, 28, 22, "https://i.pinimg.com/1200x/0d/d1/a5/0dd1a5cb8bb0e3d28a4b54ad916e4ddf.jpg"));
        clubes.add(new Clube("Fortaleza", 21, 10, 5, 6, 30, 25, "https://i.pinimg.com/1200x/51/47/d3/5147d37710b67c1fb21f7a93bdbc9c6b.jpg"));
        clubes.add(new Clube("Flamengo", 21, 9, 7, 5, 27, 20, "https://i.pinimg.com/1200x/22/4f/78/224f7859088ed0d2b2a596a5d0f03f7e.jpg"));
        clubes.add(new Clube("São Paulo", 21, 9, 6, 6, 26, 23, "https://i.pinimg.com/736x/c2/63/ae/c263ae95cda8d72363f452146eb74d40.jpg"));
        clubes.add(new Clube("Internacional", 21, 9, 5, 7, 29, 28, "https://i.pinimg.com/1200x/8a/75/af/8a75af873896f0364182173fd7b5b671.jpg"));
        clubes.add(new Clube("Botafogo", 21, 8, 7, 6, 24, 22, "https://i.pinimg.com/1200x/df/ea/e6/dfeae60ab0e6e7a857061e30134281e6.jpg"));
        clubes.add(new Clube("Corinthians", 21, 8, 6, 7, 27, 24, "https://i.pinimg.com/736x/2a/c8/68/2ac8680e6f2744ef46899d595273ca53.jpg"));
        clubes.add(new Clube("Vasco", 21, 8, 5, 8, 26, 26, "https://i.pinimg.com/1200x/40/a1/20/40a120db501da7812fcc2a322259ec83.jpg"));
        clubes.add(new Clube("Grêmio", 21, 7, 7, 7, 25, 24, "https://i.pinimg.com/1200x/6e/56/85/6e56855acd4f61251a9717eb594b0ee7.jpg"));
        clubes.add(new Clube("Santos", 21, 6, 9, 6, 22, 23, "https://i.pinimg.com/736x/08/79/f5/0879f530fc7acd0469acc7691cb4bb8c.jpg"));
        clubes.add(new Clube("Bragantino", 21, 6, 8, 7, 23, 26, "https://i.pinimg.com/1200x/bd/cd/b4/bdcdb45894cd7ab3680cf87b2c15e017.jpg"));
        clubes.add(new Clube("Ceará", 21, 6, 6, 9, 21, 28, "https://upload.wikimedia.org/wikipedia/commons/3/38/Cear%C3%A1_Sporting_Club_logo.svg"));
        clubes.add(new Clube("Juventude", 21, 5, 7, 9, 20, 28, "https://i.pinimg.com/1200x/3b/13/14/3b1314f87008ced2eb969b7c7a7a7e04.jpg"));
        clubes.add(new Clube("Sport", 21, 5, 6, 10, 19, 30, "https://sportrecife.com.br/wp-content/uploads/2024/06/image14.png"));
        clubes.add(new Clube("Vitória", 21, 5, 5, 11, 18, 31, "https://i.pinimg.com/1200x/90/34/91/903491e5355fc79be23ef20e0183307c.jpg"));
        clubes.add(new Clube("Atlético-MG", 21, 5, 4, 12, 17, 32, "https://i.pinimg.com/736x/76/82/12/76821231aa806166eab9a66914a2cdef.jpg"));
        clubes.add(new Clube("Mirassol", 21, 4, 6, 11, 16, 30, "https://i.pinimg.com/1200x/c5/99/e0/c599e0b19b9816ce39439a37820d927c.jpg"));
    }

    public List<Clube> listarClubes() {
        return clubes;
    }

    public void adicionarClube(Clube clube) {
        clubes.add(clube);
    }

  public void removerClube(String nome) {
        clubes.removeIf(
                c -> c.getNome().equalsIgnoreCase(nome));
    }

    public Clube buscarClube(String nome) {
        return clubes.stream().filter(
                c -> c.getNome().equalsIgnoreCase(nome)).findFirst().orElse(null);
    }
}