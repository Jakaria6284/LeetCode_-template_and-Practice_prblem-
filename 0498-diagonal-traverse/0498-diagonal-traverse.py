class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        map={}
        result=[]
        for i in range(0,len(mat)):
            for j in range(0,len(mat[0])):
                if i+j not in map:
                    map[i+j]=[]
                map[i+j].append(mat[i][j])
                
        for key,values in map.items():
            if key !=0 and key%2==0:
                values.reverse()
                result.extend(values)
            else:
                result.extend(values)
        print(result)

        return result


                

        