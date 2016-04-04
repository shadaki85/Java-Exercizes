/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio_conn_db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Regione {
    private int id;
    private String nome;
    private Provincia[] province ;

    public int getId() {
        return id;
    }

    public int setId(Connection conn) {
        ResultSet rs = null;
        Statement st = null;
        int id = 0;
        try
        {
            st = conn.createStatement();
                        
            String query="select id from regione where nome='"+this.getNome()+"'";
                        
            rs=st.executeQuery(query);
            while(rs.next())
            {
                id = rs.getInt("id");   
            }
        }
        catch(SQLException sqle){
            
            System.out.println("Errore in setId: " + sqle.getMessage());
        }
        return this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Provincia[] getProvince() {
        return province;
    }

    public Regione(String nome) {
        this.nome = nome;
        Connection conn = null;
        try
        {
            conn = ConnectionManager.getConnectionWithDataSource();
            province = setProvince(conn);
            id = setId(conn);
        }
        catch(SQLException sqle){
            System.out.println("Errore nel costruttore di Regione: " + sqle.getMessage());
        }
        finally
        {
            if (conn != null)
            {
                try
                {
                    conn.close();
                }
                catch(SQLException sqle)
                {
                    System.out.println("Errore durante la chiusura della connessione: " + sqle.getMessage());
                }
            }
        }
        
    }
    
    private Provincia[] setProvince(Connection conn)
    {
        ResultSet rs = null;
        Statement st = null;
        int numProvince = 0;
        int counter = 0;
        Provincia[] province = null;
        //Connection conn = null;
        try
        {
            //conn = ConnectionManager.getConnectionWithDataSource();
            st = conn.createStatement();
            
            String queryProvince="select "
                    + "provincia.id as id_provincia, "
                    + "provincia.nome as nome_provincia, "
                    + "provincia.comuni as numero_comuni, "
                    + "provincia.sigla as sigla, "
                    + "provincia.abitanti as abitanti, "
                    + "provincia.superficie as superficie "
                    + "from provincia join regione on provincia.regione = regione.id "
                    + "where regione.nome='"+this.getNome()+"'"
            ;
            
            String queryCount="select count(*) as conta from provincia join regione on provincia.regione = regione.id where regione.nome='"+this.getNome()+"'";
                        
            rs=st.executeQuery(queryCount);
            while(rs.next())
            {
                numProvince = rs.getInt("conta");    
            }

            province = new Provincia[numProvince];
            
            rs=st.executeQuery(queryProvince);
            while(rs.next())
            {
                province[counter] = new Provincia( 
                        rs.getInt("id_provincia"), 
                        rs.getString("nome_provincia"), 
                        rs.getInt("numero_comuni"),
                        rs.getString("sigla"),
                        rs.getInt("abitanti"),
                        rs.getInt("superficie")
                );
                counter++;
            }
        }
        catch(SQLException sqle){
            
            System.out.println("Errore in getProvince: " + sqle.getMessage());
        }
        return this.province = province;
    }
    
}
