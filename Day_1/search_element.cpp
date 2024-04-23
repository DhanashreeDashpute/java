#include<iostream>
using namespace std;
int main(){
    bool flag=1;
    int x;
int arr[10]={10,20,30,40,50,60,70,80,90,100};
for(int i=0;i<10;i++){
cout<<arr[i]<<" ";
}
cout<<"enter element"<<endl;
cin>>x;
for (int i=0;i<10;i++){
if(arr[i]==x){
    flag=1;
    break;
}
else{
    flag=0;

}
}
if(flag==1)
cout<<"found\n";
else
cout<<"not found";

}


