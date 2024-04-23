#include<iostream>
using namespace std;
int main(){
int temp;
int arr[10]={10,20,30,40,50,60,70,80,90,100};

for (int i=0,j=9;i<10/2;i++,j--){


    temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;


}
for(int i=0;i<10;i++){
cout<<arr[i]<<" ";
}
}

