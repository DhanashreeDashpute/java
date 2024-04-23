
#include<iostream>
using namespace std;
int main(){
int arr1[3]={10,20,30};
int arr2[4]={40,50,60,70};
int arr3[7];
for(int i=0;i<7;i++){
arr3[i]=arr1[i];
arr3[i]=arr2[i];
cout<<arr3[i]<<" ";
}

}
