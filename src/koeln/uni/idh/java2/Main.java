package koeln.uni.idh.java2;

public class Main {

	public static void main(String[] args) throws Exception {
		// neue StringList erzeugen
		StringList list = new StringList(10);

		// Größe der Liste auf der Konsole ausgeben
		System.out.println("Größe der Liste: " + list.size());

		// einige Strings hinzufügen
		list.add("Eins");
		list.add("Zwei");
		list.add("Drei");
		list.add("Vier");
		list.add("Fünf");
		list.add("Sechs");
		list.add("Sieben");
		list.add("Acht");
		list.add("Neun");
		list.add("Zehn");
		list.add("Elf");
		list.print();
		System.out.println("Größe der Liste: " + list.size());

		list.remove("Fünf");
		list.print();
		System.out.println("Größe der Liste: " + list.size());
		
		StringList l2 = list.getSubList(3, 8);
		l2.print();
	}

}
