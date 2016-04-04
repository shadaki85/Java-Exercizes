/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mar09;

public class ContenitoreGenerico<TIPOGEN extends Documento>
{
    private TIPOGEN contenuto;

    public TIPOGEN getContenuto()
    {
        return contenuto;
    }

    public void setContenuto(TIPOGEN contenuto)
    {
        this.contenuto = contenuto;
    }
    
}
