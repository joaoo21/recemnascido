/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Recemnascido {
    private int codigo;
    private String nomedamae;
    private Double peso;
    private int numerodoquarto;
    private String sexo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomedamae() {
        return nomedamae;
    }

    public void setNomedamae(String nomedamae) {
        this.nomedamae = nomedamae;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public int getNumerodoquarto() {
        return numerodoquarto;
    }

    public void setNumerodoquarto(int numerodoquarto) {
        this.numerodoquarto = numerodoquarto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nomedamae;
    }
    
}
