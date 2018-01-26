package introsde.APP4.orchestrator;

import javax.xml.ws.Endpoint;

import introsde.APP4.orchestrator.soap.NaturalTuristImpl;

//Endpoint publisher
public class Publisher{
  public static void main(String[] args) {
     Endpoint.publish("http://localhost:6901/app4/naturalturist", new NaturalTuristImpl());
  }
}
