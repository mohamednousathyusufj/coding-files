#include<stdio.h>
#include<stdlib.h>
int main(){
    int *ptr,n;
    float *pt;
    printf("\nEnter a number of values : ");
    scanf("%d",&n);
    ptr = (int*) calloc(n ,sizeof(int));
    if (ptr == NULL){
        printf("\nMemories are not allocated.");
    }
    printf("\nEnter the Values : \n");

    for(int i = 0; i<n; i++){
        scanf("%d",(ptr+i));
    }
    printf("\nEnter values are : ");

    for(int i = 0; i<n; i++){
        printf("\n%d ",*(ptr+i));
    }
    free(ptr);

    printf("\nEnter a number of values : ");
    scanf("%d",&n);
    pt = (float*) malloc(n*sizeof(float));
     if (ptr == NULL){
        printf("\nMemories are not allocated.");
    }
    printf("\nEnter the Values : \n");

    for(int i = 0; i<n; i++){
        scanf("%f",(pt+i));
    }
    printf("\nEnter values are : ");

    for(int i = 0; i<n; i++){
        printf("\n%.2f ",*(pt+i));
    }
    free(pt);
    ptr = NULL;
    pt = NULL;
}