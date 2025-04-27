class Solution:
    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:
        self.m=len(obstacleGrid)
        self.n=len(obstacleGrid[0])
        self.obstacleGrid = obstacleGrid
        self.memo={}

        return self.helper(0,0)



    
    def helper(self,i,j)->int:
        if i>=self.m or j>=self.n or self.obstacleGrid[i][j]==1 :
            return 0
        if i==self.m-1 and j==self.n-1:
            return 1
        if(i,j) in self.memo:
            return self.memo[(i,j)]
        self.memo[(i,j)]= self.helper(i,j+1) + self.helper(i+1,j)
        return self.memo[(i,j)]
        

        
        