public class MethodClass {

	public String capitalizeFirstLetter(String string) {
		
		String[] words=string.split("\\s+");
		
		StringBuilder capitalizedString = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
               
                capitalizedString.append(Character.toUpperCase(word.charAt(0)))
                                 .append(word.substring(1))
                                 .append(" ");
            }
        }
		return capitalizedString.toString().trim();
        
	}
	
}
