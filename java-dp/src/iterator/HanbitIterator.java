package iterator;

public class HanbitIterator implements MyIterator {
	private HanbitEni ha;
	private int index;
	
	public HanbitIterator(HanbitEni hanbitEni) {
		this.ha = ha;
		this.index=0;
	}

	@Override
	public boolean hasNext() {
		if (index < ha.getCount()) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public Object next() {
		Student student = ha.getStudent(index);
		index++;
		return student;
	}

}
