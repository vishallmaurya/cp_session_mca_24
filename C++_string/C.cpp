#include<bits/stdc++.h>

using namespace std;
int main()
{
    string x,y;

    cin>>x>>y;
    int flag1=0,flag2=0;
    int n=min(x.size(),y.size());
    for(int i=0;i<n;i++)
    {
        if(x[i]>y[i])
        {
            flag2=1;
            break;
        }
        else if(x[i]<y[i])
        {
            flag1=1;
            break;
        }
    }
    if(flag1==1)
    {
        cout<<x;
    }
    else if(flag2==1)
    {
        cout<<y;
    }
    else {
        if(x.size()<y.size())
        cout<<x;
        else cout<<y;
    }
    return 0;
}