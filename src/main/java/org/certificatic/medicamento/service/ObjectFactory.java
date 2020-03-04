
package org.certificatic.medicamento.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.certificatic.medicamento.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CrearMedicamentoResponse_QNAME = new QName("http://Service.Medicamento.certificatic.org/", "crearMedicamentoResponse");
    private final static QName _CrearMedicamento_QNAME = new QName("http://Service.Medicamento.certificatic.org/", "crearMedicamento");
    private final static QName _ObtenerTodos_QNAME = new QName("http://Service.Medicamento.certificatic.org/", "obtenerTodos");
    private final static QName _ObtenerTodosResponse_QNAME = new QName("http://Service.Medicamento.certificatic.org/", "obtenerTodosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.certificatic.medicamento.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearMedicamentoResponse }
     * 
     */
    public CrearMedicamentoResponse createCrearMedicamentoResponse() {
        return new CrearMedicamentoResponse();
    }

    /**
     * Create an instance of {@link CrearMedicamento }
     * 
     */
    public CrearMedicamento createCrearMedicamento() {
        return new CrearMedicamento();
    }

    /**
     * Create an instance of {@link ObtenerTodos }
     * 
     */
    public ObtenerTodos createObtenerTodos() {
        return new ObtenerTodos();
    }

    /**
     * Create an instance of {@link ObtenerTodosResponse }
     * 
     */
    public ObtenerTodosResponse createObtenerTodosResponse() {
        return new ObtenerTodosResponse();
    }

    /**
     * Create an instance of {@link Medicamento }
     * 
     */
    public Medicamento createMedicamento() {
        return new Medicamento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearMedicamentoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.Medicamento.certificatic.org/", name = "crearMedicamentoResponse")
    public JAXBElement<CrearMedicamentoResponse> createCrearMedicamentoResponse(CrearMedicamentoResponse value) {
        return new JAXBElement<CrearMedicamentoResponse>(_CrearMedicamentoResponse_QNAME, CrearMedicamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearMedicamento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.Medicamento.certificatic.org/", name = "crearMedicamento")
    public JAXBElement<CrearMedicamento> createCrearMedicamento(CrearMedicamento value) {
        return new JAXBElement<CrearMedicamento>(_CrearMedicamento_QNAME, CrearMedicamento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.Medicamento.certificatic.org/", name = "obtenerTodos")
    public JAXBElement<ObtenerTodos> createObtenerTodos(ObtenerTodos value) {
        return new JAXBElement<ObtenerTodos>(_ObtenerTodos_QNAME, ObtenerTodos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTodosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Service.Medicamento.certificatic.org/", name = "obtenerTodosResponse")
    public JAXBElement<ObtenerTodosResponse> createObtenerTodosResponse(ObtenerTodosResponse value) {
        return new JAXBElement<ObtenerTodosResponse>(_ObtenerTodosResponse_QNAME, ObtenerTodosResponse.class, null, value);
    }

}
