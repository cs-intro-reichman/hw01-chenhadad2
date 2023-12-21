class Gen3 {
public static void main(String args[]) {
        // prints a random value in [a,b)
		
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	
	int range = ((b - a) + 1);
    
		int x = (int)(Math.random()* range + a);
        System.out.println(x);

       int y = (int)(Math.random()* range + a);
        System.out.println(y);
		
		int z = (int)(Math.random()* range + a);
        System.out.println(z);
		
		int t = (int)(Math.min(x,y));
		int l = (int)(Math.min(x,z));
		int f =  (int)(Math.min(l,t));
        System.out.println(f);		
    }
}