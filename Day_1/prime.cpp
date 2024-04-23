#include<iostream>
using namespace std;
int main(){
bool flag=1;
int a;
cout<<"enter no"<<endl;
cin>>a;

for(int i=2;i<a;i++){
if(a%i==0){

    flag=1;
    break;
}
else{
    flag=0;
}
}
if(flag){
    cout<<"not prime"<<endl;
}
else{
    cout<<"prime"<<endl;
}

}
