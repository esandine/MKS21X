public class BarCode/* implements Comparable*/{
    // instance variables
    private String _zip;
    private int _checkDigit;

    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
	if(!(zip.length()==5)){
	    throw new RuntimeException();
	}
	for(int i = 0;i<zip.length()-1;i++){
	    _checkDigit+=Integer.parseInt(zip.substring(i,i+1));
	}
	_checkDigit+=Integer.parseInt(zip.substring(4));
	_checkDigit/=10;
	_zip=zip;
    }/*
    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){}


    //post: computes and returns the check sum for _zip
    private int checkSum(){}

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      */
    public String toString(){
	return _zip + _checkDigit;
    }

    /*
    public boolean equals(Object other){}
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.

    */
    public int compareTo(Comparable other){
	return 0;
    }
    // postcondition: compares the zip + checkdigit 
}