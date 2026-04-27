
    class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) throws IllegalArgumentException {
			
			try {
				
			
			if (operation == null) {
	
				throw new IllegalArgumentException("Operation cannot be null");
			} else if (operation.isBlank()) {
				throw new IllegalArgumentException("Operation cannot be empty");
			} 
			
			int result = switch (operation) {
			case "+" -> operand1 + operand2;
			case "*" -> operand1 * operand2;
			case "/" -> operand1 / operand2;
			default -> throw new IllegalOperationException("Operation '" +operation+ "' does not exist");
				
			};
			
		
				return operand1+" "+operation+" "+operand2+" = "+result;
			
			
			} catch (ArithmeticException e) {
				throw new IllegalOperationException ("Division by zero is not allowed",e);
			}
		}
    }
