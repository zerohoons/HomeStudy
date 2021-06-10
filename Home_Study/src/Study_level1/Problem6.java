package Study_level1;

public class Problem6 {
	public double[] find_roots(int a, int b, int c) {
		double[] ans = new double[2];
		int d = 0;
		d = (b*b)-(4*a*c);
		double root = 0;
		root = Math.sqrt(d);
		if(d>0){
			ans[0] =(-b+root)/(2*a);
			ans[1] =(-b-root)/(2*a);
		} else if (d==0) {
			ans[0] = (-b+root)/(2*a);
			ans[1] = (-b+root)/(2*a);
		}
		return ans;
	}
}
