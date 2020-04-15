// 0 1 1 2 3 5 8 12 20

#include <stdio.h>

void main(){

int t1=0,t2=1,i,nt;

for(i=0;i<5;i++){

    printf("%d\n",t1);
    nt = t1+t2;
    t1 = t2;
    t2 = nt;


}

}