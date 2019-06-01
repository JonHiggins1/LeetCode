
public class E21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int odd = 0;
		int even = 0;
		
		/*a while */
		while (i<10) {
			if((i%2)==0){
				even = even+i;
			}else {
				odd=odd+i;
			}
			System.out.print(i+",");
			System.out.println("o="+odd + ",e="+even + "\n");
			
	/*b*/   do {
	            switch (i) {
	                case 15: System.out.print (i + "***, ");
	                         break;
	                default: System.out.print (i + ", ");
	            }
	            ++i;
	        } while (i < 20);
	        System.out.println ("\n");

	 
	/*c*/   for ( ; i<30 ; i++) {
	 
	            if ( (i%2) == 0) {
	                System.out.print ("*" + i + "*, ");
	                continue;
	            }
	            System.out.print (i + ", ");
	        }  
	        System.out.println ("\n");
	    }
	}
	}

