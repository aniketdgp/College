/*The  above code covers all concepts of DMA in c and also uses sort function on the pointers passed through functions */

#include <stdio.h>
#include <stdlib.h>

void sort(int*,int);

void main(){

	int n;
	printf("Enter the size of the array \n");
	scanf("%d",&n);

	/*
	//malloc function(takes one arguments one is sizeof(variable) and if you want to add n items multiply by it)
	int *ptr = (int*)malloc(sizeof(int)*n);
	*/
	int *ptr = (int*)malloc(sizeof(int)*n);
	
	/*
	//calloc function(takes two arguments one is sizeof(variable) and other is number of variables)
	int *ptr = (int*)calloc(n,sizeof(int));
	*/

	if(ptr == NULL){
		printf("No Memory Allocated at all \n");
		exit(0);
	}

	for(int i=0;i<n;i++){
		scanf("%d",ptr+i);
	}

	for(int j=0;j<n;j++){
		printf("Value at pointer location (%u+%d) is : %d \n",ptr,j,*(ptr+j));
	}
	int op;
	printf("Do you want to sort the elements here 0 for yes else exit :\n");
	scanf("%d",&op);
	if(op==0){
		sort(ptr,n);
	}

	free(ptr);

}


void sort(int *ptr,int n){

	int temp;
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(*(ptr+i)>*(ptr+j)){
				temp = *(ptr+i);
				 *(ptr+i) = *(ptr+j);
				 *(ptr+j) =  temp;

			}
		}	
	}
	printf("After sorting the values are :\n");
	for(int j=0;j<n;j++){
		printf("Value at pointer location (%u+%d) is : %d \n",ptr,j,*(ptr+j));
	}

}


