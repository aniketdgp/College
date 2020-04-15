#include <stdio.h>

void main(){

    int arr[] = {2,2,2,2,2},sum=0;

    int length = sizeof(arr)/sizeof(int);
    for(int i=0;i<length;i++){

        sum = sum+arr[i];

    }

    printf("%d\n",sum);
}