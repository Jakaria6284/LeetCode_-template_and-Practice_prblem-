class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map={}
        result=[]

        for i in range(0,len(strs)):
            sorted_index=''.join(sorted(strs[i]))
            if sorted_index not in map:
                map[sorted_index]=[]
                map[sorted_index].append(strs[i])
            else:
                map[sorted_index].append(strs[i])
            
        for key,value in map.items():
            result.append(value)
        print(result)
        return result


        