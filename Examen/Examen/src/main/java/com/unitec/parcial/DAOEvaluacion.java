
package com.unitec.parcial;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class DAOEvaluacion {
    static SessionFactory factory;
    static Session session;
    static Transaction tranza;
    
    
    static{
       factory=  MiConfiguracionHibernate.getSessionFactory();
       session= factory.openSession();
       tranza=session.beginTransaction();
    }
    
    public static void cerrarTodo(){
        tranza.commit();
        session.close();
    }
    
    public DAOEvaluacion(){
        
    }
    
    //Creamos el insert
    public void guardar(Evaluacion e)throws Exception{
        //Aqui poner el codigo de tu guardado
        // despues invocas el metodo cerrarTodo
      
        session.save(e);
        cerrarTodo();
    }
    
    //Creamos el update
    public void actualizar(Evaluacion u)throws Exception{
        session.update(u);
        cerrarTodo();
    }
    
    //Creamos el buscarTodos
    public List<Evaluacion> buscarTodos()throws Exception{
        
        return null;
    }
    
    //Creamos el buscarPorId
    public Evaluacion buscarPorId(Integer id)throws Exception{
        
        return null;
    }
    
    //Creamos el de autenticar 
    public boolean autenticar(Evaluacion u)throws Exception{
    
    return false;
    }
}