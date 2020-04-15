#include <stdio.h>

void main(){

int x=10,y=20;

x = x+y;
y = x-y;
x = x-y;

printf("Swapped value of X is %d and swapped value for y is %d",x,y);


}