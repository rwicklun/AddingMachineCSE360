package cse360assign2;

/**
 * <h1>Adding Machine</h1>
 * The program AddingMachine adds or subtracts an amount from the total,
 * it also keeps a history of what calls have been made since initializing.
 * <p>
 * @author Richard Wicklund
 * @version Assignment 2: 2.0
 */
public class AddingMachine {

	private int total;
	private String history;
	
	/**
	 * This is the constructor for AddingMachine, sets the variable total to 0,
	 * and initializes the history to "0".
	 * <p>  
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * The getTotal method returns total when called.
	 * <p>
	 * @return total - This is the sum total of all 
	 * add and subtract method calls that have happened.
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * The add method adds the input to the total and updates the history.
	 * <p>
	 * @param value - This is the input value when the add method is called.
	 */
	public void add (int value) {
		total += value;
		history = history + " + " + value;
	}
	
	/**
	 * The subtract method subtracts the input from the total and updates the history.
	 * <p>
	 * @param value - This is the input value when the subtract method is called.
	 */
	public void subtract (int value) {
		total -= value;
		history = history + " - " + value;
	}
	
	/**
	 * The toString method returns the history of the add and subtraction method calls.
	 * <p>
	 * @return history - This is all of the operations logged starting from the initialization of AddingMachine.
	 */
	public String toString () {
		return history;
	}
	/**
	 * The clear method clears the total sum and the history of 
	 * the add and subtract method calls.
	 */
	public void clear() {
		history = "0";
		total = 0;
	}
}
