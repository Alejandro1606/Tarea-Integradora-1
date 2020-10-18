import java.util.Scanner;


public class TareaIntegradora{
public static String [] product = new String [2];
		public static int [] amount= new int [2];
		public static String [] utilization;
	    public static Scanner sn=new Scanner(System.in);
	    public static int [] quanty = new int [2];
		public static double [] priceHome=new double [2];
		public static double [] priceNeighborhood= new double [2];
		public static double [] priceCenter= new double [2];
		int blackWork=1300000;
		int whiteWork=2600000;
		int painting=980000;
	
	
	/**
	*Enter the products information.
	*pre:<b></b>
	*post:<b></b>
	@param a array of String.
	@return a variable String , contains the information of the product
	*/
	
	
	public static void main(String [] args){
		
		
		System.out.println("Enter the quantity of products :");
		quantity[0]=sn.nextInt();
		
	for (int i=0; i<quantity.length;i++){
		System.out.println("Enter the name of the product"  + (i+1)+":");
        product[i] = sn.nextLine();
		 System.out.println( "The product is:" + product);	
		}
		
	for (int i=0; i<product.length;i++){
	 System.out.println("Enter the amount of the product"  + (i+1)+":");
        amount[i] = sn.nextInt();
		System.out.println( "The amount is :" + amount);
	}
	/**
	*Enter the  material price in homecenter
	*pre:<b></b>
	*post:<b></b>
	@param a array of String.
	@return a variable String , contains the material price in homecenter.
	*/
    public static int[] Homecenter(String producto[],int size){
	
	scanner sn=new Scanner(System.in);
	
	System.out.println(" Homecenter ");
	int [] hm= new  int [size];
	for(int i=0; i<hm.length;i++){
		System.out.println("Enter the material price: "+(producto[i])+" in Homecenter");
		hm[i] = sn.nextInt();
		
	}
	
	return hm;
	/**
	*Enter the center hardware material price.
	*pre:<b></b>
	*post:<b></b>
	@param a array of String.
	@return a variable String , contains the material price in the center hardware.
	*/
}
		
		public static int[] Centerhardware(String producto[],int size){
	
	Scanner sn=new Scanner(System.in);
	
System.out.println("Center hardware");
	int [] cfr= new  int [size];
	for(int i=0; i<cfr.length;i++){
		System.out.println("Enter the material price: "+(producto[i])+" in the center hardware store");
		cfr[i] = sn.nextInt();
		
	}
	
	return cfr;
	
}

	public static int[] Neighborhoodhardware(String producto[],int size){
	
	Scanner sn=new Scanner(System.in);
	
System.out.println("neighborhood hardware");
	int [] bfr= new  int [size];
	for(int i=0; i<bfr.length;i++){
		System.out.println("Enter the material price: "+(producto[i])+" in the neighborhood hardware");
		bfr[i] = sn.nextInt();
		
	}
	
	return bfr;
	
}	
	public static int ubicationHouse{}{
	
Scanner sn=new Scanner(System.in);
int ubc=0;
System.out.println("\nEnter the respective number to indicate the house ubication"); 
System.out.println("1.North");
System.out.println("2.South");
System.out.println("3.Center");
ubc =sn.nextInt();

return ubc;

}
public static int price_HomeCenter(int pHome []){
	Scanner sn = new Scanner(System.in);
	
	int hmp= 0;
	for(int i=0; i<pHome.length;i++){
		hmp = hmp+pHome[i];
		
		
	}
	 return hmp;
	 
	 public static int price_HardwareCenter(int pCenter []){
		 Scanner sn= new Scanner(System.in);
		 
		 int fcp=0;
		 for(int i=0; i<pCenter.length;i++){
			 fcp= fcp+pCenter[i];
		 }
		 return fcp;
		 
	 }
	 
	 public static int price_HardwareNeighborhood(int pNeighborhood[]){
		 Scanner sn=new Scanner(System.in);
		 
		 int fbp;
		 for(int i=0; i<pNeighborhood.length;i++){
			 fbp= fbp+pNeighborhood[i];
		 }
		 return fbp;
}

public static void total_priceHome(int ubc,int homePrice, int TOTAL_WORK){
	Scanner sc= new Scanner(System.in);
	
	int htp=0;
	int total=0;
	if(homePrice<80000){
		if (ubc==1){
			htp=homePrice+120000;
		}else if (ubc==2){
			htp=homePrice+50000;
		}else if (ubc==3){
			htp= homePrice+120000;
		}
		
		
	}else if (homePrice>=300000){
		if(ubc==1){
			htp= homePrice;
		}else if (ubc==2){
			htp=homePrice;
		}else if (ubc==3){
			htp=homePrice;
			
		}
	}else{
		
		if(ubc==1){
			htp=homePrice+28000;
		}else if (ubc==2){
			htp=homePrice;
		}else if (ubc==3){
			htp=homePrice+55000;
		}
	}
	
	total=htp+TOTAL_WORK;
	System.out.println("The price in  Homecenter");
	System.out.println("The work price in Homecenter is: "+htp+"  Without domicile");
	System.out.println("The work price in Homecenter is: "+htp);
	System.out.println("The total work price in Homecenter is: "+total);
	
}

public static void total_priceNeighborhood(int ubc,int neighborhoodPrice, int TOTAL_WORK){
	Scanner sc= new Scanner(System.in);
	
	int ntp=0;
	int totaln=0;
	if(neighborhoodPrice<80000){
		if (ubc==1){
			ntp=neighborhoodPrice+120000;
		}else if (ubc==2){
			ntp=neighborhoodPrice+50000;
		}else if (ubc==3){
			ntp= neighborhoodPrice+120000;
		}
		
		
	}else if (neighborhoodPrice>=300000){
		if(ubc==1){
			ntp= neighborhoodPrice;
		}else if (ubc==2){
			ntp=neighborhoodPrice;
		}else if (ubc==3){
			ntp=neighborhoodPrice;
			
		}
	}else{
		
		if(ubc==1){
			ntp=neighborhoodPrice+28000;
		}else if (ubc==2){
			ntp=neighborhoodPrice;
		}else if (ubc==3){
			ntp=neighborhoodPrice+55000;
		}
	}
	
	totaln=ntp+TOTAL_WORK;
	System.out.println("The price in the neighborhood hardware");
	System.out.println("The work price in neighborhood hardware is: "+ntp+"  Without domicile");
	System.out.println("The work price in the neighborhood hardware is: "+ntp);
	System.out.println("The total work price in the neighborhood hardware is: "+totaln);
	
}
public static void total_priceCenter(int ubc,int centerPrice, int TOTAL_WORK){
	Scanner sc= new Scanner(System.in);
	
	int ctp=0;
	int totalc=0;
	if(centerPrice<80000){
		if (ubc==1){
			ctp=centerPrice+120000;
		}else if (ubc==2){
			ctp=centerPrice+50000;
		}else if (ubc==3){
			ctp= centerPrice+120000;
		}
		
		
	}else if (centerPrice>=300000){
		if(ubc==1){
			ctp= centerPrice;
		}else if (ubc==2){
			ctp=centerPrice;
		}else if (ubc==3){
			ctp=centerPrice;
			
		}
	}else{
		
		if(ubc==1){
			ctp=centerPrice+28000;
		}else if (ubc==2){
			ctp=centerPrice;
		}else if (ubc==3){
			ctp=centerPrice+55000;
		}
	}
	
	totalc=ctp+TOTAL_WORK;
	System.out.println("The price in the center hardware");
	System.out.println("The work price in the center neighborhood is: "+ctp+"  Without domicile");
	System.out.println("The work price in the center neighborhood is: "+ctp);
	System.out.println("The total work price in the center neighborhood is: "+totalc);
	
}

}
