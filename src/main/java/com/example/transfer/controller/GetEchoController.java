package com.example.transfer.controller;



import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class GetEchoController {

    private final String  NAME_SPACE_URI = "http://www.example.com/transfe/echo";

 /*   @PayloadRoot(namespace = NAME_SPACE_URI, localPart = "GetEchoRequest")
    @ResponsePayload
    public GetEchoResponse getEcho(@RequestPayload GetEchoRequest getEchoRequest) {

        GetEchoResponse response = new GetEchoResponse();
        response.setCODE(getEchoRequest.getAGENTCODE());
        return response;
    }
*/
    /*@PayloadRoot(namespace = NAME_SPACE_URI, localPart = "GetAgentListRequest")
    @ResponsePayload
    public GetAgentListResponse getAgentList(@RequestPayload GetAgentListRequest getAgentListRequest) {

        GetAgentListResponse response = new GetAgentListResponse();
        GetAgentListResponse.GetAgentListResult getAgentListResult = new GetAgentListResponse.GetAgentListResult();
        GetAgentListResponse.GetAgentListResult.ReturnAGENTLIST returnAGENTLIST = new GetAgentListResponse.GetAgentListResult.ReturnAGENTLIST();
        returnAGENTLIST.setADDRESS(getAgentListRequest.getPAYOUTCOUNTRY());

        getAgentListResult.getReturnAGENTLIST().add(returnAGENTLIST);
        response.setGetAgentListResult(getAgentListResult);

        return response;
    }*/
}
