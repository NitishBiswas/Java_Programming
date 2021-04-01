// Java Program to interpolate using 
// newton forward interpolation 

class GFG{ 
// calculating u mentioned in the formula 
static double u_cal(double u, int n) 
{ 
	double temp = u; 
	for (int i = 1; i < n; i++) 
		temp = temp * (u - i); 
	return temp; 
} 

// calculating factorial of given number n 
static int fact(int n) 
{ 
	int f = 1; 
	for (int i = 2; i <= n; i++) 
		f *= i; 
	return f; 
} 

public static void main(String[] args) 
{ 
	// Number of values given 
	int n = 5; 
	double x[] = { 0, 1, 2, 3, 4 }; 
	
	// y[][] is used for difference table 
	// with y[][0] used for input 
	double y[][]=new double[n][n]; 
	y[0][0] = 1; 
	y[1][0] = 7; 
	y[2][0] = 23; 
	y[3][0] = 55; 
	y[4][0] = 109; 

	// Calculating the forward difference 
	// table 
	for (int i = 1; i < n; i++) { 
		for (int j = 0; j < n - i; j++) 
			y[j][i] = y[j + 1][i - 1] - y[j][i - 1]; 
	} 

	// Displaying the forward difference table 
	for (int i = 0; i < n; i++) { 
		System.out.print(x[i]+"\t"); 
		for (int j = 0; j < n - i; j++) 
			System.out.print(y[i][j]+"\t"); 
		System.out.println(); 
	} 

	// Value to interpolate at 
	double value = 1.2; 

	// initializing u and sum 
	double sum = y[0][0]; 
	double u = (value - x[0]) / (x[1] - x[0]); 
	for (int i = 1; i < n; i++) { 
		sum = sum + (u_cal(u, i) * y[0][i]) / 
								fact(i); 
	} 

	System.out.println("\n Value at "+value+" is "+String.format("%.6g%n",sum)); 
} 
} 
// This code is contributed by mits 
