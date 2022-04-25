/**
 * IS184203C-Genap-2019/20 - Computing Assignment 04
 * Name of Project  : Sorting Algorithm
 * Student ID       : 5026211083
 * Student Name     : Muhammmad Rizano Lukman
 * Class            : C
 * Submission Date  : 25-04-2022
 */

/**
 * 
 * NEVER DO 'COPY-PASTE' WHILE YOU ARE CODING
 * 
 */

public class SortingAlgorithm {

    public static void main(String[] args) {
        int [] a={5,1,3,4,2,100,25,500,13};
        
        System.out.println("1. The original series of number:");
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
        System.out.println("2. The sorted series of number (Algorithm: Buble Sort, Order: Ascending):");
        bubleSort(a,'a');
        
        int [] b={5,1,3,4,2,100,25,500,13};
        System.out.println("3. The sorted series of number (Algorithm: Buble Sort, Order: Descending):");
        bubleSort(b,'d');
        
        int [] c={5,1,3,4,2,100,25,500,13};
        System.out.println("4. The sorted series of number (Algorithm: Selection Sort, Order: Ascending):");
        selectionSort(c,'a');
        
        int [] d={5,1,3,4,2,100,25,500,13};
        System.out.println("5. The sorted series of number (Algorithm: Selection Sort, Order: Descending):");
        selectionSort(d,'d');
        
        int [] e={5,1,3,4,2,100,25,500,13};
        System.out.println("6. The sorted series of number (Algorithm: Insertion Sort, Order: Ascending):");
        insertionSort(e,'a');
        
        int [] f={5,1,3,4,2,100,25,500,13};
        System.out.println("7. The sorted series of number (Algorithm: Insertion Sort, Order: Descending):");
        insertionSort(f,'d');
        
        
    }
    
    //buble sort algorithm
    static void bubleSort(int []arr, char order ){
       //make some modification here
       for (int j=arr.length-1;j>0;j--){
           for (int x=0;x<j;x++){
               if (arr[x+1]<arr[x]){
                   int temp=arr[x];
                   arr[x]= arr[x+1];
                   arr[x+1] = temp;
               }
           }
       }
       
       //print out the array
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    
    
    //selection sort algorithm
    static void selectionSort(int []arr, char order ){
       //make some modification here
       for(int i = 0; i<arr.length; i++){
           int terkecil= i;
           for(int j=i; j<arr.length; j++ ){
               if(arr[terkecil] > arr[j]){
                   terkecil = j;
               }
           }
           int kosong = arr[i];
           arr[i] = arr[terkecil];
           arr[terkecil] = kosong;
       }
       
       //print out the array
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    
    //insertion sort algorithm
    static void insertionSort(int []arr, char order ){
       //make some modification here
       for(int i = 1; i<arr.length; i++){
           for(int j = i; j>0; j--){
               if(arr[j] < arr[j-1]){
                   int kosong = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = kosong;
               }
           }
       }
       
       //print out the array
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
}


/**
 * DECLARATION OF ORIGINAL WORK
 * I, hereby declare that the code is my original work. 
 * I have honored the principles of academic integrity and have upheld 
 * ITS''s  Student Code of Academic in the completion of this work.
 */
