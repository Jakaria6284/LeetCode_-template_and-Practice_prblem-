class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        self.m = len(grid)
        self.n = len(grid[0])
        self.grid = grid
        self.memo={}
        return self.helper(0, 0)

    def helper(self, i, j):
        if i >= self.m or j >= self.n:
            return float('inf')   
        if i == self.m - 1 and j == self.n - 1:
            return self.grid[i][j]  
        if (i,j) in self.memo:
            return self.memo[(i,j)]
        self.memo[(i,j)]= self.grid[i][j] + min( self.helper(i, j+1),self.helper(i+1, j))
        return self.memo[(i,j)]
