/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topicos2015a;

/**
 *
 * @author Oscar
 */
public class Clibro {
    private String ISBN;
    private String Titulo;
public void setISBN(String ISBN) throws ExceptionLibro
{
    if(ISBN.length()== 13)
    this.ISBN = ISBN;
    else
       throw new ExceptionLibro("El ISBN solo puede tener 13 caracteres");
}
public void setTitulo(String Titulo)
{
    this.Titulo = Titulo;
}
public String getISBN()
{
    return ISBN;
}
public String getTitulo()
{
    return Titulo;
}
        
}
