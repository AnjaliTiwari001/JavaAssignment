package stringMtehods;

public class stringMtehods {

	public static void main(String[] args) {
		String name= " Navgurukul";
		System.out.println(name.charAt(4));
		name = name.concat("campus");
		System.out.println(name.concat("campus"));
		System.out.println(name.length());
		System.out.println(name.substring(2, 6));
		System.out.println(name.substring(2));
		System.out.println(name.replace("g", "G"));
		String[] arr= name.split("Navg");
		for (int i=0;i<2;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
		System.out.println(name.indexOf("o"));  //return -1 if not present
		System.out.println(name.isEmpty());
		System.out.println(name.equalsIgnoreCase(" navgurukul"));
		System.out.println(name.equals(" navgurukul"));
	}

}
