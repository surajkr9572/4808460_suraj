int diagonalDifference(vector<vector<int>> arr) {
    int firstDiagonal=0;
    int secondDiagonal=0;
    for(int i=0;i<arr.size();i++){
        firstDiagonal+=arr[i][i];
        secondDiagonal+=arr[i][arr.size()-1-i];
    }
    return abs(firstDiagonal-secondDiagonal);
}
