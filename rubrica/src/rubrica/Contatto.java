
package rubrica;

public class Contatto implements Comparable<Contatto>
{
    private String nome;
    private String cognome;
    private String email;
    private String telefono;

    public Contatto(String nome, String cognome, String email, String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
  
    @Override
    public int compareTo(Contatto c) {
        return this.getCognome().compareTo(c.getCognome());
    }
    
    public boolean confrontaCampi(String nome,String cognome,String telefono,String email)
    {
        return this.getNome().equals(nome) 
                && this.getCognome().equals(cognome) 
                && this.getEmail().equals(email) 
                && this.getTelefono().equals(telefono);
    }
    
    @Override
    public String toString()
    {
        return this.nome+" "+this.cognome+"\n Email: "+this.email+" \n Telefono: "+this.telefono;
    }
}


/*
Un Contatto rappresenta un contatto della rubrica e ha:
- un nome
- un cognome
- una mail
- un telefono (stringa)
*/