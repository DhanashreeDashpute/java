#include<iostream>
using namespace std;
int main(){
    bool flag=1;
    int i;
int a[5];
cout<<"enter array elements\n";
for(int i=0;i<5;i++)
{
    cin>>a[i];
}cout<<"even\n";
for(int i =0;i<5;i++)
{
    if(a[i]%2==0){
    cout<<a[i]<<" ";
}
}
cout<<"\nodd\n";
for(int i =0;i<5;i++)
{
    if(a[i]%2==1){
    cout<<a[i]<<" ";
}
}cout<<"\nprime\n";
for(int i =0;i<5;i++)
{
    for(int j=2;j<a[i];j++){
        if(a[i]%j==0){
            flag=0;
            break;
        }
        else{
            flag=1;
        }
    }
    if(flag){
    cout<<a[i]<<endl;
}
}
}


