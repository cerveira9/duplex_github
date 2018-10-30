/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author fernandocerveira
 */
@Entity
public class Morador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long idCasa;
    private String nome;
    private String dataDeEntrada;
    private String dataVencimento;
    private Double calcaoPaga;
    private String descricaoCalcao;
    private String cpf;
    @OneToMany
    private List<ContaDeAgua> contaDeAgua;
    @OneToMany
    private List<Aluguel> aluguel;
    @OneToOne
    private Saida saida;
    private Long idSaida;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(Long idCasa) {
        this.idCasa = idCasa;
    }

    public Long getIdSaida() {
        return idSaida;
    }

    public void setIdSaida(Long idSaida) {
        this.idSaida = idSaida;
    }
    
    

    public Saida getSaida() {
        return saida;
    }

    public void setSaida(Saida saida) {
        this.saida = saida;
    }

        
    public Double getCalcaoPaga() {
        return calcaoPaga;
    }

    public void setCalcaoPaga(Double calcaoPaga) {
        this.calcaoPaga = calcaoPaga;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(String dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDescricaoCalcao() {
        return descricaoCalcao;
    }

    public void setDescricaoCalcao(String descricaoCalcao) {
        this.descricaoCalcao = descricaoCalcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluguel> getAluguel() {
        return aluguel;
    }

    public void setAluguel(List<Aluguel> aluguel) {
        this.aluguel = aluguel;
    }

    public List<ContaDeAgua> getContaDeAgua() {
        return contaDeAgua;
    }

    public void setContaDeAgua(List<ContaDeAgua> contaDeAgua) {
        this.contaDeAgua = contaDeAgua;
    }
            
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Morador)) {
            return false;
        }
        Morador other = (Morador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Morador[ id=" + id + " ]";
    }
    
}
