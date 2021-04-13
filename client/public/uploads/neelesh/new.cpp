#pragma GCC optimize("Ofast")12222
#pragma GCC target("avx,avx2,fma")
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
bool sortbysec(const pair<char,int> &a,
              const pair<char,int> &b)
{
    return (a.second < b.second);
}
bool check(ll n,ll d)
{
    while(n>0)
    {
        if(n%10==d)
        return true;
        n/=10;
    }
    return false;
}
int con(string s)
{
    vector <string> tokens; 
      
        // stringstream class check1 
        stringstream check1(s); 
        
        string intermediate; 
        
        // Tokenizing w.r.t. space ' ' 
        while(getline(check1, intermediate, ':')) 
        { 
            tokens.push_back(intermediate); 
        }
        ll hr=stoi(tokens[0]);
        stringstream check2(tokens[1]);
        tokens.clear();
        while(getline(check2, intermediate, ' ')) 
        { 
            tokens.push_back(intermediate); 
        }
        ll mn=stoi(tokens[0]);
        if(tokens[1]=="PM"&&hr!=12)
        hr+=12;
        if(tokens[1]=="AM"&&hr==12)
        hr-=12;
        int tm=hr*60+mn;
        return tm;
}
unordered_map<ll,ll>primes;
void SieveOfEratosthenes(ll n)
{
    ll c=0;
    bool prime[n + 1];
    memset(prime, true, sizeof(prime));
 
    for (ll p = 2; p * p <= n; p++)
    {
        // If prime[p] is not changed, 
        // then it is a prime
        if (prime[p] == true) 
        {
            // Update all multiples 
            // of p greater than or
            // equal to the square of it
            // numbers which are multiple 
            // of p and are less than p^2 
            // are already been marked.
            for (ll i = p * p; i <= n; i += p)
                prime[i] = false;
        }
    }
 
    // Print all prime numbers
    for (ll p = 2; p <= n; p++)
        {if (prime[p])
            c++;
        primes[p]=c;}
}
ll factorial(ll n) 
{ 
    if (n == 0) 
        return 1; 
    return n * factorial(n - 1); 
}
ll mod(ll num, ll a)
{
    // Initialize result
    ll res = 0;
    string n=to_string(num);
    // One by one process all digits of 'num'
    for (ll i = 0; i < n.length(); i++)
         res = (res*10 + (ll)n[i] - '0') %a;
  
    return res;
}
int main() {
	ios_base::sync_with_stdio(false); cin.tie(NULL);
    ll tt=1;
    cin>>tt;
    for(ll p=0;p<tt;p++)
    {
        string n,ans="";
        cin>>n;
        if(n.compare("0")==0)
        cout<<"1\n";
        else{
        bool v=false;
        ll z=0,pp=0,o=0;
        for(ll i=0;i<n.length();i++)
        {
            if(n[i]=='1')
            {
                o++;
                v=true;
                if(pp!=0)
                z=pp;
                pp=0;
            }
            else
            {
                pp++;
                if(v)
                {
                    v=false;
                    ans+='1';
                }
            }
        }
        if(z==0)
        z=pp;
        for(ll i=0;i<=z;i++)
        {
            ans+='0';
        }
        string val="";
        for(ll i=0;i<o;i++)
        {
            val+='1';
        }
        val+='0';
        o++;
        if(ans.length()<=o)
        cout<<ans<<"\n";
        else
        cout<<val<<"\n";
        }
    }
    return 0;
}