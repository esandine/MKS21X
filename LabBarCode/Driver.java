public class Driver{
    public static void main(String[] args){
	try{
	    BarCode b1 = new BarCode("39495");
	    System.out.println(b1);
	    BarCode b2 = new BarCode(b1);
	    System.out.println(b2);
	    //	    BarCode b2 = new BarCode("00001");
	    //System.out.println("Works?");
	    //BarCode b3 = new BarCode("3949");
	    //System.out.println("Works?");
	    //BarCode b4 = new BarCode("3949345");
	    //System.out.println("Works?");
	    //BarCode b5 = new BarCode("3949a");
	    //System.out.println("Works?");
	}catch(RuntimeException e){
	    System.out.println("Invlaid bar code");
	}
    }
}