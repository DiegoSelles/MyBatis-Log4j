/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuration;

/**
 *
 * @author Diego
 */
import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ConnectionFactory {

    private static SqlSessionFactory sqlMapper;
    private static Reader reader; 
   
    static{
        try{
            reader = Resources.getResourceAsReader("Configuration/mybatis-config.xml");
            sqlMapper = new SqlSessionFactoryBuilder().build(reader);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static SqlSessionFactory getSession(){
        return sqlMapper;
    }
}