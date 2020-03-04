
package org.certificatic.medicamento.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para medicamento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="medicamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaCaducidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreMedicina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precioVenta" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="privaeCantidadInventario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sustanciaActiva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://Service.Medicamento.certificatic.org/}tipoEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicamento", propOrder = {
    "fechaCaducidad",
    "nombreMedicina",
    "precioVenta",
    "privaeCantidadInventario",
    "sustanciaActiva",
    "tipo"
})
public class Medicamento {

    protected String fechaCaducidad;
    protected String nombreMedicina;
    protected Double precioVenta;
    protected int privaeCantidadInventario;
    protected String sustanciaActiva;
    @XmlSchemaType(name = "string")
    protected TipoEnum tipo;

    /**
     * Obtiene el valor de la propiedad fechaCaducidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * Define el valor de la propiedad fechaCaducidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCaducidad(String value) {
        this.fechaCaducidad = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreMedicina.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreMedicina() {
        return nombreMedicina;
    }

    /**
     * Define el valor de la propiedad nombreMedicina.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreMedicina(String value) {
        this.nombreMedicina = value;
    }

    /**
     * Obtiene el valor de la propiedad precioVenta.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * Define el valor de la propiedad precioVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrecioVenta(Double value) {
        this.precioVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad privaeCantidadInventario.
     * 
     */
    public int getPrivaeCantidadInventario() {
        return privaeCantidadInventario;
    }

    /**
     * Define el valor de la propiedad privaeCantidadInventario.
     * 
     */
    public void setPrivaeCantidadInventario(int value) {
        this.privaeCantidadInventario = value;
    }

    /**
     * Obtiene el valor de la propiedad sustanciaActiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSustanciaActiva() {
        return sustanciaActiva;
    }

    /**
     * Define el valor de la propiedad sustanciaActiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSustanciaActiva(String value) {
        this.sustanciaActiva = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link TipoEnum }
     *     
     */
    public TipoEnum getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEnum }
     *     
     */
    public void setTipo(TipoEnum value) {
        this.tipo = value;
    }

}
