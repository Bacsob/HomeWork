import java.util.Scanner; 
 
public class Hazi { 
 
public static void main(String[] args) { 
// TODO Auto-generated method stub 
 
System.out.println("Meddig számoljunk el?"); 
Scanner meddig = new Scanner(System.in); // változó, ami a választ tárolja 
int i = meddig.nextInt(); // az i-nek átadjuk a változó értékét 
System.out.println("Remek választás! Akkor elszámolunk " + i + "-ig, de mégis hányasával?"); 
Scanner mennyivel = new Scanner(System.in); 
int j = mennyivel.nextInt(); 
 
int szamol = 0; 
 
System.out.println(); 
 
System.out.println("For ciklussal"); 
 
// int i = 40; //meddig (még a user imput elõtt használtam) 
// int j = 3; //hányasával (még a user imput elõtt használtam) 
 
int p = i / j; // hányszor van meg 
 
int eredmeny = 0; 
 
for (int lepteto = 1; lepteto <= p; lepteto++) { 
eredmeny += j; 
System.out.print(eredmeny + " "); 
szamol++; 
 
} // feltétel végén kilép 
 
System.out.println(); 
System.out.println(); 
 
System.out.println("While ciklussal"); 
 
int x = j; 
j = x; 
 
while (j <= i) { // elindul egy feltétellel, ha igaz tovább lép 
System.out.print(j + " "); // igaz sor 
j += x; // Itt tovább lép az igaz sor és hozzá adja a léptetést 
 
} // Itt lép ki ha hamis lesz 
 
System.out.println(); 
System.out.println(); 
System.out.print("a maradék "); 
 
 
System.out.println(i%szamol); //nem mûködik rendesen, pl 88/10 
 
System.out.println(); 
 
} 
 
} 