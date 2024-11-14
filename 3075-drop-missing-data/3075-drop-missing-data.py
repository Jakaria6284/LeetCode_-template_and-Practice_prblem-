import pandas as pd

def dropMissingData(students: pd.DataFrame) -> pd.DataFrame:
    df=pd.DataFrame(students)
    output=df.dropna(subset='name')
    return output
    