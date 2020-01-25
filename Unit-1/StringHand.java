class StringHand{
	public static void main(String []args){
		String str="hi Hello welcome to java programming";
		String myStr1 = "Hello";
		
		 String myStr2 = "eHllo";
		 char[] myStr3 = {'H', 'e', 'l', 'l', 'o'};
		 String a="";
		 String str4="     Hi Hello   ";
    System.out.println(myStr1.charAt(0));
    System.out.println(myStr1.codePointAt(0));
	System.out.println(myStr1.codePointBefore(1));
	System.out.println(myStr1.codePointCount(0, 5));
	System.out.println(myStr1.compareTo(myStr2));
	System.out.println(myStr1.compareToIgnoreCase(myStr2));
	System.out.println(myStr1.concat(myStr2));
	System.out.println(myStr1.contains("Hel"));
	System.out.println(myStr1.contentEquals("Hello"));
	a=a.copyValueOf(myStr3,0,4);
	System.out.println(a);
	a=a.copyValueOf(myStr3);
	System.out.println(a);
	System.out.println(myStr1.endsWith("Hel"));
	System.out.println(myStr1.equals(myStr2));
	System.out.println(myStr1.equalsIgnoreCase(myStr2));
	System.out.println(myStr1.hashCode());
	System.out.println(str.indexOf("welcome"));
	System.out.println(myStr1.isEmpty());
	System.out.println(str.lastIndexOf("programming"));
	System.out.println(myStr1.length());
	System.out.println(myStr1.startsWith("Hel"));
	System.out.println(myStr1.toUpperCase());
	System.out.println(myStr1.toLowerCase());
	System.out.println(str4.trim());
	System.out.println(myStr1.replace('l', 'p'));
	}
}	