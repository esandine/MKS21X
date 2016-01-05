public class Sorts{
    private static boolean debug = true;
    public static void printArray(int[]data){
	String retStr="";
	retStr+="[";
	for(int i = 0;i<data.length;i++){
	    retStr+=" ";
	    retStr+=data[i];
	    retStr+=",";
	}
	if(retStr.length()>1){
	    retStr=retStr.substring(0,retStr.length()-1);
	}
	retStr+="]";
	System.out.println(retStr);
    }
    public static void insertionSort(int[]data){
	if(debug){
	    System.out.println("Insertion Sort:");
	}
	int tempValue=0;
	int tempIndex=0;
	for(int i = 1;i<data.length;i++){
      	    tempValue=data[i];
	    tempIndex=i;
	    //System.out.println(tempValue);
	    //System.out.println(tempIndex);
	    while(tempIndex>=1&&tempValue<=data[tempIndex-1]){
		//System.out.println("yo");
		//System.out.println(tempValue);
		//System.out.println(tempIndex);
		data[tempIndex]=data[tempIndex-1];
		tempIndex-=1;
	    }
	    data[tempIndex]=tempValue;
	if(debug){
		  printArray(data);
	}
	}
	//your code here to make data re-order its elements
	//from least to greatest just like we did in class
	//same algorithm as the way you created your OrderedSuperArray
    }

    public static void selectionSort(int[] ary){
	if(debug){
	    System.out.println("Selection Sort:");
	}
	int minValue;
	int minIndex;
	for(int i = 0;i<ary.length;i++){
	    minValue=ary[i];
	    minIndex=i;
	    for(int index=i;index<ary.length;index++){
		if(ary[index]<minValue){
		    minValue = ary[index];
		    minIndex=index;
		}
	    }
	    ary[minIndex]=ary[i];
	    ary[i]=minValue;
	    if(debug){
		printArray(ary);
	    }
	}
    }
    public static void bubbleSort(int[] data){
	for(int i = 1;i<data.length;i++){
	    for(int index = 0;i<data.length-i;index++){
		if(data[index]>data[index+1])
    }
}
