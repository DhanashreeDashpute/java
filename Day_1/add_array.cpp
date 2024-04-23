#include<iostream>
using namespace std;
int main(){
int a[10];
int total=0;
cout<<"enter array elements\n";
for(int i=0;i<10;i++)
{
    cin>>a[i];

}
for(int i=0;i<10;i++)
{
    total+=a[i];

}
cout<<total;
}
