import java.util.Scanner; 

public class NummerTilOrd {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		int nummer, nummer1 , nummer2;
		String string1[] = {" "," ","tjue", "tretti", "førti","femti","seksti","søtti","åtti","nitti","hundre"};
		String string2[] = {" ","en","to","tre","fire","fem","seks","sju","åtte","ni","ti","ellve","tolv","tretten","fjorten","femten","seisten","søtten","atten","nitten"};
		
		System.out.println("Skriv inn et nummer mellom 1 og 99");
		nummer = input.nextInt();
		
		if ((nummer <1) || (nummer >100)){
			System.out.println("Feil inntasting");
		}
		else if ((nummer >=1) && (nummer <=19)) {
			System.out.println(string2[nummer]);
		}
		else if ((nummer >=20) && (nummer <=100)) {
			nummer1 = nummer/10;
			nummer2 = nummer%10;
			System.out.println(string1[nummer1]+" "+string2[nummer2]);
		}
	}

}
