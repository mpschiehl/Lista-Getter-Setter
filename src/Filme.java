
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcio Pedro Schiehl
 */
public class Filme {
private String titulo, genero,tituloOriginal;
public void setTitulo(String titulo){
    this.titulo = titulo;
}
public String getTitulo(){
    return titulo;
}
public void setGenero(String genero){
    this.genero = genero;
}
public String getGenero(){
    return genero;
}
public void setTituloOriginal(String tituloOriginal){
    this.tituloOriginal = tituloOriginal;
}
public String getTituloOriginal(){
    return tituloOriginal;
}
private short anoLancamento;
public void setAnoLancamento(short anoLancamento){
    this.anoLancamento = anoLancamento;
}
public short getAnolancamento(){
    return anoLancamento;
}
private double valorFaturamento;
private long valorOrcamento;
public double getValorFaturamento() {
        return valorFaturamento;
    }
public void setValorFaturamento(double valorFaturamento) {
        this.valorFaturamento = valorFaturamento;
    }
public long getValorOrcamento() {
        return valorOrcamento;
    }
public void setValorOrcamento(long valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }
private long espectadores;
public long getEspectadores(){
    return  espectadores;
}
public void setEspetadores(long espectadores){
    this.espectadores=espectadores;
}
private String classificacao;
public String getClassificao(){
    return classificacao;
}
public void setClassificao(String classificao){
    this.classificacao=classificacao;
}
private double mediaPreco;
public double getMediaPreco(){
    return mediaPreco;
}
public void setMediaPreco(){
    this.mediaPreco = mediaPreco;
}
private LocalDate dataLancamentoBrasil;
public void setDataLancamentoBrasil(){
    this.dataLancamentoBrasil = dataLancamentoBrasil;
}
public LocalDate getDataLancamentoBrasil(){
    return dataLancamentoBrasil;
}
private String idioma;
public void setIdioma(){
    this.idioma=idioma;
}
public String getIdioma(){
    return idioma;
}

}
