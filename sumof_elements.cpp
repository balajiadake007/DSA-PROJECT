#include <iostream>

using namespace std;

int main()
{
    int n;
    int sum = 0;

    cout << "Enter size of Array:" << endl;
    cin >> n;
    cout << "Enter " << n << " numbers: " << endl;

    int arr[n];

    for(int i =0; i < n; i++)
    {
        cin >> arr[i];    
    }

    for(int i = 0; i < n; i++)
    {
        sum = sum + arr[i];
    }

    cout << "Sum of elements:" << endl;
    cout << sum;


    return 0;
}