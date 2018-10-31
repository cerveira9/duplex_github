/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.CasaDao;
import dao.MoradorDao;
import java.io.Console;
import java.io.Serializable;
import static java.lang.System.console;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import model.Casa;
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
    
    private Morador morador;
    private List<Morador> moradores;
    private Casa casa;
    private List<Casa> casas;
    private boolean incluindo;

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
    
    public String frmLstCasas(){
        casas = daoCasa.getList();
        return "FrmLstCasas";
    }
    
    public String novaCasa(){
        incluindo = true;
        casa = new Casa();
        return "FrmAddCasa";
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
        return "FrmLstCasas";
    }
    
    public String editarCasa(Casa c) throws Exception{
        incluindo=false;
        this.casa=c;
        return "FrmAddCasa";
    }
    
    public String excluirCasa(Casa c) throws Exception{
        daoCasa.excluir(c);
        casas = daoCasa.getList(); 
        return "FrmLstCasa";
    }
    
    public String DetalheCasa(Casa c){
        this.casa = c;
        moradores = daoCasa.getListMoradores(c.getId());
        return "FrmDetCasa";
    }
    
    public String addMorador(){
        morador = new Morador();
        incluindo = true;
        morador.setIdCasa(casa.getId());
        return "FrmAddMorador";
    }
        
    public String gravarMorador(){
        daoMorador.gravar(morador, incluindo);
        moradores = daoCasa.getListMoradores(casa.getId());
        return "FrmDetCasa";
    }
}
