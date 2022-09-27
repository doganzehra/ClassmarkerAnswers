import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainClass {
	public static void main(String[] args) {
		zip();
		readFile();
	}

	/*
	 * LinkedHashMap<Character, Integer> yapýsý kullanarak “zehradogan” ifadesi için
	 * “z1e1h1r1a2d1o1g1n1” þeklinde harflerin sayýsýný sýrasý ile string deðiþkene
	 * atayan kodu yazýnýz.
	 */
	private static void zip() {
		String isim = "zehradogan";
		StringBuilder myBuilder = new StringBuilder();
		LinkedHashMap<Character, Integer> myLinkedHashMap = new LinkedHashMap<>();
		for (int i = 0; i < isim.length(); i++) {
			char myChar = isim.charAt(i);
			if (myLinkedHashMap.containsKey(myChar)) {
				myLinkedHashMap.put(myChar, myLinkedHashMap.get(myChar) + 1);
			} else {
				myLinkedHashMap.put(myChar, 1);
			}
		}
		for (Map.Entry<Character, Integer> mapEntry : myLinkedHashMap.entrySet()) {
			myBuilder.append(mapEntry.getKey());
			myBuilder.append(mapEntry.getValue());
		}
		System.err.println("Ýsim adlý deðiþkenin harflerinin sayýsýnýn sýralý hali -> " + myBuilder);
	}

	/*
	 * DOSYA ÝCERÝGÝ: java kursuna baþlanýldý. sekerbank mülakatý yapýldý.
	 * classmarker1 çözüldü. zehra dogan üye giriþi yapýldý.
	 */
	public static void readFile() {
		ArrayList<String> myArrayList = new ArrayList<>();
		String path = "C:\\deneme\\deneme.txt";
		File file = new File(path);
		FileReader reader = null;
		try {
			reader = new FileReader(file, Charset.forName("UTF-8"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader bufferedReader = new BufferedReader(reader);
		try {
			while (bufferedReader.ready()) {
				myArrayList.add(bufferedReader.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println(myArrayList);
		try {
			bufferedReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
