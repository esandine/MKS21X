public class Driver{
    public static void main(String args[]){
	int[] arrayName = { 8, 6, 7, 5, 3, 0, 9};
	Sorts.printArray( arrayName);
	Sorts.insertion( arrayName);
	Sorts.printArray( arrayName);
	int[] arrayName2 = { 8, 6, 7, 5, 3, 0, 9};
	Sorts.printArray(arrayName2);
	Sorts.selection(arrayName2);
	Sorts.printArray(arrayName2);
	int[] a2 = {};
	Sorts.insertion( arrayName);
	Sorts.printArray( a2);
    }
}
