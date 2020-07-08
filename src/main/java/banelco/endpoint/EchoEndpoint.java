package com.bpservice.webservicebanelco.endpoint;

import com.bpservice.webservicebanelco.repository.EchoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.banelco.bp.webservices.GetEchoRequest;
import com.banelco.bp.webservices.GetEchoResponse;

@Endpoint
public class EchoEndpoint {
    private static final String NAMESPACE_URI = "http://webservices.bp.banelco.com/";
	
    private EchoRepository echoRepository;
	
    @Autowired
    public void EchoEndpoint(EchoRepository echoRepository) {
        this.echoRepository = echoRepository;
    }
	
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEchoRequest")
    @ResponsePayload
    public GetEchoResponse getEcho(@RequestPayload GetEchoRequest request) {
		System.out.println(request.getMensaje());
        GetEchoResponse response = new GetEchoResponse();
        response.setResultado(echoRepository.findMensaje(request.getMensaje()));

        return response;
    }
}