public class Sasuke extends Itachi{
	String Dojutsu = "Sharingan";
	Itachi i = new Itachi();
	
        @Override
	void printDojutsu() {
		i.printDojutsu();
		System.out.println(this.Dojutsu);
	}
}