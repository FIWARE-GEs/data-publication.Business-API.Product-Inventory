package org.tmf.dsmapi;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(org.tmf.dsmapi.commons.jaxrs.BadUsageExceptionMapper.class);
        classes.add(org.tmf.dsmapi.commons.jaxrs.JacksonConfigurator.class);
        classes.add(org.tmf.dsmapi.commons.jaxrs.JsonMappingExceptionMapper.class);
        classes.add(org.tmf.dsmapi.commons.jaxrs.UnknowResourceExceptionMapper.class);
        classes.add(org.tmf.dsmapi.hub.HubResource.class);
        classes.add(org.tmf.dsmapi.product.ProductAdminResource.class);
        classes.add(org.tmf.dsmapi.product.ProductResource.class);
        // following code can be used to customize Jersey 2.x JSON provider:
        try {
			Class jacksonProvider = Class.forName("org.glassfish.jersey.jackson.JacksonFeature");
			classes.add(jacksonProvider);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(getClass().getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return classes;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically re-generated by NetBeans REST support to populate
     * given list with all resources defined in the project.
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(org.tmf.dsmapi.commons.jaxrs.BadUsageExceptionMapper.class);
        resources.add(org.tmf.dsmapi.commons.jaxrs.JacksonConfigurator.class);
        resources.add(org.tmf.dsmapi.commons.jaxrs.JsonMappingExceptionMapper.class);
        resources.add(org.tmf.dsmapi.commons.jaxrs.UnknowResourceExceptionMapper.class);
        resources.add(org.tmf.dsmapi.hub.HubResource.class);
        resources.add(org.tmf.dsmapi.product.ProductAdminResource.class);
        resources.add(org.tmf.dsmapi.product.ProductResource.class);
    }

}
