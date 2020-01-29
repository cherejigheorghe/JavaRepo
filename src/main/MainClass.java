package main;

public class MainClass {

	public static void divizori() {
		int n = 28;	
		int j = 0;
		int divizori[];
		divizori = new int [4];
		
		for (int i = 1; i < n/2; i++)
		{
			if (n % i == 0)
				if(j<4) {			
					divizori[j]=i;
					j++;
				}
		}
		System.out.println("Primii 4 divizori ai numarului "+n+" sunt: "+divizori[0]+", "+divizori[1]+", "+divizori[2]+" si "+divizori[3]+".");
		System.out.println("Suma acestora este: "+(divizori[0]+divizori[1]+divizori[2]+divizori[3])+".");
		}
	
	public static void depozitBancar() {
		int sumaDepusa = 100; //lei 
		int perioada = 4;     //ani
		double dobanda = 0.25; //dobanda anuala
		double sumaFinala = 0;
		double sumaAnuala =0;
		
		sumaAnuala = sumaDepusa + (dobanda*sumaDepusa);
		
		for (int i = 1; i<perioada; i++)
		{
			sumaAnuala = sumaAnuala + (dobanda * sumaAnuala);
		}
		sumaFinala = sumaAnuala;
		System.out.println("Suma finala dupa "+perioada+" ani este de: "+sumaFinala+" lei.");	
	}
	
	public static void timeConverter() {
	
		int initialTime, secToConvert, hour, min, sec;
		initialTime = secToConvert = 3600; //secunde
		
		hour = secToConvert/3600;
		secToConvert %=3600;
		
		min = secToConvert/60;
		secToConvert %= 60;
		
		sec = secToConvert;

		System.out.println(initialTime+" secunde sunt egale cu "+hour+" ore, "+min+" minute si "+sec+" secunde.");
	}
	
	public static void main(String[] args) {
		//divizori();
		//depozitBancar();
		timeConverter();
	}

}
