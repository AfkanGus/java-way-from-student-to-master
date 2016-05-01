package lesson_6.actions;

import lesson_4.Validator;
import lesson_6.IClinic;

/**
 * �������� �������.
 * @author parsentev
 * @since 11.08.2015
 */
public class DeletePetAction implements Action {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void execute(IClinic IClinic, Validator validator) {
		int clientId = validator.getInt("Select client ID :");
		int petId = validator.getInt("Select pet ID :");
		IClinic.deletePet(clientId, petId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String intro() {
		return String.format("%s - delete pet", this.key());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int key() {
		return 6;
	}
}