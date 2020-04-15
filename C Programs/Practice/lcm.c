#include <stdio.h>

void main(){

int i=6,j=10;

int min  = i>j?i:j;

while(1){ //while(1) for infinite loop until break statement

    if(min%i==0 && min%j==0){  // here until we get a common min which is divisible loop executes found than breaks
        printf("the Lcm of %d and %d is : %d",i,j,min);
        break;
    }
    min++;  // incremanting mean value until the if condition sattisfies

}


}