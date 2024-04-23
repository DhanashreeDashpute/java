#include<iostream>
using namespace std;
int main(){
int arr[10]={10,20,30,40,50,60,70,80,90,100};
for(int i=0;i<10;i++){
cout<<arr[i]<<" ";
}
for (int i=0;i<10;i++){
arr[i]=arr[i]*2;
}
cout<<endl;
for(int i=0;i<10;i++){
cout<<arr[i]<<" ";
}
}

