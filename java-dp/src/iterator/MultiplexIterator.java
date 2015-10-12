package iterator;

public class MultiplexIterator implements MyIterator{
	private Multiplex ml;
	private int index;
	public MultiplexIterator(Multiplex ml) {
		this.ml = ml;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if (index < ml.getCount()) {
			return true;
		} else {
			return false;
		}

	}
	@Override
	public Object next() {
		Movie movie = ml.getMovie(index);
		index++;
		return movie;
	}
}
