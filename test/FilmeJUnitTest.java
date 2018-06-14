/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class FilmeJUnitTest {
    
   @Test
   public void testeDefinirTituloOriginal(){
       Filme backToTheFuture = new Filme();
       backToTheFuture.setTituloOriginal("Back To The Future");
       assertEquals("Back To The Future", backToTheFuture.getTituloOriginal());
   }
   @Test
   public void testeDefinirTitulo(){
       Filme noOlhoDoFuracao = new Filme();
       noOlhoDoFuracao.setTitulo("No Olho do Furacão");
       assertEquals("No Olho do Furacão", noOlhoDoFuracao.getTitulo());
   }
   @Test
   public void testeDefinirGenero(){
       Filme euSoPossoImaginar = new Filme();
       euSoPossoImaginar.setTitulo("Eu Só Posso Imaginar");
       euSoPossoImaginar.setGenero("Drama");
       assertEquals("Drama", euSoPossoImaginar.getGenero());
   }
   @Test
   public void testeDefinirAnoLancamento(){
       Filme titanic = new Filme();
       titanic.setTitulo("Titanic");
       titanic.setAnoLancamento((short)1997);
       assertEquals(1997, titanic.getAnolancamento());
   }
   @Test
   public void testValorFaturamento(){
       Filme matrix = new Filme();
       matrix.setTitulo("Matrix");
       matrix.setValorFaturamento((double)742128461);
       assertEquals(742128461, matrix.getValorFaturamento(),0);
   }

}
