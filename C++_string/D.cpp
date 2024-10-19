//sheet 4:D. Strings
#include<bits/stdc++.h>
using namespace std;
int main()
{
	string a,b;
	cin>>a>>b;
	int n=a.length(),m=b.length();
	cout<<n<<' '<<m<<"\n";
	cout<<a+b<<'\n';
	swap(a[0],b[0]);
	cout<<a<<" "<<b<<"\n";
}