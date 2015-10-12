package iterator;

public class Multiplex implements MultiplaexService{
	private Movie[] movies;
	private int last; //실제로 운영되는 상영관
	
	public Multiplex(int foo) {
		this.movies = new Movie[foo];
	}
	
	public void add(Movie movie) {
		this.movies[last] = movie;
		last++;
	}
	
	public Movie getMovie(int index) {
		return movies[index];
	}
	public int getCount() {
		return last;
	}

	@Override
	public MyIterator iterator() {
		return new MultiplexIterator(this);
	}

	
	
		
	
}
