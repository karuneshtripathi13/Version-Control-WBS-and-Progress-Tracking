#pragma GCC optimize("Ofast")
#pragma GCC target("avx,avx2,fma")
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
bool sortbysec(const pair<char, int> &a,
               const pair<char, int> &b)
{
    return (a.second < b.second);
}
bool check(ll n, ll d)
{
    while (n > 0)
    {
        if (n % 10 == d)
            return true;
        n /= 10;
    }
    return false;
}
int con(string s)
{
    vector<string> tokens;

    // stringstream class check1
    stringstream check1(s);

    string intermediate;

    // Tokenizing w.r.t. space ' '
    while (getline(check1, intermediate, ':'))
    {
        tokens.push_back(intermediate);
    }
    ll hr = stoi(tokens[0]);
    stringstream check2(tokens[1]);
    tokens.clear();
    while (getline(check2, intermediate, ' '))
    {
        tokens.push_back(intermediate);
    }
    ll mn = stoi(tokens[0]);
    if (tokens[1] == "PM" && hr != 12)
        hr += 12;
    if (tokens[1] == "AM" && hr == 12)
        hr -= 12;
    int tm = hr * 60 + mn;
    return tm;
}
unordered_map<ll, ll> primes;
void SieveOfEratosthenes(ll n)
{
    ll c = 0;
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
    {
        if (prime[p])
            c++;
        primes[p] = c;
    }
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
    string n = to_string(num);
    // One by one process all digits of 'num'
    for (ll i = 0; i < n.length(); i++)
        res = (res * 10 + (ll)n[i] - '0') % a;

    return res;
}
vector<ll> fact;
void printDivisors(int n)
{
    // Note that this loop runs till square root
    for (int i = 1; i <= sqrt(n); i++)
    {
        if (n % i == 0)
        {
            // If divisors are equal, print only one
            if (n / i == i)
                fact.push_back(i);

            else // Otherwise print both
            {
                fact.push_back(i);
                fact.push_back(n / i);
            }
        }
    }
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    ll tt = 1;
    //cin >> tt;
    for (ll p = 0; p < tt; p++)
    {
        ll n;
        cin >> n;
        ll arr[n];
        for (ll i = 0; i < n; i++)
        {
            cin >> arr[i];
        }

        ll ans = 0;
        bool mk[n] = {false};
        for (ll k = 0; k < n; k++)
        {
            ll a = LLONG_MAX, b = LLONG_MAX;
            if (arr[k] == 1 && !mk[k])
            {
                for (ll i = k + 1; i < n; i++)
                {
                    if (arr[i] == 0)
                    {
                        a = i;
                        break;
                    }
                }
                for (ll i = k - 1; i >= 0; i--)
                {
                    if (arr[i] == 0)
                    {
                        b = i;
                        break;
                    }
                }
                ans += min(abs(k - a), abs(b - k));
                if (abs(k - a) > abs(b - k))
                {
                    arr[b] = 1;
                    mk[b] = true;
                }
                else
                {
                    arr[a] = 1;
                    mk[a] = true;
                }
            }
        }
        cout << ans << "\n";
    }
    return 0;
}
