package lesson_6.actions;

import lesson_4.Validator;
import lesson_6.IClinic;

/**
 * ��������� �������� ���������.
 * @author parsentev
 * @since 11.08.2015
 */
public interface Action {

	/**
	 * ��������� ��������.
	 * @param clinic �������.
	 * @param validator ��������� �����.
	 */
	void execute(final IClinic clinic, final Validator validator);

	/**
	 * �������� ��������.
	 * @return ��������.
	 */
	String intro();

	/**
	 * ����.
	 * @return ����.
	 */
	int key();
}
