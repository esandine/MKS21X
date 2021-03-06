public class BarCode implements Comparable{
    // instance variables
    private String[]pcodes={":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::","||:::"};
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
	_zip=zip;
	_checkDigit=checkSum();
    }
    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
	_zip=x._zip;
	_checkDigit=x._checkDigit;
    }

    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int retDig=0;
	for(int i = 0;i<_zip.length()-1;i++){
	    retDig+=Integer.parseInt(_zip.substring(i,i+1));
	}
	retDig+=Integer.parseInt(_zip.substring(4));
	retDig%=10;
	return retDig;

    }

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      */
    public String toString(){
	String retStr="|";
	for(int i = 0;i<_zip.length();i++){
	    retStr+=pcodes[Integer.parseInt(_zip.substring(i,i+1))+1];
	}
	retStr+=pcodes[Integer.parseInt(_zip.substring(4))-1];
	retStr+=pcodes[_checkDigit-1];
	retStr+= "|";
	return retStr;
    }

    public boolean equals(Comparable other){
	return compareTo(other)==0;
    }
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Comparable other){
	return toString().compareTo(other.toString());
    }
    // postcondition: compares the zip + checkdigit 
    public int compareTo(Object other){
	if(other instanceof Comparable){
	    return compareTo(other);
	}
	return -1;
    }
}