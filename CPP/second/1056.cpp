#include <iostream>
using namespace std;

int main()
{
    int n,ans;
    int a[11];
    cin >> n;
    for(int i=0; i<n; i ++)
        cin >> a[i];
    for(int i=0; i<n; i++)
        for(int j=0; j<n; j++)
            if(i != j) ans += a[i] * 10 + a[j];
    cout << ans;
    return 0;
}