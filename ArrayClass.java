package practice_pack;

public class ArrayClass {
    public String[] myStringArray;
    public final int DEFAULT_SIZE = 3;
    public int size = 0;


    // Initializing Default Size of the array
    public ArrayClass(){
        if (this.myStringArray == null){
            this.myStringArray = new String[DEFAULT_SIZE];
        }
    }


    // This method appends element at the end
    public boolean addElement(String element){
        if (this.size  == this.myStringArray.length){
            resize();
        }
        this.myStringArray[this.size] = element;
        this.size++;

        return true;
    }


    // This method checks the length and resizes the array
    protected String[] resize(){
        String[] arr = new String[this.myStringArray.length + this.myStringArray.length / 2];

        for (int i = 0; i < this.myStringArray.length; i++){
            arr[i] = this.myStringArray[i];
        }
        //this.myStringArray = new String[arr.length];
        this.myStringArray = arr;

        return this.myStringArray;
    }


    public static void main(String[] args) {
        ArrayClass ac = new ArrayClass();

        System.out.println("Initial Array Length: " + ac.myStringArray.length);

        for (int i = 0; i < 100; i++) {
            String e = "A:" + i;
            ac.addElement(e);
        }

        for (int i = 0; i < ac.myStringArray.length; i++){
            if (ac.myStringArray[i] == null) continue;
            System.out.println(ac.myStringArray[i]);
        }

        System.out.println("Array Length: " + ac.myStringArray.length);

    }

}



/*
    ac.addElement("Zero");
    ac.addElement("One");
    ac.addElement("Two");
    ac.addElement("Three");
    ac.addElement("Four");
    ac.addElement("five");
    ac.addElement("Six");
    ac.addElement("Seven");
    ac.addElement("Eight");
 */


/*
    //This method doesn't work.
    //I was unable to resize the instance variable myStringArray

    protected String[] resize(String[] x){
        String[] arr = new String[x.length + x.length / 2];
        System.out.println("arr.length: " + arr.length);
        for (int i = 0; i < x.length; i++){
            arr[i] = x[i];
        }
        x = new String[arr.length];
        System.out.println("x.length: " + x.length);
        x = arr;

        return x;
    }
*/


/*
    int[] n = new int[2];
    System.out.println("Length of n: " + n.length);

    int[] m = {1,2,3,4};
    System.out.println("Length of m: " + m.length);

    n = m;

    System.out.println("Length of n: " + n.length);
    for(int i=0; i<n.length; i++){
        System.out.println(n[i]);
    }
*/