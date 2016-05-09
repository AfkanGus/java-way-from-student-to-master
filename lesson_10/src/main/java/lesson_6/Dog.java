package lesson_6;

/**
 * ����� ��������� ����.
 * @author parsentev
 * @since 16.04.2015
 */
public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	/**
	 * ������� ����.
	 */
	public void catchCat() {
	}

	/**
	 * �������� ��� ��� ���
	 * @return true - ���� ��������.
	 */
	private boolean isHungry() {
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return String.format("Dog says %s.", super.getName());
	}
}
