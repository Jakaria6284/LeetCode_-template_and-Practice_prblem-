import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:

    df=pd.DataFrame(players)
    row,column=df.shape
    list=[row,column]
    return list
    