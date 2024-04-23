#include<iostream>
using namespace std;
int main(){
bool flag=1;
int a,b;
cout<<"range of prime no.\n";
cin>>a;
cin>>b;
cout<<"prime from "<<a<<"to "<<b<<endl;

while(a<b){
for(int i=2;i<a;i++){
if(a%i==0){

    flag=1;
    break;
}
else{
    flag=0;

}
}
if(flag==0){
    cout<<a<<endl;


}a++;
}
}
