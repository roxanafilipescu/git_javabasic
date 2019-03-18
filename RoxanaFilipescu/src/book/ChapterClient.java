package book;

public class ChapterClient {

	public static void main(String[] args) {
		ChapterClient chapterClient = new ChapterClient();
		chapterClient.doAction();
	}

	private void doAction() {
		Chapter cuprins = new Chapter("Cuprins", null);
		Chapter intro = new Chapter("Introducere", null);
		Chapter var = new Chapter("Variabile", null);
		Chapter varLoc = new Chapter("Variabile locale", null);
		Chapter varMem = new Chapter("Variabile membru", null);
		Chapter clase = new Chapter("Clase", null);
		// Chapter ch6 = new Chapter("Cuprins",null);

		cuprins.setsubChapter(new Chapter[] { intro, clase });
		intro.setsubChapter(new Chapter[] { var });
		var.setsubChapter(new Chapter[] { varLoc, varMem });

		cuprins.display("");

	}
}
