import javax.print.DocFlavor.STRING;

public class StringProgrma {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc 	DEFG";
		String s = "potato lemon apple orange";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace("a", "x");
		String s07 = original.replace("ABC", "XY");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		String[] vet = s.split(" ");

		System.out.println("toLowerCase(): " + s01);
		System.out.println("toUpperCase(): " + s02);
		System.out.println("trim(): " + s03);		
		System.out.println("substring(2): " + s04);
		System.out.println("substring(2, 9): " + s05);
		System.out.println("replace(\"a\", \"x\");: " + s06);
		System.out.println("replace(\"ABC\", \"XY\")" + s06);
		System.out.println("indexOf(\"bc\")" + i);
		System.out.println("lastIndexOf(\"bc\")" + j);
		
		System.out.println("-----------------------------");
		System.out.println(vet[0]);
		System.out.println(vet[1]);
		System.out.println(vet[2]);
		System.out.println(vet[3]);
	}

}
