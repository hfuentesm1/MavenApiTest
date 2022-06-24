/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author herma
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(service.service.CitaFacadeREST.class);
        resources.add(service.service.CitaInicioFacadeREST.class);
        resources.add(service.service.ClienteFacadeREST.class);
        resources.add(service.service.EspecialidadFacadeREST.class);
        resources.add(service.service.MedicoFacadeREST.class);
        resources.add(service.service.PacienteFacadeREST.class);
        resources.add(service.service.RecetaFacadeREST.class);
    }
    
}
