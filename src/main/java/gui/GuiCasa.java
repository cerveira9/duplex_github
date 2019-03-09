/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.CasaDao;
import dao.ContaDeAguaDao;
import dao.MoradorDao;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.Casa;
import model.ContaDeAgua;
import model.Morador;

/**
 *
 * @author Fjunger
 */

@Named(value="guiCasa")
@SessionScoped
public class GuiCasa implements Serializable{
    
    @EJB
    CasaDao daoCasa;
    
    @EJB
    MoradorDao daoMorador;
    
    @EJB
    ContaDeAguaDao daoContaAgua;
    
    private Morador morador;
    private List<Morador> moradores;
    private Casa casa;
    private List<Casa> casas;
    private boolean incluindo;
    private String url;
    private String urlBack;
    private ContaDeAgua contaAgua;
    private List<ContaDeAgua> contasAgua;

    public List<ContaDeAgua> getContasAgua() {
        return contasAgua;
    }

    public void setContasAgua(List<ContaDeAgua> contasAgua) {
        this.contasAgua = contasAgua;
    }
    
    public Morador getMorador() {
        return morador;
    }

    public void setMorador(Morador morador) {
        this.morador = morador;
    }

    public List<Morador> getMoraderes() {
        return moradores;
    }
    
    public void setMoraderes(List<Morador> moraderes) {
        this.moradores = moraderes;
    }
    
    public List<Casa> getCasas(){
        return casas;
    }
    
    public void setCasas(List<Casa> casas){
        this.casas = casas;
    }

    public boolean isIncluindo() {
        return incluindo;
    }

    public void setIncluindo(boolean incluindo) {
        this.incluindo = incluindo;
    }

    public ContaDeAgua getContaAgua() {
        return contaAgua;
    }

    public void setContaAgua(ContaDeAgua contaAgua) {
        this.contaAgua = contaAgua;
    }
    
    public void salvarCntAgua(){
        daoContaAgua.gravar(contaAgua, incluindo);
        
    }
    
    public String frmLstCasas(){
        casas = daoCasa.getList();
        urlBack=url;
        url="FrmLstCasas";
        return url;
    }
    
    public String novaCasa(){
        incluindo = true;
        casa = new Casa();
        urlBack=url;
        url="FrmAddCasa";
        return url;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
    
    public String gravar() throws Exception{
        daoCasa.gravar(casa, incluindo);
        casas = daoCasa.getList();
        urlBack=url;
        url="FrmLstCasas";
        return url;
    }
    
    public String editarCasa(Casa c) throws Exception{
        incluindo=false;
        this.casa=c;
        urlBack=url;
        url="FrmAddCasa";
        return url;
    }
    
    public String excluirCasa(Casa c) throws Exception{
        daoCasa.excluir(c);
        casas = daoCasa.getList(); 
        urlBack=url;
        url="FrmLstCasa";
        return url;
    }
    
    public String DetalheCasa(Casa c){
        this.casa = c;
        moradores = daoCasa.getListMoradores(c.getId());
        urlBack=url;
        url="FrmDetCasa";
        return url;
    }
    
    public String addMorador(){
        morador = new Morador();
        incluindo = true;
        morador.setIdCasa(casa.getId());
        urlBack=url;
        url="FrmAddMorador";
        return url;
    }
        
    public String gravarMorador(){
        daoMorador.gravar(morador, incluindo);
        moradores = daoCasa.getListMoradores(casa.getId());
        urlBack=url;
        url="FrmDetCasa";
        return url;
    }
    
    
    public String voltar(){
        return urlBack;
    }
    
    public String detalheMorador(Morador m){
        this.morador = m;
        contasAgua = daoContaAgua.getList(morador.getId());
        return "FrmDetMorador";
    }
    
    public String addContaAgua(){
        contaAgua = new ContaDeAgua();
        incluindo = true;
        return "FrmAddAgua";
    }
}
