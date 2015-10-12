package iterator;

public class BookShelfIterator implements MyIterator {
	
	private BookShelf bookShelf; // 필드에 dest(대상 클레스 고정함)
	private int index;
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0; // 조형 인덱스 0강
	}
	
	@Override
	public boolean hasNext() {
		if (index <bookShelf.getCount()) { // 배열이 가지고 있는 실제 요소갯수
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

}
