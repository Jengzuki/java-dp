package iterator;

public class MuvieMain {
	public static void main(String[] args) {
		Multiplex mel = new Multiplex(100);
		mel.add(new Movie("어벤저스"));
		mel.add(new Movie("왕의 남자"));
		mel.add(new Movie("전우치"));
		mel.add(new Movie("아이언맨2"));
		MyIterator it = mel.iterator();
		while (it.hasNext()) {
			Movie movie = (Movie) it.next();
			
			System.out.print(movie.getName()+"\t");
		}
		
	}
}
