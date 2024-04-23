#include<iostream>
using namespace std;
int main(){
bool flag=1;
int a=1;
while(a<50){
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
