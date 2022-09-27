/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfc;

import java.util.Date;

/**
 *
 * @author Oscar
 */
public class Cfecha  {
    private int dia,mes,año;
     
    
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
//excepciones marcadas
    public void setDia(int dia) throws Excepciones { 
        int b=0,b1=0,b2=0;
        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)
        {
            if((dia>31) || (dia<1))
            {
            throw new Excepciones("el mes "+mes+" No puede tener mas de 31 dias");
            }
        }
       
        if(mes==4 || mes==6 || mes==9 || mes==11)
        {
            if(dia<1 || dia>30)
            {
                 throw new Excepciones("el mes "+mes+" No puede tener mas de 30 dias");
            }
        }
        b=año%4;
        b1=año%100;
	b2=año%400;
        if( (b==0 && b1!=0) || b2==0) 
        {    
            if((mes==2)&&(dia<1 || dia>29))
        
                    throw new Excepciones("el mes "+mes+" No puede tener mas de 29 dias");
        }
        if((b!=0) && (b1!=0) && (b2!=0))
        {    
            if((mes==2)&&(dia<1 || dia>28))
                 throw new Excepciones("el mes "+mes+" No puede tener mas de 28 dias");
        }
      else
        this.dia = dia;
    }
    public void setMes(int mes) throws Excepciones {
        if(mes<1 || mes>12)
        {
            throw new Excepciones("el mes solo puede ser entre 1 y 12");
        }
        else
        this.mes = mes;
    }
    public void setAño(int año) throws Excepciones {
        Date fecha=new Date();
        int anio=2017;
        if((año<1800 || año>anio))
        {
            throw new Excepciones("el año debe ser menor a 1800 ni msyor que "+anio);
        }
        else
        this.año = año;
       
    }
    
    public String toString()
    {
        String fecha= año+"/"+mes+"/"+dia;
        return fecha;
    }
}