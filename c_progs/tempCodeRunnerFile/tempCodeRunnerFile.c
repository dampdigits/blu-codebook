void makeTable()
{
    for(int i=0; i<times; i++)
    {
        for(int j=0; j<n; j++)
        {
            mul[i][j] = num[j]*(i+1);
        }
    }
}