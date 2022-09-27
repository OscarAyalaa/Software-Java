/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Oscar
 */
public class Procesos {
    public void iniciar() throws Exception, IOException{
		BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
		String nom,cont,serv,prac;
		double p;
		int es,s,c;
		char con;
		con='s';
		do
		{
		System.out.println("Bienvenido al Sistema Integral de Informacion");
		System.out.println("Ingrese el nombre del alumno");
		nom= br.readLine();
		System.out.println("Ingrese el numero de control");
		cont= br.readLine();
		System.out.println("Ingrese el promedio del alumno");
	    p= Double.parseDouble( br.readLine());
	    System.out.println("Ingrese el semestre del alumno");
	    s= Integer.parseInt( br.readLine());
	    System.out.println("Ingrese el numero de creditos extra clase");
	    c=Integer.parseInt(br.readLine());
	    System.out.println("Ingrese una letra s o S si ha realizado el servicio social");
	    serv=br.readLine();
	    System.out.println("Ingrese una letra s o S si ha realizado practicas profecionales");
	    prac=br.readLine();
	    System.out.println("Ingrese La cantidad de especiales que ha llevado el alumno");
	    es= Integer.parseInt( br.readLine());
	   
	    SII sii= new SII();
	    System.out.println("Nombre: "+nom);
	    System.out.println("Numero de control: "+cont);
	    System.out.println("Promedio: "+p);
	    System.out.println("Semestre: "+s);
	    System.out.println("Creditos extra clase:"+c);
	    System.out.println("Servicio social: "+serv);
	    System.out.println("Practicas profecionales: "+prac);
	    System.out.println("Especiales: "+es);
	    sii.Promedio(p);
	    sii.Semestre(s);
	    sii.Especial(es);
	    sii.Creditos(c, s);
	    sii.Servicio(s, serv);
	    sii.Practicas(serv, s, prac);
		System.out.println("\n\nQuiere continuar?\nS/N\n");
		con = br.readLine(). charAt (0);
	}
		while((con=='s') || (con=='S'));
	}


}
