
public class CodeSnippet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=13;		
	for(int i=0;i < n;i++) {
        for(int j=0;j < n;j++) {
        	if(i==0 || i==(n-1) || j==(n-1)/2) {
        		System.out.print("*");
        	} else {
        		System.out.print(" ");
        	}
         }
        for(int j=0;j< n;j++) { // This is for N Letter
       	    if(j==0)System.out.print("  ");
        	if(j==0 || j== n-1 || (i==j)) {
       		 System.out.print("*");
       	 } else {
       		 System.out.print(" ");
       	 }
        }
        
        for(int j=0;j<n;j++) { // This is for E Letter
        	if(j==0)System.out.print("  "); 
        	if(j==0 || (i==0 ) || (i==(n-1)/2 ) ||(i==(n-1) )  ) {
          		 System.out.print("*");
          	 } else {
          		 System.out.print(" ");
          	 }
           }
        for(int j=0;j< n;j++) { // This is for U Letter
        	if(j==0)System.out.print("  ");
         	 if((j==0 && (i!= (n-1)) ) ||(i==(n-1) && j!=0 && j!=(n-1))   || (j==n-1 && i!=(n-1)  )) {
         		 System.out.print("*");
         	 } else {
         		 System.out.print(" ");
         	 }
          }
        for(int j=0;j<(n);j++) { // This is for R Letter
        	if(j==0)System.out.print("  "); 
        	if(j==0 || (i==0 && j < (n-1)/2) ||   (i== (n-1)/2 && j < (n-1)/2 ) || (j==(n-1)/2 && i < ((n-1)/2) && i!=0) || (i > (n-1)/2 && i-j==3 )  ) {
        		 System.out.print("*");
        	 } else {
        		 System.out.print(" ");
        	 }
         }

        for(int j=0;j<(n);j++) { // This is for O Letter
        	//if(j==0)System.out.print("  "); 
        	if( (i==0 && j!=0 && j!=n-1) || (j==0 && i!=0 && i!=n-1) || (i==n-1 && j!=n-1 && j!=0) || (j==n-1 && i!=0 && i!=n-1) ) {
        		 System.out.print("*");
        	 } else {
        		 System.out.print(" ");
        	 }
         }
        for(int j=0;j< n;j++) { // This is for N Letter
       	    if(j==0)System.out.print("  ");
        	if(j==0 || j== n-1 || (i==j)) {
       		 System.out.print("*");
       	 } else {
       		 System.out.print(" ");
       	 }
        }
     
        System.out.print("          ");
        for(int j=0;j< n;j++) { // This is for S Letter
       	    if((i==0 && j!=0) || (j== 0 && i<=((n-1)/2)&&i!=0&&i!=((n-1)/2)) || (i==(n-1)/2 && j!=0&&j!=n-1) || (j==(n-1) && i>=(n-1)/2 && i!= (n-1)/2 && i!=(n-1)) || (i == n-1 && j!=(n-1))) {
       		 System.out.print("*");
       	 } else {
       		 System.out.print(" ");
       	 }
        }
        for(int j=0;j< n;j++) { // This is for U Letter
        	if(j==0)System.out.print("  ");
         	 if((j==0 && (i!= (n-1)) ) ||(i==(n-1) && j!=0 && j!=(n-1))   || (j==n-1 && i!=(n-1)  )) {
         		 System.out.print("*");
         	 } else {
         		 System.out.print(" ");
         	 }
          }
        for(int j=0;j<(n);j++) { // This is for R Letter
        	if(j==0)System.out.print("  "); 
        	if(j==0 || (i==0 && j < (n-1)/2) ||   (i== (n-1)/2 && j < (n-1)/2 ) || (j==(n-1)/2 && i < ((n-1)/2) && i!=0) || (i > (n-1)/2 && i-j==3 )  ) {
        		 System.out.print("*");
        	 } else {
        		 System.out.print(" ");
        	 }
         }
        for(int j=0;j<n;j++) { // This is for E Letter
        	if(j==0)System.out.print("  "); 
        	if(j==0 || (i==0 ) || (i==(n-1)/2 ) ||(i==(n-1) )  ) {
          		 System.out.print("*");
          	 } else {
          		 System.out.print(" ");
          	 }
           }
        for(int j=0;j< n;j++) { // This is for S Letter
        	if(j==0)System.out.print("  ");
        	if((i==0 && j!=0) || (j== 0 && i<=((n-1)/2)&&i!=0&&i!=((n-1)/2)) || (i==(n-1)/2 && j!=0&&j!=n-1) || (j==(n-1) && i>=(n-1)/2 && i!= (n-1)/2 && i!=(n-1)) || (i == n-1 && j!=(n-1))) {
       		 System.out.print("*");
       	 } else {
       		 System.out.print(" ");
       	 }
        }
        for(int j=0;j< n;j++) { // This is for H Letter
        	if(j==0)System.out.print("  ");
        	if(j==0 || j==n-1 || i==(n-1)/2) {
       		 System.out.print("*");
       	 } else {
       		 System.out.print(" ");
       	 }
        }
        
		System.out.println();
	}
System.out.println();     	
	for(int i=1;i<5;i++) {
		for(int j=1;j<5;j++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	System.out.println();
	for(int i=0;i<n;i++) {
	for(int j=0;j< n;j++) { 
   	    
    	if(i==0 ||j==0 || j== n-1 || (i==n-1) || i+j<=(n-1)/2 || j-i>=(n-1)/2 ) {
   		 System.out.print("*");
   	 } else {
   		 System.out.print(" ");
   	 }
    }
	System.out.println();
	}
	System.out.println();
	for(int i=0;i<n;i++) {
		for(int j=0;j< n;j++) { 
	   	    
	    	if((j==0 && i>=(n-1/2))|| (j== n-1 && i>=(n-1)/2) || (i==n-1) || i-j>=(n-1)/2 || j+i>=(n+(n-1)/2)-1 || i==n-2) {
	   		 System.out.print("*");
	   	 } else {
	   		 System.out.print(" ");
	   	 }
	    }
		System.out.println();
		}
	
	
	System.out.println();
	for(int i=0;i<n;i++) {
	for(int j=0;j< n;j++) { 
   	    
    	if(i==0 ||j==0 || (i==n-1) || i+j<=(n-1)/2 || i-j>=(n-1)/2 ) {
   		 System.out.print("*");
   	 } else {
   		 System.out.print(" ");
   	 }
    }
	System.out.println();
	}

	
	}

}



