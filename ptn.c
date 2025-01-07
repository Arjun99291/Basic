// Rhombus pattern

#include<stdio.h>
void main(){
  for(int i = 0; i < 5; i++){
    for(int k = 5; k > i; k--){
      //for space
      printf(" ");
    }
    for(int j = 0; j < i; j++){
      //for upper triangle
      printf("* ");
    }
    printf("\n");
  }
  for(int i = 0; i < 5; i++){
    for(int j = 0; j < i; j++){
      //for upper triangle
      printf(" ");
    }
    for(int k = 5; k > i; k--){
      //for space
      printf("* ");
    }
    printf("\n");
  }
}
