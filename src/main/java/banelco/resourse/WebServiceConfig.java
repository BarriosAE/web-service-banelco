package com.bpservice.webservicebanelco.resourse;

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
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/services_bp/BPService/*");
    }

    @Bean(name = "banelco")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema banelcoSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("BPService");
        wsdl11Definition.setLocationUri("/services_bp/BPService");
        wsdl11Definition.setTargetNamespace("http://webservices.bp.banelco.com/");
        wsdl11Definition.setSchema(banelcoSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema banelcoSchema() {
        return new SimpleXsdSchema(new ClassPathResource("banelco.xsd"));
    }
}
