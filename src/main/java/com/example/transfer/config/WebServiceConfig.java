package com.example.transfer.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean(name = "transfer")
    public DefaultWsdl11Definition defaultWsdl11Definition_1(XsdSchema echoSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        //wsdl11Definition.setPortTypeName("GetEcho");
        wsdl11Definition.setPortTypeName("CommonService");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.example.com/transfer/echo");
        wsdl11Definition.setSchema(echoSchema);
        return wsdl11Definition;
    }

  /*  @Bean(name = "agentList")
    public DefaultWsdl11Definition defaultWsdl11Definition_2(XsdSchema agentListSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("GetAgentList");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.example.com/transfer/echo");
        wsdl11Definition.setSchema(agentListSchema);
        return wsdl11Definition;
    }*/

   /* @Bean
    public XsdSchema echoSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/echo.xsd"));
    }*/

   /* @Bean
    public XsdSchema agentListSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/agentlist.xsd"));
    }*/

    @Bean
    public XsdSchema agentListSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/common.xsd"));
    }
}