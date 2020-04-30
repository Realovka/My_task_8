package com.company;

public class Main {
// сортировка массива пузырьком
    public static void main(String[] args) {
	int [] array= {5,-7,8,-9,6,-10,3 };
	int t,i, j;
	for(j=array.length;j>0;j--){
		for (i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				t = array[i];
				array[i] = array[i + 1];
				array[i + 1] = t;
			}
		}
	}
	    for ( i=0; i<array.length; i++)
            System.out.print(array[i]+" ");


    }
}
