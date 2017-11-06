package com.mulesoft.training;

import static org.junit.Assert.*;
import org.junit.Rule;
import org.mule.tck.junit4.rule.DynamicPort;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

	@Rule
	public DynamicPort myPort = new DynamicPort("http.port");
	
    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
    	System.out.println("\n\nDynamic port " + myPort.getNumber());
        runFlowAndExpect("mavenFlow", "Hello World");
    }
    
    @Override
    protected String getConfigFile() {
        return "maven-project.xml";
    }

}
