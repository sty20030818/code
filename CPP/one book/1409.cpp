#include <bits/stdc++.h>
using namespace std;
int n,m,cnt;

bool isPrime(int shu)
{
	double n_sqrt=sqrt(shu);
	if(shu==1) return false;
	if(shu==2||shu==3) return true;
	if(shu%6!=1&&shu%6!=5) return false;
	for(int i=5;i<=n_sqrt;i+=6)
	    if(shu%i==0||shu%(i+2)==0) return false;
    return true;
}

int main()
{
	scanf("%d%d",&n,&m);
	for(int i=n;i<=m;i++) 
		if(isPrime(i)) cnt++;
    cout<<cnt;
	return 0;
}
