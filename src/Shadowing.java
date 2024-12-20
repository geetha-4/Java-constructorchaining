class Vegetables{
	private String name;
	private String color;
	private int cost;
	private int size;
	Vegetables(String name,String color,int cost,int size)
	{
		name=name;
		color=color;
		cost=cost;
		size=size;
	}
	public String getname()
	{
		return name;
	}
	public String getcolor()
	{
		return color;
	}
	public int getcost()
	{
		return cost;
	}
	public int getsize()
	{
		return size;
	}
}
class Shadowing{
	public static void main(String[] args) {
		Vegetables v=new Vegetables("tomato","red",10,5);
		System.out.println(v.getname());
		System.out.println(v.getcolor());
		System.out.println(v.getcost());
		System.out.println(v.getsize());
	}
}