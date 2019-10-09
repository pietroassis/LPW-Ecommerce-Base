/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.ArrayList;
import modelos.Produto;
import modelos.Usuario;

/**
 *
 * @author gutol
 */
public class Mock {

   public static void makeMock(){
         createUsers();
         createProducts();

   }
   private static void createUsers(){
      ArrayList<Usuario> lista;

      if(Usuario.getLista() .isEmpty()){
         lista = Usuario.getLista();

         Usuario admin = new Usuario();
         admin.setEmail("admin@ifpr.edu.br");
         admin.setSenha("admin");
         admin.setNome("Administrador");
         lista.add(admin);

         Usuario gerente = new Usuario();
         gerente.setEmail("gerente@ifpr.edu.br");
         gerente.setSenha("umadificilai");
         gerente.setNome("Gerente");
         lista.add(gerente);

      }

   }

   private static void createProducts(){
      ArrayList<Produto> lista;
        if(Produto.getLista() .isEmpty()){
            lista = Produto.getLista();

            Produto caneta = new Produto();
            caneta.setDescricao("Caneta Bic");
            caneta.setPreco(1.5f);
            caneta.setOferta(true);
            caneta.setPathImagem("http://www.bavatos.com.br/content/images/thumbs/0001016_caneta-esf-cristal-azul-bic_580.jpeg");
            lista.add(caneta);

            Produto caderno = new Produto();
            caderno.setDescricao("Caderno");
            caderno.setPreco(5.5f);
            caderno.setOferta(true);
            lista.add(caderno);

            Produto caneca = new Produto();
            caneca.setDescricao("Caneca");
            caneca.setPreco(10.0f);
            caneca.setOferta(false);
            lista.add(caneca);

            Produto lapis = new Produto();
            lapis.setDescricao("Lapis");
            lapis.setPreco(1.0f);
            lapis.setOferta(false);
            lista.add(lapis);

            Produto borracha = new Produto();
            borracha.setDescricao("Borracha");
            borracha.setPreco(1.5f);
            borracha.setOferta(false);
            lista.add(borracha);

            Produto sulfite = new Produto();
            sulfite.setDescricao("Folha Sulfite");
            sulfite.setPreco(5.0f);
            sulfite.setOferta(true);
            lista.add(sulfite);
        }
    }

}
