/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 *
 * @author Mattheus Pirovani
 */
@Entity
@Table(name = "municipio")
public class Municipio implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID_MUNICIPIO")
    private Integer idMunicipio;

    @Column(name = "DS_MUNICIPIO")
    private String dsMunicipios;

    @OneToOne
    @JoinTable(name="MUNICIPIO",joinColumns={@JoinColumn(name="ID_MUNICIPIO")})
    private Municipio municipio;

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    

    public String getDsMunicipios() {
        return dsMunicipios;
    }

    public void setDsMunicipios(String dsMunicipios) {
        this.dsMunicipios = dsMunicipios;
    }

    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    

}
