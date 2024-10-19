#include<bits/stdc++.h>

using namespace std;
int main()
{
    int t;
    cin>>t;
    for(int j=0;j<t;j++)
    {
 string x;
int flag=0;
    cin>>x;
   for(int i=1;i<x.size()-1;i++)
   {
        if(x[i-1]=='0'&& x[i]=='1'&&x[i+1]=='0')
       {
        flag=1;
        break;
       }
       else if(x[i-1]=='1'&& x[i]=='0'&&x[i+1]=='1')
       {
        flag=1;
        break;
       }
   }
   if(flag==1)
   {
    cout<<"Good";
   }
   else cout<<"Bad";
   cout<<endl;
    }
   
    return 0;
}