
package introsde.APP4.orchestrator.wsdl.app1parks;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.APP4.orchestrator.wsdl.app1parks package. 
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

    private final static QName _GetParkById_QNAME = new QName("http://soap.parks.APP1.introsde/", "getParkById");
    private final static QName _GetParkByIdResponse_QNAME = new QName("http://soap.parks.APP1.introsde/", "getParkByIdResponse");
    private final static QName _GetParkList_QNAME = new QName("http://soap.parks.APP1.introsde/", "getParkList");
    private final static QName _AddPark_QNAME = new QName("http://soap.parks.APP1.introsde/", "addPark");
    private final static QName _UpdateParkResponse_QNAME = new QName("http://soap.parks.APP1.introsde/", "updateParkResponse");
    private final static QName _GetHelloWorldAsString_QNAME = new QName("http://soap.parks.APP1.introsde/", "getHelloWorldAsString");
    private final static QName _GetParkListResponse_QNAME = new QName("http://soap.parks.APP1.introsde/", "getParkListResponse");
    private final static QName _GetHelloWorldAsStringResponse_QNAME = new QName("http://soap.parks.APP1.introsde/", "getHelloWorldAsStringResponse");
    private final static QName _AddParkResponse_QNAME = new QName("http://soap.parks.APP1.introsde/", "addParkResponse");
    private final static QName _UpdatePark_QNAME = new QName("http://soap.parks.APP1.introsde/", "updatePark");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.APP4.orchestrator.wsdl.app1parks
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHelloWorldAsString }
     * 
     */
    public GetHelloWorldAsString createGetHelloWorldAsString() {
        return new GetHelloWorldAsString();
    }

    /**
     * Create an instance of {@link AddPark }
     * 
     */
    public AddPark createAddPark() {
        return new AddPark();
    }

    /**
     * Create an instance of {@link UpdateParkResponse }
     * 
     */
    public UpdateParkResponse createUpdateParkResponse() {
        return new UpdateParkResponse();
    }

    /**
     * Create an instance of {@link GetParkById }
     * 
     */
    public GetParkById createGetParkById() {
        return new GetParkById();
    }

    /**
     * Create an instance of {@link GetParkByIdResponse }
     * 
     */
    public GetParkByIdResponse createGetParkByIdResponse() {
        return new GetParkByIdResponse();
    }

    /**
     * Create an instance of {@link GetParkList }
     * 
     */
    public GetParkList createGetParkList() {
        return new GetParkList();
    }

    /**
     * Create an instance of {@link UpdatePark }
     * 
     */
    public UpdatePark createUpdatePark() {
        return new UpdatePark();
    }

    /**
     * Create an instance of {@link AddParkResponse }
     * 
     */
    public AddParkResponse createAddParkResponse() {
        return new AddParkResponse();
    }

    /**
     * Create an instance of {@link GetHelloWorldAsStringResponse }
     * 
     */
    public GetHelloWorldAsStringResponse createGetHelloWorldAsStringResponse() {
        return new GetHelloWorldAsStringResponse();
    }

    /**
     * Create an instance of {@link GetParkListResponse }
     * 
     */
    public GetParkListResponse createGetParkListResponse() {
        return new GetParkListResponse();
    }

    /**
     * Create an instance of {@link Park }
     * 
     */
    public Park createPark() {
        return new Park();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParkById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.parks.APP1.introsde/", name = "getParkById")
    public JAXBElement<GetParkById> createGetParkById(GetParkById value) {
        return new JAXBElement<GetParkById>(_GetParkById_QNAME, GetParkById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParkByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.parks.APP1.introsde/", name = "getParkByIdResponse")
    public JAXBElement<GetParkByIdResponse> createGetParkByIdResponse(GetParkByIdResponse value) {
        return new JAXBElement<GetParkByIdResponse>(_GetParkByIdResponse_QNAME, GetParkByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParkList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.parks.APP1.introsde/", name = "getParkList")
    public JAXBElement<GetParkList> createGetParkList(GetParkList value) {
        return new JAXBElement<GetParkList>(_GetParkList_QNAME, GetParkList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPark }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.parks.APP1.introsde/", name = "addPark")
    public JAXBElement<AddPark> createAddPark(AddPark value) {
        return new JAXBElement<AddPark>(_AddPark_QNAME, AddPark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateParkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.parks.APP1.introsde/", name = "updateParkResponse")
    public JAXBElement<UpdateParkResponse> createUpdateParkResponse(UpdateParkResponse value) {
        return new JAXBElement<UpdateParkResponse>(_UpdateParkResponse_QNAME, UpdateParkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloWorldAsString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.parks.APP1.introsde/", name = "getHelloWorldAsString")
    public JAXBElement<GetHelloWorldAsString> createGetHelloWorldAsString(GetHelloWorldAsString value) {
        return new JAXBElement<GetHelloWorldAsString>(_GetHelloWorldAsString_QNAME, GetHelloWorldAsString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParkListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.parks.APP1.introsde/", name = "getParkListResponse")
    public JAXBElement<GetParkListResponse> createGetParkListResponse(GetParkListResponse value) {
        return new JAXBElement<GetParkListResponse>(_GetParkListResponse_QNAME, GetParkListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloWorldAsStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.parks.APP1.introsde/", name = "getHelloWorldAsStringResponse")
    public JAXBElement<GetHelloWorldAsStringResponse> createGetHelloWorldAsStringResponse(GetHelloWorldAsStringResponse value) {
        return new JAXBElement<GetHelloWorldAsStringResponse>(_GetHelloWorldAsStringResponse_QNAME, GetHelloWorldAsStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddParkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.parks.APP1.introsde/", name = "addParkResponse")
    public JAXBElement<AddParkResponse> createAddParkResponse(AddParkResponse value) {
        return new JAXBElement<AddParkResponse>(_AddParkResponse_QNAME, AddParkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePark }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.parks.APP1.introsde/", name = "updatePark")
    public JAXBElement<UpdatePark> createUpdatePark(UpdatePark value) {
        return new JAXBElement<UpdatePark>(_UpdatePark_QNAME, UpdatePark.class, null, value);
    }

}
