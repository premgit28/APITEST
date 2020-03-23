package utilities;

public class Common {

	private static final String lowercase = "abcdefghijklmnopqrstuvwxyz";
	private static final String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String numbers = "0123456789";
	private static final String alphanumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	public static String alphanumericrandom(int count, String casetype) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * casetype.length());
			builder.append(casetype.charAt(character));
		}
		return builder.toString();
	}

	public String randomnumber(int count) {
		String num = alphanumericrandom(count, numbers);
		return num;
	}
	
	public String random_email() {
		String email = alphanumericrandom(7, lowercase) + "@" + alphanumericrandom(3, lowercase) + ".test";
		return email;
	}

	public String random_name(int count) {
		String name = alphanumericrandom(count, lowercase);
		return name;
	}
}
