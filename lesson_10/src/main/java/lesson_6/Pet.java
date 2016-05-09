package lesson_6;

/**
 * ��������� ��������� ��������.
 * @author parsentev
 * @since 16.04.2015
 */
public interface Pet {
	/**
	 * ���������� ���.
	 * @param name
	 * @return
	 */
	void setName(String name);

	/**
	 * ID.
	 * @return
	 */
	int getId();

	/**
	 * ��� ���������.
	 * @return
	 */
	String getName();

	/**
	 * ���������� ID.
	 * @param id
	 */
	void setId(int id);
}