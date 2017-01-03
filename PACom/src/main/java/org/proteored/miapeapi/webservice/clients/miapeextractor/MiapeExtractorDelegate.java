package org.proteored.miapeapi.webservice.clients.miapeextractor;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "MiapeExtractorDelegate", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/")
public interface MiapeExtractorDelegate {

	/**
	 * 
	 * @param arg0
	 */
	@WebMethod
	@RequestWrapper(localName = "main", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.Main")
	@ResponseWrapper(localName = "mainResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.MainResponse")
	public void main(
			@WebParam(name = "arg0", targetNamespace = "") List<String> arg0);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.util.List<java.lang.String>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "storeMiapeMSFromPRIDE", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSFromPRIDE")
	@ResponseWrapper(localName = "storeMiapeMSFromPRIDEResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSFromPRIDEResponse")
	public List<String> storeMiapeMSFromPRIDE(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") int arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") boolean arg5);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.util.List<java.lang.String>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "storeMiapeMSIFromPRIDE", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSIFromPRIDE")
	@ResponseWrapper(localName = "storeMiapeMSIFromPRIDEResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSIFromPRIDEResponse")
	public List<String> storeMiapeMSIFromPRIDE(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") int arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") boolean arg5);

	/**
	 * 
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.util.List<java.lang.String>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "storeMiapeMSMSIFromPRIDE", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSMSIFromPRIDE")
	@ResponseWrapper(localName = "storeMiapeMSMSIFromPRIDEResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSMSIFromPRIDEResponse")
	public List<String> storeMiapeMSMSIFromPRIDE(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") boolean arg4);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @param arg6
	 * @return returns java.util.List<java.lang.String>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "storeMiapeMSFromMzML", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSFromMzML")
	@ResponseWrapper(localName = "storeMiapeMSFromMzMLResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSFromMzMLResponse")
	public List<String> storeMiapeMSFromMzML(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") int arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") boolean arg5,
			@WebParam(name = "arg6", targetNamespace = "") boolean arg6);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @param arg6
	 * @return returns java.util.List<java.lang.String>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "storeMiapeMSMSIFromMzML", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSMSIFromMzML")
	@ResponseWrapper(localName = "storeMiapeMSMSIFromMzMLResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSMSIFromMzMLResponse")
	public List<String> storeMiapeMSMSIFromMzML(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") byte[] arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") boolean arg5,
			@WebParam(name = "arg6", targetNamespace = "") boolean arg6);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.util.List<java.lang.String>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "storeMiapeMSIFromMzIdentML", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSIFromMzIdentML")
	@ResponseWrapper(localName = "storeMiapeMSIFromMzIdentMLResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSIFromMzIdentMLResponse")
	public List<String> storeMiapeMSIFromMzIdentML(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") int arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") boolean arg5);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.util.List<java.lang.String>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "storeMiapeMSMSIFromMzIdentML", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSMSIFromMzIdentML")
	@ResponseWrapper(localName = "storeMiapeMSMSIFromMzIdentMLResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSMSIFromMzIdentMLResponse")
	public List<String> storeMiapeMSMSIFromMzIdentML(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") byte[] arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") boolean arg5);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.util.List<java.lang.String>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "storeMiapeMSIFromXTandemXML", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSIFromXTandemXML")
	@ResponseWrapper(localName = "storeMiapeMSIFromXTandemXMLResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSIFromXTandemXMLResponse")
	public List<String> storeMiapeMSIFromXTandemXML(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") int arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") boolean arg5);

	/**
	 * 
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getPRIDEFromMiapeMS", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.GetPRIDEFromMiapeMS")
	@ResponseWrapper(localName = "getPRIDEFromMiapeMSResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.GetPRIDEFromMiapeMSResponse")
	public String getPRIDEFromMiapeMS(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") boolean arg3,
			@WebParam(name = "arg4", targetNamespace = "") boolean arg4);

	/**
	 * 
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getPRIDEFromMiapeMSI", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.GetPRIDEFromMiapeMSI")
	@ResponseWrapper(localName = "getPRIDEFromMiapeMSIResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.GetPRIDEFromMiapeMSIResponse")
	public String getPRIDEFromMiapeMSI(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") boolean arg3);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getPRIDEFromMiapeMSMSI", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.GetPRIDEFromMiapeMSMSI")
	@ResponseWrapper(localName = "getPRIDEFromMiapeMSMSIResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.GetPRIDEFromMiapeMSMSIResponse")
	public String getPRIDEFromMiapeMSMSI(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") int arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") boolean arg4,
			@WebParam(name = "arg5", targetNamespace = "") boolean arg5);

	/**
	 * 
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns int
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getAssociatedMiapeMS", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.GetAssociatedMiapeMS")
	@ResponseWrapper(localName = "getAssociatedMiapeMSResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.GetAssociatedMiapeMSResponse")
	public int getAssociatedMiapeMS(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2);

	/**
	 * 
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns int
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getAssociatedMiapeGE", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.GetAssociatedMiapeGE")
	@ResponseWrapper(localName = "getAssociatedMiapeGEResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.GetAssociatedMiapeGEResponse")
	public int getAssociatedMiapeGE(
			@WebParam(name = "arg0", targetNamespace = "") int arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @param arg6
	 * @param arg7
	 * @return returns java.util.List<java.lang.String>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "storeMiapeMSMSIFromMzMLandMzIdentMLAndMetadata", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSMSIFromMzMLandMzIdentMLAndMetadata")
	@ResponseWrapper(localName = "storeMiapeMSMSIFromMzMLandMzIdentMLAndMetadataResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSMSIFromMzMLandMzIdentMLAndMetadataResponse")
	public List<String> storeMiapeMSMSIFromMzMLandMzIdentMLAndMetadata(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") String arg5,
			@WebParam(name = "arg6", targetNamespace = "") boolean arg6,
			@WebParam(name = "arg7", targetNamespace = "") boolean arg7);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @param arg6
	 * @return returns java.util.List<java.lang.String>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "storeMiapeMSFromPRIDEAndMetadata", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSFromPRIDEAndMetadata")
	@ResponseWrapper(localName = "storeMiapeMSFromPRIDEAndMetadataResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSFromPRIDEAndMetadataResponse")
	public List<String> storeMiapeMSFromPRIDEAndMetadata(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") int arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") String arg5,
			@WebParam(name = "arg6", targetNamespace = "") boolean arg6);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.util.List<java.lang.String>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "storeMiapeMSMSIFromPRIDEAndMetadata", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSMSIFromPRIDEAndMetadata")
	@ResponseWrapper(localName = "storeMiapeMSMSIFromPRIDEAndMetadataResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSMSIFromPRIDEAndMetadataResponse")
	public List<String> storeMiapeMSMSIFromPRIDEAndMetadata(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") boolean arg5);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @param arg6
	 * @param arg7
	 * @return returns java.util.List<java.lang.String>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "storeMiapeMSFromMzMLAndMetadata", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSFromMzMLAndMetadata")
	@ResponseWrapper(localName = "storeMiapeMSFromMzMLAndMetadataResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSFromMzMLAndMetadataResponse")
	public List<String> storeMiapeMSFromMzMLAndMetadata(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") int arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") String arg5,
			@WebParam(name = "arg6", targetNamespace = "") boolean arg6,
			@WebParam(name = "arg7", targetNamespace = "") boolean arg7);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @param arg6
	 * @return returns java.util.List<java.lang.String>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "storeMiapeMSMSIFromMzMLandMzIdentML", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSMSIFromMzMLandMzIdentML")
	@ResponseWrapper(localName = "storeMiapeMSMSIFromMzMLandMzIdentMLResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSMSIFromMzMLandMzIdentMLResponse")
	public List<String> storeMiapeMSMSIFromMzMLandMzIdentML(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") boolean arg5,
			@WebParam(name = "arg6", targetNamespace = "") boolean arg6);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.util.List<java.lang.String>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "storeMiapeMSIFromXTandemXMLAndMetadata", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSIFromXTandemXMLAndMetadata")
	@ResponseWrapper(localName = "storeMiapeMSIFromXTandemXMLAndMetadataResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSIFromXTandemXMLAndMetadataResponse")
	public List<String> storeMiapeMSIFromXTandemXMLAndMetadata(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") boolean arg5);

	/**
	 * 
	 * @param arg5
	 * @param arg4
	 * @param arg3
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns java.util.List<java.lang.String>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "storeMiapeMSMSIFromXTandemXML", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSMSIFromXTandemXML")
	@ResponseWrapper(localName = "storeMiapeMSMSIFromXTandemXMLResponse", targetNamespace = "http://webservice.miapeconverter.miapeapi.proteored.org/", className = "org.proteored.miapeapi.webservice.clients.miapeextractor.StoreMiapeMSMSIFromXTandemXMLResponse")
	public List<String> storeMiapeMSMSIFromXTandemXML(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") byte[] arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") boolean arg5);

}