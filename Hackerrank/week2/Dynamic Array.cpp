vector<int> dynamicArray(int n, vector<vector<int>> queries)
{
    vector<int> res;
    vector<vector<int>> arr(n);
    int lastAnswer = 0;

    for (auto e : queries)
    {
        int q = e[0], x = e[1], y = e[2];

        int idx = (x ^ lastAnswer) % n;
        if (q == 1)
        {
            arr[idx].push_back(y);
        }
        else
        {
            lastAnswer = arr[idx][y % arr[idx].size()];
            res.push_back(lastAnswer);
        }
    }
    return res;
}