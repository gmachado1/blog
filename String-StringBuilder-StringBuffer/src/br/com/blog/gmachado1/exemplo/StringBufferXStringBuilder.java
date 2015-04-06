package br.com.blog.gmachado1.exemplo;

public class StringBufferXStringBuilder {

	public static void main(String args[]) {
		System.out.println("testing StringBuilder and StringBuffer");
		String testString = "surfing";
		StringBuilder testStringBuilder = new StringBuilder("surfing");
		StringBuffer testStringBuffer = new StringBuffer("surfing");
		testString.concat(" in Rio!");
		testStringBuffer.append(" in Rio!");
		testStringBuilder.append(" in Rio!");
		System.out.println("testString = " + testString);
		System.out.println("testStringBuffer = " + testStringBuffer);
		System.out.println("testStringBuilder = " + testStringBuilder);
		testString = testString.concat(" in Rio!");
		System.out.println(">> testString = " + testString);
		// delete
		System.out.print("testStringBuffer (delete)= " + testStringBuffer);
		testStringBuffer.deleteCharAt(5);
		System.out.println("(delete 5)= " + testStringBuffer);
		// insert
		System.out.print("testStringBuilder= " + testStringBuilder);
		testStringBuilder.insert(7, " all day ");
		System.out.println("(insert 7)= " + testStringBuilder);
		// reverse
		System.out.println("testStringBuilder reverse= " + testStringBuilder.reverse());
		// toString
		System.out.println("testStringBuffer toString= " + testStringBuffer.toString());

	}

}
