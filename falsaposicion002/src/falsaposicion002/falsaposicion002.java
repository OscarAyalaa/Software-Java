package falsaposicion002;

    import java.util.Scanner;
    import java.lang.Math;
    import java.math.BigDecimal;
    import java.math.*;     
public class falsaposicion002 {

    public static double Horner()
    {
        int grado, tamañoPolinomio;
        double  coeficiente,a=0,b=0,c=0,x0=0,xf=0,evaluax0=0,evaluaxf=0;
        double  x1=0,x2=0,raizAprox=0, raiz=0,aux,ev1=0,ev2=0;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el grado de la polinomio");
        grado = entrada.nextInt();
        double arreglo[] = new double[grado +1];
        double derivada[] = new double[grado+1];
        for(int i=grado; i>=0; i--)
        {
            System.out.println("Ingrese el coeficiente en el grado: " + i);
            coeficiente = entrada.nextDouble();
            arreglo[i] = coeficiente;
        }
        for(int i=grado; i>=0; i--)
            if (i == 0)
            {
               derivada[i] = 0;
            }
            else{
               derivada[i] = arreglo[i]*i;
               //System.out.println("el result: "+arreglo[i]); 
            }
        System.out.println("los coeficientes de la derivada son : ");
        for(int i=grado; i>0; i--)
        {
            System.out.println(" "+derivada[i]);
            
        }
        System.out.println("-ingrese el intervalo: ");
        
        System.out.println("inicio del intervalo: ");
        x0 = entrada.nextInt();
        System.out.println("fin del intervalo: ");
        xf = entrada.nextInt();      
        
        for (int i=grado; i>=0; i--) {
            if(i==0)
            {
               evaluax0 +=arreglo[0]; 
               evaluaxf +=arreglo[0];
            }
            else{
               evaluax0 +=arreglo[i]*Math.pow(x0,i); 
               evaluaxf +=arreglo[i]*Math.pow(xf,i); 
            }
        }
        System.out.println("el polinomio evaluado en "+x0+" es: "+evaluax0);
        System.out.println("el polinomio evaluado en "+xf+" es: "+evaluaxf);
        
      if(grado == 3)
      {
        for(int i=grado; i>0; i--){
           if(i == 3)
           {
               a = derivada[i];
           }
           if(i == 2)
           {
               b = derivada[i];
           }
           else
           {
               c = derivada[i];
           }
        }
        aux = Math.pow(b, 2)-(4*a*c);
        raiz = Math.sqrt(aux);
        x1 = (-(b)+raiz)/(2*a);
        x2 = (-(b)-raiz)/(2*a);      
        //System.out.println("a= "+a+"b= "+b+"c= "+c);
        System.out.println("la primera raiz= "+x1+ " la segunda raiz= "+x2);
        
         for (int i=grado; i>=0; i--) {
            if(i==0)
            {
               ev1 +=arreglo[0]; 
               ev2=arreglo[0];
            }
            else{
               ev1 +=arreglo[i]*Math.pow(x1,i); 
               ev2 +=arreglo[i]*Math.pow(x2,i); 
            }
        }
       System.out.println("el polinomio evaluado en "+x1+" es: "+ev1);
       System.out.println("el polinomio evaluado en "+x2+" es: "+ev2);  
      }    
      if(grado == 2)
      {
          for(int i = grado; i>0; i--)
          {
              if(i == 2)
              {
                  a = derivada[i];
              }
              else
              {
                  b = derivada[i];
              }
          }
          x1 =-((b)/(a));
         // System.out.println("a= "+a+"b= "+b);
          System.out.println("raiz= "+x1);
          for (int i=grado; i>=0; i--) {
            if(i==0)
            {
               ev1 +=arreglo[0]; 
            }
            else{
               ev1 +=arreglo[i]*Math.pow(x1,i);  
            }
        }
       System.out.println("el polinomio evaluado en "+x1+" es: "+ev1);       
      }
        return 0;
    }
    public static void main(String[] args) {
        Horner();
    }    
}