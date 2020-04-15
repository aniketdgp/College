#include <stdio.h>

void main(){

int arr[] = {1,2,3,4,40,5,6,7,8};
int max =0,length = sizeof(arr)/sizeof(int),i;

for(i=0;i<length;i++){
    if(arr[i]>max){
        max = arr[i];
    }
}

printf("max = : %d \n",max);



}