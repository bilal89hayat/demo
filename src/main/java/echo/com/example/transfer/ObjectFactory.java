//
// This file was generated by the Eclipse Implementation of JAXB, v4.0.5 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.example.transfer;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.transfer package. 
 * <p>An ObjectFactory allows you to programmatically 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.transfer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEchoRequest }
     * 
     * @return
     *     the new instance of {@link GetEchoRequest }
     */
    public GetEchoRequest createGetEchoRequest() {
        return new GetEchoRequest();
    }

    /**
     * Create an instance of {@link GetEchoResponse }
     * 
     * @return
     *     the new instance of {@link GetEchoResponse }
     */
    public GetEchoResponse createGetEchoResponse() {
        return new GetEchoResponse();
    }

}
