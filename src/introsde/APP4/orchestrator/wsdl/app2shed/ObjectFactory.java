
package introsde.APP4.orchestrator.wsdl.app2shed;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.APP4.orchestrator.wsdl.app2shed package. 
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

    private final static QName _UpdateShed_QNAME = new QName("http://soap.sheds.APP2.introsde/", "updateShed");
    private final static QName _GetShedListResponse_QNAME = new QName("http://soap.sheds.APP2.introsde/", "getShedListResponse");
    private final static QName _GetShedList_QNAME = new QName("http://soap.sheds.APP2.introsde/", "getShedList");
    private final static QName _GetShedById_QNAME = new QName("http://soap.sheds.APP2.introsde/", "getShedById");
    private final static QName _AddShed_QNAME = new QName("http://soap.sheds.APP2.introsde/", "addShed");
    private final static QName _AddShedResponse_QNAME = new QName("http://soap.sheds.APP2.introsde/", "addShedResponse");
    private final static QName _UpdateShedResponse_QNAME = new QName("http://soap.sheds.APP2.introsde/", "updateShedResponse");
    private final static QName _GetShedByIdResponse_QNAME = new QName("http://soap.sheds.APP2.introsde/", "getShedByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.APP4.orchestrator.wsdl.app2shed
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetShedList }
     * 
     */
    public GetShedList createGetShedList() {
        return new GetShedList();
    }

    /**
     * Create an instance of {@link GetShedListResponse }
     * 
     */
    public GetShedListResponse createGetShedListResponse() {
        return new GetShedListResponse();
    }

    /**
     * Create an instance of {@link UpdateShed }
     * 
     */
    public UpdateShed createUpdateShed() {
        return new UpdateShed();
    }

    /**
     * Create an instance of {@link GetShedByIdResponse }
     * 
     */
    public GetShedByIdResponse createGetShedByIdResponse() {
        return new GetShedByIdResponse();
    }

    /**
     * Create an instance of {@link AddShedResponse }
     * 
     */
    public AddShedResponse createAddShedResponse() {
        return new AddShedResponse();
    }

    /**
     * Create an instance of {@link UpdateShedResponse }
     * 
     */
    public UpdateShedResponse createUpdateShedResponse() {
        return new UpdateShedResponse();
    }

    /**
     * Create an instance of {@link AddShed }
     * 
     */
    public AddShed createAddShed() {
        return new AddShed();
    }

    /**
     * Create an instance of {@link GetShedById }
     * 
     */
    public GetShedById createGetShedById() {
        return new GetShedById();
    }

    /**
     * Create an instance of {@link Shed }
     * 
     */
    public Shed createShed() {
        return new Shed();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateShed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sheds.APP2.introsde/", name = "updateShed")
    public JAXBElement<UpdateShed> createUpdateShed(UpdateShed value) {
        return new JAXBElement<UpdateShed>(_UpdateShed_QNAME, UpdateShed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShedListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sheds.APP2.introsde/", name = "getShedListResponse")
    public JAXBElement<GetShedListResponse> createGetShedListResponse(GetShedListResponse value) {
        return new JAXBElement<GetShedListResponse>(_GetShedListResponse_QNAME, GetShedListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShedList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sheds.APP2.introsde/", name = "getShedList")
    public JAXBElement<GetShedList> createGetShedList(GetShedList value) {
        return new JAXBElement<GetShedList>(_GetShedList_QNAME, GetShedList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShedById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sheds.APP2.introsde/", name = "getShedById")
    public JAXBElement<GetShedById> createGetShedById(GetShedById value) {
        return new JAXBElement<GetShedById>(_GetShedById_QNAME, GetShedById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddShed }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sheds.APP2.introsde/", name = "addShed")
    public JAXBElement<AddShed> createAddShed(AddShed value) {
        return new JAXBElement<AddShed>(_AddShed_QNAME, AddShed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddShedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sheds.APP2.introsde/", name = "addShedResponse")
    public JAXBElement<AddShedResponse> createAddShedResponse(AddShedResponse value) {
        return new JAXBElement<AddShedResponse>(_AddShedResponse_QNAME, AddShedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateShedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sheds.APP2.introsde/", name = "updateShedResponse")
    public JAXBElement<UpdateShedResponse> createUpdateShedResponse(UpdateShedResponse value) {
        return new JAXBElement<UpdateShedResponse>(_UpdateShedResponse_QNAME, UpdateShedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShedByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.sheds.APP2.introsde/", name = "getShedByIdResponse")
    public JAXBElement<GetShedByIdResponse> createGetShedByIdResponse(GetShedByIdResponse value) {
        return new JAXBElement<GetShedByIdResponse>(_GetShedByIdResponse_QNAME, GetShedByIdResponse.class, null, value);
    }

}
