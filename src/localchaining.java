class Human{
		private String name;
		private String location;
		private int age;
		private double height;
		private double weight;
		Human(String a,String b,int c,double d,double e)
		{
			this("Ramu", "Banglore",21,176.9);
			name=a;
			location=b;
			age=c;
			height=d;
			weight=e;
		}
		Human(String a,String b,int c,double d)
		{
			this("Shamu", "Hyderabad" ,20);
			{
				name=a;
				location=b;
				age=c;
				height=d;
			}
			}
			Human(String a,String b,int c)
			{
				name=a;
				location=b;
				age=c;
			}
			public String getname()
			{
				return name;
			}
			public String getlocation()
			{
				return location;
			}
			public int getage()
			{
				return age;
			}
			public double getheight()
			{
				return height;
			}
			public double getweight()
			{
				return weight;
			}
}
class localchaining{
	public static void main (String[]args) {
		{
			Human h=new Human("sunny","chennai",19,156.7,65);
			System.out.println(h.getname());
			System.out.println(h.getlocation());
			System.out.println(h.getage());
			System.out.println(h.getheight());
			System.out.println(h.getweight());
		}
	}
}