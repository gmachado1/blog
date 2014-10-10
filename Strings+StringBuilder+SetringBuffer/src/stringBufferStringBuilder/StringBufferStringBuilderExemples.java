package stringBufferStringBuilder;

public class StringBufferStringBuilderExemples {

	public static void main(String args[]) {
		System.out.println("teste");

		String s = "Stri";
		s.concat("ng"); // sem referencia
		System.out.println("x =" + s);
		s = s.concat("n"); // com referencia
		s.concat(s+"g"); // sem referencia
		System.out.println("s =" + s);
		
		
		StringBuilder d= new StringBuilder("String");
		d.append("Builder");
		System.out.println("d =" + d);
		
		
		StringBuffer f = new StringBuffer("String");
		f.append("Buffer");
		System.out.println("f =" + f);
		f.append("c");
		System.out.println("f =" + f);
		f.append(false);
		System.out.println("f =" + f);
		f.append(2.5D);
		System.out.println("f =" + f);
		f.append(4324.3432f);
		System.out.println("f =" + f);
		f.append(4);
		System.out.println("f =" + f);
		f.append(-4);
		System.out.println("f =" + f);
		f.delete(12, f.toString().length());
		System.out.println("f =" + f);
		f.insert(6, "Builder ou String");
		System.out.println("f =" + f);
		f.insert(0, true);
		System.out.println("f =" + f);
		f.reverse();
		System.out.println("f =" + f);

		f.toString();
		System.out.println("f =" + f.toString());
	}
}
