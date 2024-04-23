#include<iostream>
using namespace std;
int main(){
    int temp;
int arr[10]={10,20,30,45,84,74,96,54,20,65};

for (int i=0;i<10;i++){
for(int j=i+1;j<10;j++){
    if(arr[i]<arr[j]){
    temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;

}
}
}for(int i=0;i<10;i++){
cout<<arr[i]<<" ";
}
}

