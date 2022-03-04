#include <algorithm>
#include <map>
#include <iostream>
using namespace std;

int main()
{
  map<string, int> n;
  map<string, int>::iterator it;
  int n_idx, m_idx;
  cin >> n_idx;
  for (int i = 0; i < n_idx; i++)
  {
    string s;
    cin >> s;
    if (n.find(s) == n.end())
    {
      n[s] = 1;
    }
    else
    {
      n[s]++;
    }
  }
  cin >> m_idx;
  for (int i = 0; i < m_idx; i++)
  {
    string s;
    cin >> s;
    if (n.find(s) != n.end())
    {
      n[s]--;
    }
  }
  for (it = n.begin(); it != n.end(); it++)
  {
    if (it->second != 0)
    {
      for (int i = 0; i < it->second; i++)
      {
        cout << it->first << endl;
      }
    }
  }
  return 0;
}