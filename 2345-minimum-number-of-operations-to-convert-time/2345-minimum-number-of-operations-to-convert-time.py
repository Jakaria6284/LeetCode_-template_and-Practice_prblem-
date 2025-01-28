class Solution:
    def convertTime(self, current: str, correct: str) -> int:
        curr= int(current[:2])*60+int(current[3:])
        target=int(correct[:2])*60+int(correct[3:])
        ans=0;

        diff=target-curr
        time=[60,15,5,1]
        for i in time:
            ans+=diff//i;
            diff=diff%i;

        return ans

        