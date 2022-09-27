using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace Euler
{
    class Program
    {

        static void Main(string[] args)
        {
            string sifrastring, aproxstring, acumuladostring, acumuladoparcials;
            int cont = 1, sifraint = 0, sup = 0;
            double tolerancia = 0.0, error = 0.0, valoract = 0.0, valorant = 0.0, acumulado = 0.0, acumuladoparcial = 0.0;
            StreamWriter lapiz = File.CreateText("EULER.txt");

            Console.WriteLine("\n Ingrese la cantidad de cifras significativas");
            sifrastring = Console.ReadLine();

            DateTime inicio = DateTime.Now;
            sifraint = Convert.ToInt32(sifrastring);


            sup = Math.Abs(2 - sifraint);
            if (2 - sifraint < 0)
            {
                tolerancia = (0.5) / (Math.Pow(10, sup));
            }
            else
                tolerancia = (0.5) * Math.Pow(10, sup);

            do
            {

                //comparaion del error con la tolerancia
                valorant = valoract;
                valoract = 1 / (Math.Pow(cont, 2));
                error = ((valoract - valorant) / (valoract));
                error = error * 100;
                error = Math.Abs(error);


                //Sumatoria de pi
                acumulado = acumulado + 1 / (Math.Pow(cont, 2));

                //cada caso de pi
                acumuladoparcial = acumulado * 6;
                acumuladoparcial = Math.Sqrt(acumuladoparcial);
                acumuladoparcials = Convert.ToString(acumuladoparcial);

                lapiz.WriteLine("   " + cont + "    " + acumuladoparcials);

                Console.WriteLine("Acumulado parcial: " + acumuladoparcial);
                Console.WriteLine("error: " + error);
                Console.WriteLine("tolerancia: " + tolerancia);
                cont++;
            } while (error > tolerancia);
            lapiz.Close();
            
            acumulado = acumulado * 6;
            acumulado = Math.Sqrt(acumulado);
            acumuladostring = Convert.ToString(acumulado);

            aproxstring = acumuladostring.Substring(0, sifraint + 2);
            acumulado = Convert.ToDouble(aproxstring);

            Console.WriteLine(" Aproximacion con " + sifraint + ":  "+acumulado);
            Console.WriteLine(" Cantidad de iteraciones: " + cont);
            DateTime fin = DateTime.Now;
            TimeSpan total = new TimeSpan(fin.Ticks - inicio.Ticks);
            Console.WriteLine(" Tiempo: " + total.ToString());
            Console.ReadLine();

        }
    }
}
