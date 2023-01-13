package com.portfolio.nico.Interface;

import com.portfolio.nico.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> getPerosna();
    
    public void savePersona(Persona persona);
    
    public void deletePersona(int id);
    
    public Persona findPersona(int id);
}
