class test{
	private String name;
	private String color;
	private int cost;
	private int size;
	test(String name,String color,int cost,int size)
	{
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.size=size;
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
class thisusing{
	public static void main(String[] args) {
		test v=new test("tomato","red",10,5);
		System.out.println(v.getname());
		System.out.println(v.getcolor());
		System.out.println(v.getcost());
		System.out.println(v.getsize());
	}
}
