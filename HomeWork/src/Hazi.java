import java.util.Scanner; 
 
public class Hazi { 
 
public static void main(String[] args) { 
// TODO Auto-generated method stub 
 
System.out.println("Meddig sz�moljunk el?"); 
Scanner meddig = new Scanner(System.in); // v�ltoz�, ami a v�laszt t�rolja 
int i = meddig.nextInt(); // az i-nek �tadjuk a v�ltoz� �rt�k�t 
System.out.println("Remek v�laszt�s! Akkor elsz�molunk " + i + "-ig, de m�gis h�nyas�val?"); 
Scanner mennyivel = new Scanner(System.in); 
int j = mennyivel.nextInt(); 
 
int szamol = 0; 
 
System.out.println(); 
 
System.out.println("For ciklussal"); 
 
// int i = 40; //meddig (m�g a user imput el�tt haszn�ltam) 
// int j = 3; //h�nyas�val (m�g a user imput el�tt haszn�ltam) 
 
int p = i / j; // h�nyszor van meg 
 
int eredmeny = 0; 
 
for (int lepteto = 1; lepteto <= p; lepteto++) { 
eredmeny += j; 
System.out.print(eredmeny + " "); 
szamol++; 
 
} // felt�tel v�g�n kil�p 
 
System.out.println(); 
System.out.println(); 
 
System.out.println("While ciklussal"); 
 
int x = j; 
j = x; 
 
while (j <= i) { // elindul egy felt�tellel, ha igaz tov�bb l�p 
System.out.print(j + " "); // igaz sor 
j += x; // Itt tov�bb l�p az igaz sor �s hozz� adja a l�ptet�st 
 
} // Itt l�p ki ha hamis lesz 
 
System.out.println(); 
System.out.println(); 
System.out.print("a marad�k "); 
 
 
System.out.println(i%szamol); //nem m�k�dik rendesen, pl 88/10 
 
System.out.println(); 
 
} 
 
} 